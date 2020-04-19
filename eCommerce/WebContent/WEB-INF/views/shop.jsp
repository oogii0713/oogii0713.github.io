<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cardTotal" value="0" />
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
   	 	<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>CS472 WAP - Team Project - E-Commerce</title>
		
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
		<link href="https://fonts.googleapis.com/css2?family=Roboto:wght@100;300;400;500;700;900&display=swap" rel="stylesheet">
		<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    

    	<!-- <link rel="stylesheet" href="WEB-INF/css/main.css"> -->
    	<link rel="stylesheet" href="css/main.css">
		<link rel="stylesheet" href="css/shop.css">
	</head>
	<body>
		<%@ include file="/WEB-INF/fragments/header.jsp" %>
		<div class="container">
			<!-- Section: Banner and Categories list -->
			<section id="hero" class="mb30">
				<div class="row">
					<div class="col-md-3 col-sm-4 col-xs-12">
						<%@ include file="/WEB-INF/fragments/topCategories.jsp" %>
					</div>
					<div class="col-md-9 col-sm-8 col-xs-12">
						<%-- <%@ include file="/WEB-INF/fragments/heroBanner.jsp" %> --%>
							<div class="sidebar-wrapper">
								<div  class="all-products">
									<c:forEach var="product" items="${products}">
										<div class="col">
											<div  class="product-box">
												<div  class="product-item">
													<div  class="mat-card">
															<div  class="product-img">
																<a class="product-link" href="<c:url value="/product?productId=${product.id}"/>">
																<img alt="" src="<c:url value="${product.imagePath}"/>">
																</a>
															</div>
															<div  class="product-info-wrapper"><span class="category"><c:out value="${product.category.name}"/></span>
															<div  class="title-wrap">
																<h4><c:out value="${product.name}"/></h4>
															</div>
															<div  class="stars">
																<mat-icon class="mat-icon material-icons" role="img">star_rate</mat-icon>
																<mat-icon class="mat-icon material-icons" role="img">star_rate</mat-icon>
																<mat-icon class="mat-icon material-icons" role="img">star_rate</mat-icon>
																<mat-icon class="mat-icon material-icons" role="img">star_rate</mat-icon>
																<mat-icon class="mat-icon material-icons" role="img">star_rate</mat-icon>
															</div>
															<div  class="price-wrap">
																<p>$<c:out value="${product.price}"/></p>
																<a class="addToCard" value="<c:out value="${product.id}"/>">
																	<mat-icon class="mat-icon material-icons" role="img">shopping_cart</mat-icon>
																</a>
															</div>
														</div>
													</div>
												</div>
											</div>
										</div>
									</c:forEach>
								</div>
							</div>
					</div>
				</div>
			</section>
		
			
		</div>
		<%-- <fieldset>
				<legend>Shopping card:</legend>
				<c:forEach var="item" items="${shoppingCard.items}">
					<p>${item.product.name} - ${item.quantity} X ${item.product.price}</p>
					<c:set var="cardTotal" value="${cardTotal + item.price}" scope="page"/>
				</c:forEach>
				<b>Total:</b> <c:out value="$${cardTotal}"></c:out>
			</fieldset>
			
			<p>Categories:</p>
			<ul>
				<c:forEach var="category" items="${categories}">
					<li><a href="shop?category=${category.id}"><c:out value="${category.name}"/></a></li>
				</c:forEach>
			</ul>
			<br/>
			<p>Products:</p>
			<ul>
				<c:forEach var="product" items="${products}">
					<li>
						<c:out value="${product.name}"/>
						<img src="<c:out value="${product.imagePath}"/>" alt="${product.imagePath}" style="max-width: 180px;"/>
						<button class="addToCard" value="${product.id}">add to card</button>
					</li>
				</c:forEach>
			</ul> --%>
		<!-- JQuery & app.js files are included in the footer element. -->
		<%@ include file="/WEB-INF/fragments/footer.jsp" %>	
		<script src="js/shopping.js"></script>
	</body>
</html>

