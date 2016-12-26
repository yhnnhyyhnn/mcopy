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
    <script type="text/javascript" src="/local/menus.js"></script>

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
            <th w_index="MENU_ID" width="5%;">ID</th>
            <th w_index="MENUNAME" width="20%;">菜单名称</th>
            <th w_index="URL" w_align="left" width="20%;">URL</th>
            <th w_index="USETEMP" w_align="left" width="25%;">是否启用模版</th>
            <th w_index="PARENT" width="15%;">父菜单</th>
            <th w_index="SORT" width="15%;">排序</th>
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
                    <h5 class="modal-title" id="myModalLabel">菜单维护</h5>
                </div>
                <input type="hidden" id="MENU_ID1"/>
                <div class="modal-body">
                    <div class="form-group">
                        <label class="col-sm-2 control-label no-padding-right" for="form-field-1">菜单名称：</label>
                        <div class="col-sm-10">
                            <input type="text" id="MENUNAME1" name="MENUNAME" placeholder="菜单名称"
                                   class="col-xs-12 col-sm-12"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label no-padding-right" for="form-field-1">菜单英文名称：</label>
                        <div class="col-sm-10">
                            <input type="text" id="MENUNAME_EN1" name="MENUNAME_EN" placeholder="菜单英文名称"
                                   class="col-xs-12 col-sm-12"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label no-padding-right" for="form-field-1">上级菜单：</label>
                        <div class="col-sm-10">
                            <select class="form-control" id="PARENT1" name="PARENT">
                                <option value="101">核心业务</option>
                                <option value="102">成功案例</option>
                                <option value="103">服务网点</option>
                                <option value="104">关于我们</option>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label no-padding-right" for="form-field-1">是否启用模版：</label>
                        <div class="col-sm-10">
                            <select class="form-control" id="USETEMP1" name="USETEMP">
                                <option value="1">是</option>
                                <option value="0">否</option>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label no-padding-right" for="form-field-1">URL：</label>
                        <div class="col-sm-10">
                            <input type="text" id="URL1" name="URL" placeholder="URL" class="col-xs-12 col-sm-12"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label no-padding-right" for="form-field-1">排序：</label>
                        <div class="col-sm-10">
                            <input type="text" id="SORT1" name="SORT" placeholder="排序" class="col-xs-12 col-sm-12"/>
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
        if(confirm("是否删除本条数据?")){
            var menu_id = gridObj.getRecordIndexValue(gridObj.getRowRecord(gridObj.getSelectedRow()), 'MENU_ID');
            $.ajax({
                url:"/manage/menus/delete/"+menu_id,
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

    //初始化查询结果
    var arr = [];

    <#if (list?size>0)>
        <#list list as l>
        var d = {
            MENU_ID: "${l.MENU_ID}",
            MENUNAME: "${l.MENUNAME}",
            USETEMP: "${l.USETEMP}",
            PARENT: "${l.PARENTSTR}",
            URL:"${l.URL}",
            SORT: "${l.SORT!''}"
        };
        arr.push(d);
        </#list>
    </#if>

</script>
</body>
</html>
