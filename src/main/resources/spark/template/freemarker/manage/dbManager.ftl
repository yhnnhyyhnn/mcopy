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

    <script type="text/javascript" src="/local/dbManager.js"></script>

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
        数据库查询
    </div>
    <div class="container">
        <label for="form-field-11">SQL</label>
        <textarea id="condition" class="autosize-transition form-control"></textarea>
        <button class="btn btn-xs" id="query">查询</button>
    </div>
    <div class="table-responsive">
        <table id="searchTable" class="table table-striped table-bordered table-hover"
        <tr>
            <th w_index="XH" width="5%;">XH</th>
            <th w_index="ID" width="5%;">ID</th>
            <th w_index="CHAR" w_align="left" width="15%;">CHAR</th>
            <th w_index="TEXT" w_align="left" width="35%;">TEXT</th>
            <th w_index="DATE" width="15%;">DATE</th>
            <th w_index="TIME" width="15%;">TIME</th>
            <th w_index="NUM" width="15%;">NUM</th>
        </tr>
        </table>
    </div>
</div>


    <script type="text/javascript">
        var localData = [
            {
                "ID": 202,
                "CHAR": "1",
                "TEXT": "TEXT_TEXT_TEXT_TEXT_TEXT_TEXT_TEXT_TEXT_TEXT_TEXT_TEXT_1",
                "NUM": 11.2,
                "XH": 1
            },
            {
                "ID": 201,
                "CHAR": "111",
                "TEXT": "TEXT_TEXT_TEXT_TEXT_TEXT_TEXT_TEXT_TEXT_TEXT_TEXT_TEXT_2",
                "XH": 2
            },
            {
                "ID": 200,
                "CHAR": "200",
                "TEXT": "TEXT_TEXT_TEXT_TEXT_TEXT_TEXT_TEXT_TEXT_TEXT_TEXT_TEXT_3",
                "XH": 3
            },
            {
                "ID": 199,
                "CHAR": "199",
                "XH": 4
            },
            {
                "ID": 32,
                "CHAR": "34",
                "NUM": 12.1,
                "XH": 5
            }];

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
//            gridObj = $.fn.bsgrid.init('searchTable', {
//                localData: localData,
//                pageSizeSelect: true,
//                pageSize: 10,
//                stripeRows: true,
//                rowHoverColor: true
//            });

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

        });
    </script>
</body>
</html>
