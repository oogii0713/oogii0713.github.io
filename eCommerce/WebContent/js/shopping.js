"use strict";
$(function(){
	$('.addToCard').on('click',addProduct);
});

function addProduct(event){
	event.preventDefault();
	const productId = $(this).attr("value");
	$.ajax("http://localhost:8080/wap_project/shop",{
		method:"POST",
		data: {"cmd":"addProductToCard",
				"productId":productId,
				"quantity":1},
		dataType: "json"
	})
	.done(function(response){
		if(response.success){
			$('#itemCount').text(response.cardSize);
			showSuccess(response.message);
		}else{
			showError(response.message);
		}
	})
	.fail(function(){
		alert("Failed to add this product on shopping card!");
	})
}


