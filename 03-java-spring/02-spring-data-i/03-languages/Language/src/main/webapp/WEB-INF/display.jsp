<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Language - display</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div class="container">
<h2>Display Language</h2>
<p><a href="/">Dashboard</a>
<p>ID: <c:out value="${oneLanguage.id}"/>
<p>Name: <c:out value="${oneLanguage.name}"/>
<p>Creator: <c:out value="${oneLanguage.creator}"/>
<p>Version: <c:out value="${oneLanguage.version}"/>
<p><a href="/language/${oneLanguage.id}/edit">Edit</a>
<p><a href="/delete/${oneLanguage.id}">Delete</a>
</div>
</body>
</html>