<%--
  Created by IntelliJ IDEA.
  User: A402
  Date: 2025/12/21
  Time: 17:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>显示用户列表</title>
</head>

<body>
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
</body>
</html>
