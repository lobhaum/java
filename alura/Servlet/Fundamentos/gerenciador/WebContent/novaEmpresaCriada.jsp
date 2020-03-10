<%
	
	String nomeEmpresa = (String) request.getAttribute("empresa");
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
A <%= nomeEmpresa %> faz parte agora do nosso escopo.
</body>
</html>