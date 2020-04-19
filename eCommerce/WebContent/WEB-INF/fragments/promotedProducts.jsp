<section class="promoted-products mb30">
	<div class="row">
		<div class="col-md-4 col-sm-3 col-xs-12">
			<div class="item featured-products">
				<h4>Featured Products</h4>
				<div class="promoted-products-list">
					<c:forEach var="product" items="${featuredProducts}">
			         	<div class="item row mb20">
							<div class="col-md-3 col-sm-4 col-xs-6">
								<a href="<c:url value="/product?productId=${product.id}"/>" class="thumb"><img src="<c:out value = "${product.imagePath}" />" /></a>							
							</div>
							<div class="col-md-9 col-sm-8 col-xs-6">
								<a href="<c:url value="/product?productId=${product.id}"/>" class="title"><c:out value = "${product.name}"/></a>
								<div class="star-review">
									<i class="material-icons">star_rate</i>
									<i class="material-icons">star_rate</i>
									<i class="material-icons">star_rate</i>
									<i class="material-icons">star_rate</i>
									<i class="material-icons">star_rate</i>
								</div>
								<div class="price">$<c:out value = "${product.price}"/></div>
							</div>
						</div>
			      	</c:forEach>	
				</div>
			</div>
		</div>
		<div class="col-md-4 col-sm-3 col-xs-12">
			<div class="item featured-products">
				<h4>Top Selling Products</h4>
				<div class="promoted-products-list">
					<c:forEach var="product" items="${topProducts}">
			         	<div class="item row mb20">
							<div class="col-md-3 col-sm-4 col-xs-6">
								<a href="<c:url value="/product?productId=${product.id}"/>" class="thumb"><img src="<c:out value = "${product.imagePath}" />" /></a>							
							</div>
							<div class="col-md-9 col-sm-8 col-xs-6">
								<a href="<c:url value="/product?productId=${product.id}"/>" class="title"><c:out value = "${product.name}"/></a>
								<div class="star-review">
									<i class="material-icons">star_rate</i>
									<i class="material-icons">star_rate</i>
									<i class="material-icons">star_rate</i>
									<i class="material-icons">star_rate</i>
									<i class="material-icons">star_rate</i>
								</div>
								<div class="price">$<c:out value = "${product.price}"/></div>
							</div>
						</div>
			      	</c:forEach>			
				</div>
			</div>
		</div>
		<div class="col-md-4 col-sm-3 col-xs-12">
			<div class="item featured-products">
				<h4>Hot Offer</h4>
				<div class="promoted-products-list">
					<c:forEach var="product" items="${hotProducts}">
			         	<div class="item row mb20">
							<div class="col-md-3 col-sm-4 col-xs-6">
								<a href="<c:url value="/product?productId=${product.id}"/>" class="thumb"><img src="<c:out value = "${product.imagePath}" />" /></a>							
							</div>
							<div class="col-md-9 col-sm-8 col-xs-6">
								<a href="<c:url value="/product?productId=${product.id}"/>" class="title"><c:out value = "${product.name}"/></a>
								<div class="star-review">
									<i class="material-icons">star_rate</i>
									<i class="material-icons">star_rate</i>
									<i class="material-icons">star_rate</i>
									<i class="material-icons">star_rate</i>
									<i class="material-icons">star_rate</i>
								</div>
								<div class="price">$<c:out value = "${product.price}"/></div>
							</div>
						</div>
			      	</c:forEach>					
				</div>
			</div>
		</div>
	</div>
</section>