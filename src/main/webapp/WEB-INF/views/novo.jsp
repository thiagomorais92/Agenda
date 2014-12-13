<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/novoStyle.css"/>
</head>
<c:import url="header.jsp"/>
<body>
	 <form action="novo/cadastrar" method="post">
                Nome:<br/>
                <input type="text" name="nome"/><br/>
                Sobrenome:<br/>
                <input type="text" name="sobrenome"/><br/>
                Email:<br/>
                <input type="text" name="email"/><br/>
                Senha:<br/>
                <input type="password" name="senha"/><br/>
                Repita a senha:<br/>
                <input type="password" /><br/>
                <input type="submit" value="Cadastrar"/>
                
                
            </form>
	
<c:import url="footer.jsp"/>
</body>
</html>