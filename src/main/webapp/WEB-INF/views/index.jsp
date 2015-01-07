<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
        <title>Sua Agenda Pessoal</title>
        <link rel="stylesheet" type="text/css" href="resources/css/index.css" />
    </head>
    <body>
        
        <div id="center">
            <div id="topo"><p>Agenda</p></div>
            <div class="form">
                <form action="main" method="POST">
                    <span>Email:</span>
                    <form:errors path="usuario.email" cssClass="erro"/>
                    <input id="email" type="text" name="email"/><br/><br/>
                    
                    <span>Senha:</span>
                    <form:errors path="usuario.senha" cssClass="erro"/>
                    <input id="senha" type="password" name="senha"/> <br/><br/>
                    <input id="bt" type="submit" value="Login">
                </form>
                
            </div>
            <div id="minifooter">
                <a href="./novo">Quero me registrar</a>  
            </div>
        </div>
    
    
    </body>

</html>