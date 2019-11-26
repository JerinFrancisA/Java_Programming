<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Scientific Calculator</title>
</head>
<body>
	Calculator<br><br>
	<form action="ScientificCalculator.jsp">
		<input type="text" name="num" value="0">Enter Number
		<input type="submit" value="sin()" name="op">
		<input type="submit" value="cos()" name="op">
		<input type="submit" value="tan()" name="op">
		<input type="submit" value="log()" name="op">
		<input type="submit" value="()^1/2" name="op">
	</form>
	<% 
		try{int n = Integer.parseInt(request.getParameter("num"));	
		String op = request.getParameter("op");
		if(op.equals("sin()"))
			out.print(Math.sin(n));
		if(op.equals("cos()"))
			out.print(Math.cos(n));
		if(op.equals("tan()"))
			out.print(Math.tan(n));
		if(op.equals("log()"))
			out.print(Math.log(n));
		if(op.equals("()^1/2"))
			out.print(Math.sqrt(n));}catch(Exception e){}
	%>
</body>
</html>