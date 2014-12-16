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
        
        <div id="center">
            <div id="topo"><p>Agenda</p></div>
            <div class="form">
                <form>
                    <span>Email:</span> <input id="nome" type="text" name="email"/><br/><br/>
                    <span>Senha:</span> <input id="senha" type="password" name="senha"/> <br/><br/>
                    <input id="bt" type="submit" value="Login">
                </form>
                
            </div>
            <div id="minifooter">
                <a href="./novo">Quero me registrar</a>  
            </div>
        </div>
    
    
    </body>

</html>