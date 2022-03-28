package in.co.rays.ctl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.co.rays.been.RajistrationBeen;
import in.co.rays.been.StoudentBeen;
import in.co.rays.modale.Loginm;
import in.co.rays.modale.RajistrationModel;
import in.co.rays.modale.StoudentModel;

@WebServlet(urlPatterns = "/StoudentCtl")
public class StoudentCtl extends HttpServlet{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try {HttpSession s=request.getSession();
		StoudentBeen	l=(StoudentBeen)StoudentModel.getData((Integer) s.getAttribute("id"));
		
		RequestDispatcher r = request.getRequestDispatcher("StoudentView.jsp");
		request.setAttribute("m", l);
		String m=(String)request.getAttribute("mg");
		
		if(m!=null) {
		request.setAttribute("mg", s);}
		r.forward(request, response);
	
		}catch(Exception e) {}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		StoudentBeen b = new StoudentBeen();
		b.setName(request.getParameter("name"));
		b.setLname(request.getParameter("lname"));
		b.setRollno(request.getParameter("rollno"));
		b.setSession(request.getParameter("session"));
	
	
		try {
		

			
					/*if(b.getRollno()==""){
						RequestDispatcher r3 = request.getRequestDispatcher("StoudentView.jsp");
						request.setAttribute("mg3", "plese enter value");
						r3.forward(request, response);
					}*/


						
							 String s=request.getParameter("po");
							 if(s.equals("Add")) {
							StoudentModel.add(b);
							doGet(request, response);
							
							
							request.setAttribute("mg", "succsesfully Added");
						
							 }
							 else if(s.equals("Update")) {
								 	StoudentModel.update(b);
								 	doGet(request, response);
									
									
									request.setAttribute("mg", "succsesfully Update");
									
									 }
							 else if(s.equals("Delit")) {
									StoudentModel.delete(b.getRollno());
									
									doGet(request, response);
									request.setAttribute("mg", "succsesfully delited");
									
									 }
							

} catch (Exception e) {
	RequestDispatcher r6 = request.getRequestDispatcher("StoudentView.jsp");
	
	request.setAttribute("mg", "Someting went Wrong");
	r6.forward(request, response);
e.printStackTrace();
}
	
	}
	
	
	
}
/*
 * StoudentBeen b1=StoudentModel.getData(b.getRollno()); RequestDispatcher r5 =
 * request.getRequestDispatcher("StoudentView.jsp");
 * 
 * request.setAttribute("bean", b1);
 * 
 * r5.forward(request, response);
 */