<%--
	1. Develop a dynamic web project for a Library database using JSP & Servlets.
		a. index.jsp: First page to be displayed when the application is run. Provide the
		links to insert a book record, Search a book record, Update a book record and
		delete a book record.
		b. insertRecord.jsp: Design the UI to allow user to enter the book details.
		(book_ID, book_Name, book_Auhor, book_Edition, book_Price). Validate the
		details in the validateRecord.java servlet.
		c. displayRecord.jsp: Design the UI to allow user to search the book details by
		entering ID or Name. Validate the details in the displayRecord.java servlet and
		display the result.
		d. deleteRecord.jsp: Design the UI to allow user to delete the book details by
		entering book_ID. Validate the details in the deleteRecord.java servlet and update
		the table.
		e. updateRecord.jsp: Design the UI to allow user to search the book details by
		entering book_ID and if the record is available, then display the records in the text
		boxes. User can change the details and update the record. Validate the details in
		the updateRecord.java servlet and update the table.
 --%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
</head>
<body>
	<h2 align="center">MENU</h2><br><br>
	<a href="insertRecord.jsp">Insert Record</a><br>
	<a href="displayRecord.jsp">Display Record</a><br>
	<a href="deleteRecord.jsp">Delete Record</a><br>
	<a href="updateRecord.jsp">Update Record</a><br>
</body>
</html>