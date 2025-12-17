<%--
  Created by IntelliJ IDEA.
  User: A402
  Date: 2025/12/9
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>登录界面</title>
</head>
<body>

    <h1>登录表单</h1>
<form action="/login" method="post">
    <label>用户名：</label>
    <input type="text" name="username">
    <br>
    <label>密码：</label>
    <input type="password" name="password">
    <br>
    <% if (request.getAttribute("error") != null){   %>
    <div style="color: red"><%= request.getAttribute("error")%></div>
    <% } %>
    <input type="submit" value="登录">
</form>
</body>
</html>
