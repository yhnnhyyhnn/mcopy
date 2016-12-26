$(function () {
    $("#query").click(function(){
        var condition = $("#condition").val();
        $.ajax({
            type:"get",
            url:"/manage/dbManager/query",
            data:{condition:condition},
            ContentType:"application/json;charset=utf-8",
            success : function (data) {
                var keys = new Array();//存放表头

                if(data){
                    var json = eval(data);

                    for(var i=0;i<json.length;i++){
                        for(var key in json[i]) {
                            if(keys.indexOf(key)<0){
                                keys.push(key);
                            }
                        }
                    }
                    gridObj = $.fn.bsgrid.init('searchTable', {
                        localData: json,
                        pageSizeSelect: true,
                        pageSize: 10,
                        stripeRows: true,
                        rowHoverColor: true,
                        processUserdata: function (userdata, options) {
                            $('#searchTable tr th').remove();
                            var cNum = keys.length;
                            for (var i = 0; i < cNum; i++) {
                                $('#searchTable tr').append('<th w_index="' + keys[i] + '">' + keys[i] + '</th>');
                            }
                            options.columnsModel = $.fn.bsgrid.initColumnsModel(options);
                        }
                    });

                }
            }
        });
    });
});