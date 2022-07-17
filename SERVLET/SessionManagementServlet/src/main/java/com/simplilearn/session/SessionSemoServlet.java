package com.simplilearn.session;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SessionSemoServlet extends HttpServlet{

	public void service(HttpServletRequest request , HttpServletResponse response)throws IOException,ServletException {
		//1. Collect the data from Request
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		
		HttpSession session =request.getSession();
		
		System.out.println("Is New : "+session.isNew());
		System.out.println("Session ID : "+session.getId());
		System.out.println("Session Created Time : "+session.getCreationTime());
		System.out.println("Session Last Accessed Time "+session.getLastAccessedTime());
		
       ServletConfig sconfig = getServletConfig();
       ServletContext scontex = sconfig.getServletContext();
       
       /*Sending only Email to the user*/
       request.setAttribute("EM1", email);
       session.setAttribute("EM2", email);
       scontex.setAttribute("EM3", email);
       
       /*Home Work */
       /*Send the Name also*/

       RequestDispatcher rd = request.getRequestDispatcher("show.jsp");
       rd.forward(request, response);
       
       
	}
}