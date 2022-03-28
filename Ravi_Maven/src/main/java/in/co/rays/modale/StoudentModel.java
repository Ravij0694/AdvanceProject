package in.co.rays.modale;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import in.co.rays.been.Loginb;
import in.co.rays.been.StoudentBeen;

public class StoudentModel {
	public static int nextpk() throws Exception {
		int pk =0;
		ResourceBundle rb=ResourceBundle.getBundle("in.co.rb.app");
		Class.forName(rb.getString("driver"));
		 Connection co = DriverManager.getConnection(rb.getString("url"),rb.getString("username"),rb.getString("password"));
		 co.setAutoCommit(false);
		 PreparedStatement ps = co.prepareStatement("select max(id)from Stoudent");
		
		 
		 ResultSet rs =ps.executeQuery();
		while (rs.next()) {
			pk= rs.getInt(1);
		}
		 
		 return pk+1;
		
	}
	public static void add(StoudentBeen b) throws Exception {
		ResourceBundle rb=ResourceBundle.getBundle("in.co.rb.app");
		Class.forName(rb.getString("driver"));
		Connection co = DriverManager.getConnection(rb.getString("url"),rb.getString("username"),rb.getString("password"));

		co.setAutoCommit(false);
		PreparedStatement pr =  co.prepareStatement("insert into Stoudent values(?,?,?,?,?)");

		pr.setString(1, b.getName());
		pr.setString(2, b.getLname());
		pr.setString(3, b.getRollno());
		pr.setString(4, b.getSession());
		pr.setInt(5,nextpk());
	
		int r = pr.executeUpdate();
		co.commit();

		System.out.println(r + "inserted");
		pr.close();
		co.close();
	}


	public static void update(StoudentBeen b) throws Exception {
		ResourceBundle rb=ResourceBundle.getBundle("in.co.rb.app");
		Class.forName(rb.getString("driver"));
		Connection co = DriverManager.getConnection(rb.getString("url"),rb.getString("username"),rb.getString("password"));
PreparedStatement pr =  co.prepareStatement("update  Stoudent set Name=?, Lname=?, session =? where rollno = ?");


pr.setString(1, b.getName());
pr.setString(2, b.getLname());

pr.setString(3, b.getSession());
pr.setString(4, b.getRollno());

		
		
		int r = pr.executeUpdate();

		System.out.println(r + "update");
		pr.close();
		co.close();

	}

	public static StoudentBeen  delete(String i) throws Exception {
		ResourceBundle rb=ResourceBundle.getBundle("in.co.rb.app");
		Class.forName(rb.getString("driver"));
		Connection co = DriverManager.getConnection(rb.getString("url"),rb.getString("username"),rb.getString("password"));
	PreparedStatement pr = co.prepareStatement("delete from   Stoudent where rollno =?");
		
		
		pr.setString(1,i);
		int r = pr.executeUpdate();
		
		StoudentBeen m=new StoudentBeen();
		
		
		pr.close();
		co.close();
		return m;

	}

	public static StoudentBeen getData(int i) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("in.co.rb.app");
		Class.forName(rb.getString("driver"));
		Connection co = DriverManager.getConnection(rb.getString("url"), rb.getString("username"),
				rb.getString("password"));

		PreparedStatement pr = (PreparedStatement) co.prepareStatement("select * from Stoudent where id =?");
		pr.setInt(1, i);
		ResultSet r = pr.executeQuery();
		StoudentBeen m = new StoudentBeen();
		ArrayList a=new ArrayList();
		while (r.next()) {
			m.setName(r.getString(1));
			m.setLname(r.getString(2));
			m.setRollno(r.getString(3));
			m.setSession(r.getString(4));
			a.add(m);
		}

		pr.close();
		co.close();
		return m;
	}

	public static List<StoudentBeen> select(StoudentBeen m) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("in.co.rb.app");
		Class.forName(rb.getString("driver"));
		Connection co = DriverManager.getConnection(rb.getString("url"), rb.getString("username"),
				rb.getString("password"));
		PreparedStatement pr = co.prepareStatement("select * from Stoudent");
		ArrayList<StoudentBeen> a = new ArrayList<StoudentBeen>();
		ResultSet r = pr.executeQuery();
		
		while (r.next()) {

			m.setName(r.getString(1));
			m.setLname(r.getString(2));
			m.setRollno(r.getString(3));
			m.setSession(r.getString(4));

		
			
			a.add(m);
			System.out.println(m.getName()+" -----------");

		}
		System.out.println();

		pr.close();
		co.close();
		return a;

	}
	
}
