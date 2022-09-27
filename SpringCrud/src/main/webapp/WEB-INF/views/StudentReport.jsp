<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="./base.jsp"%>

<meta charset="ISO-8859-1">

</head>
<body>


	<div class="container mt-3">

		<h1> Add Student  Form</h1>
		<a href=addstudent class="btn btn-primary"> Add Student </a>
		<div class="row">

			<table class="table table-hover">
				<thead>	
					<tr>
						<th scope="col">ID</th>
						<th scope="col">Name</th>
						<th scope="col">Address</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="emp" items="${student}">
						<tr>
							<td class="table-plus">${emp.id}</td>
							<td>${emp.name}</td>
							<td>${emp.address}</td>
							
							<td><a href="EditStudent/${emp.id}" class="btn btn-warning">
									Edit </a></td>
							<td><a href="deleteStudent/${emp.id}"
								class="btn btn-danger"> Delete </a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</body>
</html>