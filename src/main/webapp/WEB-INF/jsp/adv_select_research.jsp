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
    <title>adv_select_research</title>
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
    <table id="dg" title="结合科研实际统计" class="easyui-datagrid" style="width: 100%;height:auto"
           toolbar="#toolbar"
           fitColumns="true" singleSelect="true" pagination="true"
           data-options="rownumbers:true,
            <%--url:'/topic/research/133',--%>
            method:'get',
            pageSize:15,
            pageList:[5,10,15,20,25]">
        <thead>
        <tr>
            <th field="var1" width="50">专业</th>
            <th field="var2" width="50">班级</th>
            <th field="var3" width="50">学号</th>
            <th field="var4" width="50">学生姓名</th>
            <th field="var5" width="50">毕业设计题目名称</th>
            <th field="var6" width="50">指导教师</th>
            <th field="var7" width="50">指导教师职称</th>
            <th field="var8" width="50">教师科研项目名称</th>
            <th field="var9" width="50">备注</th>
        </tr>
        </thead>
    </table>
</div>
<div id="toolbar">
    <%--<a href="#" class="easyui-linkbutton" iconCls="icon-reload" plain="true" onclick="exportQpaper()">导出</a>--%>
    <label>按年度查询</label>
    <input id="research_searchInput"
           name="year"
           class="easyui-combobox"
           data-options="
                           valueField:'ddlcode',
                           textField:'ddlname',
                           width:300,
                           url:'${pageContext.request.contextPath}/systemddl/list/year'" />
</div>
</body>
</html>

