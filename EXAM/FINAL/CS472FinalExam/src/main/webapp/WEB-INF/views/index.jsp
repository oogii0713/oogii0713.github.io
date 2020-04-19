<%--
  Created by IntelliJ IDEA.
  User: oogii
  Date: 4/11/2020
  Time: 11:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <script defer src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script defer src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    <script defer src="${pageContext.request.contextPath}/script/script.js"></script>

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
    <title>FINAL EXAM</title>
</head>

<body>
<header>
    <nav class="navbar navbar-dark bg-dark">
        <a class="navbar-brand" href="#">CS472 : : : Student Registration</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
        </div>
    </nav>
</header>
<main>
    <div class="container">
        <p>&nbsp;</p>
        <h2>Student Registration Form</h2>
        <form id="myForm">
            <div class="form-group">
                <label for="studentId">Student ID</label>
                <input type="text" placeholder="000-XX-XXXX" class="form-control" name="studentId" id="studentId" aria-describedby="studentIdlHelp" pattern="^[0]{3}(-[0-9]{2}-[0-9]{4})$" required
                       title="You unique student Identification number">
                <small id="accNolHelp" class="form-text text-muted">You unique student Identification number.</small>
            </div>
            <div class="form-group">
                <label>*Level of study</label><br>
                <label class="mr-3"><input type="radio" name="degree" id="ugrad" value="Undergraduate" required> Undergraduate</label>
                <label class="mr-3"><input type="radio" name="degree" id="pgrad" value="Postgraduate"> Postgraduate</label>
            </div>
            <div class="form-group">
                <label for="fullName">Full Name</label>
                <input type="text" placeholder="e.g. Anna J.Smith" class="form-control" name="fullName" id="fullName" required>
            </div>
            <div class="form-group">
                <label>*Next Course to take</label>
                <select class="form-control" name="nextCourse" id="nextCourse" required>
                    <option value="" selected disabled>Select Course...</option>
                    <option value="CS401-MPP">CS401-MPP</option>
                    <option value="CS544-EA">CS544-EA</option>
                    <option value="CS582-ASD">CS582-ASD</option>
                </select>
            </div>
            <button id="btn" type="submit" class="btn btn-primary">Register Student</button>
        </form>
        <p>&nbsp;</p>
    </div>
</main>
<footer class="footer">
    <div id="footer-content">
        <span class="text-muted">Otgonbayar M : : : CS472-WAP</span>
        <span class="text-muted" style="float:right;">&copy; April 2020</span>
    </div>
</footer>
</body>
</html>
