<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gerenciamento::Cadastrado</title>
</head>
<body>
	<c:if test="${ not empty empresa }">
		<p>Empresa ${ empresa } cadastrada com sucesso!</p>
		<h2>A ${ empresa } faz parte agora do nosso escopo.</h2>
	</c:if>
	<c:if test="${ empty empresa }">
		<p>Nenhuma empresa cadastrada!</p>
	</c:if>

</body>
</html>