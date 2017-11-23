<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculadora Casio</title>
</head>
<body>
	<h1>Calculadora Casio</h1>
	<form action="Calculadora" method="post">
		<label>Valor 1</label> 
		<br />
		<input type="number" name="param1" step="any"> 
		<br />
		<label>Operador</label>
		<br /> 
		<select name="operador">
			<option>+</option>
			<option>-</option>
			<option>*</option>
			<option>/</option>
		</select>
		<br /> 
		<label>Valor2</label>
		<br /> 
		<input type="number" name="param2" step="any"> 
		<input type="submit" value="Calcular">
	</form>
    <br /> 
	<label>Resultado</label>
	<h3>${resultado}</h3>
</body>
</html>