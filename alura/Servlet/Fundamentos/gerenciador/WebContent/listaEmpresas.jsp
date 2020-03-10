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
		<c:forEach items="${ empresas }">
			
		</forEach>
	</ul>
	<ul>
		<%
			List<Empresa> lista = (List<Empresa>) request.getAttribute("empresas");
			for (Empresa empresa : lista) {
		%>
		<li>
			<%
				out.print(empresa.getNome());
			%>
		</li>
		<%
			}
		%>
	</ul>

</body>
</html>