<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/Header.jsp"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<form:form action="Insertproduct" modelAttribute="product" method="post" enctype="multipart/form-data">

<table align="center" class="table">
		<tr><td colspan="2"> 
			<center>Product Info</center>
			</td>
		</tr>

		<tr>
		<td>Product Name</td>
			<td> <form:input path="productname"/></td>
		</tr>

	<tr>
		<td>Product Price</td>
			<td> <form:input path="productprice"/></td>
		</tr>
		
		<tr>
		<td>Stock</td>
			<td> <form:input path="productstock"/></td>
		</tr>
		
		<tr>
		<td> Category </td>
		<td>
		<form:select path="categoryId">
		<form:option value="0" label="---select list---"/>
		<form:option value="" items="${categoryList}"/>
		</form:select>
		</td>
		</tr>
		
		<tr>
		<td>Supplier ID</td>
			<td> <form:input path="supplierId"/></td>
		</tr>
		
		<tr>
		<td>Product Description</td>
			<td> <form:input path="productDesc"/></td>
		</tr>
		
		<tr>
		<td>Product Image</td>
			<td> <form:input type="file" path="pimage"/></td>
		</tr>
		
		<tr>
		<td colspan="2"> <center><input type="submit" value="Insert Product"/> </center></td>
		</tr>

</table>
</form:form>


<table class="table-bordered">
<tr>
<td>Product Id</td>
<td>Product Name</td>
<td>Price </td>
<td>Stock</td>
<td>Supplier</td>
<td>operations</td>
</tr>

<c:forEach items="${ProductList}" var="product">
			<tr>
				<td>${product.productId}</td>
				<td>${product.productname}</td>
				<td>${product.price}</td>
				<td>${product.stock}</td>
				<td>${product.supplierId}</td>
					<a href="<c:url value="/editCategory/${category.categoryId}"/>" class="btn btn-success">EDIT</a>
				<a href="<c:url value="/deleteCategory/${category.categoryId}"/>" class="btn btn-danger">Delete</a>  
			</tr>
		</c:forEach>




</table>