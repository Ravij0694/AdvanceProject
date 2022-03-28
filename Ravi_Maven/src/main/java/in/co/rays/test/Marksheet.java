package in.co.rays.test;

import java.util.ArrayList;
import java.util.Iterator;

import in.co.rays.been.MarksheetBeen;
import in.co.rays.modale.MarksheetModel;

public class Marksheet {
	public static void main(String[] args) throws Exception {
		testAdd(04,123,"sher","vai",78,89,92,45,55);

			// testGetdata(2);
			// testupdate(2,323,"veeru","sahstrabuddhe",99,97,73,89,99);
			//testDelete(25);
			
			
			//testSelect();
			 
			//meritList();
			
			
			}
		

		private static void meritList() throws Exception {
	MarksheetBeen m= new MarksheetBeen();
			MarksheetModel mb = new MarksheetModel();
			ArrayList a= mb.merit(m);
			
			Iterator it = a.iterator();
			  a.toString();
			  while (it.hasNext()) { 
				  System.out.print(it.next() +"\t");
				  }

		}

		private static void testDelete(int i) throws Exception {

		

			MarksheetModel mb = new MarksheetModel();
			MarksheetBeen m=mb.delete(i);
			ArrayList a=new ArrayList();
			a.add("\n");
			
			a.add(m.getId());
			a.add(m.getRollno());
			a.add(m.getPhy());
			a.add(m.getChe());
			a.add(m.getMath());
			a.add(m.getFname());
			a.add(m.getLname());
			 System.out.println("ID "+i+" deleted");
			  System.out.println("\tID\tRollNo\tPhy\tCha\tMath\tFNmae\tLName");
			  Iterator it = a.iterator();
			   
			  while (it.hasNext()) { System.out.print(it.next() +"\t"); }
			 
			 		


		}

		private static void testGetdata(int j) throws Exception {
			MarksheetModel mb = new MarksheetModel();
			MarksheetBeen m=mb.getData(j);
			ArrayList a=new ArrayList();
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
			  System.out.println("\tID\tRollNo\tPhy\tCha\tMath\tFNmae\tLName\thindi\teng");
			  Iterator it = a.iterator();
			  
			  while (it.hasNext()) { System.out.print(it.next() +"\t"); }
			 		

		}

		private static void testupdate(int id, int rno, String n, String ln, int p, int c, int mt,int hi,int en) throws Exception {

			MarksheetBeen m = new MarksheetBeen();
			m.setId(id);
			m.setRollno(rno);
			m.setFname(n);
			m.setLname(ln);
			m.setPhy(p);
			m.setChe(c);
			m.setMath(mt);
			m.setHindi(hi);
			m.setEng(en);

			MarksheetModel mb = new MarksheetModel();
			mb.update(m);

		}

		private static void testSelect() throws Exception {
			MarksheetModel mb = new MarksheetModel();
			MarksheetBeen m = new MarksheetBeen();
			ArrayList a = mb.select(m);
			Iterator it = a.iterator();
			  
			 while (it.hasNext()) {
				 System.out.print(it.next() +"\t");
				 }

		}

		private static void testAdd(int id, int rno, String n, String ln, int p, int c, int mt,int hi,int en) throws Exception {

			MarksheetBeen m = new MarksheetBeen();
		    m.setId(id);
			m.setRollno(rno);
			m.setFname(n);
			m.setLname(ln);
			m.setPhy(p);
			m.setChe(c);
			m.setMath(mt);
			m.setHindi(hi);
			m.setEng(en);
			MarksheetModel mb = new MarksheetModel();
			mb.add(m);

		}

}
