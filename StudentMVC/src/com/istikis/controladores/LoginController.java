package com.istikis.controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final String LOGIN_JSP = "/WEB-INF/vistas/login.jsp";
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher(LOGIN_JSP).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String pasword = request.getParameter("pasword");
		
		if("rodrigosoto@mail.com".equals(email) && "contra".equals(pasword)) {
			request.getSession().setAttribute("email", email);
			response.sendRedirect("admin/index");
		}else {
			request.setAttribute("alertatexto", "El login no es correcto!");
			request.setAttribute("alertanivel", "danger");
			request.setAttribute("email", email);
			
			request.getRequestDispatcher(LOGIN_JSP).forward(request, response);
		}
		
		
	}

}
