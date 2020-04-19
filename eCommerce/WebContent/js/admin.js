/**
 admin.js
 @author Burmaa.E
 */
'use strict';
(function(){

})();

const loadImage = function(event){
    let image = document.getElementById('uploadedImage');
    image.src = URL.createObjectURL(event.target.files[0]);
    image.classList.remove("d-md-none");
    const label = document.getElementById("chooseFileLabel");
    label.innerText = event.target.files[0].name;
    const date = new Date();
    document.getElementById('id').value = "" + date.getFullYear() + (date.getMonth() + 1) + date.getUTCDate() + Math.floor(Math.random()*100);
}

function deleteProduct(id){
		fetch(
		      'http://localhost:8080/wap_project/delete-product',
		      {
		        method: 'POST',
		        mode: 'no-cors',
		        headers: {
		          'Content-Type': 'application/x-www-form-urlencoded',
		        },
		        body: 'productId='+ id
		      }
		    )
		      .then((result) => {
		    	  if(result.ok){
		    		  $('#row-'+id).remove();
		    	  }
		      })
		      .catch((res) => console.log(res));
		
}