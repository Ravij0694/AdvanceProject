package in.co.rays.ctl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oracle.jrockit.jfr.RequestDelegate;

import in.co.rays.been.Loginb;
import in.co.rays.been.RajistrationBeen;
import in.co.rays.modale.Loginm;
import in.co.rays.modale.RajistrationModel;



@WebServlet(urlPatterns = "/ravi")

public class UserCtl extends HttpServlet {

	
	
	
	private static final long serialVersionUID = 1L;
    
	  
	  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession  sn=request.getSession();
		RequestDispatcher r = request.getRequestDispatcher("welcome.jsp");
		
		sn.setAttribute("msg1", rb.getName());
		System.out.println(rb.getName());
	    r.forward(request, response);
	}

	
	RajistrationBeen rb=new RajistrationBeen();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Loginb b=new Loginb();
		b.setUserid(request.getParameter("login")); 
		b.setPass((request.getParameter("pass"))); 
		

		response.setContentType("text/html");
    if(b.getUserid()=="" || b.getPass()=="") {
    	request.setAttribute("msg", "plese enter");
    }
	
		try {HttpSession  sn=request.getSession();
		
		if(Loginm.authenticat(b)==true) {
			
			RequestDispatcher r = request.getRequestDispatcher("welcome.jsp");
			 rb =Loginm.getName(b.getUserid());
			sn.setAttribute("msg1", rb.getName());
			sn.setAttribute("id", rb.getId());
		    r.forward(request, response);
		    
		}else {
			RequestDispatcher r = request.getRequestDispatcher("/LoginView.jsp");
			request.setAttribute("msg", "plese set currect value");
			r.forward(request, response);
			
		}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		HttpSession  s=request.getSession();
		s.setAttribute("login",b.getUserid());
		s.setAttribute("pass", b.getPass());

	}
}
