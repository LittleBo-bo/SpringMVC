<%--
  Created by IntelliJ IDEA.
  User: Canic
  Date: 2021/5/15
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.6.0.js"></script>
    <script>
    function a() {
      $.post({
        url:"${pageContext.request.contextPath}/a1",
        data:{"name":$("#username").val()},
        success: function (data,status) {
          console.log("data="+data);
          console.log("status="+status);
        }
      })
    }
    </script>
  </head>
  <body>
  <%--失去焦点的时候，发起一个请求(携带信息)到后台--%>
  用户名：<input type="text" id="username" onblur="a()">
  </body>
</html>
