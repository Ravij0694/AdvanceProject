package in.co.rays.test;

import java.util.ArrayList;
import java.util.Iterator;

import in.co.rays.been.Loginb;
import in.co.rays.modale.Loginm;

public class Test {
	public static void main(String[] args) throws Exception {
	//testAdd("rav",1235);

		 //testGetdata(9);
		// testupdate(17,323,"veeru","sahstrabuddhe",99,97,73);
		//testDelete(18);
		
		
		//testSelect();
		 
		//meritList();
		
		//testAuthn("shy","rhy9");
	//String s=	Loginm.getName("");
	//	System.out.println(s);
		}
	


	
	  private static void testAuthn(String j,String i) throws Exception { 
		  Loginb m=new  Loginb();
	  
	  m.setUserid(j);
	  m.setPass(i);
	  
	// b= Loginm.authenticat(m);
	//  System.out.println(b);
	  }
	 



	private static void testDelete(int i) throws Exception {
	
		
	
			Loginm mb = new Loginm();
			
			
			Loginb m=mb.delete(i);
			ArrayList a=new ArrayList();
			a.add("\n");
			
			a.add(m.getUserid());
			a.add(m.getPass());
	
			 System.out.println("ID "+i+" deleted");
			  System.out.println("\tID\tRollNo\tPhy\tCha\tMath\tFNmae\tLName");
			  Iterator it = a.iterator();
			   
			  while (it.hasNext()) { System.out.print(it.next() +"\t"); }
			 
			 		
	
	
		}
	
		private static void testGetdata(int j) throws Exception {
			Loginm mb = new Loginm();
			Loginb m= mb.getData(j);
			ArrayList a=new ArrayList();
			a.add("\n");
			
			a.add(m.getUserid());
			a.add(m.getPass());
			
			  System.out.println("\tID\tRollNo\tPhy\tCha\tMath\tFNmae\tLName");
			  Iterator it = a.iterator();
			  
			  while (it.hasNext()) { System.out.print(it.next() +"\t"); }
			 		
	
		}
	
		private static void testupdate(String id, String pass) throws Exception {
	
			Loginb m = new Loginb();
			m.setUserid(id);
			m.setPass(pass);
			
	
			Loginm mb = new Loginm();
			mb.changePass(m);
	
		}
	
		private static void testSelect() throws Exception {
			Loginm mb = new Loginm();
			Loginb m = new Loginb();
			ArrayList a = mb.select(m);
			Iterator it = a.iterator();
			  
			 while (it.hasNext()) {
				 System.out.print(it.next() +"\t");
				 }
	
		}
	
		private static void testAdd(String id, String pass ) throws Exception {
	
			Loginb m = new Loginb();
		    m.setUserid(id);
			m.setPass(pass);
		
	
			Loginm mb = new Loginm();
			mb.add(m);
	
		}
	
	}
	


