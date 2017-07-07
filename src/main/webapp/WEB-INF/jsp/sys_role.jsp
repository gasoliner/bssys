<%--
  Created by IntelliJ IDEA.
  User: 万洪基
  Date: 2017/3/9
  Time: 18:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>roleManage</title>
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
    <table id="dg" title="角色管理表" class="easyui-datagrid" style="width: 100%;height:auto"
           toolbar="#toolbar"
           fitColumns="true" singleSelect="true" pagination="true"
           data-options="rownumbers:true,
            url:'/role/list',
            method:'get',
            pageSize:15,
            pageList:[5,10,15,20,25]">
        <thead>
        <tr>
            <th field="role" width="50">角色</th>
            <th field="resource_Ids" width="50">权限</th>
            <th field="voavailable" width="50">状态</th>
        </tr>
        </thead>
    </table>
</div>
<div id="toolbar">
    <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newRole()">新建</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editRole()">编辑</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyRole()">删除</a>
</div>
<div id="roleDialog" class="easyui-dialog" style="width:500px;height:550px;padding:10px 20px"
     closed="true" buttons="#roleForm-buttons">
    <div class="ftitle">角色管理表</div>
    <form id="fm" method="post">
        <div class="fitem">
            <label>角色:&nbsp;&nbsp;&nbsp;</label>
            <input name="role" class="easyui-validatebox">
        </div><br/>
        <div class="fitem">
            <label>权限:&nbsp;&nbsp;&nbsp;</label>
            <p>系统管理相关</p>
            <div>
                <input name="ddlnames" value="11" type="checkbox">流程管理
                <input name="ddlnames" value="9" type="checkbox">字典管理
                <input name="ddlnames" value="8" type="checkbox">角色管理
                <input name="ddlnames" value="13" type="checkbox">通知管理
                <input name="ddlnames" value="10" type="checkbox">人员管理
            </div>
            <p>个人办公（仅显示自身相关数据）</p>
            <div>
                <input name="ddlnames" value="4" type="checkbox">试卷归档管理
                <input name="ddlnames" value="6" type="checkbox">实训归档管理
                <input name="ddlnames" value="2" type="checkbox">获奖信息管理
            </div>
            <p>个人办公（显示所有数据）</p>
            <div>
                <input name="ddlnames" value="3" type="checkbox">试卷归档管理
                <input name="ddlnames" value="5" type="checkbox">实训归档管理
                <input name="ddlnames" value="1" type="checkbox">获奖信息管理
            </div>
        </div>
    </form>
</div>
<div id="roleForm-buttons">
    <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveRole()">保存</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#roleDialog').dialog('close')">取消</a>
</div>
<div>
    <form id="dfm" method="post">
        <input type="hidden" name="_method" value="DELETE">
    </form>
</div>
</body>
</html>
