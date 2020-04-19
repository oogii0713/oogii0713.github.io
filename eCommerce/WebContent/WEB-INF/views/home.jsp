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
    

    	<!-- <link rel="stylesheet" href="WEB-INF/css/main.css"> -->
    	<link rel="stylesheet" href="css/main.css">
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
						<%@ include file="/WEB-INF/fragments/heroBanner.jsp" %>
					</div>
				</div>
			</section>
			
			<!-- Section: Brand Promises -->
			<%@ include file="/WEB-INF/fragments/brandPromise.jsp" %>
			
			<!-- Section: Promotion -->
			<%@ include file="/WEB-INF/fragments/promotion.jsp" %>
			
			
			<!-- Section: Products Tabs -->
			<%@ include file="/WEB-INF/fragments/promotedProducts.jsp" %>
			
		</div>
		
		<!-- JQuery & app.js files are included in the footer element. -->
		<%@ include file="/WEB-INF/fragments/footer.jsp" %>		
	</body>
</html>