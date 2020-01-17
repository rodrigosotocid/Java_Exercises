<%@page import="com.istikis.CalculosMatematicos.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	La suma de 7 y 5 es:
	<%=Calculo.metodoSuma(7, 5)%>
	<br> La resta de 7 y 5 es:
	<%=Calculo.metodoResta(7, 5)%>
	<br> La multiplicación de 7 y 5 es:
	<%=Calculo.metodoMultiplica(7, 5)%><br> La división de 7 y 5 es:
	<%=Calculo.metodoDivide(7, 5)%>

</body>
</html>