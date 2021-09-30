<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Dojo</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div class="container">
<h2>New Ninja</h2>
	<form:form action="/ninja/newNinja" method="post" modelAttribute="ninja">
	<p>
	Dojo <form:select path="dojoToNinja">
	<c:forEach items="${dojos}" var="dojo">
		<option value="${dojo.id}">${dojo.name}</option>
	</c:forEach>
	</form:select>
	<p>
		<form:label path="firstName">First Name</form:label>
		<form:errors path="firstName"/>
		<form:input type="text" path="firstName"/>
	</p>
		<p>
		<form:label path="lastName">Last Name</form:label>
		<form:errors path="lastName"/>
		<form:input type="text" path="lastName"/>
	</p>
		<p>
		<form:label path="age">Age</form:label>
		<form:errors path="age"/>
		<form:input type="text" path="age"/>
	</p>
	<input type="submit" value="Create Ninja"/>
	</form:form>
</div>
<div class="container">
<p><a href="/">Home</a>
</div>
</body>
</html>