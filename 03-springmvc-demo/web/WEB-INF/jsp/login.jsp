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
<h2>${helloMsg}</h2>
<div>
    <img src="./static/images/aa.jpg"></img>
    <img src="${pageContext.request.contextPath}/static/images/aa.jpg"></img>
   <!-- 放在web-inf下的静态资源images的图片是访问不到的 -->

<div>有问题的:</div>
    <img src="./images/bb.jpg"></img>
    <img src="./static/images/cc.jpg"></img>
    <img src="../static/images/cc.jpg"></img>
    <img src="../../static/images/aa.jpg"></img>
    <img src="../images/bb.jpg"></img>

</div>
</body>
</html>
