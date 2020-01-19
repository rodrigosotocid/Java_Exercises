package com.istikis.controladores;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.istikis.modelos.Student;
import com.istikis.repositorios.Dao;
import com.istikis.repositorios.StudentTreeMap;

@WebServlet("/admin/student")
public class AdminStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String STUDENT_JSP = "/WEB-INF/vistas/admin/student.jsp";
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// https://w3api.com/wiki/Java:ServletRequest.getParameter()
		// obtiene un String con el valor del parametro o null si no existe
		String id = request.getParameter("id");
		String op = request.getParameter("op");
		
		if(id != null) {
			Student student = StudentTreeMap.getInstancia().getById(Long.parseLong(id));
			request.setAttribute("student", student);
		}
		
		request.setAttribute("op", op);
		request.setAttribute("primeravez", true);
		request.getRequestDispatcher(STUDENT_JSP).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		Dao<Student> dao = StudentTreeMap.getInstancia();
		
		String op = request.getParameter("op");
		String id = request.getParameter("id");
		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellidos");
		String sexo = request.getParameter("sexo");
		//Date fecha = request.getParameter());
		
	}

}
