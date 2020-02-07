<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="/WEB-INF/vistas/layout/head.jsp"%>
<section class="container mt-3">
	<div class="row d-flex align-content-center">
		<div class="col col-sm-8 offset-2">
		
			<h3 class="mb-4">Área Clientes</h3>
			<form>
				<div class="form-group row">
					<label for="nombre" class="col-sm-2 col-form-label">Nombre</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="nombre">
					</div>
				</div>
				<div class="form-group row">
					<label for="apellidos" class="col-sm-2 col-form-label">Apellidos</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="apellidos">
					</div>
				</div>
					<div class="form-group row">
					<label for="dni" class="col-sm-2 col-form-label">DNI</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="dni">
					</div>
				</div>
				<div class="form-group row">
					<label for="fecha" class="col-sm-2 col-form-label">Fecha</label>
					<div class="col-sm-10">
						<input type="date" class="form-control" id="fecha">
					</div>
				</div>
				<div class="row">				
					  <label for="apellidos" class="col-sm-2 col-form-label">Servicios</label>
					  <div class="col">
					    <div class="list-group" id="list-tab" role="tablist">
					      <a class="list-group-item list-group-item-action active" id="list-home-list" data-toggle="list" href="#list-home" role="tab" aria-controls="home">Masaje Facial</a>
					      <a class="list-group-item list-group-item-action" id="list-profile-list" data-toggle="list" href="#list-profile" role="tab" aria-controls="profile">Drenaje Linfático</a>
					      <a class="list-group-item list-group-item-action" id="list-messages-list" data-toggle="list" href="#list-messages" role="tab" aria-controls="messages">Cobertura de Algas</a>
					      <a class="list-group-item list-group-item-action" id="list-settings-list" data-toggle="list" href="#list-settings" role="tab" aria-controls="settings">Cobertura de Barro</a>
					    </div>
					  </div>					  
				</div>
				<div class="form-group row">
					<div class="col-sm-2">Valoración</div>
					<div class="col-sm-10">
						<div class="form-check">
							
							<input class="form-check-input" type="checkbox" id="gridCheck1">
							<input class="form-check-input" type="checkbox" id="gridCheck2">
							<input class="form-check-input" type="checkbox" id="gridCheck3">
							
						</div>
					</div>
				</div>
				<div class="form-group row">
					<div class="col-sm-10">
						<button type="submit" class="btn btn-primary">Sign in</button>
					</div>
				</div>
				<div class="form-group row">
					<div class="col-sm-10">
						<button type="submit" class="btn btn-primary">Sign Out</button>
					</div>
				</div>
			</form>
		</div>
	</div>
</section>


<%@ include file="/WEB-INF/vistas/layout/footer.jsp"%>