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
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Customer Contact App</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css"
          integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
<jsp:include page="../fragments/header.jsp"/>
<div class="container">
    <main>
        <div class="container">
            <p class="h1">Customer Contact Form</p>
            <div>
                <c:forEach var="error" items="${errMsgs}">
                    <p><span style="color:red;font-size:1em"><c:out value="${error}"/></span></p>
                </c:forEach>
            </div>
            <form id="contactForm" method="POST" action="${pageContext.request.contextPath}/process-contact-form">
                <div class="row justify-content-md-center">
                    <div class="col-12">
                        <div class="form-group">
                            <label>*Name</label>
                            <input type="text" name="customerName" id="customerName" class="form-control" placeholder="e.g. John Smith" value="${param.customerName}" pattern="^[a-zA-Z]+(([\'\,\.\-][a-zA-Z])?[a-zA-Z]*)*$">
                            <small class="form-text text-muted">Enter your full name</small>
                        </div>
                    </div>
                    <div class="col-12">
                        <label>*Gender?</label><br>
                        <label class="mr-3"><input type="radio" name="radioGender" id="male" value=" Male"
                        <c:if test="${param.radioGender eq 'male'}">
                            <c:out value="checked"/>
                        </c:if>> Male</label>
                        <label class="mr-3"><input type="radio" name="radioGender" id="female" value=" Female"
                        <c:if test="${param.radioGender eq 'female'}">
                            <c:out value="checked"/>
                        </c:if>> Female</label>
                    </div>
                    <div class="col-12">
                        <div class="form-group">
                            <label>*Category</label>
                            <select class="form-control" name="ddlCategory" id="ddlCategory">
                                <option value="">Select...</option>
                                <option value="Feedback"
                                        <c:if test="${param.ddlCategory eq 'Feedback'}">
                                            <c:out value=" selected "/>
                                        </c:if>>Feedback</option>
                                <option value="Inquiry"
                                        <c:if test="${param.ddlCategory eq 'Inquiry'}">
                                            <c:out value=" selected "/>
                                        </c:if>>Inquiry</option>
                                <option value="Complaint"
                                        <c:if test="${param.ddlCategory eq 'Complaint'}">
                                            <c:out value=" selected "/>
                                        </c:if>>Complaint</option>
                            </select>
                            <small class="form-text text-muted">Select you State of residence</small>
                        </div>
                    </div>
                    <div class="col-12">
                        <div class="form-group">
                            <label>*Message</label>
                            <textarea class="form-control" name="message" id="message" rows="3"></textarea>
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