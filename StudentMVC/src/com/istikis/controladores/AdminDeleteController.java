package com.istikis.controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.istikis.repositorios.StudentTreeMap;

@WebServlet("/admin/deletestudent")
public class AdminDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Solicitamos el parámetro "id" para poder ejecutar el borrado desde el TreeMap
		String id = request.getParameter("id");
		StudentTreeMap.getInstancia().deleteStudent(Long.parseLong(id));
		
		// se direcciona a una url specifica + añadimos el <base> como metodo y sumamos la url faltante en String 
		response.sendRedirect(request.getContextPath() + "/admin/index");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
