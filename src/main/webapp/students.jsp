<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 19.11.2022
  Time: 22:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>homeworks</title>
    <link rel="stylesheet" href="static/bootstrap.min.css">
    <link rel="stylesheet" href="css/mystyle.css" type="text/css">
</head>

<body>

<header class="header">
    <div class="container">
        <div class="header_inner">
            <div class="header_logo">Homeworks</div>

            <nav class="nav">
                <a class="nav_link" href="index.jsp">Main</a>
                <a class="nav_link"  href="works.jsp">Works</a>
                <a class="nav_link"  href="#">About</a>
                <a class="nav_link"  href="#">Contacts</a>
            </nav>
        </div>
    </div>
</header>

<div class="intro">
    <div class="container">
        <div class="intro_inner">
            <h1>${SA}</h1>
        </div>
    </div>
</div>

<footer>
    <div>

    </div>
</footer>

<script src="static/bootstrap.bundle.min.js" ></script>
<script src="static/my.js"></script>
</body>
</html>
