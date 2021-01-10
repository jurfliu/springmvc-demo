<%--
  Created by IntelliJ IDEA.
  User: jurfl
  Date: 2020/9/12
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>helloworld</title>
</head>
<body>
<h2>${helloMsg}-123</h2>

<img src="./images/aa.jpg"></img>
<img src="${pageContext.request.contextPath}/images/aa.jpg"></img>
<!--也就是说web-inf下面的静态资源是访问不到的  -->
<img src="../images/bb.jpg"></img>
<img src="/WEB-INF/images/bb.jpg"></img>
</div>
</body>
</html>
