$(function () {
    //表单校验
    $('#dataForm').bootstrapValidator({
        fields: {
            TITLE: {
                message: "标题无效",
                validators: {
                    notEmpty: {
                        message: '标题不能位空'
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
            TITLE: $("#TITLE1").val(),
            CONTENT: dd
        };
        $.ajax({
            url: "/manage/news/add",
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
        var newid=$("#NEW_ID1").val();
        var d = {
            TITLE: $("#TITLE1").val(),
            CONTENT: dd
        };
        $.ajax({
            url:"/manage/news/update/"+newid,
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


    $('#myModal').on('hide.bs.modal', function () {
        $("#TITLE1").val("");
        $("#NEW_ID1").val("");
        $("#editor1").html("");
    });
});

function modifyData() {
    $("#myModal").modal("show");

    var new_id = gridObj.getRecordIndexValue(gridObj.getRowRecord(gridObj.getSelectedRow()), 'NEW_ID');

    $.ajax({
        url:"/manage/news/get/"+new_id,
        data:{},
        ContentType: "application/json;charset=utf-8",
        success:function (data) {
            var json = JSON.parse(data);
            $("#TITLE1").val(json['tITLE']);
            $("#editor1").html(json['cONTENT']);
            $("#NEW_ID1").val(new_id);
        }
    });

    $("#update").show();
    $("#add").hide();
}

