<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ejemplo de Declaraciones</title>
</head>
<body>

	<h1>Ejemplo de Declaraciones</h1>

	<%!private int resultado;

	public int metodoSuma(int num1, int num2) {

		resultado = num1 + num2;
		return resultado;
	}

	public int metodoResta(int num1, int num2) {

		resultado = num1 - num2;
		return resultado;
	}

	public int metodoMultiplica(int num1, int num2) {

		resultado = num1 * num2;
		return resultado;
	}

	public int metodoDivide(int num1, int num2) {

		resultado = num1 / num2;
		return resultado;
	}%>

	El resultado de la Suma es:
	<%=metodoSuma(7, 5)%>
	<br> El resultado de la Resta es:
	<%=metodoResta(7, 5)%>
	<br> El resultado de la Multiplicación es:
	<%=metodoMultiplica(7, 5)%>
	<br> El resultado de la División es:
	<%=metodoDivide(7, 5)%>
	<br>
</body>
</html>