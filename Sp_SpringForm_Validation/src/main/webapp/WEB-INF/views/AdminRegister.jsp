<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Welcome to the Admin Registration Page</h3>
	<form:form action="send" method="POST" modelAttribute="admin">
		<pre>
			Name : <form:input path="adminName"/>
			Dept : <form:select path="dept">
						<form:option value=""></form:option>
						<form:option value="MCA">MCA</form:option>
						<form:option value="BSC">BSC</form:option>
						<form:option value="EEE">EEE</form:option>
						<form:option value="CSC">CSC</form:option>
					<form:option value="ECE">ECE</form:option>
					</form:select>
			Grade : <form:radiobutton path="grade" value="A+"/>A+
					<form:radiobutton path="grade" value="A"/>A
					<form:radiobutton path="grade" value="B"/>B
					<form:radiobutton path="grade" value="C"/>
			Note : <form:textarea path="note" />
			Grant :<form:checkbox path="grant"/>Accept
					<form:checkbox path="grant"/>Export
					<form:checkbox path="grant"/>Read
					
			<input type="submit" value="SUBMIT"/>
		</pre>
	</form:form>
</body>
</html>