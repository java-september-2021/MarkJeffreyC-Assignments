<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Language</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div class="container">
<div>
<h2>Table of Languages</h2>
<table class="table table-striped">
	<thead>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Creator</th>
			<th>Version</th>
			<th>Action</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${allLanguages}" var="language">
		<tr>
			<th><a href="/language/${language.id}">${language.id}</a></th>
			<th>${language.name}</th>
			<th>${language.creator}</th>
			<th>${language.version}</th>
			<th><a href="/language/${language.id}/edit">Edit</a> | <a href="/delete/${language.id}">Delete</a></th>
		</tr>
	 </c:forEach>
	</tbody>
</table>
</div>
<div id="form">
<h2>Add new Language</h2>
	<form:form action="/language" method="post" modelAttribute="language">
    <p>
        <form:label path="name">Name</form:label>
        <form:errors path="name"/>
        <form:input type="text" path="name"/>
    </p>
    <p>
        <form:label path="creator">Creator</form:label>
        <form:errors path="creator"/>
        <form:input type="text" path="creator"/>
    </p>
    <p>
        <form:label path="version">Version</form:label>
        <form:errors path="version"/>
        <form:input type="text" path="version"/>
    </p>
    <input type="submit" value="Submit"/>
	</form:form>
</div>
</div>
</body>
</html>