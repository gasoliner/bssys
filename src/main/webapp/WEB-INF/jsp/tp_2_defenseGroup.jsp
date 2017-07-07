<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: 万洪基
  Date: 2017/6/29
  Time: 21:18
  To change this template use File | Settings | File Templates.
--%>
<%@page pageEncoding="UTF-8" language="java" %>
<html>
<head>
    <title>sys_defenseGroup</title>
    <link rel="stylesheet" type="text/css" href="/ui/themes/bootstrap/easyui.css">
    <link rel="stylesheet" type="text/css" href="/ui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="/ui/demo/demo.css">
    <link rel="stylesheet" type="text/css" href="/ui/bssys.css">
    <script type="text/javascript" src="/ui/jquery.min.js"></script>
    <script type="text/javascript" src="/ui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="/ui/bssys.js"></script>
</head>
<body>
<div align="center">
    <table id="dg" title="答辩分组表" class="easyui-datagrid" style="width: 100%;height:auto"
            <shiro:hasPermission name="defenseGroup:*">
                toolbar="#toolbar"
            </shiro:hasPermission>
           fitColumns="true" singleSelect="true" pagination="true"
           data-options="rownumbers:true,
            url:'/defenseGroup/list',
            method:'get',
            pageSize:15,
            pageList:[5,10,15,20,25]">
        <thead>
        <tr>
            <th field="groupid" width="25">小组编号</th>
            <th field="leader" width="50">小组长</th>
            <th field="members" width="100">小组成员</th>
        </tr>
        </thead>
    </table>
</div>
<shiro:hasPermission name="defenseGroup:*">
<div id="toolbar">
    <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newDefenseGroup()">新建</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editDefenseGroup()">编辑</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyDefenseGroup()">删除</a>
    <%--<a href="#" class="easyui-linkbutton" iconCls="icon-reload" plain="true" onclick="exportQpaper()">导出</a>--%>
</div>
</shiro:hasPermission>
<div id="defenseGroupDialog" class="easyui-dialog" style="width:500px;height:550px;padding:10px 20px"
     closed="true" buttons="#defenseGroup-buttons">
    <div class="ftitle">答辩分组填写</div>
    <form id="fm" method="post">
        <div class="fitem">
            <label>学院&nbsp;&nbsp;&nbsp;</label><div>&nbsp;</div>
            <input name="college"
                   class="easyui-combobox"
                   data-options="
                           valueField:'ddlcode',
                           textField:'ddlname',
                           width:300,
                           url:'${pageContext.request.contextPath}/systemddl/list/college'" />
        </div><br/>
        <div class="fitem">
            <label>小组编号</label><div>&nbsp;</div>
            <input type="text" name="groupid" placeholder="该字段切勿重复" class="plainText">
        </div><br/>
        <div class="fitem">
            <label>小组长</label><div>&nbsp;</div>
            <input name="leader" type="text" class="plainText">
        </div><br/>
        <div class="fitem">
            <label>小组成员</label><div>&nbsp;</div>
            <textarea name="members" class="textareaComment" placeholder="输入名字请用半角逗号分开"></textarea>
        </div>
    </form>
</div>
<div id="defenseGroup-buttons">
    <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveDefenseGroup()">保存</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#defenseGroupDialog').dialog('close')">取消</a>
</div>
<div>
    <form id="dfm" method="post">
        <input type="hidden" name="_method" value="DELETE">
    </form>
</div>
</body>
</html>
