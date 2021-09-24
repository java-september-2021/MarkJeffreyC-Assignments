<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Language - edit</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div class="container">
<h2>Edit Language</h2>
<a href="/delete/${oneLanguage.id}">Delete</a>
<a href="/">Dashboard</a>
<div id="edit">
	<form:form action="/language/${oneLanguage.id}/edit" method="POST" modelAttribute="oneLanguage">
    <input type="hidden" name="_method" value="PUT"/>
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
    <input type="submit" value="Edit"/>
	</form:form>
</div>
</div>
</body>
</html>