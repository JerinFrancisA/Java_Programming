<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cookie Catcher</title>
</head>
<body>
	<h1>CAUGHT COOKIES !!</h1>
	<%
		Cookie[] ck = request.getCookies();
		for(int i=0; i<ck.length; i++) {
			out.print(ck[i].getName() + " -> " + ck[i].getValue() + "<br><br>");
		}
	%>
</body>
</html>