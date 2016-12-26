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
    <link rel="stylesheet" href="/bootstrapvalidator/bootstrapValidator.css"/>

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
    <script type="text/javascript" src="/local/users.js"></script>

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
            <th w_index="user_id" width="10%;">用户ID</th>
            <th w_index="username" width="30%;">用户名称</th>
            <th w_index="loginname" w_align="left" width="30%;">登陆账号</th>
            <th w_index="userlevel" w_align="left" width="10%;">用户级别</th>
            <th w_index="createtime" width="20%;">创建时间</th>
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
                    <h5 class="modal-title" id="myModalLabel">用户维护</h5>
                </div>
                <input type="hidden" id="user_id"/>
                <div class="modal-body">
                    <div class="form-group">
                        <label class="col-sm-2 control-label no-padding-right" for="form-field-1">用户名称：</label>
                        <div class="col-sm-10">
                            <input type="text" id="username" name="username" placeholder="用户名称" class="col-xs-12 col-sm-12"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label no-padding-right" for="form-field-1">登陆账号：</label>
                        <div class="col-sm-10">
                            <input type="text" id="loginname" name="loginname" placeholder="登陆账号" class="col-xs-12 col-sm-12"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label no-padding-right" for="form-field-1">登陆密码：</label>
                        <div class="col-sm-10">
                            <input type="password" id="password" name="password" placeholder="登陆密码" class="col-xs-12 col-sm-12"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label no-padding-right" for="form-field-1">登陆密码确认：</label>
                        <div class="col-sm-10">
                            <input type="password" id="repassword" name="repassword" placeholder="登陆密码确认" class="col-xs-12 col-sm-12"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label no-padding-right" for="form-field-1">用户级别：</label>
                        <div class="col-sm-10">
                            <select class="form-control" id="userlevel" name="userlevel">
                                <option value="1">普通用户</option>
                                <option value="2">管理员</option>
                            </select>
                        </div>
                    </div>
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

        $("#username").removeAttr("readonly");
        $("#loginname").removeAttr("readonly");
        $("#userlevel").removeAttr("readonly");
    }

    function modifyData() {
        $("#myModal").modal("show");
        $("#user_id").val(gridObj.getRecordIndexValue(gridObj.getRowRecord(gridObj.getSelectedRow()), 'user_id'));
        $("#username").val(gridObj.getRecordIndexValue(gridObj.getRowRecord(gridObj.getSelectedRow()), 'username'));
        $("#loginname").val(gridObj.getRecordIndexValue(gridObj.getRowRecord(gridObj.getSelectedRow()), 'loginname'));
        var userlevel = gridObj.getRecordIndexValue(gridObj.getRowRecord(gridObj.getSelectedRow()), 'userlevel');
        if(userlevel=="管理员"){
            $("#userlevel").val("2");
        }
        if(userlevel=="普通用户"){
            $("#userlevel").val("1");
        }

        //用户名称设为只读
        $("#username").attr({ readonly: 'true' });
        $("#loginname").attr({ readonly: 'true' });
        $("#userlevel").attr({ readonly: 'true' });

        $("#update").show();
        $("#add").hide();
    }



    //初始化查询结果
    var arr = [];
    <#list list as l>
    var d = {
        user_id:"${l.USER_ID}",
        username:"${l.USERNAME}",
        loginname:"${l.LOGINNAME}",
        userlevel:"${l.USERLEVEL}",
        createtime:'${l.CREATETIME?string("yyyy-MM-dd HH:mm:ss")}'
    };
    arr.push(d);
    </#list>
</script>
</body>
</html>
