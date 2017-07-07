<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <meta charset="UTF-8"/>
    <title>首页</title>
    <link rel="stylesheet" type="text/css" href="/ui/themes/bootstrap/easyui.css">
    <link rel="stylesheet" type="text/css" href="/ui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="/ui/demo/demo.css">
    <script type="text/javascript" src="/ui/jquery.min.js"></script>
    <script type="text/javascript" src="/ui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="/ui/bssys.js"></script>
    <script type="text/javascript">
        function addTab(title, url){
            if ($('#tt').tabs('exists', title)){
                $('#tt').tabs('select', title);
            } else {
                var content = '<iframe scrolling="auto" frameborder="0"  src="'+url+'" style="width:100%;height:100%;"></iframe>';
                $('#tt').tabs('add',{
                    title:title,
                    content:content,
                    closable:true
                });
            }
        }
    </script>
</head>
<body>
<div class="easyui-layout" style="width:100%;height: 723px;">
    <div region="north" split="false" style="width: 100%;height: 60px;border: 0px">
        <jsp:include page="north.jsp"/>
    </div>
    <div region="west" split="false" title="常用功能" style="width: 270px;height:100%;">
        <jsp:include page="west.jsp"/>
    </div>
    <div region="center" title="主体任务区" style="padding:5px;height: auto;">
        <div id="tt" class="easyui-tabs" style="width: 100%;height: 100%;">
            <div title="Home">
                <div style="height: auto;margin-top: 60px;margin-left: 60px;" align="left">
                    <iframe allowtransparency="true" frameborder="0" width="565" height="98" scrolling="no" src="//tianqi.2345.com/plugin/widget/index.htm?s=2&z=3&t=1&v=0&d=3&bd=0&k=000000&f=008080&q=1&e=1&a=1&c=54830&w=565&h=98&align=center"></iframe>
                </div>
                <div style="width: 800px">
                    <table id="dg" title="通知列表" class="easyui-datagrid" style="width: 100%;height:auto"
                           toolbar="#toolbar"
                           fitColumns="true" singleSelect="true" pagination="true"
                           data-options="rownumbers:true,
                            url:'/notice/list',
                            method:'get',
                            pageSize:15,
                            pageList:[5,10,15,20,25]">
                        <thead>
                        <tr>
                            <th field="title" width="50">标题</th>
                            <th field="date" width="50">发布时间</th>
                            <th field="publisher" width="50">发布人</th>
                            <th field="voFile" width="25">其他</th>
                        </tr>
                        </thead>
                    </table>
                </div>
                <span style="height: auto;margin-right: 20px;">
                    <div class="easyui-calendar" style="width:250px;height:250px;"></div>
                </span>
            </div>
        </div>
    </div>
    <div region="south" split="true" style="width: 100%;height: 50px;border: 0px;">
        <jsp:include page="south.jsp"/>
    </div>
</div>
<div id="read_noticeDialog" class="easyui-dialog" style="width:770px;height:550px;padding:10px 20px" closed="true" buttons="#notice_read-buttons">
    <div id="notice_content"></div>
    <span id="notice_footer" style="display:block; width: 500px; float:right; text-align:right;"></span>
</div>
<div id="toolbar">
    <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="readNotice()">查看详情</a>
</div>
<div id="notice_read-buttons">
    <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="javascript:$('#read_noticeDialog').dialog('close')">好的</a>
</div>
</body>
</html>
