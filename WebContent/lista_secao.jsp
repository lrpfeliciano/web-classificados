<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page 
 	import="br.com.classificados.dao.SecaoDao" %>
<%@ taglib prefix="c" 
	uri="http://java.sun.com/jsp/jstl/core"   %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="dao" 
		class="br.com.classificados.dao.SecaoDao">
	<table>
	
	<c:forEach var="secao" items="${dao.listar() }">
		<tr>
			<td>${secao.descricao } </td>
		</tr>
	</c:forEach>
	
	</table>
</jsp:useBean>
</body>
</html>