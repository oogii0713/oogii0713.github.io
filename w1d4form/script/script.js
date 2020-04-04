"use strict"
$(function() {
  $("#w1d4form2").submit(event => {
    event.preventDefault();
    const pNum = $("#pNumber").val();
    const pN = $("#pName").val();
    const uP = $("#unitPrice").val();
    const sN = $("#supplierName").val();
    const sD = $("#supplyDate").val();
    const pQ = $("#pQuantity").val();
    const pDivData = $("#divProduct");
    $("#pProdNum").text(`Product Number: ${pNum} \n`);
    $("#pProdName").text(`Product name: ${pN} \n`);
    $("#pProdPrice").text(`Unit Price: ${uP} \n`);
    $("#pQty").text(`Product Quantity: ${pQ} \n`);
    $("#pProdSupplier").text(`Supplier name: ${sN} \n`);
    $("#pProdDate").text(`Supplied date: ${sD}`);
    pDivData.css("display", "block");
  }); 
}); 
 
function popalert() {
  const pNum = document.getElementById("pNumber").value;
  const pN = document.getElementById("pName").value;
  const uP = document.getElementById("unitPrice").value;
  const sN = document.getElementById("supplierName").value;
  const sD = document.getElementById("supplyDate").value;
  const pQ = document.getElementById("pQuantity").value;
  alert("Product name: " + pN + "\nProduct number: " + pNum + "\nUnit Price: " +  uP + "\nQuantity in stock: "  +  pQ + "\nSupplier name: " + sN + "\nSupplied date: " + sD);
}