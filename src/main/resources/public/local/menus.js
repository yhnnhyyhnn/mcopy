$(function () {
    //表单校验
    $('#dataForm').bootstrapValidator({
        fields: {
            MENUNAME: {
                message: "菜单名称无效",
                validators: {
                    notEmpty: {
                        message: '菜单名称不能位空'
                    }
                }
            },
            MENUNAME_EN: {
                message: "菜单英文名称无效",
                validators: {
                    notEmpty: {
                        message: '菜单英文名称不能位空'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z0-9]+$/,
                        message: '菜单英文名称只能由字母、数字组成'
                    }
                }
            }
        }
    })
    ;

    //新增用户点击事件
    $("#add").click(function () {
        // $('#dataForm').bootstrapValidator('validate');
        var dd = $('#editor1').html();
        var d = {
            MENUNAME: $("#MENUNAME1").val(),
            MENUNAME_EN: $("#MENUNAME_EN1").val(),
            CONTENT: dd,
            USETEMP: $("#USETEMP1").val(),
            URL: $("#URL1").val(),
            MENULEVEL: '2',
            PARENT: $("#PARENT1").val(),
            SORT: $("#SORT1").val()
        };
        $.ajax({
            url: "/manage/menus/add",
            data: d,
            type:"POST",
            ContentType: "application/json;charset=utf-8",
            success: function (data) {
                if (data=="success") {
                    alert("新增成功！");
                    $("#myModal").modal("hide");
                    window.location.reload();
                }
            }
        });

    });

    $("#update").click(function () {
        var dd = $('#editor1').html();
        var menuid=$("#MENU_ID1").val();
        var d = {
            MENUNAME: $("#MENUNAME1").val(),
            MENUNAME_EN: $("#MENUNAME_EN1").val(),
            CONTENT: dd,
            USETEMP: $("#USETEMP1").val(),
            URL: $("#URL1").val(),
            MENULEVEL: '2',
            PARENT: $("#PARENT1").val(),
            SORT: $("#SORT1").val()
        };
        $.ajax({
            url:"/manage/menus/update/"+menuid,
            data:d,
            type:"POST",
            ContentType:"application/json;charset=utf-8",
            success:function (data) {
                if(data=="success"){
                    alert("修改成功！");
                    $("#myModal").modal("hide");
                    window.location.reload();
                }
            }
        });
    });

    $("#PARENT1").change(function () {
        alert($("#PARENT1").val());
        if($("#PARENT1").val() === 101){
            $("#URL1").val("/hxyw/");
        }
    });

    $('#myModal').on('hide.bs.modal', function () {
        $("#MENUNAME1").val("");
        $("#MENU_ID1").val("");
        $("#MENUNAME_EN1").val("");
        $("#editor1").html("");
        $("#USETEMP1").val("");
        $("#URL1").val("");
        $("#PARENT1").val("");
        $("#SORT1").val("");
    });
});

function modifyData() {
    $("#myModal").modal("show");

    var menu_id = gridObj.getRecordIndexValue(gridObj.getRowRecord(gridObj.getSelectedRow()), 'MENU_ID');

    $.ajax({
        url:"/manage/menus/get/"+menu_id,
        data:{},
        ContentType: "application/json;charset=utf-8",
        success:function (data) {
            var json = JSON.parse(data);
            $("#MENUNAME1").val(json['mENUNAME']);
            $("#MENUNAME_EN1").val(json['mENUNAME_EN']);
            $("#PARENT1").val(json['pARENT']);
            $("#URL1").val(json['uRL']);
            $("#SORT1").val(json['sORT']);
            $("#USETEMP1").val(json['uSETEMP']);
            $("#editor1").html(json['cONTENT']);
            $("#MENU_ID1").val(menu_id);

        }
    });

    $("#update").show();
    $("#add").hide();
}

