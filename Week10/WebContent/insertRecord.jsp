<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Record</title>
</head>
<body>
	<%--	(book_ID, book_Name, book_Auhor, book_Edition, book_Price).	  --%>
	<h1 align="center">INSERT RECORD</h1><br><br>
	<form action="Insert">
		Bookd Id      : <input type="text" name="id"><br>
		Bookd Name    : <input type="text" name="name"><br>
		Bookd Author  : <input type="text" name="author"><br>
		Bookd Edition : <input type="text" name="edition"><br>
		Bookd Price   : <input type="text" name="price"><br>
		<input type="submit" value="INSERT"><br>
	</form>
</body>
</html>