<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
        <title>Sua Agenda Pessoal</title>
        <link rel="stylesheet" type="text/css" href="resources/css/index.css" />
    </head>
    <body>
        <c:import url="header.jsp"/>
        <section>
        	<br/>
        	<form action="logar" method="post">
        		Email: <input type="text" name="login"/><br/><br/>
        		Senha: <input type="password" name="senha"><br/><br/>
        		<input type="submit" value="Logar"><br/>
        		<a href="./novo">Não possuo cadastro.</a>
        	
            
        </section>
        <c:import url="footer.jsp"/>
    
    </body>

</html>