<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="zh-CN">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>北京美立特图文快印</title>

    <link rel="stylesheet" href="/thirdplugins/assets/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="/thirdplugins/assets/css/font-awesome.min.css"/>
    <link rel="stylesheet" href="/thirdplugins/assets/css/jquery-ui-1.10.3.custom.min.css"/>
    <link rel="stylesheet" href="/thirdplugins/assets/css/ace.min.css"/>
    <link rel="stylesheet" href="/thirdplugins/assets/css/ace-rtl.min.css"/>
    <link rel="stylesheet" href="/thirdplugins/assets/css/ace-skins.min.css"/>
    <link rel="stylesheet" href="/bsgrid/builds/merged/bsgrid.all.min.css"/>


    <script src='/thirdplugins/assets/js/jquery-1.10.2.min.js'></script>
    <script src="/thirdplugins/assets/js/bootstrap.min.js"></script>
    <script src="/thirdplugins/assets/js/jquery-ui-1.10.3.custom.min.js"></script>
    <script src="/thirdplugins/assets/js/jquery.ui.touch-punch.min.js"></script>
    <script src="/thirdplugins/assets/js/markdown/markdown.min.js"></script>
    <script src="/thirdplugins/assets/js/markdown/bootstrap-markdown.min.js"></script>
    <script src="/thirdplugins/assets/js/jquery.hotkeys.min.js"></script>
    <script src="/thirdplugins/assets/js/bootstrap-wysiwyg.min.js"></script>
    <script src="/thirdplugins/assets/js/bootbox.min.js"></script>
    <script src="/thirdplugins/assets/js/ace-elements.min.js"></script>
    <script src="/thirdplugins/assets/js/ace.min.js"></script>

    <script type="text/javascript" src="/bsgrid/builds/js/lang/grid.zh-CN.min.js"></script>
    <script type="text/javascript" src="/bsgrid/builds/merged/bsgrid.all.min.js"></script>
    <script type="text/javascript" src="/bootstrapvalidator/bootstrapValidator.js"></script>
    <script type="text/javascript" src="/local/news.js"></script>

    <style type="text/css">
        /****** grid style start ******/
        /* grid header and column */
        .bsgrid th, .bsgrid td {
            border-color: #b2cfe1;
            background-color: white;
            color: #274d6d;
            font-size: 16px;
            line-height: 160%; /* default 150%; */
        }

        /* grid header */
        .bsgrid th {
            background: #c7e1fa none;
        }

        /* grid even index row column color */
        .bsgrid tr.even_index_row td {
            background-color: #f2f9ff;
        }

        /* grid row hover column color */
        .bsgrid tr.row_hover td {
            background-color: #fff0bc !important;
        }

        /* grid selected row column color */
        .bsgrid tr.selected.selected_color td {
            background-color: #fff0bc !important;
        }

        /****** grid style end ******/

        /****** paging style start ******/
        /* paging toolbar out table */
        .bsgridPagingOutTab {
            border-color: #b2cfe1;
            background-color: white;
        }

        .bsgridPaging {
            font-size: 16px;
            color: #274d6d;
        }

        /* paging toolbar button */
        .bsgridPaging .pagingBtn {
            background: #c7e1fa none;
            border-color: #b2cfe1;
        }

        .bsgridPaging .gotoPageInput {
            border-color: #b2cfe1;
        }

        /****** paging style end ******/

        .table-header {
            width: 98%;
        }
    </style>
</head>

<body>
<div class="row">
    <div class="table-header">
        用户管理
    </div>
    <div class="table-responsive">
        <table id="searchTable" class="table table-striped table-bordered table-hover"
        <tr>
            <th w_index="NEW_ID" width="5%;">ID</th>
            <th w_index="TITLE" width="60%;">标题</th>
            <th w_index="READCOUNT" w_align="left" width="15%;">阅读次数</th>
            <th w_index="CREATEDATE" w_align="left" width="20%;">创建时间</th>
        </tr>
        </table>
    </div>
</div>


<#--弹出框 start-->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog" style="width: 80%">
        <form class="form-horizontal" id="dataForm" role="form">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <h5 class="modal-title" id="myModalLabel">新闻信息维护</h5>
                </div>
                <input type="hidden" id="NEW_ID1"/>
                <div class="modal-body">
                    <div class="form-group">
                        <label class="col-sm-2 control-label no-padding-right" for="form-field-1">标题：</label>
                        <div class="col-sm-10">
                            <input type="text" id="TITLE1" name="TITLE" placeholder="标题"
                                   class="col-xs-12 col-sm-12"/>
                        </div>
                    </div>

                    <h5 class="header clearfix">
                        页面内容：
                    </h5>
                    <div class="wysiwyg-editor" id="editor1"></div>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" class="btn btn-primary" id="add">保存</button>
                    <button type="button" class="btn btn-primary" id="update">提交</button>
                </div>
            </div><!-- /.modal-content -->
        </form>
    </div><!-- /.modal -->
</div><#--弹出框 end-->
<script type="text/javascript">

    jQuery(function ($) {

        function showErrorAlert(reason, detail) {
            var msg = '';
            if (reason === 'unsupported-file-type') {
                msg = "Unsupported format " + detail;
            }
            else {
                console.log("error uploading file", reason, detail);
            }
            $('<div class="alert"> <button type="button" class="close" data-dismiss="alert">&times;</button>' +
                    '<strong>File upload error</strong> ' + msg + ' </div>').prependTo('#alerts');
        }

        //$('#editor1').ace_wysiwyg();//this will create the default editor will all buttons

        //but we want to change a few buttons colors for the third style
        $('#editor1').ace_wysiwyg({
            toolbar: [
                'font',
                null,
                'fontSize',
                null,
                {name: 'bold', className: 'btn-info'},
                {name: 'italic', className: 'btn-info'},
                {name: 'strikethrough', className: 'btn-info'},
                {name: 'underline', className: 'btn-info'},
                null,
                {name: 'insertunorderedlist', className: 'btn-success'},
                {name: 'insertorderedlist', className: 'btn-success'},
                {name: 'outdent', className: 'btn-purple'},
                {name: 'indent', className: 'btn-purple'},
                null,
                {name: 'justifyleft', className: 'btn-primary'},
                {name: 'justifycenter', className: 'btn-primary'},
                {name: 'justifyright', className: 'btn-primary'},
                {name: 'justifyfull', className: 'btn-inverse'},
                null,
                {name: 'createLink', className: 'btn-pink'},
                {name: 'unlink', className: 'btn-pink'},
                null,
                {name: 'insertImage', className: 'btn-success'},
                null,
                'foreColor',
                null,
                {name: 'undo', className: 'btn-grey'},
                {name: 'redo', className: 'btn-grey'}
            ],
            'wysiwyg': {
                fileUploadError: showErrorAlert
            }
        }).prev().addClass('wysiwyg-style2');

        if (typeof jQuery.ui !== 'undefined' && /applewebkit/.test(navigator.userAgent.toLowerCase())) {

            var lastResizableImg = null;

            function destroyResizable() {
                if (lastResizableImg == null) return;
                lastResizableImg.resizable("destroy");
                lastResizableImg.removeData('resizable');
                lastResizableImg = null;
            }

            var enableImageResize = function () {
                $('.wysiwyg-editor')
                        .on('mousedown', function (e) {
                            var target = $(e.target);
                            if (e.target instanceof HTMLImageElement) {
                                if (!target.data('resizable')) {
                                    target.resizable({
                                        aspectRatio: e.target.width / e.target.height,
                                    });
                                    target.data('resizable', true);

                                    if (lastResizableImg != null) {//disable previous resizable image
                                        lastResizableImg.resizable("destroy");
                                        lastResizableImg.removeData('resizable');
                                    }
                                    lastResizableImg = target;
                                }
                            }
                        })
                        .on('click', function (e) {
                            if (lastResizableImg != null && !(e.target instanceof HTMLImageElement)) {
                                destroyResizable();
                            }
                        })
                        .on('keydown', function () {
                            destroyResizable();
                        });
            }

            enableImageResize();
        }
    });

    var gridObj;
    $(function () {
        gridObj = $.fn.bsgrid.init('searchTable', {
            localData: arr,
            pageSizeSelect: true,
            pageSize: 5,
            stripeRows: true,
            rowHoverColor: true,
            displayBlankRows: false
        });


        $.fn.getStyleObject = function () {
            var dom = this.get(0);
            var style;
            var returns = {};
            if (window.getComputedStyle) {
                var camelize = function (a, b) {
                    return b.toUpperCase();
                };
                style = window.getComputedStyle(dom, null);
                for (var i = 0, l = style.length; i < l; i++) {
                    var prop = style[i];
                    var camel = prop.replace(/\-([a-z])/, camelize);
                    var val = style.getPropertyValue(prop);
                    returns[camel] = val;
                }
                return returns;
            }
            if (style = dom.currentStyle) {
                for (var prop in style) {
                    returns[prop] = style[prop];
                }
                return returns;
            }
            if (style = dom.style) {
                for (var prop in style) {
                    if (typeof style[prop] != 'function') {
                        returns[prop] = style[prop];
                    }
                }
                return returns;
            }
            return returns;
        }

        var buttonHtml = '<td style="text-align: left;">';
        buttonHtml += '<table><tr>';
        buttonHtml += '<td><input type="button" value="新增" onclick="addData()" /></td>';
        buttonHtml += '<td><input type="button" value="修改" onclick="modifyData()" /></td>';
        buttonHtml += '<td><input type="button" value="删除" onclick="delData()" /></td>';
        buttonHtml += '</tr></table>';
        buttonHtml += '</td>';
        $('#' + gridObj.options.pagingOutTabId + ' tr:eq(0)').prepend(buttonHtml);
        $('#' + gridObj.options.pagingOutTabId + ' tr td:eq(0) :button').css($('.bsgridPaging .pagingBtn:last').getStyleObject()).css('width', 'auto');

    });

    function addData() {
        $("#myModal").modal("show");
        $("#update").hide();
        $("#add").show();
    }

    function delData() {
        if(confirm("是否删除本条数据？")){
            var new_id = gridObj.getRecordIndexValue(gridObj.getRowRecord(gridObj.getSelectedRow()), 'NEW_ID');
            $.ajax({
                url:"/manage/news/delete/"+new_id,
                data:{},
                type:"POST",
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

    //初始化查询结果
    var arr = [];

    <#if (list?size>0)>
        <#list list as l>
        var d = {
            NEW_ID: "${l.NEW_ID}",
            TITLE: "${l.TITLE}",
            READCOUNT: "${l.READCOUNT}",
            CREATEDATE: '${l.CREATEDATE?string("yyyy-MM-dd")}'
        };
        arr.push(d);
        </#list>
        <#else >
        arr.push({
            NEW_ID: null,
            TITLE: null,
            READCOUNT: null,
            CREATEDATE: null
        });
    </#if>

</script>
</body>
</html>
