<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="pt">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Vendas</title>
</head>
<body>
	<div align="center">
		<P>Lista de Vendas</P>
		<table border="1">
			<tr>
				<th>Produto</th>
				<th>Valor</th>
				<th>Data</th>
			</tr>
			<c:forEach var="venda" items="${listaVenda}">
				<tr>
					<td>${venda.produto}</td>
					<td>${venda.valor}</td>
					<td><fmt:formatDate value="${venda.data}" type="both" pattern="dd/MM/yyyy"/>  
				</tr>
			</c:forEach>
		</table>
		<c:if test="${fn:length(listaVenda) > 0}">
   		Foram realizadas ${fn:length(listaVenda)} vendas!
 		</c:if><br> 		
	</div>
	<a href="index.jsp">Voltar</a>
	
</body>
</html>