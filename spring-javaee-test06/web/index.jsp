<%--
  Created by IntelliJ IDEA.
  User: Canic
  Date: 2021/5/19
  Time: 22:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <form method="post" action="${pageCon3text.request.contextPath}/mc/submit">
                <table class="table">
                    <thead>
                    <tr>
                        <th>你心中的偶像是？</th>
                    </tr>
                    </thead>

                    <tbody></h1>
                    <tr class="error">
                        <td>美羊羊</td>
                        <td><input type="radio" name="yy" value="myy" ></td>
                    </tr>
                    <tr class="success">
                        <td>喜羊羊</td>
                        <td><input type="radio"  name="yy" value="xyy"></td>
                    </tr>
                    <tr class="error">
                        <td>懒羊羊</td>
                        <td><input type="radio"  name="yy" value="lyy"></td>
                    </tr>
                    <tr class="success">
                        <td>沸羊羊</td>
                        <td><input type="radio" name="yy" value="fyy"></td>
                    </tr>
                    <tr class="error">
                        <td>现在的年龄</td>
                        <td><input type="text" name="age"></td>
                    </tr>
                    </tbody>
                </table>
                <div class="col-md-12 column">
                    <button type="submit" >提交</button>
                </div>
            </form>
        </div>
    </div>
</div>

</body>
</html>
