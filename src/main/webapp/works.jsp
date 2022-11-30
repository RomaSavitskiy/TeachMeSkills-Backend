<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 24.11.2022
  Time: 12:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>works</title>
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
                <a class="nav_link"  href="#">Works</a>
                <a class="nav_link"  href="#">About</a>
                <a class="nav_link"  href="#">Contacts</a>
            </nav>
        </div>
    </div>
</header>

<div class="intro">
    <div class="container">
        <div class="work-div">
            <a href="DBmainServlet">
                <div class="work-button">
                    <p>Students</p>
                    <br>
                    <p>Task: output information about all students from SQL DB</p>
                </div>
            </a>
        </div>
        <div class="work-div">
            <a href="date.jsp">
                <div class="work-button">
                    <p>Define date</p>
                    <br>
                    <p>Task: define the day of the week and number of day of the year from a date</p>
                </div>
            </a>
        </div>
        <div class="work-div">
            <a href="date.jsp">
                <div class="work-button">
                    <p>Define date</p>
                    <br>
                    <p>Task: define the day of the week and number of day of the year from a date</p>
                </div>
            </a>
        </div>
    </div>
</div>

<script src="static/bootstrap.bundle.min.js" ></script>
<script src="static/my.js"></script>
</body>
</html>
