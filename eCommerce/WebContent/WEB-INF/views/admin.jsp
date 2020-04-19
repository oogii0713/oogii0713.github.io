<%--
  Created by IntelliJ IDEA.
  User: Burmaa-PC
  Date: 4/14/2020
  Time: 1:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>CS472 WAP - Team Project - E-Commerce</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	<link href="https://fonts.googleapis.com/css2?family=Roboto:wght@100;300;400;500;700;900&display=swap" rel="stylesheet">
	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="css/main.css">
 
   
</head>
<body>
<%@ include file="/WEB-INF/fragments/header.jsp" %>
<main>
    <div class="container">
        <div class="upperPart mb-2">
            <a href="./add-product" class="btn btn-primary">Add New Product</a>
        </div>
        <div class="lowerPart">
            
            <table class="table table-striped">
			  <thead>
			    <tr>
			      <th scope="col">#</th>
			      <th scope="col">Name</th>
			      <th scope="col">Category</th>
			      <th scope="col">Price</th>
			      <th scope="col">Quantity</th>
			      <th scope="col">Action</th>
			    </tr>
			  </thead>
			  <tbody>
			  <c:forEach var="product" items="${adminProducts}" varStatus="loop">
		                <tr id="row-${product.id}">		
		               	  <th scope="row">${loop.index   + 1}</th>			      
					      <td><c:out value="${product.name}"/></td>
					      <td><c:out value="${product.category}"/></td>
					      <td>$<c:out value="${product.price}"/></td>
					      <td><c:out value="${product.quantity}"/></td>
					      <td><button class=" btn btn-outline-danger" onclick="deleteProduct(${product.id})">DELETE</button></td>
					    </tr>   					
					</c:forEach>			  
			  </tbody>
			</table>
            <!-- <button class=" btn btn-outline-danger" onclick="deleteProduct(${product.id})">DELETE</button> <li class="list-group-item d-flex justify-content-between"><p class="p-0 m-0 flex-grow-1"><c:out value="${product.name}"/> - $<c:out value="${product.price}"/></p>
		    </li>-->
           
        </div>
    </div>
</main>
<!-- JQuery & app.js files are included in the footer element. -->
<%@ include file="/WEB-INF/fragments/footer.jsp" %>	
   <script src="js/admin.js"></script>
</body>
</html>
