<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>User Registration</h1>
	<form action="user" method="post">
	<pre>
	User ID   <input type="text" name="uid">
	User Name <input type="text" name="uname">
	User age  <input type="text" name="age">
	DOB		     <input type="date" name="dob">
	User Address 
				<textarea rows="4" cols="50" name="addr">
					Enter text here...</textarea>
					
	Password   <input type="password" name="pwd">
		
		Select Gender 
					<input type="radio" name="gender" value="Male">Male
					<input type="radio" name="gender" value="Female">Female
		
		Project Name
					<select name="pname">
						<option>-Select-</option>
						<option>TCS</option>
						<option>Tech Mahindra</option>
						<option>Wipro</option>
						<option>VL</option>
						<option>IVY</option>
					</select>				
		
		Client Location
					<select name="loc" multiple="multiple">
						<option>India</option>
						<option>USA</option>
						<option>UK</option>
						<option>CANADA</option>
					</select>
		
		Branch	
			<input type="checkbox" name="cbranch" value="HYD"> HYD
			<input type="checkbox" name="cbranch" value="DEL"> DEL
			<input type="checkbox" name="cbranch" value="BAG"> BAG
			<input type="checkbox" name="cbranch" value="MUB"> MUB
			
		<button type="submit">Register</button>
</pre>
	</form>
</body>
</html>