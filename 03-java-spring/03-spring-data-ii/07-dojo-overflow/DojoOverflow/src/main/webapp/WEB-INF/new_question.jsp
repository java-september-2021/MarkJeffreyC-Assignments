<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Question</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<h1>What is your question?</h1>
<form action="/questions/new" method="post">
<p><label for="question">Question:</label>
<p><textarea name="question" id="question" rows="4" cols="50"></textarea>
<p><label for="tag">Tags:</label>
<p><input type="text" name="tag">
<p><input type="submit" value="Submit"/>
</form>
<a href="/">Home</a>
</body>
</html>