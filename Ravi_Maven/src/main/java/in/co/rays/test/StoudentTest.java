package in.co.rays.test;

import java.util.ArrayList;
import java.util.Iterator;

import in.co.rays.been.RajistrationBeen;
import in.co.rays.been.StoudentBeen;
import in.co.rays.modale.RajistrationModel;
import in.co.rays.modale.StoudentModel;

public class StoudentTest {
	public static void main(String[] args) throws Exception {

		//testAdd("ram", "kumar", "235", "2000-01");

		// testupdate("ravi","prakash","234","2010-13");
		 testDelete("235");

	}

	
	  private static void testDelete(String i) throws Exception {
	  
	  
	  
	  StoudentModel mb = new StoudentModel();
	  
	  
	  StoudentBeen m=mb.delete(i);
	  
	  ArrayList a=new ArrayList();
	  a.add("\n");
	  
	  a.add(m.getName());
	  a.add(m.getRollno());
	  
	  
	  System.out.println("ID "+i+" deleted");
	  
	  System.out.println("\tname\tid"); Iterator it
	  = a.iterator();
	  
	  while (it.hasNext()) { System.out.print(it.next() +"\t"); }
	  
	  
	  
	  
	  }
	  
	  
	  
	  private static void testupdate(String name,String lname,String rno,String son) throws Exception {
	  
	  StoudentBeen m = new StoudentBeen();
	  
	  m.setName(name);
	  m.setLname(lname); 
	  m.setRollno(rno);
	  m.setSession(son);
	 
	  
	  StoudentModel mb = new StoudentModel();
	  mb.update(m);
	  
	  }
	 

	private static void testAdd(String name, String lname, String id, String pass)
			throws Exception {

		StoudentBeen m = new StoudentBeen();
		m.setName(name);
		m.setLname(lname);
		m.setRollno(id);
		m.setSession(pass);
	

		StoudentModel mb = new StoudentModel();
		mb.add(m);

	}
}
