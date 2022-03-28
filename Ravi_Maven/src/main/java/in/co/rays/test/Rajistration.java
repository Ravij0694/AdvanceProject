package in.co.rays.test;

import java.util.ArrayList;
import java.util.Iterator;

import in.co.rays.been.RajistrationBeen;

import in.co.rays.modale.RajistrationModel;

public class Rajistration {
	public static void main(String[] args) throws Exception {

		testAdd("rama", "kumari", "rama", "12356", "femail", "13/01/95");

		// testupdate("ravi","prakash","1","123r","male","13/01/92");
		// testDelete("1");

	}

	
	  private static void testDelete(String i) throws Exception {
	  
	  
	  
	  RajistrationModel mb = new RajistrationModel();
	  
	  
	  RajistrationBeen m=mb.delete(i);
	  
	  ArrayList a=new ArrayList(); a.add("\n");
	  
	  a.add(m.getName()); a.add(m.getId());
	  
	  
	  System.out.println("ID "+i+" deleted");
	  
	  System.out.println("\tname\tid"); Iterator it
	  = a.iterator();
	  
	  while (it.hasNext()) { System.out.print(it.next() +"\t"); }
	  
	  
	  
	  
	  }
	  
	  
	  
	  private static void testupdate(String name,String lname,String id,String
	  pass,String gender,String DOB) throws Exception {
	  
	  RajistrationBeen m = new RajistrationBeen();
	  
	  m.setName(name); m.setLname(lname); m.setEmaild(id); m.setPass(pass);
	  m.setGender(gender); m.setDOB(DOB);
	  
	  RajistrationModel mb = new RajistrationModel(); mb.update(m);
	  
	  }
	 

	private static void testAdd(String name, String lname, String id, String pass, String gender, String DOB)
			throws Exception {

		RajistrationBeen m = new RajistrationBeen();
		m.setName(name);
		m.setLname(lname);
		m.setEmaild(id);
		m.setPass(pass);
		m.setGender(gender);
		m.setDOB(DOB);

		RajistrationModel mb = new RajistrationModel();
		mb.add(m);

	}
}
