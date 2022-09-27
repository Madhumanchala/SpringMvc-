<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://java.sun.com/jsp/jstl/core"%>


<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="updateStudent" method="post">

		<div class="row">
			<label for="id">Id</label> <input type="text" id="id"
				value="${Student.id}" name="id" readonly="readonly">
		</div>

		<div class="row">
			<label for="name">name</label> <input type="text" id="name"
				value="${Student.name}" name="name">
		</div>

		s<div class="row">
				<label for="department"> department </label> <input type="text"
				value="${Student.department}" id="department" name="department">
		</div>

		<div class="row">
			<label for="address"> address </label> <input type="text"
				value="${Student.address}" id="address" name="address">
		</div>

		<input type="submit" value="Submit">
	</form>


</body>
</html>