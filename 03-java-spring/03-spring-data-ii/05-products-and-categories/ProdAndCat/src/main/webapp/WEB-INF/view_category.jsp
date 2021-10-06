<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Category Page</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div class="container">
<h2>${oneCategory.name}</h2>
<a href="/">Home</a>
</div>
<div class="row justify-content-md-center">
<div class="col col-lg-4">
<h3>Product:</h3>
<ul>
<c:forEach items="${oneCategory.productCategory}" var="category">
<li>${category.name}</li>
</c:forEach>
</ul>
</div>
<div class="col col-lg-4">
<form method="POST" action="/category/add/${oneCategory.id}">
Add Product: 
<select name="addProduct">
<c:forEach items="${allProducts}" var="product">
<c:if test="${!product.categoryProduct.contains(oneCategory)}"> 
<option value="${product.id}">${product.name}</option>
</c:if>
</c:forEach>
</select>
<button>Add</button>
</form>
</div>

</div>
</body>
</html>