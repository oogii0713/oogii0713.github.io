"use strict"
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
      const monthNames = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"];
      const days = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'];
      const date = new Date();
      const year = date.getFullYear();
      const month = monthNames[date.getMonth()];
      const day = date.getDate();
      const dayName = days[date.getDay()];
      const hours = timeFormat(date.getHours());
      const min = (date.getMinutes() < 10 ? '0' : '') + date.getMinutes();
      const sec = (date.getSeconds() < 10 ? '0' : '') + date.getSeconds();
      const period = defPeriod(date.getHours());
      


      function checkTime(hour) {
        if( hour < 10 ) 
          hour = '0' + hour;
        return hour;
      }

      function timeFormat(hour) {
        if ( hour > 12 ) 
          hour = hour - 12;
        return checkTime(hour);
     }

     function defPeriod(hour) {
      if ( hour > 12 ) {
        hour = hour - 12;
        if (hour == 12)
          return 'AM';
        return 'PM';
      }
      return 'AM';
     }

      $('#clock').text(`${dayName}, ${day} ${month} ${year} - ${hours}:${min}:${sec} ${period}`);
    }