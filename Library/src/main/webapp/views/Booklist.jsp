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
<h1 align="center">Welcome</h1>
<h2 align="center"><i>Library Management</i> </h2>
<h3 align="center"><a href='index'>Add Book</a></h3>
	<table border=1 align="center">
		<tr>
			<th>Book Id</th>
			<th>Book Name</th>
			<th>Author</th>
			<th>Actions</th>
		</tr>
		<c:forEach var="bobj" items="${booklist}">
			<tr>
				<td>${bobj.getBookid()}</td>
				<td>${bobj.getBookname()}</td>
				<td>${bobj.getAuthor()}</td>	
				<td>			
				<a href="edit/${bobj.getBookid()}">Edit</a>
					&nbsp;&nbsp;&nbsp;&nbsp; 
				<a href="delete/${bobj.getBookid()}">Delete</a></td>
				</td>
			</tr>
		</c:forEach>
		

	</table>
</body>
</html>