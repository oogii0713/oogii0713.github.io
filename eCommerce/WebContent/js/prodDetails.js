"use strict";
$(function(){
	$("#minus").on('click',deductQty);
	$("#plus").on('click',addQty);
	$('#addToCard').on('click',addProduct);
});

function addProduct(event){
	event.preventDefault();
	const productId = $(this).attr("value");
	const quantity = $("#inputQty").val();
	$.ajax("http://localhost:8080/wap_project/shop",{
		method:"POST",
		data: {"cmd":"addProductToCard",
				"productId":productId,
				"quantity": quantity},
		dataType: "json"
	})
	.done(function(response){
		if(response.success){
			$('#itemCount').text(response.cardSize);
			showSuccess(response.message);
			location.reload(true); 
		}else{
			showError(response.message);
		}
	})
	.fail(function(){
		alert("Failed to add this product on shopping card!");
	})
}


function deductQty(event) {
	event.preventDefault();
	let inputQty = parseInt($("#inputQty").val());
	if (inputQty > 1) {
		inputQty--;
	} 
	$("#inputQty").val(inputQty);
}

function addQty(event) {
	event.preventDefault();
	const productQty = parseInt($("#productQuantity").val());
	let inputQty = parseInt($("#inputQty").val());
	if (productQty > inputQty) {
		inputQty = inputQty + 1;
		$("#inputQty").val(inputQty);
	}
	
}

$('#feauturedProductControls').carousel({
	  interval :2000
	})

	$('.carousel .carousel-item').each(function(){
	    var next = $(this).next();
	    if (!next.length) {
	    next = $(this).siblings(':first');
	    }
	    next.children(':first-child').clone().appendTo($(this));
	    
	    for (var i=0;i<2;i++) {
	        next=next.next();
	        if (!next.length) {
	        	next = $(this).siblings(':first');
	      	}
	        
	        next.children(':first-child').clone().appendTo($(this));
	      }
	});
