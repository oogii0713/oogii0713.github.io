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
    	<link rel="stylesheet" href="css/about.css">
    	<link rel="stylesheet" href="css/main.css">
	</head>
	<body>		
		<%@ include file="/WEB-INF/fragments/header.jsp" %>
		<div class="container">
			<div class="row mb-4">
		    	<div class="col-md-6 col-sm-6 col-xs-12" style="border-right:1px solid rgba(0,0,0,.125);">
			          <h2 class="text-center">About project</h2>
			          <p>
			          This is a final project task of Web application programming(CS472) at MIU.
			          </p>
			          <p> 
			          We have developed this project team as group of 5 members.
			          In this project we have chosen e-commerce web application. 
			          E-Commerce web applications are very popular and useful in modern world. 
			          Also, many scenarios are convenient to use jQuery ajax and restful API.  Hence, we implemented many features that we learn from this course.
			          </p>
			          
			           <button type="button" class="collapsible"> - Advantage of E-commerce</button>
						<div class="content">
						  <p>Application covers the market with an ever-growing network of business and technology partners that we actively
						   support in terms of technical support, sales, and marketing. We are keen on promoting the highest 
						   possible return on partnerships. By providing the highest standard of client services, our partners
						   can rely on us as a stable source of income.</p>
						</div>
					     <button type="button" class="collapsible"> - Why E-commerce ? </button>
						<div class="content">
						  <p>The world of eCommerce selling products and services through the internet, offers vast opportunity for
						   entrepreneurs. If you're interested in starting a business, selling online can be extremely rewarding. 
						   It can also provide a path to success without the risks involved in buying property and opening a physical store..</p>
						</div>	
						<button type="button" class="collapsible"> - Awesome quality of application</button>
						<div class="content">
						  <p>Perfecting product quality has numerous benefits for any company. The positive correlation between product
						   quality and sales should be reason enough to make quality a top priority in a business strategy. The trust, 
						   credibility, and loyalty that comes from happy customers builds repeat sales and ignites positive.</p>
						</div>	
								          
			    </div>
			    <div class="col-md-6 col-sm-6 col-xs-12">
			    	<h2 class="text-center">Team members</h2>
			    	<div class="row">
			    		<div class="col-md-4 mt-2" >
				    		<div class="card" style="width: 12rem;">
							  <img class="card-img-top" src="images/male.PNG" alt="Card image cap">
							  <div class="card-body justify-content-center">
							    <p class="card-text"><b>Munkh-Erdene Tolya</b><br/>
							    	<small id="emailHelp" class="text-muted">Team member</small>
							    </p>
							  </div>
							</div>
			    		</div>
			    		<div class="col-md-4 mt-2" >
				    		<div class="card" style="width: 12rem;">
							  <img class="card-img-top" src="images/female.PNG" alt="Card image cap">
							  <div class="card-body justify-content-center">
							    <p class="card-text"><b>Namuun Sainbayar</b><br/>
							    	<small id="emailHelp" class="text-muted">Team member</small>
							    </p>
							  </div>
							</div>
			    		</div>
			    		<div class="col-md-4 mt-2" >
				    		<div class="card" style="width: 12rem;">
							  <img class="card-img-top" src="images/male.PNG" alt="Card image cap">
							  <div class="card-body justify-content-center">
							    <p class="card-text"><b>Otgonbayar Mijiddorj</b><br/>
							    	<small id="emailHelp" class="text-muted">Team member</small>
							    </p>
							  </div>
							</div>
			    		</div>
			    		<div class="col-md-4 mt-2" >
				    		<div class="card" style="width: 12rem;">
							  <img class="card-img-top" src="images/female.PNG" alt="Card image cap">
							  <div class="card-body justify-content-center">
							    <p class="card-text"><b>Burmaa Enkhbat</b><br/>
							    	<small id="emailHelp" class="text-muted">Team member</small>
							    </p>
							  </div>
							</div>
			    		</div>
			    		<div class="col-md-4 mt-2" >
				    		<div class="card" style="width: 12rem;">
							  <img class="card-img-top" src="images/male.PNG" alt="Card image cap">
							  <div class="card-body justify-content-center">
							    <p class="card-text"><b>Uuganbayar Oyun</b><br/>
							    	<small id="emailHelp" class="text-muted">Team member</small>
							    </p>
							  </div>
							</div>
			    		</div>
			    	</div>
	        	</div>
		    </div>
		    <%@ include file="/WEB-INF/fragments/brandPromise.jsp" %>
		  </div>
		
		<!-- JQuery & app.js files are included in the footer element. -->
		<%@ include file="/WEB-INF/fragments/footer.jsp" %>		

	</body>
</html>
		
<script>
		var coll = document.getElementsByClassName("collapsible");
		var i;
		
		for (i = 0; i < coll.length; i++) {
		  coll[i].addEventListener("click", function() {
		    this.classList.toggle("active");
		    var content = this.nextElementSibling;
		    if (content.style.display === "block") {
		      content.style.display = "none";
		    } else {
		      content.style.display = "block";
		    }
		  });
		}
</script>