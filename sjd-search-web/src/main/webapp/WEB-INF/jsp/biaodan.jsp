<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/24 0024
  Time: 11:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/product/search" METHOD="post">
        <input type="text" name="pName"/><br/>
        <input type="text" value="0" name="minPrice"/><br/>
        <input type="text" value="0" name="maxPrice"/><br/>
        <input type="hidden" value="-1" name="pSales"/><br/>

        <input type="submit" value="提交"/>
    </form>
</body>
</html>
