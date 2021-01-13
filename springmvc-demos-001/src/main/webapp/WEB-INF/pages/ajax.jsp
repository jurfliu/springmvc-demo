<%--
  Created by IntelliJ IDEA.
  User: jurfl
  Date: 2021/1/11
  Time: 20:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script>
        var userList=new Array();
        userList.push({userName:"beijing",age:34});
        userList.push({userName:"shanghai",age:89});
        $.ajax({
            type:"post",
            url:"${pageContext.request.contextPath}/bike7",
            data:JSON.stringify(userList),
            contentType:"application/json;charset=utf-8",
            success:function(result){
                alert(result);
            }
        })
    </script>
</head>
<body>

</body>
</html>
