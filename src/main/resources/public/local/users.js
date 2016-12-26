$(function () {
    //表单校验
    $('#dataForm').bootstrapValidator({
//        live: 'disabled',
//         message: 'This value is not valid',
//         feedbackIcons: {
//             valid: 'glyphicon glyphicon-ok',
//             invalid: 'glyphicon glyphicon-remove',
//             validating: 'glyphicon glyphicon-refresh'
//         },
        fields: {
            username: {
                message: '用户名称无效',
                validators: {
                    notEmpty: {
                        message: '用户名称不能为空'
                    },
                    stringLength: {
                        max: 20,
                        message: '用户名称必须小于20个字符'
                    }
                }
            },
            loginname: {
                message: '登陆账号无效',
                validators: {
                    notEmpty: {
                        message: '登陆账号不能为空'
                    },
                    stringLength: {
                        max: 20,
                        message: '登陆账号必须小于20个字符'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z0-9_\.]+$/,
                        message: '登陆账号只能由字母、数字、点和下划线组成'
                    },
                    different: {
                        field: 'password',
                        message: '登陆账号和密码不能相同'
                    }
                }
            },
            password: {
                validators: {
                    notEmpty: {
                        message: '密码不能为空'
                    },
                    stringLength: {
                        max: 16,
                        message: '密码必须小于16个字符'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z0-9_\.]+$/,
                        message: '密码只能由字母、数字、点和下划线组成'
                    },
                    identical: {
                        field: 'repassword',
                        message: '两次密码不一致'
                    },
                    different: {
                        field: 'loginname',
                        message: '登陆账号和密码不能相同'
                    }
                }
            },
            repassword: {
                validators: {
                    notEmpty: {
                        message: '密码不能为空'
                    },
                    identical: {
                        field: 'password',
                        message: '两次密码不一致'
                    },
                    different: {
                        field: 'loginname',
                        message: '登陆账号和密码不能相同'
                    }
                }
            },
            userlevel: {
                validators: {
                    notEmpty: {
                        message: '请选择级别'
                    }
                }
            }
        }
    });

    //新增用户点击事件
    $("#add").click(function () {
        $('#dataForm').bootstrapValidator('validate');
        var d = {
            username: $("#username").val(),
            loginname: $("#loginname").val(),
            password: $("#password").val(),
            userlevel: $("#userlevel").val()
        };
        $.ajax({
            url: "/manage/users/add",
            type:"POST",
            data: d,
            ContentType: "application/json;charset=utf-8",
            success: function (data) {
                if (data) {
                    var js = JSON.parse(data);

                    if(js["result"]==="1"){
                        alert("新增成功！");
                        $("#myModal").modal("hide");
                        window.location.reload();
                    }else{
                        alert(js["message"]);
                        return;
                    }

                }
            },
            error:function (data) {
                alert("新增失败，请联系管理员");
            }
        });

    });

    $("#update").click(function () {
        $('#dataForm').bootstrapValidator('validate');
        var d = {
            user_id:$("#user_id").val(),
            username: $("#username").val(),
            loginname: $("#loginname").val(),
            password: $("#password").val(),
            userlevel: $("#userlevel").val()
        };

        $.ajax({
            url:"/manage/users/update",
            type:"POST",
            data:d,
            ContentType:"application/json;charset=utf-8",
            success:function (data) {
                if(data){
                    alert("修改成功！");
                    $("#myModal").modal("hide");
                    window.location.reload();
                }
            },
            error:function (data) {
                alert("修改失败，请联系管理员");
            }
        });
    });



    $('#myModal').on('hide.bs.modal', function () {
        $("#user_id").val("");
        $("#username").val("");
        $("#loginname").val("");
        $("#userlevel").val("");
        $("#password").val("");
    });

});

function delData(){
    if(confirm("是否确认删除当前数据 ？")){
        var d = {
            user_id:gridObj.getRecordIndexValue(gridObj.getRowRecord(gridObj.getSelectedRow()), 'user_id')
        };

        $.ajax({
            url:"/manage/users/delete",
            type:"POST",
            data:d,
            ContentType:"application/json;charset=utf-8",
            success:function (data) {
                if(data){
                    alert("删除成功！");
                    $("#myModal").modal("hide");
                    window.location.reload();
                }
            },
            error:function (data) {
                alert("删除失败，请联系管理员");
            }
        });
    }else{
        return;
    }
}