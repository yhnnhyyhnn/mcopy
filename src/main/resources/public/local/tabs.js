$(function () {
    //表单校验
    $('#dataForm').bootstrapValidator({
        fields: {
            TITLE1: {
                message: "标题无效",
                validators: {
                    notEmpty: {
                        message: '标题不能位空'
                    }
                }
            }
        }
    });

    //新增用户点击事件
    $("#add").click(function () {
        // $('#dataForm').bootstrapValidator('validate');
        var dd = $('#editor1').html();
        var d = {
            TITLE: $("#TITLE1").val(),
            MENUNAME: $("#MENUNAME1").val(),
            CONTENT: dd,
            SORT: $("#SORT1").val()
        };
        $.ajax({
            url: "/manage/tabs/add",
            type:"POST",
            data: d,
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
        var tabid=$("#TAB_ID1").val();
        var d = {
            MENUNAME: $("#MENUNAME1").val(),
            CONTENT: dd,
            TITLE: $("#TITLE1").val(),
            SORT: $("#SORT1").val()
        };
        $.ajax({
            url:"/manage/tabs/update/"+tabid,
            type:"POST",
            data:d,
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

    $('#myModal').on('hide.bs.modal', function () {
        $("#MENUNAME1").val("");
        $("#TITLE1").val("");
        $("#editor1").html("");
        $("#SORT1").val("");
    });
});

function delData() {
    if(confirm("是否确认删除当前数据？")){
        var tab_id = gridObj.getRecordIndexValue(gridObj.getRowRecord(gridObj.getSelectedRow()), 'TAB_ID');

        $.ajax({
            url:"/manage/tabs/delete/"+tab_id,
            type:"POST",
            data:{},
            ContentType:"application/json;charset=utf-8",
            success:function (data) {
                if(data == "success"){
                    alert("删除成功！");
                    $("#myModal").modal("hide");
                    window.location.reload();
                }
            }
        });
    }

}

function modifyData() {
    $("#myModal").modal("show");

    //所属菜单选项
    $.ajax({
        url:"/manage/tabs/menulist",
        data:{},
        ContentType:"application/json;charset=utf-8",
        success:function (data) {
            if(data){
                var json = JSON.parse(data);
                for(var key in json){
                    $("#MENUNAME1").append("<option value='"+json[key]+"'>"+key+"</option>");
                }
            }

        }
    });

    var tab_id = gridObj.getRecordIndexValue(gridObj.getRowRecord(gridObj.getSelectedRow()), 'TAB_ID');

    $.ajax({
        url:"/manage/tabs/get/"+tab_id,
        data:{},
        ContentType: "application/json;charset=utf-8",
        success:function (data) {
            var json = JSON.parse(data);
            setTimeout(function () {
                $("#TITLE1").val(json['tITLE']);
                $("#MENUNAME1").val(json['mENU_ID']);
                $("#SORT1").val(json['sORT']);
                $("#editor1").html(json['cONTENT']);
                $("#TAB_ID1").val(tab_id);
            },500);

        }
    });

    $("#update").show();
    $("#add").hide();
}

function addData() {
    $("#myModal").modal("show");
    $("#update").hide();

    $.ajax({
        url:"/manage/tabs/menulist",
        data:{},
        ContentType:"application/json;charset=utf-8",
        success:function (data) {
            if(data){
                var json = JSON.parse(data);
                for(var key in json){
                    $("#MENUNAME1").append("<option value='"+json[key]+"'>"+key+"</option>");
                }
            }

        }
    });

    $("#add").show();
}

