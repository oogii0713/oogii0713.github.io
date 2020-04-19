<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang='en'>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>CS472 WAP - Team Project - E-Commerce</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<link href="https://fonts.googleapis.com/css2?family=Roboto:wght@100;300;400;500;700;900&display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link rel="stylesheet" href="css/main.css">
<link rel="stylesheet" href="css/productDetails.css">
</head>
<body>
	<%@ include file="/WEB-INF/fragments/header.jsp"%>
	<div id="product" class="container pt-4">
		<div class="row mb-4">
			<div class="col-4 image">
				<img src="<c:out value="${product.imagePath}"/>" alt="${product.imagePath}" style="" />
			</div>
			<div class="col-5">
				<h2>${product.name}</h2>
				<h4>$ ${product.price}</h4>
				<div class="horizontal-line">
					<p class="text-justify">${product.description}</p>
				</div>
				<div>
					<input type="text" disabled value="${product.quantity}" id="productQuantity" style="visibility: hidden;" />
					<p>
						<span class="text-muted">Availability: </span><span id="stockStatus">${product.quantity > 0 ? 'In stock' : 'Out of stock'}</span>
					</p>
				</div>
				<button class="buttonQuantity" id="minus">-</button>
				<input type="text" disabled value="1" id="inputQty" class="inputQuantity" />
				<button id="plus" class="buttonQuantity">+</button>
				<div class="buttons">
					<button class="btn btn-orange" id="addToCard" value="${product.id}">ADD TO CARD</button>
				</div>
			</div>
			<div class="col-3">
				<%@ include file="/WEB-INF/fragments/brandPromiseVer.jsp"%>
			</div>
		</div>
	</div>
	<div class="container promoted-products mb30">
		<h4>Featured Products</h4>
		<div class="row mx-auto my-auto">
			<div id="feauturedProductControls" class="carousel slide w-100" data-ride="carousel">
				<div class="carousel-inner w-100" role="listbox">
					<c:forEach var="product" items="${featuredProducts}" varStatus="index">
						<div class="carousel-item ${index.index ==0 ? 'active' : '' }">
							<div class="mat-card item col mb20 m-4">
								<div class="col-md-12 col-sm-4 col-xs-6 thumb mb-3" style="padding: 0px;">
									<a href="<c:url value="/product?productId=${product.id}"/>" class="thumb"><img src="<c:out value = "${product.imagePath}" />" /></a>
								</div>
								<div class="col-md-12 col-sm-8 col-xs-6">
									<a href="<c:url value="/product?productId=${product.id}"/>" class="title"><c:out value="${product.name}" /></a>
									<div class="star-review">
										<i class="material-icons">star_rate</i> <i class="material-icons">star_rate</i> <i class="material-icons">star_rate</i> <i class="material-icons">star_rate</i> <i class="material-icons">star_rate</i>
									</div>
									<div class="price">
										$
										<c:out value="${product.price}" />
									</div>
								</div>
							</div>
						</div>
					</c:forEach>
				</div>
				<a class="carousel-control-prev" href="#feauturedProductControls" role="button" data-slide="prev"> <span class="carousel-control-prev-icon" aria-hidden="true"></span> <span class="sr-only">Previous</span>
				</a> <a class="carousel-control-next" href="#feauturedProductControls" role="button" data-slide="next"> <span class="carousel-control-next-icon" aria-hidden="true"></span> <span class="sr-only">Next</span>
				</a>
			</div>
		</div>
	</div>


	<%@ include file="/WEB-INF/fragments/footer.jsp"%>
	<script src="js/prodDetails.js"></script>
</body>
</html>