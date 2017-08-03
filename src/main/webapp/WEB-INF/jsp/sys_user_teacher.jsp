<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 万洪基
  Date: 2017/8/1
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>sys_user_student</title>
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
    <table id="dg" title="教师列表" class="easyui-datagrid" style="width: 100%;height:auto"
           toolbar="#toolbar"
           fitColumns="true" singleSelect="true" pagination="true"
           data-options="rownumbers:true,
            url:'/user/list',
            method:'get',
            pageSize:15,
            pageList:[5,10,15,20,25]">
        <thead>
        <tr>
            <th field="voDep" width="50">所属系别</th>
            <th field="employeenum" width="50">教师编号</th>
            <th field="username" width="50">姓名</th>
            <th field="voSex" width="50">性别</th>
            <th field="role" width="50">角色</th>
        </tr>
        </thead>
    </table>
</div>
<div id="toolbar">
    <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newUser()">新建</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editUser()">编辑</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyUser()">删除</a>
</div>
<div id="userDialog" class="easyui-dialog" style="width:500px;height:550px;padding:10px 20px"
     closed="true" buttons="#userForm-buttons">
    <div class="ftitle">教师信息</div>
    <form id="fm" method="post">
        <div class="fitem">
            <label>系别&nbsp;&nbsp;&nbsp;</label><div>&nbsp;</div>
            <input name="deptid"
                   class="easyui-combobox"
                   data-options="
                           valueField:'ddlcode',
                           textField:'ddlname',
                           width:300,
                           url:'${pageContext.request.contextPath}/systemddl/list/dep'" />
        </div><br/>
        <div class="fitem">
            <label>工号&nbsp;&nbsp;&nbsp;</label>
            <input name="employeenum" class="easyui-validatebox">
        </div>
        <br/>
        <div class="fitem">
            <label>姓名&nbsp;&nbsp;&nbsp;</label>
            <input name="username" class="easyui-validatebox">
        </div>
        <br/>
        <div class="fitem">
            <label>权限&nbsp;&nbsp;&nbsp;</label>
            <input name="role" class="easyui-validatebox">
        </div>
        <br/>
        <div class="fitem">
            <label>密码&nbsp;&nbsp;&nbsp;</label>
            <input name="password" class="easyui-validatebox">
        </div>
        <br/>
        <div class="fitem">
            <label>班级&nbsp;&nbsp;&nbsp;</label><div>&nbsp;</div>
            <input name="clazz"
                   class="easyui-combobox"
                   data-options="
                           valueField:'ddlcode',
                           textField:'ddlname',
                           width:300,
                           url:'${pageContext.request.contextPath}/systemddl/list/clazz'" />
        </div><br/>
        <div class="fitem">
            <label>邮箱&nbsp;&nbsp;&nbsp;</label>
            <input name="email" class="easyui-validatebox">
        </div>
        <br/>
        <div class="fitem">
            <label>手机号&nbsp;&nbsp;&nbsp;</label>
            <input name="phone" class="easyui-validatebox">
        </div>
        <br/>
        <div class="fitem">
            <label>特长&nbsp;&nbsp;&nbsp;</label>
            <textarea name="strongpoint" class="textareaComment" placeholder="200字以内"></textarea>
        </div>
    </form>
</div>
<div id="userForm-buttons">
    <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveUser()">保存</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-cancel"
       onclick="javascript:$('#userDialog').dialog('close')">取消</a>
</div>
<div>
    <form id="dfm" method="post">
        <input type="hidden" name="_method" value="DELETE">
    </form>
</div>
</body>
</html>
