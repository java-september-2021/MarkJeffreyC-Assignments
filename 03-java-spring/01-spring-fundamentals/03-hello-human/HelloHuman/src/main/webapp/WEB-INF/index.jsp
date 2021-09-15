<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello Human</title>
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<h2>Hello Human</h2>
<p> Welcome to Spring Tool Suite
<form action="/name" method="post">
<input type="text" name="firstname" placeholder="First Name">
<input type="text" name="lastname" placeholder="Last Name">
<button>Submit Name</button>
</form>
</body>
</html>