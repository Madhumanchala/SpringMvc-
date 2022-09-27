<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>


<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

		<h1>Add Student Form</h1>
		<a href="../addStudent" class="btn btn-primary"> Add Student </a>
		
	<h1>Welcoome to java</h1>
	<h1>your id is, ${student.id}</h1>	
	<h1>Welcome ,${student.name}</h1>
	<h1>Your Department is ${student.department}</h1>
	<h1>your Address is ${student.address}</h1>
	
	<!-- <h3>Add Employee Form</h3>s
	<a href="addStudent" class="btn btn-primary"> Add Student </a> -->

	<a href="editStudent/${student.id}" class="btn btn-warning"> Edit </a>

	<a href="./deleteStudent/${student.id}" class="btn btn-danger"> Delete </a>

</body>
</html>