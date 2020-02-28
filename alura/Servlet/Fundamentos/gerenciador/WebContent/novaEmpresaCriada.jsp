<%
	String nomeEmpresa = "Alura";
	System.out.println(nomeEmpresa);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alura</title>
</head>
<body>
Empresa <% out.print(nomeEmpresa); %> cadastrada com sucesso!
</body>
</html>