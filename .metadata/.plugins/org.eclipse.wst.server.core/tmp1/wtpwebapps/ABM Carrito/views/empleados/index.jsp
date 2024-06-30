<%-- <%@page import="models.Empleado"%>
<%@page import="java.util.List"%>
<%@page import="repositories.EmpleadosRepoSingleton"%>
<%@page import="repositories.interfaces.EmpleadoRepo"%> --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%
/* 	EmpleadoRepo repo = EmpleadosRepoSingleton.getInstance();
	List<Empleado> listaEmple = repo.getAll();
	
	request.setAttribute("listita", listaEmple); */
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Empleados</title>
</head>
<body>

	<h1>Hola <c:out value="${sessionScope.empleado.nombre}" default="Desconocido"></c:out></h1>
	
	<a href="empleados?accion=create">Agregar empleado</a>
	
	<table border="1">
		<thead>
			<tr>
				<th>ID</th>
				<th>Nombre</th>
				<th>Edad</th>
				<th>Sueldo</th>
				<th></th>
				<th></th>
				<th></th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach var="empleado" items="${listita}">
				<tr>
					<td> <c:out value="${empleado.id}"/> </td>
					<td> <c:out value="${empleado.nombre}"/> </td>
					<td> <c:out value="${empleado.edad}"/> </td>
					<td> <c:out value="${empleado.sueldo}"/> </td>
					<td> <a href="empleados?accion=show&id=${empleado.id}">Ver</a> </td>
					<td> <a href="empleados?accion=edit&id=${empleado.id}">Editar</a> </td>
					<td> <a href="empleados?accion=delete&id=${empleado.id}">Eliminar</a> </td>
				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
</html>