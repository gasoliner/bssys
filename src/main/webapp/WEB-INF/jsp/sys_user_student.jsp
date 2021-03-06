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
    <table id="dg" title="学生列表" class="easyui-datagrid" style="width: 100%;height:auto"
           toolbar="#toolbar"
           fitColumns="true" singleSelect="true" pagination="true"
           data-options="rownumbers:true,
            url:'/student/list',
            method:'get',
            pageSize:15,
            pageList:[5,10,15,20,25]">
        <thead>
        <tr>
            <th field="voMajor" width="50">专业</th>
            <th field="voClazz" width="50">班级</th>
            <th field="number" width="50">学号</th>
            <th field="name" width="50">姓名</th>
            <th field="grade" width="50">年级</th>
            <th field="degree" width="50">学历</th>
            <th field="voIschoose" width="50">是否选题</th>
        </tr>
        </thead>
    </table>
</div>
<div id="toolbar">
    <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newStu()">新建</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editStu()">编辑</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyStu()">删除</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="importByExcel_openDialog()">批量导入</a>
</div>
<div id="stuDialog" class="easyui-dialog" style="width:500px;height:550px;padding:10px 20px"
     closed="true" buttons="#stuForm-buttons">
    <div class="ftitle">学生信息</div>
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
            <label>专业名称&nbsp;&nbsp;&nbsp;</label><div>&nbsp;</div>
            <input name="major"
                   class="easyui-combobox"
                   data-options="
                           valueField:'ddlcode',
                           textField:'ddlname',
                           width:300,
                           url:'${pageContext.request.contextPath}/systemddl/list/major'" />
        </div><br/>
        <div class="fitem">
            <label>学号&nbsp;&nbsp;&nbsp;</label>
            <input name="number" class="easyui-validatebox">
        </div>
        <br/>
        <div class="fitem">
            <label>姓名&nbsp;&nbsp;&nbsp;</label>
            <input name="name" class="easyui-validatebox">
        </div>
        <br/>
        <div class="fitem">
            <label>年级&nbsp;&nbsp;&nbsp;</label>
            <input name="grade" class="easyui-validatebox">
        </div>
        <br/>
        <div class="fitem">
            <label>学历&nbsp;&nbsp;&nbsp;</label>
            <input name="degree" class="easyui-validatebox">
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
<div id="stuForm-buttons">
    <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveStu()">保存</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-cancel"
       onclick="javascript:$('#stuDialog').dialog('close')">取消</a>
</div>
<div id="stu_import_Dialog" class="easyui-dialog" style="width:500px;height:550px;padding:10px 20px"
     closed="true" buttons="#stu_import-buttons">
    <div class="ftitle">通过Excel</div>
    <form id="stu_import_fm" enctype="multipart/form-data" method="post">
        <div class="fitem">
            请确保Excell文件符合下面格式，否则导入错误数据。
            <ul>
                <li>
                    1、存放学生数据的Excell表单名称必须是Sheet1；
                </li>
                <li>
                    2、Sheet1中第一行是标题：学院,专业名称,学号,姓名,密码,问题,答案,年级,类别,班级,状态,电话,邮件,特长；
                </li>
                <li>
                    3、第二行开始是要导入的数据，必须与标题中的内容相对应，不能多不能少；
                </li>
                <li>
                    4、点击下载示例文件
                </li>
            </ul>

        </div>
        <div class="fitem">
            <label>文件&nbsp;&nbsp;&nbsp;</label>
            <input name="file" type="file">
        </div>
    </form>
</div>
<div id="stu_import-buttons">
    <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="importByExcel()">保存</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-cancel"
       onclick="javascript:$('#stu_import_Dialog').dialog('close')">取消</a>
</div>
<div>
    <form id="dfm" method="post">
        <input type="hidden" name="_method" value="DELETE">
    </form>
</div>
</body>
</html>
