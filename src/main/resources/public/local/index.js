var json = new Object();
var hxywcount = 0;
$.ajax({
    url: "/menu/getChildren",
    data: {},
    ContentType: "application/json;charset=utf-8",
    success: function (data) {
        if (data) {
            json = JSON.parse(data);

        }
    }
});

$(document).ready(function () {
    $("#nav li").hover(function () {

        if (hxywcount == 0) {
            for(var key in json){
                if($(this).children(":first").text() == key){
                    var arr = json[key];
                    var content = '<ul>';
                    for (var i = 0; i < arr.length; i++) {
                        content += '<li><a href="' + arr[i]['uRL'] + '">' + arr[i]['mENUNAME'] + '</a></li>';
                    }
                    content += '</ul>';
                    $(this).append(content);
                    break;
                }
            }
        }
        $(this).find("ul").slideDown("slow");
    }, function () {
        $(this).find("ul").slideUp("fast");
    });
});