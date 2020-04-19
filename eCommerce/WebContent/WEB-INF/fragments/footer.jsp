<footer>
	<div class="container">
		<div class="row">
			<div class="col-md-3 col-sm-6 col-xs-12">
				<a href="<c:url value="/"/>" class="logo"><img src="images/logo.png" /></a>
				<div class="foo-desc">
					This is E-Commerce application that have been made by 5 students of MIU.
				</div>
			</div>
			<div class="col-md-2 col-sm-6 col-xs-12">
				<h4>Categories</h4>
				<ul>
					<c:forEach var="category" items="${categories}" varStatus="loopCounter">
						<!-- checking counter is lower than 5, because we'll show only first 4 categories below -->
						<c:if test="${loopCounter.count<5}">
							<li><a href="<c:url value="/shop?category=${category.id}"/>"><c:out value = "${category.name}" /></a></li>
					     </c:if>	         	
			      	</c:forEach>					
				</ul>
			</div>
			<div class="col-md-3 col-sm-6 col-xs-12">
				<h4>Subscribe Newsletter</h4>
				<div>Get latest updates and offers.</div>
			</div>
			<div class="col-md-4 col-sm-6 col-xs-12">
				<h4>Contact Us</h4>
				<div class="contact-info address">1000 N 4th Street, Fairfield, IA 52557, USA</div>
				<div class="contact-info phone">(800) 369-6480</div>
				<div class="contact-info email">contact@miu.edu</div>
			</div>
		</div>
	</div>
</footer>
<div id="notify" style="display: none;">Alert</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js" type="text/javascript"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
		<script type="text/javascript" src="js/app.js" ></script>
		<script src="js/notify.js"></script>