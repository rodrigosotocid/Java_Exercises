<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/vistas/includes/head.jsp"%>

<div class="row">

	<form action="admin/student" method="post"
		class="offset-xl-3 offset-md-2 offset-sm-1 col-sm-10 col-md-8 col-xl-6 mt-5 mb-5">

		<fieldset>
			<legend class="mb-5">Estudiante</legend>

			<input type="hidden" id="op" name="op" value="${op}">

			<div class="form-group row">
				<label for="id" class="col-sm-2 col-form-label">Id</label>
				<div class="col-sm-10">
					<input 
						type="number" 
						class="form-control" 
						id="id" 
						name="id"
						value="${student.id}" 
						readonly>
				</div>
			</div>
			<div class="form-group row">
				<label for="nombre" class="col-sm-2 col-form-label">Nombre</label>
				<div class="col-sm-10">
					<input
						class="form-control ${primeravez ? '' : (student.errorNombre == null ? 'is-valid' : 'is-invalid') }"
						id="nombre" 
						name="nombre" 
						value="${student.nombre}">
					<div class="invalid-feedback">${student.errorNombre}</div>
				</div>

			</div>
			<div class="form-group row">
				<label for="apellidos" class="col-sm-2 col-form-label">Apellidos</label>
				<div class="col-sm-10">
					<input 
						type="text"
						class="form-control ${primeravez ? '' : (student.errorApellidos == null ? 'is-valid' : 'is-invalid') }"
						id="apellidos" 
						name="apellidos" 
						value="${student.apellidos}">
					<div class="invalid-feedback">${student.errorApellidos}</div>
				</div>

			</div>
			<div class="form-group">
				<div class="row">
					<div class="col-form-label col-sm-2 pt-0">Sexo</div>
					<div class="col-sm-10">
						<div class="form-check">
							<input 
								class="form-check-input" 
								type="radio" 
								name="sexo"
								id="gridRadios1" 
								value="male" checked> 
								
								<label 
									class="form-check-label"
									for="sexo"> Masculino 
								</label>
						</div>
						<div class="form-check">
							<input 
								class="form-check-input" 
								type="radio" 
								name="sexo"
								id="gridRadios2" 
								value="female"><label class="form-check-label" for="sexo"> Femenino 
								</label>
						</div>
					</div>
				</div>
			</div>

			<div class="form-group row">
				<label for="date" class="col-sm-2 col-form-label">Fecha	Nacimiento</label>
				<div class="col-sm-10">
					<input 
						type="date"
						class="form-control"
						id="fecha" 
						name="fecha" 
						value="${student.fechaNacimiento}">
						
					<div class="invalid-feedback"></div>
				</div>

			</div>

			<div class="form-group row">
				<div class="offset-sm-2 col-sm-10">
					<button type="submit" class="btn btn-primary">Aceptar</button>
				</div>
			</div>
		</fieldset>

	</form>

</div>

<%@ include file="/WEB-INF/vistas/includes/footer.jsp"%>