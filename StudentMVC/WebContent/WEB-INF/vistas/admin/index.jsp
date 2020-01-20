<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/vistas/includes/head.jsp"%>


<section id="students">
	<h2>Estudiantes</h2>
	<table 
		class="table table-striped table-bordered table-hover table-xl table-responsive">
		<thead>
			<tr>
				<th>Id</th>
				<th>Nombre</th>
				<th>Apellidos</th>
				<th>Sexo</th>
				<th>Fecha Nacimiento</th>
				<th>Opciones</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${students}" var="student">
				<tr>
					<th>${student.id}</th>
					<td>${student.nombre}</td>
					<td>${student.apellidos}</td>
					<td>
						<c:if test="${student.sexo == 'female' }">
							<a class="d-flex justify-content-center"><i class="icono-tabla-female fas fa-female"></i></a> 			
						</c:if>
						<c:if test="${student.sexo == 'male' }">
							<a class="d-flex justify-content-center"><i class="icono-tabla-male fas fa-male"></i></a> 			
						</c:if>
					</td>
					<td><fmt:formatDate pattern="yyyy-MM-dd" value="${student.fechaNacimiento}" /></td>
					<td>
						<a class="btn btn-secondary" href="admin/student?id=${student.id}&op=updateStudent">Modificar</a>
						<a class="btn btn-danger" href="admin/deletestudent?id=${student.id}">Borrar</a>
					</td>
				</tr>
		   </c:forEach>
		</tbody>
	</table>
	
	<a class="btn btn-primary mb-2" href="admin/student?op=addStudent">Añadir</a>
</section>


<%@ include file="/WEB-INF/vistas/includes/footer.jsp"%>