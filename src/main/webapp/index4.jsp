<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 31.10.2022
  Time: 20:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index.jsp</title>
</head>
<%--Скреплет - используется, для добавление java кода.--%>
<%
    String myTitle = "my title";
    String[] users = {"Tom", "Pit"};
%>

<h1>Hello world! <%=myTitle%> </h1>
<h1><%=users[0]%></h1>
<h1><%= new Date()%></h1>
<h2><%=request.getAttribute("user")%></h2>
<h1>${user.username}</h1>
<h1>${user.age}</h1>
<h1>${myUsers[1]}</h1>
<h1>-----------------</h1>

<%
    for (String user : users) {
        out.println("<h1>" + getNameWithDots(user) + "</h1>");
    }
%>

<%!
    String getNameWithDots(String value) {
        return value.substring(0, 3) + "...";
    }
%>

<body>
<form action="login" method="post">
    First Name: <input type="text" name="first_name">
    <br/>
    Age:    <input type="text" name="age"/>
    <input type="submit" value="Submit"/>
</form>

</body>
</html>
