<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Question Dashboard</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div class="container">
<div class="col col-lg-9">
<h1>Questions Dashboard</h1>
<table class="table table-striped">
	<thead>
		<tr>
			<th>Question</th>
			<th>Tag</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${allQuestions}" var="question">
		<tr>
			<th><a href="/questions/${question.id}">${question.myQuestion}</a></th>
			<th>
				<c:forEach items="${question.tagQuestion}" var="tag">
				[${tag.myTag}]
				</c:forEach>
			</th>
		</tr>
	 </c:forEach>
	</tbody>
</table>
</div>
</div>
<div class="container">
<div>
<a href="/questions/new">Create A New Question</a>
</div>
</div>
</body>
</html>