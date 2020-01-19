<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/vistas/includes/head.jsp"%>

<header class="jumbotron mt-3">
	<h1 class="display-6 text-center">Estudiantes del curso de MVC</h1>
</header>

<section id="student" class="row justify-content-between">

<c:forEach items="${students}" var="student">

		<article id="student" class="card col-12 col-sm-6 col-md-4 col-lg-3 col-xl-2 m-1 mb-2">
		
			<div class="card-body">
				<c:if test="${student.sexo == 'female'}">
					<a class="d-flex justify-content-center m-2"><i class="icono-card-female fas fa-female"></i></a> 			
				</c:if>
				<c:if test="${student.sexo == 'male'}">
					<a class="d-flex justify-content-center m-2"><i class="icono-card-male fas fa-male"></i></a> 			
				</c:if>
			
				<h3 class="card-title text-center mt-1">${student.nombre} ${student.apellidos}</h3>
				<p class="card-text text-center"><strong>Nacimiento:</strong> <fmt:formatDate pattern="yyyy-MM-dd" value="${student.fechaNacimiento}" /></p>
			</div>
		</article>
		
</c:forEach>
	
</section>
<%@ include file="/WEB-INF/vistas/includes/footer.jsp"%>