<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div class="container">
<h2>${dojoDetails.name}</h2>
<table class="table table-striped">
	<thead>
		<tr>
			<th>ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Age</th>
			<th>Action</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${dojoDetails.ninjas}" var="ninja">
		<tr>
			<th>${ninja.id}</th>
			<th>${ninja.firstName}</th>
			<th>${ninja.lastName}</th>
			<th>${ninja.age}</th>
			<th><a href="/ninja/${ninja.id}/edit">Edit</a> | <a href="/ninja/delete/${ninja.id}">Delete</a></th>
		</tr>
	 </c:forEach>
	</tbody>
</table>
</div>
<div class="row justify-content-md-center">
<div class="col col-lg-8">
<a href="/">Home</a> | <a href="/ninja/new">Create A New User</a>
</div>
</div>
</body>
</html>