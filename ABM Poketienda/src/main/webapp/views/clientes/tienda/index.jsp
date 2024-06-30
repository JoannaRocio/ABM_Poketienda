<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
	.flip-card {
	  background-color: transparent;
	  width: 300px;
	  height: 300px;
	  perspective: 1000px;
	  padding: 10px;
	}
	
	.flip-card-inner {
	  position: relative;
	  width: 100%;
	  height: 100%;
	  text-align: center;
	  transition: transform 0.6s;
	  transform-style: preserve-3d;
	  box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);
	}
	
	.flip-card:hover .flip-card-inner {
	  transform: rotateY(180deg);
	}
	
	.flip-card-front, .flip-card-back {
	  position: absolute;
	  width: 100%;
	  height: 100%;
	  -webkit-backface-visibility: hidden;
	  backface-visibility: hidden;
	}
	
	.flip-card-front {
	  background-color: #bbb;
	  color: black;
	}
	
	.flip-card-back {
	  background-color: #2980b9;
	  color: white;
	  transform: rotateY(180deg);
	}
</style>
	<title>Poketienda</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styles.css">
</head>
<body class="body-tienda">

<header>
	<div class="botonera-tienda">
		<button class="button-tienda">Tienda</button>
		<button class="button-tienda">Ver Carrito</button>
		<button class="button-tienda">Historial de Compras</button>
		<button class="button-tienda">Cuenta</button>
		<button class="button-tienda">Cerrar sesión</button>
	</div>
</header>


	<div class="articulos-tienda">

		<c:forEach var="articulo" items="${listita}">
			<tr>
				<td> 
					<div class="flip-card">
					  <div class="flip-card-inner">
					    <div class="flip-card-front">
					      <img src="img_avatar.png" alt="Avatar" style="width:300px;height:300px;">
					    </div>
					    <div class="flip-card-back">
					      <h1><c:out value="${articulo.nombreArticulo}"/></h1> 
					      <p>Cantidad en stock: <c:out value="${articulo.cantidad}"/></p> 
					      <p>Precio: $<c:out value="${articulo.precio}"/></p>
					      <button>Agregar al carrito</button>
					    </div>
					  </div>
					</div>
				</td>
			</tr>
		</c:forEach>
		
	</div>

</body>
</html>