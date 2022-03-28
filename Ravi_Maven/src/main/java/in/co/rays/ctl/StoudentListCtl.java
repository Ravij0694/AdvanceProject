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

import in.co.rays.been.StoudentBeen;
import in.co.rays.modale.StoudentModel;
@WebServlet(urlPatterns = "/StoudentList")
public class StoudentListCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		StoudentBeen b=new StoudentBeen();
		try {
			List<StoudentBeen> a=StoudentModel.select(b);
			
			RequestDispatcher r3 = request.getRequestDispatcher("StoudentListView.jsp");
			
			request.setAttribute("List", a);
			r3.forward(request, response);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
	}

}
