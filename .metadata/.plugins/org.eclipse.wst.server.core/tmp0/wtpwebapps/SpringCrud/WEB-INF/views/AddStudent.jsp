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

		<h1>Add Employee Form</h1>
		<form action="inserStudent" method="post">

			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="name">Name</label> <input type="text"
							class="form-control" id="name" name="name"
							placeholder="Enter Name">
					</div>
				</div>

			<div class="col">
					<div class="form-group">
						<label for="address">Address</label> <input type="text"
							class="form-control" id="address" name="address"
							placeholder="Enter Address">
					</div>
				</div>
			</div>

			<%-- <a href="${pageContext.request.contextPath }/"
				class="btn btn-warning"> Back </a> --%>
				
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>

	</div>

</body>
</html>