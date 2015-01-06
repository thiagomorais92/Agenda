<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/novoStyle.css"/>
</head>

<body>
	  <div id="center">
            <div id="topo"><p>Cadastro</p></div>
            <br/>
            <form action="cadastrar" method="post" enctype="multipart/form-data">
                
                <div id="warning">
                <form:errors path="usuario.nome"/><br/>
                <form:errors path="usuario.sobrenome"/><br/>
                <form:errors path="usuario.email"/><br/>
                <form:errors path="usuario.senha"/><br/>
                <form:errors path="usuario.resenha"/><br/>
                </div>
                <div id="inputBasic">
                    <span>Nome:</span>
                    <form:errors path="usuario.nome" cssClass="erro">*</form:errors>
                    <input type="text" name="nome"/><br/>
                </div>
                <div id="inputBasic">
                    <span>Sobrenome:</span>
                    <form:errors path="usuario.sobrenome" cssClass="erro">*</form:errors>
                    <input type="text" name="sobrenome"/><br/>
                </div>
                <div id="inputBasic">
                    <span>Email:</span>
                    <input type="text" name="email"/><br/>
                </div>
                
                <div id="inputBasic">
                    <span>Senha:</span>
                    <input type="password" name="senha"/><br/>
                </div>
                <div id="inputBasic">
                    <span>Repita a senha:</span>
                    <input type="password" name="resenha"/><br/>
                </div>
                <div id="upload">
                	<span>Foto:</span>
                	<input id="upload" type="file" name="foto">
                </div>
                
                <input id="bt" type="submit" value="Criar conta"/>
                
                
            </form>
        </div>
</body>
</html>