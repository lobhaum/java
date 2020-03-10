<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.alura.gerenciador.servlet.Empresa" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gerenciamento::Lista Empresas</title>
</head>
<body>
	<h1>Lista de empresas</h1>
	<ul>
		<c:forEach items="${ empresas }" var="empresa">
			<li>${ empresa.nome } ${ empresa.dataAbertura }</li>
		</c:forEach>
	</ul>
</body>
</html>