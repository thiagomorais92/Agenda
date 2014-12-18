<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>Nome</th>
			<th>Sobre Nome</th>
			<th>Email</th>
		</tr>
		<c:forEach items="${listarUsuarios}" var="usuario" />
		<tr>
			
			<td>${usuario.nome}</td>
			<td>${usuario.sobrenome}</td>
			<td>${usuario.email}</td>
		</tr>
		
	</table>
	
</body>
</html>