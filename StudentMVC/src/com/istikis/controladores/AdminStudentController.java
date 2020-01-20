package com.istikis.controladores;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		String fecha = request.getParameter("fecha");

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Student student = null;
//		response.getWriter().println(id);
//		response.getWriter().println(op);	
//	    response.getWriter().println(nombre);
//		response.getWriter().println(apellidos);
//		response.getWriter().println(sexo);
//		response.getWriter().println(fecha);
		
		switch (op) {
		case "addStudent":
			
			try {
				student = new Student(nombre, apellidos, sexo, sdf.parse(fecha));
			} catch (ParseException e1) {
				e1.printStackTrace();
			}
		
			if(student.isCorrecto()) {
				dao.addStudent(student);
			}
			break;
		case "updateStudent":
			try {
				student = new Student(Long.parseLong(id),nombre, apellidos, sexo, sdf.parse(fecha));
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (ParseException e) {
				e.printStackTrace();
			}
			if(student.isCorrecto()) {
				dao.updateStudent(student);
			}
		break;

		default:
			throw new RuntimeException("Operación no reconocida");
		}
		
		if(student.isCorrecto()) {
			HttpSession session = request.getSession();
			session.setAttribute("alertatexto", "La operación " + op + " se ha realizado correctamente");
			session.setAttribute("alertanivel", "success");
			response.sendRedirect(request.getContextPath() + "/admin/index");
		}else {
			request.setAttribute("alertatexto", "Hay un error en el formulario. Revise los datos.");
			request.setAttribute("alertanivel", "danger");
			request.setAttribute("primeravez", false);
			request.setAttribute("op", op);
			request.setAttribute("student", student);
			request.getRequestDispatcher(STUDENT_JSP).forward(request, response);
		}
	}

}
