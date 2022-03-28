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

import in.co.rays.been.Loginb;
import in.co.rays.been.RajistrationBeen;
import in.co.rays.modale.Loginm;
import in.co.rays.modale.RajistrationModel;

@WebServlet(urlPatterns = "/RjistrationCtl")
public class RjistrationCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RajistrationBeen b = new RajistrationBeen();
		b.setName(request.getParameter("name"));
		b.setLname(request.getParameter("lname"));
		b.setEmaild(request.getParameter("id"));
		b.setPass(request.getParameter("pass"));
		b.setGender(request.getParameter("gen"));
		b.setDOB(request.getParameter("date"));

		response.setContentType("text/html");

		try {

			if (b.getName()== "") {
				RequestDispatcher r = request.getRequestDispatcher("RajistrationView.jsp");
				request.setAttribute("msg", "plese enter value");
				r.forward(request, response);
				
				}
				if(b.getLname()==""){
					RequestDispatcher r2 = request.getRequestDispatcher("RajistrationView.jsp");
					request.setAttribute("msg1", "plese enter value");
					r2.forward(request, response);
					}
					if(b.getEmaild()==""){
						RequestDispatcher r3 = request.getRequestDispatcher("RajistrationView.jsp");
						request.setAttribute("msg2", "plese enter value");
						r3.forward(request, response);
					}
						if(b.getPass()==""){
							RequestDispatcher r4 = request.getRequestDispatcher("RajistrationView.jsp");
							request.setAttribute("msg3", "plese enter value");
							r4.forward(request, response);
						}
							if(b.getGender()==""){
								RequestDispatcher r5 = request.getRequestDispatcher("RajistrationView.jsp");
								request.setAttribute("msg4", "plese enter value");
								r5.forward(request, response);
								}
								if(b.getDOB()=="") {
									RequestDispatcher r6 = request.getRequestDispatcher("RajistrationView.jsp");
									request.setAttribute("msg5", "plese enter value");
									r6.forward(request, response);
								}
									else {HttpSession se=request.getSession();
										RajistrationModel.add(b);
										RajistrationBeen s=Loginm.getName((b.getEmaild()));
										
										se.setAttribute("msg1", s.getName());
										RequestDispatcher r6 = request.getRequestDispatcher("welcome.jsp");
										
										r6.forward(request, response);
											}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}