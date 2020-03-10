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
		
		for (Empresa empresa : lista) {
			out.print("<li>");
			out.print(empresa.getNome());	
			out.print("
		<li>");
		}

	</ul>
		
</body>
</html>