$(document).ready(function() {
    clockUpdate();
    setInterval(clockUpdate, 1000);

    $("#midForm").submit(event => {
      event.preventDefault();
      let name = $("#fullname").val();
      let cizenID = $("#cizenID").val();
      let ssn = $("#ssn").val();
      let state = $("#state option:selected").val();
      let radioValue = $("input[name='options']:checked").val();

      
      $("#citizenTable tbody").after(`<tr>
        <td>${name}</td>
        <td>${cizenID}</td>
        <td>${ssn}</td>
        <td>${state}</td>
        <td>${radioValue}</td>
      </tr>`);
    }); 
  });
  
  
  function clockUpdate() {
    const date = new Date();
    function addZero(x) {
      if (x < 10) {
        return x = '0' + x;
      } else {
        return x;
      }
    }

    const h = addZero(date.getHours());
    const m = addZero(date.getMinutes());
    const s = addZero(date.getSeconds());
  
    $('#clock').text(h + ':' + m + ':' + s)
  }