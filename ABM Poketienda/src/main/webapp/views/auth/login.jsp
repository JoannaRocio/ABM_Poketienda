<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>  
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styles.css">
		<title>Poketienda</title>
	</head>
	<body class="body-login">
		<div class="container-login">
			<div>
				<h3>Iniciar sesión CLIENTE</h3>
			</div>
			<form class="form-login" action="auth" method="post">
			
				<p class="">
					<label class="label-login">Usuario:</label>
					<input class="input-login" type="text" name="username" placeholder="Ingrese su usuario"/>
			<%-- 		<select name="empleado_id">
							<c:forEach var="empleado" items="${empleados}">
								<option value="${empleado.id}">${empleado.nombre}</option>
							</c:forEach>
					</select> --%>
				</p>
				
				<p class="">
					<label class="label-login">Contraseña: </label>
					<input class="input-login" type="password" name="pass" placeholder="Ingrese su contraseña"/>
				</p>
				
				<p>
				
					<a href="auth?accion=login-admin">Ingresar como Empleado</a>
				</p>
				 <input type="hidden" value="panel-cliente" name="accion"/>
				 <input class="button-login" type="submit" value="Ingresar"/>
				 
			</form>
		</div>
	</body>
</html>