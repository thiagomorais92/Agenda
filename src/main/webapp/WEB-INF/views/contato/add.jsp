<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Cadastro de Novo Contato</h3>

	<form action="salvar" method="post">
		Nome:<input type="text" name="nome"/><br/>
		Sobrenome:<input type="text" name="sobrenome"/><br/>
		Email:<input type="text" name="email"/><br/>
		Celular:<input type="text" name="celular"/><br/>
		<input type="submit" value="Salvar contato.">
	</form>	
	
</body>
</html>