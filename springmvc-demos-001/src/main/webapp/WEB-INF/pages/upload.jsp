<%--
  Created by IntelliJ IDEA.
  User: jurfl
  Date: 2021/1/13
  Time: 22:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/uploadFile" METHOD="POST" ENCTYPE="multipart/form-data">
    名称:<input type="text" name="userName"></br>
    文件:<input type="file" name="uploadFile"></br>
    <input type="submit" value="提交">
</form>
</body>
</html>
