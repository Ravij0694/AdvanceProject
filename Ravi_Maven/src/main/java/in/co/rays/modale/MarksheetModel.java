package in.co.rays.modale;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.ResourceBundle;


import in.co.rays.been.MarksheetBeen;

public class MarksheetModel {
	public static int nextpk() throws Exception {
		int pk =0;
		ResourceBundle rb=ResourceBundle.getBundle("in.co.rb.app");
		Class.forName(rb.getString("driver"));
		 Connection co = DriverManager.getConnection(rb.getString("url"),rb.getString("username"),rb.getString("password"));
		 co.setAutoCommit(false);
		 PreparedStatement ps = co.prepareStatement("select max(id)from marksheet");
		
		 
		 ResultSet rs =ps.executeQuery();
		while (rs.next()) {
			pk= rs.getInt(1);
		}
		 
		 return pk+1;
		
	}
	public static void add(MarksheetBeen m) throws Exception {
		ResourceBundle rb=ResourceBundle.getBundle("in.co.rb.app");
		Class.forName(rb.getString("driver"));
		Connection co = DriverManager.getConnection(rb.getString("url"),rb.getString("username"),rb.getString("password"));

		co.setAutoCommit(false);
		PreparedStatement pr =  co.prepareStatement("insert into marksheet values(?,?,?,?,?,?,?,?,?)");

		pr.setInt(1, nextpk());
		pr.setInt(2, m.getRollno());
		pr.setInt(3, m.getPhy());
		pr.setInt(4, m.getChe());
		pr.setInt(5, m.getMath());
		pr.setString(6, m.getFname());
		pr.setString(7, m.getLname());
		pr.setInt(8, m.getHindi());
		pr.setInt(9, m.getEng());

		int r = pr.executeUpdate();
		co.commit();

		System.out.println(r + "inserted");
		pr.close();
		co.close();
	}

	public static ArrayList select(MarksheetBeen m) throws Exception {
		ResourceBundle rb=ResourceBundle.getBundle("in.co.rb.app");
		Class.forName(rb.getString("driver"));
		Connection co = DriverManager.getConnection(rb.getString("url"),rb.getString("username"),rb.getString("password"));
		PreparedStatement pr = co.prepareStatement("select * from marksheet");
		ArrayList a = new ArrayList();
		ResultSet r = pr.executeQuery();
		 System.out.println("MeritList \n");
		  System.out.println("\tID\tRollNo\tPhy\tCha\tMath\tFNmae\tLName\thindi\teng");
		while (r.next()) {
			
			m.setId(+r.getInt(1));
			m.setRollno(r.getInt(2));
			m.setPhy(r.getInt(3));
			m.setChe(r.getInt(4));
			m.setMath(r.getInt(5));
			m.setFname(r.getString(6));
			m.setLname(r.getString(7));
			m.setEng(r.getInt(8));
			m.setEng(r.getInt(9));
			
			a.add("\n");
			
			a.add(m.getId());
			a.add(m.getRollno());
			a.add(m.getPhy());
			a.add(m.getChe());
			a.add(m.getMath());
			a.add(m.getFname());
			a.add(m.getLname());
			a.add(m.getHindi());
			a.add(m.getEng());
			

		}System.out.println();

		pr.close();
		co.close();
		return a;

	}

	public static MarksheetBeen getData(int i) throws Exception {
		ResourceBundle rb=ResourceBundle.getBundle("in.co.rb.app");
		Class.forName(rb.getString("driver"));
		Connection co = DriverManager.getConnection(rb.getString("url"),rb.getString("username"),rb.getString("password"));

		PreparedStatement pr = (PreparedStatement) co.prepareStatement("select * from marksheet where id =?");
		pr.setInt(1, i);
		ResultSet r = pr.executeQuery();
		MarksheetBeen m=new MarksheetBeen();
ArrayList a=new ArrayList();
		while (r.next()) {
			m.setId(+r.getInt(1));
			m.setRollno(r.getInt(2));
			m.setPhy(r.getInt(3));
			m.setChe(r.getInt(4));
			m.setMath(r.getInt(5));
			m.setFname(r.getString(6));
			m.setLname(r.getString(7));
			m.setHindi(r.getInt(8));
			m.setEng(r.getInt(9));
			

		}

		pr.close();
		co.close();
		return m;
	}

	public static void update(MarksheetBeen m) throws Exception {
		ResourceBundle rb=ResourceBundle.getBundle("in.co.rb.app");
		Class.forName(rb.getString("driver"));
		Connection co = DriverManager.getConnection(rb.getString("url"),rb.getString("username"),rb.getString("password"));
		PreparedStatement pr =  co.prepareStatement("update marksheet set rollno=?, phi =?,cha=?,math=?,fname=?, lname=?,hindi=?,eng=? where id = ?");

		pr.setInt(1, m.getRollno());
		pr.setInt(2, m.getPhy());
		pr.setInt(3, m.getChe());
		pr.setInt(4, m.getMath());
		pr.setString(5, m.getFname());
		pr.setString(6, m.getLname());
		pr.setInt(7, m.getHindi());
		pr.setInt(8, m.getEng());
		pr.setInt(9, m.getId());
		

		int r = pr.executeUpdate();

		System.out.println(r + "update");
		pr.close();
		co.close();

	}

	public static MarksheetBeen delete(int i) throws Exception {
		ResourceBundle rb=ResourceBundle.getBundle("in.co.rb.app");
		Class.forName(rb.getString("driver"));
		Connection co = DriverManager.getConnection(rb.getString("url"),rb.getString("username"),rb.getString("password"));
	PreparedStatement pr = (PreparedStatement) co.prepareStatement("delete from  marksheet where id =?");
		
		
		pr.setInt(1,i);
		int r = pr.executeUpdate();
		
		MarksheetBeen m=new MarksheetBeen();
		
		
		pr.close();
		co.close();
		return m;

	}

	public static ArrayList merit(MarksheetBeen m) throws Exception {
		ResourceBundle rb=ResourceBundle.getBundle("in.co.rb.app");
		Class.forName(rb.getString("driver"));
		Connection co = DriverManager.getConnection(rb.getString("url"),rb.getString("username"),rb.getString("password"));
			PreparedStatement pr = (PreparedStatement) co.prepareStatement(
				"SELECT fname,id,(phi+cha+math+hindi+eng) AS totle ,(phi+cha+math+hindi+eng)/5 AS persent FROM marksheet WHERE (phi>40 AND cha>40 AND math>40 And hindi>40 And eng>40 ) ORDER BY totle DESC LIMIT 0,6;");

		ResultSet r = pr.executeQuery();
		
		  System.out.println("MeritList \n");
		 
		 	
		ArrayList a=new ArrayList();
		while (r.next()) {
			
		a.add("\n");	
		a.add("\t" + r.getString(1));
		a.add("\t" + r.getString(2));
			
		a.add("\t" + r.getString(3));
		a.add("\t" + r.getString(4));

		}

		pr.close();
		co.close();
		return a;

	}
}
