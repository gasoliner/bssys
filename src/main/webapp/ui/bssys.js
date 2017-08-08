//字典管理的按类型查询
$(function () {
    $('#searchInput').combobox({
        onChange: function(){
            $("#dg").datagrid({
                url:'/systemddl/list/'+$("#searchInput").combobox("getValue")
            });
            // $("#dg").datagrid("load");
        }
    });
});
//课题的按学年查询
$(function () {
    $('#topic_searchInput').combobox({
        onChange: function(){
            $("#dg").datagrid({
                url:'/topic/list/'+$("#topic_searchInput").combobox("getValue")
            });
            // $("#dg").datagrid("load");
        }
    });
});
//结合科研情况按年查询
$(function () {
    $('#research_searchInput').combobox({
        onChange: function(){
            $("#dg").datagrid({
                url:'/topic/research/'+$("#research_searchInput").combobox("getValue")
            });
        }
    });
});
//教师通过课题按年查询
$(function () {
    $('#passedTopic_searchInput').combobox({
        onChange: function(){
            $("#dg").datagrid({
                url:'/user/passtopic/'+$("#passedTopic_searchInput").combobox("getValue")
            });
        }
    });
});
//指导时间和地点按年查询
$(function () {
    $('#timeAndPlace_searchInput').combobox({
        onChange: function(){
            $("#dg").datagrid({
                url:'/student/timeAndPlace/'+$("#timeAndPlace_searchInput").combobox("getValue")
            });
        }
    });
});

function perInf1() {
    $.post("/user/personalInfo",{
        phone:$("#phone").val(),
        email:$("#email").val()
    },function (data) {
        alert(data);
    });
}
function subNewUser() {
    $.post("/user/addition",{
        employeenum:$("#employeenum").val(),
        username:$("#username").val(),
        roleidsstr:$("#roleSelect").val(),
        deptid:$("#depSelect").val(),
        email:$("#email").val(),
        phone:$("#phone").val(),
    },function (backresult) {
        alert(backresult);
    })
}
//字典
function newSystemDDL(){
    $("#fm").form("clear");
    $("#sysDDLDialog").dialog("open").dialog("setTitle","字典管理--新建");
    url = "/systemddl/addition";
}
function editSystemDDL(){
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $("#sysDDLDialog").dialog("open").dialog("setTitle","字典管理--编辑");
        $("#fm").form("clear");
        $("#fm").form("load",row);
        url = "/systemddl/updates/"+row.uuid;
    }
}
function destroySystemDDL(){
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $.messager.confirm("Confirm","确定要删除这条记录吗",function (r) {
            if (r){
                $("#dfm").form("submit",{
                    url:"/systemddl/deletion/"+row.uuid,
                    success: function (res) {
                        alert(res);
                        $("#sysDDLDialog").dialog("close");
                        $("#dg").datagrid("reload")
                    }
                })
            }
        })
    }
}
function saveSysDDL(){
    $("#fm").form("submit",{
        url:url,
        success: function (res) {
            alert(res);
            $("#sysDDLDialog").dialog("close");
            $("#dg").datagrid("reload");
        }
    })
}
//课题
function newTopic(){
    $("#fm").form("clear");
    $("#topicDialog").dialog("open").dialog("setTitle","课题管理--新建");
    url = "/topic/addition";
}
function editTopic(){
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $("#topicDialog").dialog("open").dialog("setTitle","课题管理--编辑");
        $("#fm").form("clear");
        $("#fm").form("load",row);
        url = "/topic/updates/"+row.id;
    }
}
function destroyTopic(){
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $.messager.confirm("Confirm","确定要删除这条记录吗",function (r) {
            if (r){
                $("#dfm").form("submit",{
                    url:"/topic/deletion/"+row.id,
                    success: function (res) {
                        alert(res);
                        $("#topicDialog").dialog("close");
                        $("#dg").datagrid("reload")
                    }
                })
            }
        })
    }
}
function saveTopic(){
    $("#fm").form("submit",{
        url:url,
        success: function (res) {
            alert(res);
            $("#topicDialog").dialog("close");
            $("#dg").datagrid("reload");
        }
    })
}
function showTopic() {

}
//答辩分组相关
function newDefenseGroup(){
    $("#fm").form("clear");
    $("#defenseGroupDialog").dialog("open").dialog("setTitle","答辩分组--新建");
    url = "/defenseGroup/addition";
}
function editDefenseGroup(){
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $("#defenseGroupDialog").dialog("open").dialog("setTitle","答辩分组--编辑");
        $("#fm").form("clear");
        $("#fm").form("load",row);
        url = "/defenseGroup/updates/"+row.id;
    }
}
function destroyDefenseGroup(){
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $.messager.confirm("Confirm","确定要删除这条记录吗",function (r) {
            if (r){
                $("#dfm").form("submit",{
                    url:"/defenseGroup/deletion/"+row.id,
                    success: function (res) {
                        alert(res);
                        $("#defenseGroupDialog").dialog("close");
                        $("#dg").datagrid("reload")
                    }
                })
            }
        })
    }
}
function saveDefenseGroup(){
    $("#fm").form("submit",{
        url:url,
        success: function (res) {
            alert(res);
            $("#defenseGroupDialog").dialog("close");
            $("#dg").datagrid("reload");
        }
    })
}
//通知
function newNotice(){
    $("#fm").form("clear");
    $("#noticeDialog").dialog("open").dialog("setTitle","通知管理--新建");
    url = "/notice/addition";
}
function editNotice(){
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $("#noticeDialog").dialog("open").dialog("setTitle","通知管理--编辑");
        $("#fm").form("clear");
        $("#fm").form("load",row);
        url = "/notice/updates/"+row.uuid;
    }
}
function destroyNotice(){
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $.messager.confirm("Confirm","确定要删除这条记录吗",function (r) {
            if (r){
                $("#dfm").form("submit",{
                    url:"/notice/deletion/"+row.uuid,
                    success: function (res) {
                        alert(res);
                        $("#noticeDialog").dialog("close");
                        $("#dg").datagrid("reload")
                    }
                })
            }
        })
    }
}
function saveNotice(){
    $("#fm").form("submit",{
        url:url,
        success: function (res) {
            alert(res);
            $("#noticeDialog").dialog("close");
            $("#dg").datagrid("reload");
        }
    })
}
function readNotice() {
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $("#read_noticeDialog").dialog("open").dialog("setTitle",row.title);
        $("#notice_content").html(row.content);
        $("#notice_footer").html("发布人："+row.publisher+"  发布日期："+row.date);
    }
}
function downloadFile(model1,model2) {
    window.location.href = "/"+model1+"/download/"+model2;
}

//用户登录登出
function login() {
    $("#fm").form("submit",{
        url:"/user/login",
        success: function (res) {
            window.location.href = res;
        }
    })
}
function logout() {
    $.get("/user/logout",null,function (res) {
        window.location.href = "/login";
    })
}
//角色
function newRole(){
    $("#fm").form("clear");
    $("#roleDialog").dialog("open").dialog("setTitle","角色管理--新建");
    url = "/role/addition";
}
function editRole(){
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $("#roleDialog").dialog("open").dialog("setTitle","角色管理--编辑");
        $("#fm").form("clear");
        $("#fm").form("load",row);
        url = "/role/updates/"+row.uuid;
    }
}
function destroyRole(){
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $.messager.confirm("Confirm","确定要删除这条记录吗",function (r) {
            if (r){
                $("#dfm").form("submit",{
                    url:"/role/deletion/"+row.uuid,
                    success: function (res) {
                        alert(res);
                        $("#roleDialog").dialog("close");
                        $("#dg").datagrid("reload")
                    }
                })
            }
        })
    }
}
function saveRole(){
    $("#fm").form("submit",{
        url:url,
        success: function (res) {
            alert(res);
            $("#roleDialog").dialog("close");
            $("#dg").datagrid("reload");
        }
    })
}
//答疑时间和地点设置
function answerTP() {
    $.post("/user/updates/"+$("#uid").val(),
        {
        "defensetime":$("#time").val(),
        "defenseplace":$("#place").val()
        },
    function (res) {
        alert(res);
    })
}
//学生
function newStu(){
    $("#fm").form("clear");
    $("#stuDialog").dialog("open").dialog("setTitle","学生管理--新建");
    url = "/student/addition";
}
function editStu(){
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $("#stuDialog").dialog("open").dialog("setTitle","学生管理--编辑");
        $("#fm").form("clear");
        $("#fm").form("load",row);
        url = "/student/updates/"+row.sid;
    }
}
function destroyStu(){
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $.messager.confirm("Confirm","确定要删除这条记录吗",function (r) {
            if (r){
                $("#dfm").form("submit",{
                    url:"/student/deletion/"+row.sid,
                    success: function (res) {
                        alert(res);
                        $("#stuDialog").dialog("close");
                        $("#dg").datagrid("reload")
                    }
                })
            }
        })
    }
}
function saveStu(){
    $("#fm").form("submit",{
        url:url,
        success: function (res) {
            alert(res);
            $("#stuDialog").dialog("close");
            $("#dg").datagrid("reload");
        }
    })
}
//发送邮件事件
function sendEmail() {
    $("#mailForm").form("submit",{
        url:"/mail/send",
        success: function (res) {
            alert(res);
        }
    })
}
//教师
function newUser(){
    $("#fm").form("clear");
    $("#userDialog").dialog("open").dialog("setTitle","教师管理--新建");
    url = "/user/addition";
}
function editUser(){
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $("#userDialog").dialog("open").dialog("setTitle","教师管理--编辑");
        $("#fm").form("clear");
        $("#fm").form("load",row);
        url = "/user/updates/"+row.uid;
    }
}
function destroyUser(){
    var row = $("#dg").datagrid("getSelected");
    if (row){
        $.messager.confirm("Confirm","确定要删除这条记录吗",function (r) {
            if (r){
                $("#dfm").form("submit",{
                    url:"/user/deletion/"+row.uid,
                    success: function (res) {
                        alert(res);
                        $("#userDialog").dialog("close");
                        $("#dg").datagrid("reload")
                    }
                })
            }
        })
    }
}
function saveUser(){
    $("#fm").form("submit",{
        url:url,
        success: function (res) {
            alert(res);
            $("#userDialog").dialog("close");
            $("#dg").datagrid("reload");
        }
    })
}
//通过Excel
function importByExcel() {
    $("#stu_import_fm").form("submit",{
        url:'/student/import',
        success: function (res) {
            alert(res);
            $("#stu_import_Dialog").dialog("close");
            $("#dg").datagrid("reload");
        }
    })
}
function importByExcel_openDialog() {
    $("#stu_import_fm").form("clear");
    $("#stu_import_Dialog").dialog("open").dialog("setTitle","学生添加--批量");
}
