<%--
  Created by IntelliJ IDEA.
  User: 万洪基
  Date: 2017/8/2
  Time: 21:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>per_mail_message</title>
    <link rel="stylesheet" type="text/css" href="/ui/themes/bootstrap/easyui.css">
    <link rel="stylesheet" type="text/css" href="/ui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="/ui/demo/demo.css">
    <link rel="stylesheet" type="text/css" href="/ui/bssys.css">
    <script type="text/javascript" src="/ui/jquery.min.js"></script>
    <script type="text/javascript" src="/ui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="/ui/bssys.js"></script>
</head>
<body>
<form action="/mail/send" method="post" enctype="multipart/form-data">
    <table class="commonTable" style="width:100%;" cellpadding="2" cellspacing="0" bordercolor="#000000">
        <tbody>
        <tr>
            <td colspan="2" style="text-align:center;background-color:#60D978;">发送信息<br/>
            </td>
        </tr>
        <tr>
            <td>
                发送对象
                <br/>
            </td>
            <td>
                <input class="easyui-combobox"
                       name="sender"
                       data-options="
					url:'/student/tid/133',
					method:'get',
					valueField:'sid',
					textField:'name',
					multiple:true,
					panelHeight:'auto'
			">
                <br/>
            </td>
        </tr>
        <tr>
            <td>
                主题：(最多25个汉字)
                <br/>
            </td>
            <td>
                <input type="text" name="subject">
                <br/>
            </td>
        </tr>
        <tr>
            <td>
                内容：(最多500个汉字)
                <br/>
            </td>
            <td>
                <textarea class="textareaComment" style=""></textarea>
                <br/>
            </td>
        </tr>
        <tr>
            <td>
                附件：
                <br/>
            </td>
            <td>
                <input type="file" name="file">
                <br/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="发送">
                <br/>
            </td>
        </tr>
        </tbody>
    </table>
</form>
</body>
</html>
