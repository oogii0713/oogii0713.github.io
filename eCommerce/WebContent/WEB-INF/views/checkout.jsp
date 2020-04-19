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
			<section id="checkout" class="active mb30">
			<c:if test = "${not empty shoppingCard.items}" >
				<div class="row">
					<div class="col-md-6 col-sm-6 col-xs-12">
						<h2>Billing Details</h2>
						<form method="POST" id="myForm">
						<input type="hidden" name="lastOrderId" value="<c:out value="${lastOrderId}" />" />
							<div class="row">
			                	<div class="col-md-6 col-xs-12">
				                	<div class="input text">
					                    <input type="text" name="firstName" id="firstName" placeholder="First name (required)*" required 
					                   pattern="^[a-zA-Z]+(([\'\,\.\- ][a-zA-Z ])?[a-zA-Z]*)*$" title="Please enter a valid name."  />
				                	</div>
			                	</div>
		                		<div class="col-md-6 col-xs-12">
		                			 <div class="input text">
					                    <input type="text" name="lastName" id="lastName" minlength="2" required placeholder="Last Name (required)*" 
					                    pattern="^[a-zA-Z]+(([\'\,\.\- ][a-zA-Z ])?[a-zA-Z]*)*$" title="Please enter a valid name." />			                    
					                </div>
			                	</div>
		                	</div>		
		                				               
			                <div class="input text">
			                    <input type="text" name="address" id="address" minlength="2" required placeholder="Address (required)" />			                    
			                </div>
			                <div class="input text">
			                    <input type="text" name="city" id="city" minlength="2" required placeholder="City (required)" />			                    
			                </div>
			                <div class="row">
			                	<div class="col-md-6 col-xs-12">
				                	<div class="input text">
					                    <input type="text" name="state" id="state" minlength="2" required placeholder="State (required)" />			                    
					                </div>
			                	</div>
			                	<div class="col-md-6 col-xs-12">
				                	<div class="input text">
					                    <input type="text" name="zipcode" id="zipcode" required placeholder="Postcode (required)" 
					                    pattern="(^(?!0{5})(\d{5})(?!-?0{4})(|-\d{4})?$)" title="Please enter a valid postcode." />			                    
					                </div>
			                	</div>
			                </div>
			                <div class="row">
			                	<div class="col-md-6 col-xs-12">
				                	<div class="input text">
					                    <input type="email" name="email" id="email" minlength="2" required placeholder="Email Address (required)" />			                    
					                </div>
			                	</div>
			                	<div class="col-md-6 col-xs-12">
				                	<div class="input text">
					                    <input type="text" name="phone" id="phone" minlength="2" required placeholder="Phone (required)" />			                    
					                </div>
			                	</div>
			                </div>
			                <div class="mt30">
			                	<h2>Additional Information</h2>
				                <div class="input text">
					                    <textarea name="note" id="note" placeholder="Order notes (optional)" ></textarea>			                    
					                </div>
				                <div class="submit">
				                    <button type="submit" class="btn btn-orange">Submit</button>                   
				                </div>
			                </div>
			            </form>
					</div>
					<div class="col-md-6 col-sm-6 col-xs-12">
						<section class="order-details border-gray">
							<div class="thead row">
								<div class="col-md-6 col-sm-6 col-xs-6 big">Product</div>
								<div class="col-md-6 col-sm-6 col-xs-6 normal">Total</div>							
							</div>
							<c:set var="sum" scope="page" value="0.0"/>
							<c:forEach var="item" items="${shoppingCard.items}">
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
	      	<c:if test = "${empty shoppingCard.items}" >
	      		<div>Card is empty.</div>
	      	</c:if>		      	
			</section>			
		</div>
		
		<!-- JQuery & app.js files are included in the footer element. -->
		<%@ include file="/WEB-INF/fragments/footer.jsp" %>		
	</body>
</html>