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
<div class="row justify-content-md-center">
<div class="col col-lg-4">
<h2>New Dojo</h2>
	<form:form action="/dojo/new" method="post" modelAttribute="dojo">
	<p>
		<form:label path="name">Name</form:label>
		<form:errors path="name"/>
		<form:input type="text" path="name"/>
	</p>
	<input type="submit" value="Create"/>
	</form:form>
</div>
<div class="col col-lg-4">
<h2>Table of Dojos</h2>
<table class="table table-striped">
	<thead>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Action</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${allDojos}" var="dojo">
		<tr>
			<th><a href="/details/${dojo.id}">${dojo.id}</a></th>
			<th>${dojo.name}</th>
			<th><a href="/${dojo.id}/edit">Edit</a> | <a href="/delete/${dojo.id}">Delete</a></th>
		</tr>
	 </c:forEach>
	</tbody>
</table>
</div>
</div>
<div class="row justify-content-md-center">
<div class="col col-lg-2">
<a href="/ninja/new">Create A New User</a>
</div>
</div>
</body>
</html>