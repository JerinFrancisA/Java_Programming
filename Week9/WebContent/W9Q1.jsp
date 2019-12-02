<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cookie Demo</title>
</head>
<body>
	<h1>THREE COOKIES CREATED</h1>
	<%
		for(int i=0; i<3; i++) {
			Cookie ck = new Cookie("c"+Integer.toString(i+1), "ckckie");
			ck.setMaxAge(60*60);
			response.addCookie(ck);
		}
	%>
	<a href="W9Q1cookieCatcher.jsp">CATCH COOKIES</a>
</body>
</html>