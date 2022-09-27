<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/Header.jsp"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

				 <form action="<c:url value="/UpdateCategory"/>" method="post">  
<!--  <form action="UpdateCategory" method="post">  -->

<table align="center" class="table">
		<tr>
			<td colspan="2"> 
			<center><h3>Category</h3></center>
			</td>
		</tr>

		<tr>
			<td>Category Id</td>
			<td><input type="text" name="catId" value="${category.categoryId}" readonly /></td>
		</tr>


	<tr>
			<td>Category Name</td>
			<td><input type="text" name="catName" value="${category.categoryName}"  /></td>
		</tr>
		
		<tr>
			<td>Category Description</td>
			<td><input type="text" name="catDesc" value="${category.categoryDesc}"  /></td>
		</tr>


<tr>
			<td colspan="1">
				<center>
					<td><input type="submit" value="UPDATE CATEGORY" />
				</center>
			</td>
		</tr>


</table>
</form>