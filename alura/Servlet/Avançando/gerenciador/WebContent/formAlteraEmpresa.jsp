<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:url value="/entrada" var="linkEntradaServlet" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gerenciamento::Alterar</title>
</head>
<body>
	<form action="${ linkServletNovaEmpresa }" method="POST">
		<div class="field">
			<label for="fnome">Nome:</label> <input type="text" name="nome"
				value="${ empresa.nome }">
		</div>
		<div class="field">
			<label for="fdata">Data Abertura:</label> <input type="text"
				name="data"
				value="<fmt:formatDate value="${ empresa.dataAbertura }" pattern="dd/MM/yyyy"/>" />
		</div>
		<div class="field">
			 <input type="hidden" name="id"
				value="${ empresa.id }"  >
		</div>
		<input type="submit" value="Alterar">
	</form>

</body>
</html>