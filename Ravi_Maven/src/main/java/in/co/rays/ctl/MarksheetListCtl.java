package in.co.rays.ctl;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.been.MarksheetBeen;
import in.co.rays.modale.MarksheetModel;
@WebServlet(urlPatterns = "/MarkshList")
public class MarksheetListCtl extends HttpServlet {

	private static final long serialVersionUID = 1L;
       
    
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MarksheetBeen b= new MarksheetBeen();
	
		
		  try {
			  ArrayList a = MarksheetModel.merit(b);
		  RequestDispatcher r = request.getRequestDispatcher("MarkshList.jsp");
		
		   request.setAttribute("ml", a);
		  
		  r.forward(request, response);
		  
		  } catch (Exception e) { // TODO Auto-generated catch block
		  e.printStackTrace(); }
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
		 
		
		
	}
	
}
