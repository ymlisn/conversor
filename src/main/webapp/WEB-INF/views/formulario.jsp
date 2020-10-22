<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exercício</title>
</head>
<body>

	<form:form method="POST" modelAttribute="conversor" action="cadastro">
		<p>Valor em Dolar: <form:input path="dolar" /></p>
		<p>Cotação: <form:input path="cotacao" /></p>
		<p><form:button>Converter</form:button></p>
		<p>${mensagem}</p>
	</form:form>
	
	<p>
		<table>
		   <thead>
		    <tr>
		     <th>Cotação em REAL</th>
			</tr>
		   </thead>
		   <tbody>
		      <tr>
		       <td>${conversor.resultado}</td>
		       <td>
		       </td>
		      </tr>
		    </tbody>
		</table>
	<p>

</body>
</html>