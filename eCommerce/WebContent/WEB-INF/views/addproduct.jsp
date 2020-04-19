<%--
  Created by IntelliJ IDEA.
  User: Burmaa-PC
  Date: 4/14/2020
  Time: 1:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Add Product</title>
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<link
	href="https://fonts.googleapis.com/css2?family=Roboto:wght@100;300;400;500;700;900&display=swap"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<link rel="stylesheet" href="css/main.css">


</head>
<body>
	<%@ include file="/WEB-INF/fragments/header.jsp"%>
	<main>
		<div class="container">
			<h1 id="titleHeader">Add Product</h1>
			<hr style="border: 1px solid grey;" />
			<form class="was-validated" method="POST" action="./add-product"
				enctype="multipart/form-data" id="productForm">
				<div class="form-row">
					<div class="col-md-6 mb-2">
						<div class="form-group">
							<label for="name">*Product Name:</label> <input type="text"
								id="name" name="name" placeholder="Enter name of the product"
								class="form-control" required value=""
								pattern="^[a-zA-Z ,.'-]+$" />
							<div class="valid-feedback">Looks good!</div>
							<div class="invalid-feedback">Enter a valid name!</div>
						</div>
					</div>
					<div class="col-md-6 mb-2">
						<div class="form-group">
							<label for="quantity">*Quantity:</label>
							<div class="input-group">
								<input name="quantity" id="quantity" type="text" required
									value="" class="form-control" placeholder="0"
									pattern="^[0-9]+$">
							</div>
							<div class="valid-feedback">Looks good!</div>
							<div class="invalid-feedback">Enter a valid quantity!</div>
						</div>
					</div>
				</div>
				<div class="form-row">
					<div class="col-md-6 mb-2">
						<div class="form-group">
							<label for="price">*Price:</label>
							<div class="input-group">
								<div class="input-group-prepend">
									<div id="dollar-sign" class="input-group-text">$</div>
								</div>
								<input name="price" id="price" type="text" required value=""
									class="form-control" placeholder="0.00" pattern="^[0-9.]+$">

								<div class="valid-feedback">Looks good!</div>
								<div class="invalid-feedback">Enter a valid price!</div>
							</div>
						</div>

					</div>
					<div class="col-md-6 mb-2">
						<div class="form-group">
							<label for="category">*Category:</label> <select name="category"
								id="category" class="form-control" required>
								<option value="">Select...</option>
								<c:forEach var="category" items="${categories}">
									<option value="${category.id}" />
									<c:out value="${category.name}" />
									</option>
								</c:forEach>
							</select>
							<div class="valid-feedback">Looks good!</div>
							<div class="invalid-feedback">Need to select one of them!</div>
						</div>
					</div>
				</div>
				<div class="form-row">
					<div class="col-md-6 mb-2">
						<div class="form-group">
							<label for="description">*Description:</label>
							<textarea id="description" name="description"
								placeholder="Please, enter description of the product"
								class="rounded-1 form-control" required value=""
								pattern="^[a-zA-Z ,.'-]+$" rows="3"></textarea>
							<div class="valid-feedback">Looks good!</div>
							<div class="invalid-feedback">Enter a valid description!</div>
						</div>
					</div>
					<div class="col-md-6 mb-2 mt-4">
						<div class="form-row">
							<div class="col-md-6 mb-2">
								<div class="form-group">
									<label for="productImage">*Product Image:</label>
									<div class="custom-file overflow-hidden mb-1">
										<input id="productImage" accept="image/*" name="productImage"
											onchange="loadImage(event)" required type="file"
											class="form-control custom-file-input "> <label
											for="productImage" id="chooseFileLabel"
											class="custom-file-label ">Choose file</label>
									</div>
									<div class="valid-feedback">Looks good!</div>
									<div class="invalid-feedback">Upload a picture!</div>
									
								</div>
							</div>
							<div class="col-md-6 mb-2">
								<img id="uploadedImage" class="d-md-none" width="150" 
								alt="Uploaded image" />
							</div>
						</div>
					</div>
				</div>
				<div class="my-auto mx-2">
						<div class="text-center form-group">
							<input type="hidden" name="id" required id="id" value="0" />
							<button class="btn btn-info" type="submit">Add Product</button>
						</div>
				</div>
				
			</form>
		</div>
	</main>
	<%@ include file="/WEB-INF/fragments/footer.jsp"%>
	<script src="js/admin.js"></script>
</body>
</html>
