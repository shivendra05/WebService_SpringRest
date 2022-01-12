<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Bmazon Shopping Carts</h1>

	<span>
		<h1>
			<a href="productHome">Home</a> <a href="userRegister">Current_Product</a>
			<a href="all">All Product</a>
		</h1>
	</span>

	<table border="1">
		<tr>
			<th>Product ID</th>
			<th>Product Name</th>
			<th>Product Price</th>
			<th>Product Quantity</th>
			<th>Product GST</th>
			<th>Product Bill</th>

			<th>Delete Product</th>
		</tr>
		<c:forEach items="${prodList}" var="list">
			<tr>
				<td>${list.id}</td>
				<td>${list.name}</td>
				<td>${list.price}</td>
				<td>${list.qty}</td>
				<td>${list.gst}</td>
				<td>${list.bill}</td>

				<td><a href="/delete?id=${list.id}"> Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<h1>
	${deleteMSG}</h1>
</body>
</html>