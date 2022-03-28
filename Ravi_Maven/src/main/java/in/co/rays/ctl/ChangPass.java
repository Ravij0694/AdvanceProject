package in.co.rays.ctl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.been.Loginb;
import in.co.rays.modale.Loginm;
@WebServlet(urlPatterns = "/ChangPass")
public class ChangPass extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		

	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Loginb b=new Loginb();
		b.setUserid(request.getParameter("id")); 
		b.setPass((request.getParameter("pass"))); 
		
		try {
			Loginm.changePass(b);
			RequestDispatcher r = request.getRequestDispatcher("ChangPassView.jsp");
			request.setAttribute("pass", b.getPass());
			r.forward(request, response);
		} catch (Exception e) {
			RequestDispatcher r = request.getRequestDispatcher("ChangPassView.jsp");
			
			r.forward(request, response);
			e.printStackTrace();
		}
      }
		
	
	
	}
