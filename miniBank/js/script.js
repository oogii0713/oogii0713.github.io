"use strict"

$(function() {
    $("#bankForm").submit(event => {
      event.preventDefault();
      const accNo = $("#accNo").val();
      const custName = $("#custName").val();
      const accType = $("#accType").val();
    //   const entry = document.createElement("li");
    //   entry.setAttribute("class", "list-group-item");
    //   entry.append(document.createTextNode(`${accNo} | ${custName}\t | ${accType}`));

      const entry = $("<li>", {
        "class": "list-group-item",
        "text": `${accNo} | ${custName} | ${accType}`,
      });
      $("#acctInfo").append(entry);
    }); 
  }); 