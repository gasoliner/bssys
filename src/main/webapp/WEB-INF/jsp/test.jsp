<%--
  Created by IntelliJ IDEA.
  User: 万洪基
  Date: 2016/12/27
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@page isELIgnored="false" %>--%>
<html>
<head>
    <title>Test</title>
    <link rel="stylesheet" type="text/css" href="/ui/themes/bootstrap/easyui.css">
    <link rel="stylesheet" type="text/css" href="/ui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="/ui/demo/demo.css">
    <link rel="stylesheet" type="text/css" href="/ui/bssys.css">
    <script type="text/javascript" src="/ui/jquery.min.js"></script>
    <script type="text/javascript" src="/ui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="/ui/bssys.js"></script>
</head>
<body>
<%--树形展示方式--%>
<div data-options="region:'west',title:'菜单',split:true" style="width:180px;">
    <ul id="menu" class="easyui-tree" style="margin-top: 10px;margin-left: 5px;">
        <li>
            <span>课题相关操作</span>
            <ul>
                <li onclick="addTab('课题管理','tp_1_manage')">课题管理</li>
                <li>
                    <span>课题相关查询</span>
                    <ul>
                        <li onclick="addTab('答辩分组查询','tp_2_defenseGroup')">答辩分组查询</li>
                        <li onclick="addTab('我的学生名单','tp_1_manage')">我的学生名单</li>
                    </ul>
                </li>
                <li>
                    <span>课题相关填写</span>
                    <ul>
                        <li onclick="addTab('填报设计成绩','tp_2_defenseGroup')">填报设计成绩</li>
                        <li onclick="addTab('答疑时间和地点设置','tp_1_manage')">答疑时间和地点设置</li>
                    </ul>
                </li>
            </ul>
        </li>
        <li>
            <span>个人相关操作</span>
            <ul>
                <li>
                    <span>个人信息管理</span>
                    <ul>
                        <li onclick="addTab('个人信息','tp_2_defenseGroup')">个人信息</li>
                        <li onclick="addTab('密码修改','tp_2_defenseGroup')">密码修改</li>
                    </ul>
                </li>
                <li>
                    <span>邮件管理</span>
                    <ul>
                        <li onclick="addTab('给同学留言','tp_2_defenseGroup')">给同学留言</li>
                        <li onclick="addTab('收件箱','tp_2_defenseGroup')">收件箱</li>
                        <li onclick="addTab('发件箱','tp_2_defenseGroup')">发件箱</li>
                    </ul>
                </li>
            </ul>
        </li>
        <li>
            <span>高级管理</span>
            <ul>
                <li>
                    <span>查询统计相关</span>
                    <ul>
                        <li onclick="addTab('课题选择情况','tp_2_defenseGroup')">课题选择情况</li>
                        <li onclick="addTab('教师课题统计','tp_2_defenseGroup')">教师课题统计</li>
                        <li onclick="addTab('指导时间和地点统计','tp_2_defenseGroup')">指导时间和地点统计</li>
                        <li onclick="addTab('结合科研实际统计','tp_2_defenseGroup')">结合科研实际统计</li>
                        <li onclick="addTab('未选题情况统计','tp_2_defenseGroup')">未选题情况统计</li>
                        <li onclick="addTab('教师被选课题统计','tp_2_defenseGroup')">教师被选课题统计</li>
                        <li onclick="addTab('毕业设计情况汇总','tp_2_defenseGroup')">毕业设计情况汇总</li>
                    </ul>
                </li>
            </ul>
        </li>
        <li>
            <span>系统管理</span>
            <ul>
                <li onclick="addTab('字典管理','sys_directory')">字典管理</li>
                <li onclick="addTab('年度设置','sys_year')">年度设置</li>
                <li onclick="addTab('选课题时间设置','sys_chooseTime')">选课题时间设置</li>
            </ul>
        </li>
    </ul>
</div>




<%--另一种展示方式--%>

<div title="课题相关操作" iconCls="icon-computer" style="overflow:auto;padding:10px;">
    <div class="easyui-accordion" style="width: auto;height: auto">
        <div title="课题相关管理" iconCls="icon-computer" style="overflow: auto;padding: 10px;">
            <div class="menu-last">
                <a href="#" class="easyui-linkbutton" onclick="addTab('课题管理','tp_1_manage')">课题管理</a>
            </div>
        </div>
        <div title="课题相关查询" iconCls="icon-computer" style="overflow: auto;padding: 10px;">
            <div class="menu-last">
                <a href="#" class="easyui-linkbutton" onclick="addTab('答辩分组查询','tp_2_defenseGroup')">答辩分组相关</a>
            </div>
            <div class="menu-last">
                <a href="#" class="easyui-linkbutton" onclick="addTab('我的学生名单','educationalAdministration/teachingPaperManage')">我的学生名单</a>
            </div>
        </div>
        <div title="课题相关填写" iconCls="icon-computer" style="overflow: auto;padding: 10px;">
            <div class="menu-last">
                <a href="#" class="easyui-linkbutton" onclick="addTab('填报设计成绩','awardDetail/manage')">填报设计成绩</a>
            </div>
            <div class="menu-last">
                <a href="#" class="easyui-linkbutton" onclick="addTab('答疑时间和地点设置','awardDetail/manage')">答疑时间和地点设置</a>
            </div>
        </div>
    </div>
</div>
<div title="个人相关操作" iconCls="icon-mini-edit" selected="true" style="padding:10px;">
    <div class="easyui-accordion" style="width: auto;height: auto">
        <div title="个人信息管理" iconCls="icon-computer" style="overflow: auto;padding: 10px;">
            <div class="menu-last">
                <a href="#" class="easyui-linkbutton" onclick="addTab('个人信息','personalManageUI/personalInfo')">个人信息</a>
            </div>
            <div class="menu-last">
                <a href="#" class="easyui-linkbutton" onclick="addTab('密码修改','personalManageUI/personalPass')">密码修改</a>
            </div>
        </div>
        <div title="邮件管理" iconCls="icon-computer" style="overflow: auto;padding: 10px;">
            <div class="menu-last">
                <a href="#" class="easyui-linkbutton" onclick="addTab('给同学留言','personalManageUI/personalInfo')">给同学留言</a>
            </div>
            <div class="menu-last">
                <a href="#" class="easyui-linkbutton" onclick="addTab('收件箱','personalManageUI/personalPass')">收件箱</a>
            </div>
            <div class="menu-last">
                <a href="#" class="easyui-linkbutton" onclick="addTab('发件箱','personalManageUI/personalPass')">发件箱</a>
            </div>
        </div>
    </div>
</div>
<div title="高级管理" iconCls="icon-mini-edit" selected="true" style="padding:10px;">
    <div class="easyui-accordion" style="width: auto;height: auto">
        <div title="查询统计相关" iconCls="icon-computer" style="overflow: auto;padding: 10px;">
            <div class="menu-last">
                <a href="#" class="easyui-linkbutton" onclick="addTab('课题选择情况','personalManageUI/personalInfo')">课题选择情况</a>
            </div>
            <div class="menu-last">
                <a href="#" class="easyui-linkbutton" onclick="addTab('教师课题统计','personalManageUI/personalPass')">教师课题统计</a>
            </div>
            <div class="menu-last">
                <a href="#" class="easyui-linkbutton" onclick="addTab('指导时间和地点统计','personalManageUI/personalPass')">指导时间和地点统计</a>
            </div>
            <div class="menu-last">
                <a href="#" class="easyui-linkbutton" onclick="addTab('结合科研实际统计','personalManageUI/personalPass')">结合科研实际统计</a>
            </div>
            <div class="menu-last">
                <a href="#" class="easyui-linkbutton" onclick="addTab('未选题情况统计','personalManageUI/personalPass')">未选题情况统计</a>
            </div>
            <div class="menu-last">
                <a href="#" class="easyui-linkbutton" onclick="addTab('教师被选课题统计','personalManageUI/personalPass')">教师被选课题统计</a>
            </div>
            <div class="menu-last">
                <a href="#" class="easyui-linkbutton" onclick="addTab('毕业设计情况汇总','personalManageUI/personalPass')">毕业设计情况汇总</a>
            </div>
        </div>
    </div>
</div>
<div title="系统管理" iconCls="icon-computer" style="overflow:auto;padding:10px;">
    <div class="menu-last">
        <a href="#" class="easyui-linkbutton" onclick="addTab('字典管理','sys_directory')">字典管理</a>
    </div>
    <div class="menu-last">
        <a href="#" class="easyui-linkbutton" onclick="addTab('年度设置','sys_year')">年度设置</a>
    </div>
    <div class="menu-last">
        <a href="#" class="easyui-linkbutton" onclick="addTab('选课题时间设置','sys_chooseTime')">选课题时间设置</a>
    </div>
</div>

</body>
</html>
