<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>


	<div class="container mt-3">

		<h1>Edit Employee Form</h1>
		<form action="updateStudent" method="post">

			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="id">Id</label> <input type="text"
							value="${student.id}" class="form-control" id="id" name="id"
							readonly="readonly">
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="name">Name</label> <input type="text"
							value="${student.name }" class="form-control" id="name"
							name="name" placeholder="Enter Name">
					</div>
				</div>

			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="address">Address</label>
						<textarea class="form-control" id="address" name="address"
							rows="5" placeholder="Enter Address"> ${student.address } </textarea>
					</div>
				</div>
			</div>

			<button type="submit" class="btn btn-primary">Submit</button>
		</form>

	</div>

</body>
</html>