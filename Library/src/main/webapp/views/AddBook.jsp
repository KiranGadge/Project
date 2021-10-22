<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<h1>Library Management </h1>
<h3><a href='index.jsp'>Add Book</a></h3>
	<table border=1>
		<tr>
			<th>Book Id</th>
			<th>Book Name</th>
			<th>Author</th>
		</tr>
		<c:forEach var="bobj" items="${listBook}">
			<tr>
				<td>${bobj.getbookid()}</td>
				<td>${bobj.getbookname()}</td>
				<td>${bobj.getauthor()}</td>
				
				<td>
				<a href="edit/${bobj.getbookid()}">Edit</a>
					&nbsp;&nbsp;&nbsp;&nbsp; 
				<a href="delete/${bobj.getbookid()}">Delete</a>
				</td>
			</tr>
		</c:forEach>
		

	</table>

</body>
</html>