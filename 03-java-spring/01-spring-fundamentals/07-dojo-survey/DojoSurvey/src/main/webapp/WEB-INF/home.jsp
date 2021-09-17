<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Survey</title>
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<form action="/display" method="POST">
<p><label for="name">Name: </label>
<input type="text" name="name">
<p><label for="location">Location: </label>
<select name="location" id="location">
	<option value="New York">New York</option>
	<option value="San Jose">San Jose</option>
	<option value="Chicago">Chicago</option>
</select>
<p><label>Language: </label>
<select name="language" id="language">
	<option value="Python">Python</option>
	<option value="MERN">MERN</option>
	<option value="JAVA">JAVA</option>
</select>
<p>Comments:
<p><textarea id="comments" name="comment" rows="5" cols="30"></textarea>
<p><button>Submit</button>
</form>
</body>
</html>