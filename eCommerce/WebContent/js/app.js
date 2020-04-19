"use strict";
/**
 * app.js
 */
$(function(){
	
	if($('.carousel-wrap').hasClass('active')){
		console.log("here");
		$('.carousel').carousel({
			interval: 5000
		});
	}
	
	if($('#cart').hasClass('active')){		
		
		$(".remove").on("click",function(evt){
			evt.preventDefault();
			const productId = $(this).data("item");
			const itemRow = $('#item-'+productId);
			console.log($(itemRow).find('.total').html());
			const itemPrice = parseFloat($(itemRow).find('.total').html().replace("$",""));
			let gTotal = parseFloat($('#grandTotal').html());
			showLoader();
			
			$.ajax("http://localhost:8080/wap_project/shop",{
				method:"POST",
				data: {"cmd":"removeProductFromCard",
						"productId":productId,
						"quantity":1},
				dataType: "json"
			})
			.done(function(response){
				if(response.success){
					itemRow.remove();
	                gTotal -= itemPrice;
	                $('#grandTotal').html(gTotal);
	                $('#itemCount').text(response.cardSize);
	                showSuccess(response.message);
	                if(response.cardSize==0){
	                	$("#cart").html("<div>Your Shopping Cart is empty.</div>");
	                }
				}else{
					showError(response.message);
				}
			})
			.fail(function(){
				alert("Failed to remove this product from the shopping cart!");
			})
		});
	}
});
function showLoader(){
    $("#loader").show();
}
function hideLoader(){
    $("#loader").hide();
}