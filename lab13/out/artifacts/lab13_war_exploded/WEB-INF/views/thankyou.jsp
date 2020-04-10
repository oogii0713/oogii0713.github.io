<%--
  Created by IntelliJ IDEA.
  User: oogii
  Date: 4/9/2020
  Time: 3:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script defer src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script defer src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script defer src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
    <title>CS472-WAP-Lesson13</title>
</head>
<body>
    <jsp:include page="../fragments/header.jsp"/>
    <main>
        <div class="container">
            <p class="text-right p-2"></p>
            <div class="card">
                <div class="card-header">
                    Thank you! Your message has been received as follows:
                </div>
                <div class="card-body">
                    <p class="lead">Name: <c:out value="${param.customerName}"/> </p>
                    <p><small class="text-muted">Gender: <c:out value="${param.radioGender}"/></small></p>
                    <p><small class="text-muted">Category: <c:out value="${param.ddlCategory}"/></small></p>
                    <p><small>Message: <c:out value="${param.message}"/></small></p><br>
                    <p>Please feel free to <a href="contact">Contact us</a> again.</p>
                </div>
            </div>
        </div>
    </main>
    <div class="container">
        <br>
        <span>Hit Count for this page: </span>
        <span style="float: right;">Total Hit Count for entire WebApp:--</span>
    </div>
    <jsp:include page="../fragments/footer.jsp"/>
</body>
</html>
