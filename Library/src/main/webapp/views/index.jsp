<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="skyblue">

	<form action="add" method="post" align="center">
		<c:if test="${empty book}">
			<h1>Add Book</h1>
		</c:if>

		<c:if test="${not empty book}">
			<h1>Edit Book</h1>
			<form action="save" method="post">
		</c:if>


		Book id : <input type='text' name="bookid" value="${book.getbookid()}">
		<br> Book Name : <input type='text' name="bookname"
			value="${book.getbookname()}"> <br> Author : <input
			type='text' name="author" value="${book.getauthor()}"> <br>

		<button type="submit">Save</button>
	</form>


</body>
</html>