<%--
  Created by IntelliJ IDEA.
  User: oogii
  Date: 4/9/2020
  Time: 3:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <script defer src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script defer src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script defer src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <title>CS472-WAP-Lesson13</title>
</head>
<body>
    <jsp:include page="../fragments/header.jsp"/>
    <main>
        <div class="container">
            <p class="h1">Customer Contact Form</p>
            <form id="contactForm" method="POST">
                <div class="row justify-content-md-center">
                    <div class="col-12">
                        <div class="form-group">
                            <label>*Name</label>
                            <input type="text" name="name" id="name" class="form-control" placeholder="e.g. John Smith" value="${param.name}" pattern="^[a-zA-Z]+(([\'\,\.\-][a-zA-Z])?[a-zA-Z]*)*$" required>
                            <small class="form-text text-muted">Enter your full name</small>
                        </div>
                    </div>
                    <div class="col-12">
                        <label>*Gender?</label><br>
                        <label class="mr-3"><input type="radio" name="gender" id="male" value=" Male"
                        <c:if test="${param.gender eq 'Male'}">
                            <c:out value="checked"/>
                        </c:if>> Male</label>
                        <label class="mr-3"><input type="radio" name="gender" id="female" value=" Female"
                        <c:if test="${param.gender eq 'Female'}">
                            <c:out value="checked"/>
                        </c:if>> Female</label>
                    </div>
                    <div class="col-12">
                        <div class="form-group">
                            <label>*Category</label>
                            <select class="form-control" name="category" id="category" required>
                                <option value="">Select...</option>
                                <option value="Feedback"
                                        <c:if test="${param.ddlCategory eq 'Feedback'}">
                                            <c:out value=" selected "/>
                                        </c:if>>Feedback</option>
                                <option value="Inquiry"
                                        <c:if test="${param.ddlCategory eq 'Inquiry'}">
                                            <c:out value=" selected "/>
                                        </c:if
                                >Inquiry</option>
                                <option value="Complaint"
                                        <c:if test="${param.ddlCategory eq 'Complaint'}">
                                            <c:out value=" selected "/>
                                        </c:if
                                >Complaint</option>
                            </select>
                            <small class="form-text text-muted">Select you State of residence</small>
                        </div>
                    </div>
                    <div class="col-12">
                        <div class="form-group">
                            <label>*Message</label>
                            <textarea class="form-control" name="message" id="message" rows="3" required></textarea>
                        </div>
                    </div>
                    <div class="col-12">
                        <button id="btn" type="submit" class="btn btn-primary btn-lg btn-block">Sumbit</button>
                    </div>
                </div>
            </form>
        </div>
        <div class="container">
            <br>
            <span>Hit Count for this page: ${hitCount}</span>
            <span style="float: right;">Total Hit Count for entire WebApp: --</span>
        </div>
    </main>
    <jsp:include page="../fragments/footer.jsp"/>
</body>
</html>
