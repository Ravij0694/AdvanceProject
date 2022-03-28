package in.co.rays.ctl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.been.MarksheetBeen;
import in.co.rays.been.RajistrationBeen;
import in.co.rays.modale.Loginm;
import in.co.rays.modale.MarksheetModel;
import in.co.rays.modale.RajistrationModel;

@WebServlet(urlPatterns = "/rav")
public class MarksheetCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	

	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
	
		MarksheetBeen b=new MarksheetBeen();
		b.setId(Integer.parseInt(request.getParameter("id")));
		b.setFname(request.getParameter("name")); 
		b.setLname(request.getParameter("lname"));
		
		b.setRollno(Integer.parseInt(request.getParameter("rollno")));
		b.setPhy(Integer.parseInt(request.getParameter("phy")));
		b.setChe(Integer.parseInt(request.getParameter("che")));
		b.setMath(Integer.parseInt(request.getParameter("math")));
		b.setHindi(Integer.parseInt(request.getParameter("hindi")));
		b.setEng(Integer.parseInt(request.getParameter("eng")));
		response.setContentType("text/html");

		
		
					MarksheetModel.add(b);
			RequestDispatcher r = request.getRequestDispatcher("addmarksheetview.jsp");
			
			request.setAttribute("msg9", "SuccesfullyADD");
			
			r.forward(request, response);
									
			
		} catch (Exception e) {
			
RequestDispatcher r = request.getRequestDispatcher("addmarksheetview.jsp");
			
			request.setAttribute("msg9", "Plese Enter Currect Info");
			
			r.forward(request, response);
		}

		
	}
	
	
	
	

}
