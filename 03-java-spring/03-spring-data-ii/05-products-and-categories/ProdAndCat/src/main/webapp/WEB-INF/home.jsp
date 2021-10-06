<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products and Categories</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div class="container">
<div class="col col-lg-8">
<h2>Table of Products</h2>
<table class="table table-striped">
	<thead>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Description</th>
			<th>Price</th>
			<th>Action</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${allProducts}" var="product">
		<tr>
			<th><a href="/details/${product.id}">${product.id}</a></th>
			<th>${product.name}</th>
			<th>${product.description}</th>
			<th><fmt:setLocale value="en_US"/>
				<fmt:formatNumber value="${product.price}" type="currency"/>
			</th>
			<th><a href="/product/view/${product.id}">View</a></th>
		</tr>
	 </c:forEach>
	</tbody>
</table>
</div>
<div class="col col-lg-6">
<h2>List of Categories</h2>
<table class="table table-striped">
	<thead>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Action</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${allCategories}" var="category">
		<tr>
			<th><a href="/details/${category.id}">${category.id}</a></th>
			<th>${category.name}</th>
			<th><a href="/category/view/${category.id}">View</a></th>
		</tr>
	 </c:forEach>
	</tbody>
</table>
</div>
</div>
<div class="row justify-content-md-center">
<div class="col col-lg-5">
<a href="/product/new">Create A New Product</a> | 
<a href="/category/new">Create A New Category</a>
</div>
</div>
</body>
</html>