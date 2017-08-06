<%--
  Created by IntelliJ IDEA.
  User: 万洪基
  Date: 2017/8/6
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>adv_select_passedTopic</title>
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
    <table id="dg" title="教师课题统计表" class="easyui-datagrid" style="width: 100%;height:auto"
           toolbar="#toolbar"
           fitColumns="true" singleSelect="true" pagination="true"
           data-options="rownumbers:true,
            <%--url:'/topic/research/133',--%>
            method:'get',
            pageSize:15,
            pageList:[5,10,15,20,25]">
        <thead>
        <tr>
            <th field="var1" width="50">系别</th>
            <th field="var2" width="50">姓名</th>
            <th field="var3" width="50">数量</th>
        </tr>
        </thead>
    </table>
</div>
<div id="toolbar">
    <%--<a href="#" class="easyui-linkbutton" iconCls="icon-reload" plain="true" onclick="exportQpaper()">导出</a>--%>
    <label>按年度查询</label>
    <input id="passedTopic_searchInput"
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
