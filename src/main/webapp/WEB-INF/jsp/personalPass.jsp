<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>personalPass</title>
    <link rel="stylesheet" type="text/css" href="/ui/themes/bootstrap/easyui.css">
    <link rel="stylesheet" type="text/css" href="/ui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="/ui/demo/demo.css">
    <script type="text/javascript" src="/ui/jquery.min.js"></script>
    <script type="text/javascript" src="/ui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="/ui/bssys.js"></script>
</head>
<body>
<div style="width: 900px;height: auto;margin: 0 auto">
    <div class="messager-input" style="height: 56px; margin: 10px;">
        <p align="center" style="font-size: 16px;">
            <label for="oldpass" >输入原密码: </label>
            <input id="oldpass" class="easyui-textbox" type="password" style="width: 300px;height: 32px"/>
        </p>
    </div>
    <div class="messager-input" style="height: 56px; margin: 10px;">
        <p align="center" style="font-size: 16px;">
            <label for="newpass" >输入新密码: </label>
            <input id="newpass" class="easyui-textbox"  type="password" style="width: 300px;height: 32px"/>
        </p>
    </div>
    <div class="messager-input" style="height: 56px; margin: 10px;">
        <p align="center" style="font-size: 16px;">
            <label for="newpass_check" >确认新密码: </label>
            <input id="newpass_check" class="easyui-textbox" type="password"  style="width: 300px;height: 32px"/>
        </p>
    </div>
    <div class="messager-button" style="height: 56px; margin: 10px;">
        <a href="#" class="easyui-linkbutton" iconCls="icon-ok"  onclick="perPas1()">
            <span style="font-size: 16px">确认</span>
        </a>
    </div>

</div>
</div>
<div>
    <input id="tid" type="hidden" value="1"/>
</div>
</body>
</html>
