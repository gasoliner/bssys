<%--
  Created by IntelliJ IDEA.
  User: 万洪基
  Date: 2016/12/26
  Time: 9:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>

    <link rel="stylesheet" type="text/css" href="/ui/themes/bootstrap/easyui.css">
    <link rel="stylesheet" type="text/css" href="/ui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="/ui/demo/demo.css">
    <script type="text/javascript" src="/ui/jquery.min.js"></script>
    <script type="text/javascript" src="/ui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="/ui/bssys.js"></script>
</head>
<body>
<div class="easyui-layout" style="width: 100%;height: 700px;">
    <div region="north" split="true" style="width: 100%;height: 70px;border: 0px">
        <jsp:include page="north.jsp"/>
    </div>
    <div region="center" style="padding: 5px;border-left: 0px;border-right: 0px;border-top: 0px;">

        <form id="fm" method="post">
            <div style="font-size:16px;margin-left:500px;margin-right:500px;">
                <div class="fitem">
                    <label>账号&nbsp;&nbsp;&nbsp;</label>
                    <div style="height: 5px;">&nbsp;</div>
                    <input class="easyui-textbox" name="employeenum" style="width: 100%;height: 32px"/>
                </div><br/>
                <div class="fitem">
                    <label>密码&nbsp;&nbsp;&nbsp;</label>
                    <div style="height: 5px;">&nbsp;</div>
                    <input class="easyui-textbox" name="password" style="width: 100%;height: 32px" type="password"/>
                </div>
            </div>
        </form>
        <div style="margin: 20px"></div>
        <div style="width: 15%;margin: 20px auto;">
            <a class="easyui-linkbutton" iconCls="icon-ok" style="width: 100%;height: 32px;" onclick="login()">登录</a>
        </div>
    </div>
    <div region="south" split="true" style="width: 100%;height: 60px;border: 0px;">
        <jsp:include page="south.jsp"/>
    </div>
</div>
</body>
</html>
