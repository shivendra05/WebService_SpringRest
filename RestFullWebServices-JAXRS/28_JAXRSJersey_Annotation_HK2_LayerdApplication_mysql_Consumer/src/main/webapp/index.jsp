<%@page isELIgnored="false"%>

<html>
<body>
	<h2>WELCOME TO NARESH IT</h2>

	<form action="student" method="post">

		<pre>

Student ID   <input type="text" name="sid">
Student Name <input type="text" name="sname">
Course       <input type="text" name="course">
Course Fee   <input type="text" name="fee">

<button type="submit">Register User</button>

</pre>
		${message}
	</form>

</body>
</html>
