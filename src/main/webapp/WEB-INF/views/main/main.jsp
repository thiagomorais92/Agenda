<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sua Agenda.</title>
	<link rel="stylesheet" type="text/css" href="resources/css/mainStyle.css"/>
</head>
<body>
	<header>
            <h1>Bem vindo a sua agenda.</h1>
        </header>
        
        <nav>
            <ul>
                <li>Contatos
                	<ul>
                		<li><a href="contato/add">Adicionar contato</a></li>
                		<li><a href="contato/gerenciar">Gerenciar contatos</a></li>
                	</ul>
                </li>
                <li>Compromissos</li>
                	<ul>
                		<li><a href="compromisso/add">Adicionar compromisso</a></li>
                		<li><a href="compromisso/gerenciar">Gerenciar compromissos</a></li>
                	</ul>
                
                <li id="logout">Bem vindo<a href="usuario/${usuario.email}"> ${usuario.email}</a>_<a href="./logout">Logout</a></li>
            </ul>
            
        </nav>
</body>
</html>