/**
 * @author Oogii
 * description: Lab15 
 */ 
 
"use strict" 

$(function() {
    loadBookInfo();
    $('#addBookForm').on('submit',addBook); 
});

function loadBookInfo() {
    const url = 'https://elibraryrestapi.herokuapp.com/elibrary/api/book/list';
    fetch(url).then(data => data.json())
    .then(response => {
        let i = 0;
        $.each(response, function(key, value) {
            let book ='';
            book += '<tr>';
            book += '<td>' +(++i)+'</td>';
            book += '<td>' +value.isbn+'</td>';
            book += '<td>' +value.title+'</td>';
            book += '<td>' +value.overdueFee+'</td>';
            book += '<td>' +value.publisher+'</td>';
            book += '<td>' +value.datePublished+'</td>';
            book += '</tr>';
            $("#bookInfo > tbody").append(book);
        });
        
    })
    .catch(error => {
        const errMsg = $("<p>", {"text": "Failed to load book data", "css": {
               "color": "red",
                "text-align": "center"
            }
        });
        $("#listOfBook").append(errMsg);
    });
}


function addBook(event) {
    event.preventDefault();
    const url = 'https://elibraryrestapi.herokuapp.com/elibrary/api/book/add';

    const formData = {};
    $('#addBookForm').serializeArray().map(function(x){formData[x.name] = x.value;}); 

    fetch(url, {
        method: 'POST',
        body: JSON.stringify(formData),
        headers: {
            'Content-Type': 'application/json'
        }
    })
    .then(res => {
        $('#addBookForm').trigger("reset");
        $("#bookDialog #close").click();
        loadBookInfo();
        alert("Book successfully added");
    })
    .catch(error => {
        alert("Failed to save new book!");
    });
    
}
