<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册表单</title>
</head>
<body>
<h2>用户注册</h2>
<form action="/doregister" method="post">
    用户名：<input type="text" name="username" required><br><br>
    密码：<input type="password" name="password" required><br><br>
    <input type="submit" value="注册">
</form>
</body>

</html>