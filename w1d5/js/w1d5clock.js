"use strict";

function displayClock() {
    setInterval(displayClock, 1000);
    let time = new Date();

    let year = time.getFullYear();
    let month = time.getMonth() + 1;
    let day = time.getDate();
    let hours = time.getHours();
    let min = (time.getMinutes() < 10 ? "0" : "") + time.getMinutes();
    let sec = (time.getSeconds() < 10 ? "0" : "") + time.getSeconds();

    // 2019-11-4 12:16:01  
    document.getElementById("clock").innerHTML = year + "-" + month + "-" + day + " " + hours + ":" + min + ":" + sec;
}