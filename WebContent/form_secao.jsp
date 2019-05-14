<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="secao">
		<input type="hidden" name="acao" 
			value="${requestScope['acao'] }" />
	
		Descrição:
		<input type="text" 
			   name="descricao"
			   value="${requestScope['secao'].descricao }" />
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
		<input type="submit" value="Salvar"/>
	</form>
</body>
</html>