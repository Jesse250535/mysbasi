<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册成功</title>
</head>
<body>
<h1>注册成功！</h1>
<p>用户名：${param.username}</p>
<a href="${pageContext.request.contextPath}/showRegister">继续注册</a>
</body>
</html>