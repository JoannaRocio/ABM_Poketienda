<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  
<h1>Alta</h1> 

<form action="empleados" method="post">
	<!-- <p>ID: <input value="" name="id" /></p> -->
	<input type="hidden" value="insert" name="accion"/>
	<p>Nombre: <input value="" name="nombre" /></p>
	<p>Edad: <input value="" name="edad" /></p>
	<p>Sueldo: <input value="" name="sueldo" /></p>
	
	<input type="submit" value="Registrar"/>

</form> 

</body>
</html>