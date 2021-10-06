<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Category</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div class="container">
<div class="col col-lg-5">
<h2>New Product</h2>
	<form:form action="/category/new" method="post" modelAttribute="category">
	<p>
		<form:label path="name">Name</form:label>
		<form:errors path="name"/>
		<form:input type="text" path="name"/>
	</p>	
	<input type="submit" value="Create Category"/>
	</form:form>
</div>
</div>
<div class="container">
<a href="/">Home</a>
</div>
</body>
</html>