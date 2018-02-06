<!DOCTYPE html>
<html lang="pt">
<head>
<title>Vendas</title>
</head>
<body>
	<div align="center">
		<form method="post" action="VendaServlet?acao=registar">
			<fieldset>
				<legend>Registar Venda</legend>
				<label>Nome do cliente:</label><input name="clienteNome" placeholder="nome do cliente" value="${Cliente.nome}"/>
				<label>Sobrenome do cliente:</label><input name="clienteSobrenome" placeholder="sobrenome do cliente" value="${Cliente.sobrenome}"/><br />
				<label>Produto:</label><input name="produto" placeholder="nome do produto"  value="${Venda.produto}"/><br />
				<label>Valor:</label><input name="valor" placeholder="2.00"  value="${Venda.valor}"/><br />
				<label>data:</label><input name="data" type="date" placeholder="01/01/2017"  value="${Venda.data}"/><br />
				<input type="submit" value="Enviar"> <input type="reset" value="Limpar"> <br />
			</fieldset>
		</form>
		
				<a href = "index.jsp">voltar</a>
	</div>
</body>
</html>