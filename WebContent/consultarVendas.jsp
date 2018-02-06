<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Consulta de vendas</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
</head>
<body>
	<h1>Consulta de vendas</h1>
	<form method="post" action="VendaServlet?acao=consultar">
	<label>Codigo do produto</label><input type="text" value="${Venda.cod}"/>
	<input type="submit" value="Consultar">
	<br />
	</form>
	<div align="center">
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
		<br> 		
	</div>
	<a href="index.jsp">Voltar</a>
	
</body>
</html>