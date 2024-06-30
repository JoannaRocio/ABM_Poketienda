<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Creación proyecto</title>
</head>
<body>

	<h1>Bienvenido al carrito</h1>
	
	<p>
		Encargado:
		<c:out value="${carrito.lider.nombre} (${carrito.lider.edad} años)"/>
	</p>
	
	<p>
		Presupuesto: $
		<c:out value="${carrito.presupuesto}"/>
	</p>
	
	<h3>Cambiar presupuesto</h3>
	<form action="crear" method="post">
		<input type="hidden" value="modifpre" name="accion"/>
		<input name="importe" />
		<input type="submit" value="Cargar"/>
	</form>

</body>
</html>