<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<h1>Hello <c:out value="${firstname}"/> <c:out value="${lastname}"/></h1>
<p> Welcome to Spring Tool Suite
<p><a href="/">Go Back</a>
</body>
</html>