<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@page isELIgnored="false"%>	
<!DOCTYPE html>
<html>
<head>
<style>  
.error{color:red}  
</style> 
<!-- <script>
// Defining a function to display error message
function printError(elemId, hintMsg) {
    document.getElementById(elemId).innerHTML = hintMsg;
}

// Defining a function to validate form 
function validateForm() {
console.log("validation called")
    // Retrieving the values of form elements 
    var name = document.contactForm.name.value;
/*     var email = document.contactForm.department.value;
    var mobile = document.contactForm.Address.value; */
    
    
 // Defining error variables with a default value
    var nameErr = true;
    
    // Validate name
    if(name == "") {
        printError("nameErr", "Please enter your name");
    } else {
        var regex = /^[a-zA-Z\s]+$/;                
        if(regex.test(name) === false) {
            printError("nameErr", "Please enter a valid name");
        } else {
            printError("nameErr", "");
            nameErr = false;
        }
    }
    if(nameErr == true) {
        return false;
}
}
    </script>
 -->
 </head>
<body>

<form name="contactForm"  action="insertStudent" method="post">
 <!-- //onsubmit="return validateForm()" -->
		
		<h1>Add Student Form</h1>
		
<!-- <div class="row">
<label> ID </label>
<input type="text" name="id" id="id">
 <div class="error" id="idErr"></div>
 </div>
 -->
		
<div class="row">
<label>  Name </label>
<input type="text" name="name" id="name">
<!--  <div class="error" id="nameErr"></div>
 --> </div>

<div class="row">
<label> department </label>
<input type="text" name="department" id="department">
<!-- <div class="error" id="departErr"></div> -->
</div>

<div class="row">
<label> Address </label>
<input type="text" name="address" id="address">
<!-- <div class="error" id="addErr"></div> -->
</div>

<!-- <div class="row">
<label> Mobile No </label>
<input type="number" name="mobileno" maxlength="10">
<div class="error id="mobErr"></div>
</div> -->

<div class="row">
<input type="submit" value="Submit">
<!-- <input type="button" value="test" onclick="validateForm()">
 -->
</div>
		<!-- //onclick="return validateForm()" -->
		</form>

</body>
</html>