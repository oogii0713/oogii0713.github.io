<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="ISO-8859-1">
   	 	<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>CS472 WAP - Team Project - E-Commerce</title>
		
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
		<link href="https://fonts.googleapis.com/css2?family=Roboto:wght@100;300;400;500;700;900&display=swap" rel="stylesheet">
		<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">    

    	<link rel="stylesheet" href="css/main.css">
	</head>
	<body>		
		<%@ include file="/WEB-INF/fragments/header.jsp" %>
		<div class="container">
			<!-- Orders list -->			
			<c:if test = "${not empty orders}" >				
				<section class="orders-list mb30">
				<h1>Your Orders</h1>
				<c:forEach var="order" items="${orders}">		
					<div class="date"><strong>Order Date: </strong><c:out value = "${order.orderDate}"/></div>
					
					<section id="cart" class="active mb30">
						<div class="thead row text-center">
							<div class="col-md-2 col-sm-4 col-xs-6">Product	</div>
							<div class="col-md-2 col-sm-4 col-xs-6">Name</div>
							<div class="col-md-2 col-sm-4 col-xs-6">Price</div>
							<div class="col-md-2 col-sm-4 col-xs-6">Quantity</div>
							<div class="col-md-2 col-sm-4 col-xs-6">Total</div>
						</div>
						<c:set var="sum" scope="page" value="0.0"/>
									
							<c:forEach var="item" items="${order.items}">
							<c:set var="sum" scope="page" value="${sum + item.price}" />
				         	<div class="cart-item row mb20" id="item-<c:out value="${item.product.id}"/>">
								<div class="col-md-2 col-sm-4 col-xs-6">
									<a href="<c:url value="/product?productId=${item.product.id}"/>" class="thumb" target="_blank">
										<img src="<c:out value = "${item.product.imagePath}" />" />
									</a>							
								</div>
								<div class="col-md-2 col-sm-4 col-xs-6">
									<div class="col-wrap">
										<a href="<c:url value="/product?productId=${item.product.id}"/>" class="title"><c:out value = "${item.product.name}"/></a>
									</div>
								</div>
								<div class="col-md-2 col-sm-4 col-xs-6">
									<div class="col-wrap">
										<div class="price">$<c:out value = "${item.product.price}"/></div>
									</div>
								</div>
								<div class="col-md-2 col-sm-4 col-xs-6">
									<div class="col-wrap">
										<div class="quantity"><c:out value = "${item.quantity}"/></div>
									</div>
								</div>
								<div class="col-md-2 col-sm-4 col-xs-6">
									<div class="col-wrap">
										<div class="price total">$<c:out value = "${item.price}"/></div>
									</div>
								</div>
								
							</div>
							</c:forEach>
							<div class="buttons row">					      		
					      		<div class="col-md-12 col-xs-12 text-right">
						      		<span class="grandTotal">Grand total: $<span id="grandTotal"><c:out value="${sum}" /></span></span>
					      		</div>
					      	</div>
			      	</section>				      	
		      	</c:forEach>
		      		<div class="buttons row">
			      		<div class="col-md-5 col-xs-12">
				      		<a href="<c:url value="/shop"/>" class="btn btn-orange">Shop Now</a>
			      		</div>			      		
			      	</div>
	      	</section>
	      	</c:if>			
	      	<c:if test = "${empty orders}" >
	      		<section id="cart" class="active mb30">
	      			<div>No Orders.</div>	 
	      		</section>	     		
	      	</c:if>		      	
					
		</div>
		
		<!-- JQuery & app.js files are included in the footer element. -->
		<%@ include file="/WEB-INF/fragments/footer.jsp" %>		
	</body>
</html>