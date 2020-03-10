<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/novaEmpresa" var="linkServletNovaEmpresa" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gerenciamento::Cadastro</title>
</head>
<body>
	<form action="${ linkServletNovaEmpresa }" method="POST">
		<div class="field">
			<label for="fnome">Nome:</label>
			<input type="text" name="nome">
		</div>
		<div class="field">
			<label for="fdata">Data Abertura:</label>
			<input type="date" name="data">
		</div>
		<input type="submit" value="Cadastrar">
	</form>

</body>
</html>