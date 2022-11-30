<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 30.11.2022
  Time: 13:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>day of the week</title>
  <link rel="stylesheet" href="static/bootstrap.min.css">
  <link rel="stylesheet" href="css/mystyle.css" type="text/css">
  <link rel="stylesheet" href="css/date.css" type="text/css">
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
        <p class="date-text">Input date for define day of the week or day number of the year</p>
            <form action="DayOfTheWeek" method="get">
                <input type="text" name="date" value="Date"/>
                <br>
                <input type="submit" value="Define number day of the year">
            </form>
            <form action="DayOfTheYear" method="post">
                <input type="text" name="date" value="Date"/>
                <br>
                <input type="submit" value="Define number day of the year">
            </form>
    </div>
</div>

<script src="static/bootstrap.bundle.min.js" ></script>
<script src="static/my.js"></script>
</body>
</html>
