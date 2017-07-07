<%--
  Created by IntelliJ IDEA.
  User: 万洪基
  Date: 2017/6/26
  Time: 16:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>sys_directory</title>
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
    <table id="dg" title="字典管理表" class="easyui-datagrid" style="width: 100%;height:auto"
           toolbar="#toolbar"
           fitColumns="true" singleSelect="true" pagination="true"
           data-options="rownumbers:true,
            method:'get',
            pageSize:15,
            pageList:[5,10,15,20,25]">
        <thead>
        <tr>
            <th field="keyword" width="50">类型</th>
            <th field="ddlcode" width="50">标记</th>
            <th field="ddlname" width="50">名称</th>
        </tr>
        </thead>
    </table>
</div>
<div id="toolbar">
    <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newSystemDDL()">新建</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editSystemDDL()">编辑</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroySystemDDL()">删除</a>
    <label>按类型查询</label>
    <input id="searchInput"
           name="keyword"
           class="easyui-combobox"
           data-options="
                           valueField:'keyword',
                           textField:'keyword',
                           width:300,
                           url:'${pageContext.request.contextPath}/systemddl/keyword'" />
</div>
<div id="sysDDLDialog" class="easyui-dialog" style="width:500px;height:550px;padding:10px 20px"
     closed="true" buttons="#sysDDLForm-buttons">
    <div class="ftitle">字典管理表</div>
    <form id="fm" method="post">
        <div class="fitem">
            <label>类型&nbsp;&nbsp;&nbsp;</label>
            <input name="keyword" class="easyui-combobox"
                   data-options="
                           valueField:'keyword',
                           textField:'keyword',
                           width:300,
                           url:'${pageContext.request.contextPath}/systemddl/keyword'" />
        </div>
        <div class="fitem">
            <label>名称&nbsp;&nbsp;&nbsp;</label>
            <input name="ddlname" class="easyui-validatebox">
        </div>
    </form>
</div>
<div id="sysDDLForm-buttons">
    <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveSysDDL()">保存</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#sysDDLDialog').dialog('close')">取消</a>
</div>
<div>
    <form id="dfm" method="post">
        <input type="hidden" name="_method" value="DELETE">
    </form>
</div>
</body>
</html>
