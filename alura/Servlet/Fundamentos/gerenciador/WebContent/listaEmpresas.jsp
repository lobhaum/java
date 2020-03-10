<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gerenciamento::Lista Empresas</title>
</head>
<body>

	<ul>
		<%
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