package in.co.rays.modale;



import in.co.rays.been.RajistrationBeen;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class RajistrationModel {
	
	public static int nextpk() throws Exception {
		int pk =0;
		ResourceBundle rb=ResourceBundle.getBundle("in.co.rb.app");
		Class.forName(rb.getString("driver"));
		 Connection co = DriverManager.getConnection(rb.getString("url"),rb.getString("username"),rb.getString("password"));
		 co.setAutoCommit(false);
		 PreparedStatement ps = co.prepareStatement("select max(id)from rjistration");
		
		 
		 ResultSet rs =ps.executeQuery();
		while (rs.next()) {
			pk= rs.getInt(1);
		}
		 
		 return pk+1;
		
	}
	public static void add(RajistrationBeen b) throws Exception {
		ResourceBundle rb=ResourceBundle.getBundle("in.co.rb.app");
		Class.forName(rb.getString("driver"));
		Connection co = DriverManager.getConnection(rb.getString("url"),rb.getString("username"),rb.getString("password"));

		co.setAutoCommit(false);
		PreparedStatement pr =  co.prepareStatement("insert into rjistration values(?,?,?,?,?,?,?)");

		pr.setString(1, b.getName());
		pr.setString(2, b.getLname());
		pr.setString(3, b.getEmaild());
		pr.setString(4, b.getPass());
		pr.setString(5,b.getGender());
		pr.setString(6, b.getDOB());
		pr.setInt(7, nextpk());
		int r = pr.executeUpdate();
		co.commit();

		System.out.println(r + "inserted");
		pr.close();
		co.close();
	}

	
	public static void update(RajistrationBeen b) throws Exception {
		ResourceBundle rb=ResourceBundle.getBundle("in.co.rb.app");
		Class.forName(rb.getString("driver"));
		Connection co = DriverManager.getConnection(rb.getString("url"),rb.getString("username"),rb.getString("password"));
PreparedStatement pr =  co.prepareStatement("update  rjistration set Name=?, Lname=?, Pass =? ,Gender=?, DOB=? where Id = ?");


pr.setString(1, b.getName());
pr.setString(2, b.getLname());
pr.setString(3, b.getEmaild());
pr.setString(4, b.getPass());
pr.setString(5, b.getGender());
pr.setString(6, b.getDOB());
pr.setInt(7, b.getId());
		
		
		int r = pr.executeUpdate();

		System.out.println(r + "update");
		pr.close();
		co.close();

	}

	public static RajistrationBeen  delete(String i) throws Exception {
		ResourceBundle rb=ResourceBundle.getBundle("in.co.rb.app");
		Class.forName(rb.getString("driver"));
		Connection co = DriverManager.getConnection(rb.getString("url"),rb.getString("username"),rb.getString("password"));
	PreparedStatement pr = co.prepareStatement("delete from   rjistration where Id =?");
		
		
		pr.setString(1,i);
		int r = pr.executeUpdate();
		
		RajistrationBeen m=new RajistrationBeen();
		
		
		pr.close();
		co.close();
		return m;

	}
	
	
}
