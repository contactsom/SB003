package com.simplilearn.cookies;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class CookieDemoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email=request.getParameter("email");
		Cookie cookies[]=request.getCookies();
		
		if(cookies!=null) {
			
			if(cookies.length!=0) {
				
				for (Cookie cookie : cookies) {
					String cookieName=cookie.getName();
					
					if(cookieName.equals("JSESSIONID")) {
						System.out.println("You are Old User as per JSESSIONID");
					}else {
						System.out.println("You Are New User as per JSESSIONID");
					}
					
					String cookeeValue=cookie.getValue();
					System.out.println("Cookee Value - "+cookeeValue);
					String cookieDomain=cookie.getDomain();
					System.out.println("Cookie Domain"+cookieDomain);
					
					
				}
			}else {
				System.out.println("No Cookie Found");
			}
		}else {
			System.out.println("No Cookie Found");
		}
		
		HttpSession sesion = request.getSession();
		boolean isNew=sesion.isNew();
		
		if(isNew) {
			System.out.println("You are the New User as per session");
		}else{
			System.out.println("You are the OLD User as per session");
		}
		
		Cookie c1= new Cookie("Email", email);
		response.addCookie(c1);
		
		Cookie c2= new Cookie("Phone", "99999");
		response.addCookie(c2);
		
		RequestDispatcher rd = request.getRequestDispatcher("cookiedemo.jsp");
		
		rd.forward(request, response);
	}
}