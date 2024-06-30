<%-- <%@page import="repositories.EmpleadosRepoSingleton"%>
<%@page import="models.Empleado"%>
<%@page import="repositories.interfaces.EmpleadoRepo"%> --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%
/* 	EmpleadoRepo repo = EmpleadosRepoSingleton.getInstance();

	Empleado emple = repo.findById(2);
	
	request.setAttribute("empleado", emple); */
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mostrar Empleado</title>
</head>
<body>


<h1>Empleado</h1>

<p>Nombre: 
	<c:out value="${empleado.nombre}"></c:out> 
</p>

<p>Edad: 
	<c:out value="${empleado.edad}"></c:out> 
</p>

<p>Sueldo: 
	<c:out value="${empleado.sueldo}"></c:out> 
</p>

<c:if test="${empleado.fechaVueltaVacaciones != null}">
	<p>La persona se encuentra de vacaciones hasta el día: 
		<c:out value="${empleado.fechaVueltaVacaciones}" 
		default="No se encuentra de vacaciones."></c:out>
	</p>
</c:if>

<h4>Modificar Vacaciones</h4>

<form action="empleados" method="post">
	<input name="accion" value="vacaciones" type="hidden">
	<input name="id" value="${empleado.id}" type="hidden">
	<p>
		<input name="dia" size="1" value="1">/ <input name="mes" size="1" value="01">/ <input name="anio" size="3" value="2024">
		<input type="submit" value="Guardar">
	</p>
</form>


<h1>Eliminar:</h1>

<form action="empleados" method="post">
	<input type="hidden" name="id" value="${empleado.id}">	
	<input type="hidden" name="accion" value="delete">
	<input type="submit" value="Eliminar empleado">
</form>


</body>
</html>