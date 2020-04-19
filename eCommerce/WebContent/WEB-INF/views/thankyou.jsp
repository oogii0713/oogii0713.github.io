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
			<!-- Billing Details Form -->
			<section id="checkout" class="checkout-success mb30">
			<c:if test = "${not empty orderInfo}" >
				<div id="msg" class="success">
					<div class="mb30">Thank you! Your order successfully sent!</div>
				</div>
				<div class="row">
					<div class="col-md-6 col-sm-12 col-xs-12">
						<h4>Your Information</h4>
						
	                	<div class="info">
		                	<label>First name: </label>
		                	<span><c:out value="${orderInfo.billingDetails.firstName}"/></span>
	                	</div>
                		<div class="info">
                			<label>Last name: </label>
		                	<span><c:out value="${orderInfo.billingDetails.lastName}"/></span>
	                	</div>
                	
	                	<div class="info">
		                	<label>Address: </label>
	                		<span><c:out value="${orderInfo.billingDetails.address}"/></span>
	                	</div>		         	
	                	
	                	<div class="info">
		                	<label>City: </label>
		                	<span><c:out value="${orderInfo.billingDetails.city}"/></span>
	                	</div>
                		<div class="info">
                			<label>State: </label>
		                	<span><c:out value="${orderInfo.billingDetails.state}"/></span>
	                	</div>
	                	<div class="info">
                			<label>Postcode: </label>
		                	<span><c:out value="${orderInfo.billingDetails.zipcode}"/></span>
	                	</div>
                	
	                	<div class="info">
		                	<label>Email: </label>
		                	<span><c:out value="${orderInfo.billingDetails.email}"/></span>
	                	</div>
                		<div class="info">
                			<label>Phone: </label>
		                	<span><c:out value="${orderInfo.billingDetails.phone}"/></span>
	                	</div>
	                	
	                	
	                	<c:if test = "${not empty orderInfo.billingDetails.note}" >
	                	<div class="info">
			                	<label>Additional information: </label>
		                		<span><c:out value="${orderInfo.billingDetails.note}"/></span>
		                	</div>
	                	</c:if>
		                	
					</div>
					<div class="col-md-6 col-sm-6 col-xs-12">
						<section class="order-details border-gray">
							<div class="thead row">
								<div class="col-md-6 col-sm-6 col-xs-6 big">Product</div>
								<div class="col-md-6 col-sm-6 col-xs-6 normal">Total</div>							
							</div>
							<c:set var="sum" scope="page" value="0.0"/>
							<c:forEach var="item" items="${orderInfo.items}">
								<c:set var="sum" scope="page" value="${sum + item.price}" />
					         	<div class="cart-item row mb20" id="item-<c:out value="${item.product.id}"/>">
									<div class="col-md-6 col-sm-6 col-xs-6">
										<c:out value = "${item.product.name}"/>x<c:out value = "${item.quantity}"/>						
									</div>
									<div class="col-md-6 col-sm-6 col-xs-6 price">
										$<c:out value = "${item.price}"/>							
									</div>								
								</div>
					      	</c:forEach>	
					      	<div class="subtotal row">
					      		<div class="col-md-6 col-xs-6">
						      		<strong>Total</strong>
					      		</div>
					      		<div class="col-md-6 col-xs-6 price">
						      		<span class="total">$<c:out value="${sum}" /></span>
					      		</div>
					      	</div>
						</section>
					</div>
				</div>
				
	      	</c:if>			
	      	<c:if test = "${empty orderInfo}" >
	      		<div>Order not found.</div>
	      	</c:if>		      	
			</section>			
		</div>
		
		<!-- JQuery & app.js files are included in the footer element. -->
		<%@ include file="/WEB-INF/fragments/footer.jsp" %>		
	</body>
</html>