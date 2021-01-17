<%--
  Created by IntelliJ IDEA.
  User: jurfl
  Date: 2021/1/16
  Time: 17:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login/toLogin" method="post">
   姓名: <input type="text"  name="userName" value=""/>
    密码:<input type="password" name="password" value=""/>
    <input type="submit" value="登录">
</form>
</body>
</html>
