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

<a href="secao?acao=inicio_inclusao">Incluir nova seção</a>

<jsp:useBean id="dao" 
		class="br.com.classificados.dao.SecaoDao">
	<table>
		<thead>
			<tr>
				<th>Descrição</th>
				<th>Ações</th>
		</thead>
		<tbody>
	<c:forEach var="secao" items="${dao.listar() }">
		<tr>
			<td>${secao.descricao } </td>
			<td> 
				<a href="secao?acao=inicio_alteracao&id=${secao.id }">
					Alterar</a>
				
				<a href="secao?acao=excluir&id=${secao.id }">
					Excluir</a>
					
					
					
					
					
					
					
					
					
					
			</td>	
		</tr>
	</c:forEach>
		</tbody>
	</table>
</jsp:useBean>
</body>
</html>