<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
        <title>Sua Agenda Pessoal</title>
        <link rel="stylesheet" type="text/css" href="resources/css/index.css" />
    </head>
    <body>
        <header>
            <h1>Agenda Pessoal</h1>
        </header>
        <nav>
        	<ul>
        		<li><a href="#">Home</a></li>
        		<li><a href="#">Tarefas</a></li>
        		<li><a href="#">Contatos</a></li>
        		<li><a href="#">Sobre</a></li>
        	</ul>
        </nav>
        <section>
        	<form action="logar" method="post">
        		Email: <input type="text" name="login"/><br/><br/>
        		Senha: <input type="password" name="senha"><br/><br/>
        		<input type="submit" value="Logar">
        		
        	</form><br/>
        	<form action="novo">
        	<a href="./novo">Não possuo cadastro.</a>
        	<input type="submit" value="quero me cadastrar">
        	</form>
            
        </section>
        <footer>
            Projeto Basic
        </footer>
    
    </body>

</html>