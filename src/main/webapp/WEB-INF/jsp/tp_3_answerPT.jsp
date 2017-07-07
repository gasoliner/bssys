<%--
  Created by IntelliJ IDEA.
  User: 万洪基
  Date: 2017/7/6
  Time: 21:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>tp_3_answerPT</title>
    <link rel="stylesheet" type="text/css" href="/ui/themes/bootstrap/easyui.css">
    <link rel="stylesheet" type="text/css" href="/ui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="/ui/demo/demo.css">
    <link rel="stylesheet" type="text/css" href="/ui/bssys.css">
    <script type="text/javascript" src="/ui/jquery.min.js"></script>
    <script type="text/javascript" src="/ui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="/ui/bssys.js"></script>
</head>
<body>
<div style="width: 900px;height: auto;margin: 0 auto">
    答疑时间与地点
    注：此功能将对本年度您负责的所有课题进行设置。
    <div class="messager-input" style="height: 56px; margin: 10px;">
        <p align="center" style="font-size: 16px;">
            <label for="time" >答疑时间: </label>
            <textarea id="time" name="defensetime" class="textareaComment" placeholder="50字以内" style="height: 60px">${globleUser.defensetime}</textarea>
        </p>
    </div>
    <div class="messager-input" style="height: 56px; margin: 10px;">
        <p align="center" style="font-size: 16px;">
            <label for="place" >答疑地点: </label>
            <textarea id="place" name="defenseplace" class="textareaComment" placeholder="50字以内" style="height: 60px">${globleUser.defenseplace}</textarea>
        </p>
    </div>
    <div class="messager-button" style="height: 56px; margin: 10px;">
        <a href="#" class="easyui-linkbutton" iconCls="icon-ok"  onclick="answerTP()">
            <span style="font-size: 16px">确认</span>
        </a>
    </div>

</div>
</div>
<div>
    <input id="uid" type="hidden" value="${globleUser.uid}"/>
</div>
</body>
</html>
