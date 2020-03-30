window.onload = function() {
    "use strict";
    // put all of your code here

    document.getElementById("btnForBG").onclick = interval;
    document.getElementById("bling").onchange = textStyle;
    document.getElementById("btnPig").onclick = igpay;
    document.getElementById("btnMalkov").onclick = malkov;
}

function newAlert() {
    alert("Hello, World!");
}

function enlargeFont() {
    let textArea = document.getElementById("txtarea");
    let size = parseInt(textArea.style.fontSize) ? parseInt(textArea.style.fontSize) : 12;
    size += 2;
    textArea.style.fontSize =  size + "pt";
}

function textStyle() {
    if (document.getElementById("bling").checked == true) {
        document.getElementById("txtarea").style.fontWeight = "bold";
        document.getElementById("txtarea").style.color = "green";
        document.getElementById("txtarea").style.textDecoration = "underline";
        document.body.style.backgroundImage = 'url("http://www.cs.washington.edu/education/courses/190m/CurrentQtr/labs/6/hundred-dollar-bill.jpg")';
    } else {
        document.getElementById("txtarea").style.fontWeight = "";
        document.getElementById("txtarea").style.color = "";
        document.getElementById("txtarea").style.textDecoration = "";
        document.body.style.backgroundImage = "";

    }
}

var timer = null;

function interval() {
    if (timer == null) {
        timer = setInterval(enlargeFont, 500);;
    } else {
        clearInterval(timer);
        timer = null;
    }
}

function igpay() {
    let words = document.getElementById("txtarea").value;
    let splittedword = words.split(/\s+/);
    let result = "";
    for (let i = 0; i < splittedword.length; i++) {
        if (splittedword[i].charAt(0).match("[aeoiuAEOIU]")) {
            changed = splittedword[i] + "ay";
        } else {
            let word = splittedword[i];
            for (let j = 0; j < word.length; j++) {
                if (word[j].match("[aeoiuAEOIU]")) {
                    let changed = word.substring(j) + word.substring(0, j) + "ay";
                    break;
                }

            }
        }
        result += changed + " ";

    }
    document.getElementById("txtarea").value = result;
}

function malkov() {
    var words = document.getElementById("txtarea").value;
    var arr = words.split(/\s+/);
    var result = "";
    for (let i = 0; i < arr.length; i++) {
        if (arr[i].length >= 5) {
            arr[i] = "Malkovich";
        }
        result += arr[i] + " ";
    }
    document.getElementById("txtarea").value = result;
}