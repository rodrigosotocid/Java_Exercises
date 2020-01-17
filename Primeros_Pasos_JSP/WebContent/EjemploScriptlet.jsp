<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ejemplo Scriptlet</title>
</head>
<body>

	<h1>Ejemplo de Scriptlet</h1>

	<%
		for (int i = 0; i < 8; i++) {
			out.println("Este es el mensaje: " + i + "<br>");
		}
	%>

</body>
</html>