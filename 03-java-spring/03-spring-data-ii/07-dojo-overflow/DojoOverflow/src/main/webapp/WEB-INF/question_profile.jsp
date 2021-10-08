<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Question Profile</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div class="col col-lg-6">
<h1>${oneQuestion.myQuestion}</h1>
Tags :
<c:forEach items="${oneQuestion.tagQuestion}" var="tag">
[${tag.myTag}] 
</c:forEach>
</div>
<div class="container-lg">
<div class="col col-lg-6">
<h2>Answers</h2>
<table class="table table-striped">
	<tbody>
	<c:forEach items="${oneQuestion.answer}" var="answer">
		<tr>
			<th>${answer.myAnswer}</th>
		</tr>
	 </c:forEach>
	</tbody>
</table>
</div>
<div class="col col-lg-6">
<h2>Add your answer:</h2>
<form:form action="/questions/${oneQuestion.id}" method="post" modelAttribute="answer">
	<form:hidden value="${oneQuestion.id}" path="questionAnswer"/>
	<p>
		<form:label path="myAnswer">Answer</form:label>
		<form:errors path="myAnswer"/>
		<form:input type="text" path="myAnswer"/>
	</p>
	<input type="submit" value="Answer it!"/>
</form:form>
</div>
</div>
<div class="container">
<a href="/">Home</a>
</div>
</body>
</html>