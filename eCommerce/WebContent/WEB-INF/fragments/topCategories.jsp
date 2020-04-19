<section id="topCategories" class="border-gray">
	<h4>Top Categories</h4>
	<div class="cat-list">
		<ul>
			<li><a class="noborder" href="shop">Show All</a></li>
			<c:forEach var="category" items="${categories}" varStatus="loopCounter">
				<c:if test="${loopCounter.count<7}">
					<li>
						<a href="<c:url value="/shop?category=${category.id}"/>">
							<c:out value = "${category.name}" />
						</a>
					</li>
			     </c:if>	         	
	      	</c:forEach>				
		</ul>
	</div>
</section>