
<%--
  Created by IntelliJ IDEA.
  User: A402
  Date: 2025/12/16
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>登录成功</title>
</head>
<body>
<h1 style="color: darkgreen">登录成功</h1>
<h2>用户列表</h2>
<table border="1">
    <tr>
        <th>用户名</th>
        <th>密码</th>
        <th>头像</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${users}" var="user2">
        <tr>
            <td>${user2.username}</td>
            <td>${user2.password}</td>
            <td>Picture</td>
            <td><a href="/deleteUser?username=${user2.username}">删除</a> <a href="/showChangePassword?username=${user2.username}">修改密码</a></td>
        </tr>
    </c:forEach>
</table>
<a href="/index.jsp">返回index界面</a>
</body>
</html>
