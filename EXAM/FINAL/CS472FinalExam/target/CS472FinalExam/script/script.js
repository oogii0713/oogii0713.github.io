$(function(){
    $('#myForm').on('submit',registerCourse);
});



function registerCourse(event) {
    event.preventDefault();
    const url = 'http://localhost:8080/CS472FinalExam/registerCourse';
    const formData = $('#myForm').serialize();


    fetch(url, {
        method: 'POST',
        body: formData,
        headers: {
            'Content-Type': 'application/x-www-form-urlencoded',
        }
    })
        .then(res => {
            console.log(res);
            alert("Registration completed");
            $('#myForm').trigger("reset");
        })
        .catch(error => {
            alert("Failed to register for a course!");
        });
}