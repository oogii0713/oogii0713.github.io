<%--
  Created by IntelliJ IDEA.
  User: oogii
  Date: 4/9/2020
  Time: 11:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="ct" uri="/WEB-INF/custom-tld/ct.tld" %>
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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
    <title>CS472-WAP-Lesson14</title>
</head>
<body>
    <jsp:include page="../fragments/header.jsp"/>
    <main>
        <div class="container">
            <p>&nbsp;</p>
            <div class="jumbotron">
                <h1 class="display-3">Hello, world of HttpServlet 4.0!</h1>
                <h3>Implement JSP Custom tags: Lab14</h3>
                <hr class="my-4">
                <p class="lead">Model 2 Architecture aka <b>Model-View-Controller (MVC) architecture</b></p>
                <p>
                    <c:if test="${true}">
                        <span>Using &lt;ct:CurrentDateTime/&gt;, Server date is: </span><ct:currDateTime color="red" size="18px" /><br/>
                    </c:if>
                </p>
                <p>&nbsp;</p>
                <a class="btn btn-primary btn-lg" href="#" role="button">Learn more</a>
              </div>
        </div>
    </main>
    <jsp:include page="../fragments/footer.jsp"/>
</body>
</html>