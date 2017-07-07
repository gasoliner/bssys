<%--
  Created by IntelliJ IDEA.
  User: 万洪基
  Date: 2017/6/26
  Time: 14:05
  To change this template use File | Settings | File Templates.
--%>
<%@page pageEncoding="UTF-8" language="java" %>
<html>
<head>
    <title>tp_1_manage</title>
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
    <table id="dg" title="课题管理表" class="easyui-datagrid" style="width: 100%;height:auto"
           toolbar="#toolbar"
           fitColumns="true" singleSelect="true" pagination="true"
           data-options="rownumbers:true,
            url:'/topic/list/-1',
            method:'get',
            pageSize:15,
            pageList:[5,10,15,20,25]">
        <thead>
        <tr>
            <th field="name" width="50">题目</th>
            <th field="explaining" width="50">课题说明</th>
            <th field="srname" width="50">适用专业</th>
            <th field="spsource" width="50">审核状态</th>
            <th field="sexamineway" width="50">选择状态</th>
        </tr>
        </thead>
    </table>
</div>
<div id="toolbar">
    <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newTopic()">新建</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editTopic()">编辑</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyTopic()">删除</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="showTopic()">查看详细信息</a>
    <%--<a href="#" class="easyui-linkbutton" iconCls="icon-reload" plain="true" onclick="exportQpaper()">导出</a>--%>
    <label>按年度查询</label>
    <input id="topic_searchInput"
           name="year"
           class="easyui-combobox"
           data-options="
                           valueField:'ddlcode',
                           textField:'ddlname',
                           width:300,
                           url:'${pageContext.request.contextPath}/systemddl/list/year'" />
</div>
<div id="topicDialog" class="easyui-dialog" style="width:500px;height:550px;padding:10px 20px"
     closed="true" buttons="#topic-buttons">
    <div class="ftitle">课题信息填写</div>
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
            <label>适用专业&nbsp;&nbsp;&nbsp;</label><div>&nbsp;</div>
            <input name="major"
                   class="easyui-combobox"
                   data-options="
                           valueField:'ddlcode',
                           textField:'ddlname',
                           width:300,
                           url:'${pageContext.request.contextPath}/systemddl/list/major'" />
        </div><br/>
        <div class="fitem">
            <label>当前年度&nbsp;&nbsp;&nbsp;</label><div>&nbsp;</div>
            <input name="year"
                   class="easyui-combobox"
                   data-options="
                           valueField:'ddlcode',
                           textField:'ddlname',
                           width:300,
                           url:'${pageContext.request.contextPath}/systemddl/list/year'" />
        </div><br/>
        <div class="fitem">
            <label>课题名称</label><div>&nbsp;</div>
            <input type="text" name="name" placeholder="50字以内" class="plainText">
        </div><br/>
        <div class="fitem">
            <label>课题说明</label><div>&nbsp;</div>
            <textarea name="explaining" class="textareaComment" placeholder="500字以内"></textarea>
        </div><br/>
        <div class="fitem">
            <label>课题类别&nbsp;&nbsp;&nbsp;</label><div>&nbsp;</div>
            <input name="category"
                   class="easyui-combobox"
                   data-options="
                           valueField:'ddlcode',
                           textField:'ddlname',
                           width:300,
                           url:'${pageContext.request.contextPath}/systemddl/list/category'" />
        </div><br/>
        <div class="fitem">
            <label>课题来源&nbsp;&nbsp;&nbsp;</label><div>&nbsp;</div>
            <input name="src"
                   class="easyui-combobox"
                   data-options="
                           valueField:'ddlcode',
                           textField:'ddlname',
                           width:300,
                           url:'${pageContext.request.contextPath}/systemddl/list/src'" />
        </div><br/>
        <div class="fitem">
            <label>科研题目名称</label><div>&nbsp;</div>
            <input name="srname" type="text" placeholder="选择了“联系科研实际”时填写" class="plainText">
        </div><br/>
        <div class="fitem">
            <label>课题类型</label><div>&nbsp;</div>
            <input name="type"
                   class="easyui-combobox"
                   data-options="
                           valueField:'ddlcode',
                           textField:'ddlname',
                           width:300,
                           url:'${pageContext.request.contextPath}/systemddl/list/type'" />
        </div><br/>
        <div class="fitem">
            <label>计算机能力</label><div>&nbsp;</div>
            <input name="comability"
                   class="easyui-combobox"
                   data-options="
                           valueField:'ddlcode',
                           textField:'ddlname',
                           width:300,
                           url:'${pageContext.request.contextPath}/systemddl/list/comability'" />
        </div><br/>
        <div class="fitem">
            <label>设计动手能力</label><div>&nbsp;</div>
            <input name="handability"
                   class="easyui-combobox"
                   data-options="
                           valueField:'ddlcode',
                           textField:'ddlname',
                           width:300,
                           url:'${pageContext.request.contextPath}/systemddl/list/require'" />
        </div><br/>
        <div class="fitem">
            <label>实验调研要求</label><div>&nbsp;</div>
            毕业实习环节<input type="text" name="gradlink" class="smallText">周&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            实验占课题<input type="text" name="testpercent" class="smallText">%<div>&nbsp;</div>
            调查研究<input type="text" name="research" class="smallText">周<br/>
        </div><br/>
        <div class="fitem">
            <label>阅读文献要求</label><div>&nbsp;</div>
            中文<input type="text" name="ch" class="smallText">篇&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            英文<input type="text" name="en" class="smallText">篇
        </div><br/>
        <div class="fitem">
            <label>创新要求</label><div>&nbsp;</div>
            <input name="innovation"
                   class="easyui-combobox"
                   data-options="
                           valueField:'ddlcode',
                           textField:'ddlname',
                           width:300,
                           url:'${pageContext.request.contextPath}/systemddl/list/require'" />
        </div><br/>
        <div class="fitem">
            <label>课题总量</label><div>&nbsp;</div>
            <input name="total"
                   class="easyui-combobox"
                   data-options="
                           valueField:'ddlcode',
                           textField:'ddlname',
                           width:300,
                           url:'${pageContext.request.contextPath}/systemddl/list/degree'" />
        </div><br/>
        <div class="fitem">
            <label>课题难度</label><div>&nbsp;</div>
            <input name="difficulty"
                   class="easyui-combobox"
                   data-options="
                           valueField:'ddlcode',
                           textField:'ddlname',
                           width:300,
                           url:'${pageContext.request.contextPath}/systemddl/list/degree'" />
        </div><br/>
        <div class="fitem">
            <label>备注</label><div>&nbsp;</div>
            <textarea name="comment" class="textareaComment" placeholder="250字以内"></textarea>
        </div>
    </form>
</div>
<div id="topic-buttons">
    <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveTopic()">保存</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#topicDialog').dialog('close')">取消</a>
</div>
<div>
    <form id="dfm" method="post">
        <input type="hidden" name="_method" value="DELETE">
    </form>
</div>
</body>
</html>
