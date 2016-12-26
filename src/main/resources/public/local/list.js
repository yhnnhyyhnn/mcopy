$(function () {

});

/**
 * 创建分页
 *
 * @param pageSize
 *            每页显示的条数
 * @param buttons
 *            显示的页面数（如页面太多，可以只显示一部分页面数）
 * @param total
 *            总条数
 */
function createPage(pageSize, buttons, total, pageNum) {
    $(".pagination")
        .jBootstrapPage(
            {
                pageSize: pageSize,
                total: total,
                selectedIndex: pageNum,
                maxPageButton: buttons,
                onPageClicked: function (obj, pageIndex) {
                    var data = {
                        "sername": $(".ser_name").val(),
                        "pageSize": pageSize,
                        "pageNum": pageIndex + 1
                    };
                    var jsonData = JSON.stringify(data);
                    document
                        .write("<form action='list' method='post' name='form1' style='display:none' >");
                    document
                        .write("<input name='jsonData' type='hidden' value='"
                            + jsonData + "' />");
                    document.write("</form>");
                    document.form1.submit();
                }
            });
}