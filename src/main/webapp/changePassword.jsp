<%--
  Created by IntelliJ IDEA.
  User: A402
  Date: 2025/12/21
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>忘记密码</title>
</head>
<body>
<h1>修改密码</h1>
<form action="/changePassword" method="post">
    <label>用户名：</label>
    <input type="text" name="username">
    <br>
    <label>新密码：</label>
    <input type="password" name="newpassword">
    <br>
    <label>确认密码：</label>
    <input type="password" name="cusername">
    <br>
    <% if (request.getAttribute("error") != null){   %>
    <div style="color: red"><%= request.getAttribute("error")%></div>
    <% } %>
    <input type="submit" value="修改">
</form>
</body>
</html>
