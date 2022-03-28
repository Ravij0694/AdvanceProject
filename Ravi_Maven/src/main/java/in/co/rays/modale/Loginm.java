package in.co.rays.modale;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.ResourceBundle;

import in.co.rays.been.Loginb;
import in.co.rays.been.RajistrationBeen;

public class Loginm {
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
	public static ArrayList select(Loginb m) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("in.co.rb.app");
		Class.forName(rb.getString("driver"));
		Connection co = DriverManager.getConnection(rb.getString("url"), rb.getString("username"),
				rb.getString("password"));
		PreparedStatement pr = co.prepareStatement("select * from login");
		ArrayList a = new ArrayList();
		ResultSet r = pr.executeQuery();
		System.out.println("MeritList \n");
		System.out.println("\tID\tRollNo\tPhy\tCha\tMath\tFNmae\tLName");
		while (r.next()) {

			m.setUserid(r.getString(1));
			m.setPass(r.getString(2));

			a.add("\n");

			a.add(m.getUserid());
			a.add(m.getPass());

		}
		System.out.println();

		pr.close();
		co.close();
		return a;

	}

	public static Loginb getData(int i) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("in.co.rb.app");
		Class.forName(rb.getString("driver"));
		Connection co = DriverManager.getConnection(rb.getString("url"), rb.getString("username"),
				rb.getString("password"));

		PreparedStatement pr = (PreparedStatement) co.prepareStatement("select * from login where id =?");
		pr.setInt(1, i);
		ResultSet r = pr.executeQuery();
		Loginb m = new Loginb();
		ArrayList a = new ArrayList();
		while (r.next()) {
			m.setUserid(r.getString(1));
			m.setPass(r.getString(2));
		}

		pr.close();
		co.close();
		return m;
	}

	public static void changePass(Loginb m) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("in.co.rb.app");
		Class.forName(rb.getString("driver"));
		Connection co = DriverManager.getConnection(rb.getString("url"), rb.getString("username"),
				rb.getString("password"));
		PreparedStatement pr = (PreparedStatement) co.prepareStatement("update rjistration set  pass =? where Emailid = ?");
		
		
		pr.setString(1, m.getPass());

		pr.setString(2, m.getUserid());
		
		int r = pr.executeUpdate();

		System.out.println(r + "update");
		pr.close();
		co.close();

	}

	public static Loginb delete(int i) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("in.co.rb.app");
		Class.forName(rb.getString("driver"));
		Connection co = DriverManager.getConnection(rb.getString("url"), rb.getString("username"),
				rb.getString("password"));
		PreparedStatement pr = (PreparedStatement) co.prepareStatement("delete from  login where id =?");

		pr.setInt(1, i);
		int r = pr.executeUpdate();

		Loginb m = new Loginb();

		pr.close();
		co.close();
		return m;

	}

	public static void add(Loginb m) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("in.co.rb.app");
		Class.forName(rb.getString("driver"));
		Connection co = DriverManager.getConnection(rb.getString("url"), rb.getString("username"),
				rb.getString("password"));

		co.setAutoCommit(false);
		PreparedStatement pr = co.prepareStatement("insert into login values(?,?,?)");

		pr.setString(1, m.getUserid());
		pr.setString(2, m.getPass());
        pr.setInt(3, nextpk());
		int r = pr.executeUpdate();
		co.commit();

		System.out.println(r + "inserted");
		pr.close();
		co.close();
	}

	public static Boolean authenticat(Loginb m) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("in.co.rb.app");
		Class.forName(rb.getString("driver"));
		Connection co = DriverManager.getConnection(rb.getString("url"), rb.getString("username"),rb.getString("password"));
		int t = 0;

		PreparedStatement pr = co.prepareStatement("select EmailId,pass from rjistration");


		ResultSet r = pr.executeQuery();
		RajistrationBeen m1 = new RajistrationBeen();
		while (r.next()) {
			m1.setEmaild(r.getString(1));
			m1.setPass(r.getString(2));
			
			 if (m.getUserid().equals(m1.getEmaild())&&m.getPass().equals(m1.getPass())) { 
				 t=1;
				}
				 }
		if(t==1) {return true;}
		else {return false;}


		}
	

	public static RajistrationBeen getName(String i) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("in.co.rb.app");
		Class.forName(rb.getString("driver"));
		Connection co = DriverManager.getConnection(rb.getString("url"), rb.getString("username"),rb.getString("password"));
		

		PreparedStatement pr = co.prepareStatement("select Name,id from rjistration where EmailId=?");
     
		pr.setString(1, i);

		ResultSet r = pr.executeQuery();
		RajistrationBeen m1 = new RajistrationBeen();
		while (r.next()) {
			m1.setName(r.getString(1));
			m1.setId(r.getInt(2));
	}
		return m1;

}
	

}
