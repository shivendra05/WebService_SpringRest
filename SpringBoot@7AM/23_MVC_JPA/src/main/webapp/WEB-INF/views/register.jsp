<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Bmazon Shopping</h1>
	<span>
		<h1>
			<a href="productHome">Home</a> 
			<a href="userRegister">Current_Product</a>
			<a href="all">All Product</a>
		</h1>
	</span>
	<form action="userRegister" method="post">
		<pre>
		Product ID 			<input type="text" name="id"> 
		Product Name 		<input type="text" name="name"> 
		Product Quantity	<input type="text" name="qty"> 
		Product Price 		<input type="text" name="price">
		<button type="submit">Click To Submit</button>
		</pre>
	</form>
	${ProdId}
</body>
</html>