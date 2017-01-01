<#include "common/head.ftl"/>
<script type="text/javascript" src="/zcurd/js/menu.js"></script>
<script type="text/javascript">
    if (self != top) {  //主页不允许在iframe中
        top.window.location.reload();
    }
</script>
<style type="text/css">
    .head{background: #09C; font-size: 14px; color: white; height: 50px; line-height: 50px; padding: 0px 8px; overflow: hidden;}
    .head table{border-spacing: 0px; width: 100%;}
    .head table,tr,td,th{padding: 0px;}
    .head .rtool a{color: white;}
    .head .rtool a.l-btn-plain:hover{color: black;}
    .head .rtool a.l-btn-plain.m-btn-plain-active{color: black;}

    .easyui-tabs .tabs{border-color: #A5C4EF;}
    .easyui-tabs .tabs li a.tabs-inner{border-radius: 2px 2px 0 0;}

    .tree-node {padding: 8px 0px;}
    .tree-node-hover{background: #465467; color: white;}
    .tree-node-selected{background: #0099cc; color: white;}
    .tree-node .tree-title{font-size: 13px; font-weight: normal; color: #fff; }

    .left{background-color: #424f63;}
    .menu_head{height: 30px;line-height: 30px;background: #4e5f77;color: #aeb9c2;text-align: center;}
    .layout-expand-north, .layout-expand-west{height: 0px;}

    .tree-expanded{
        background: url('/zcurd/css/images/tree_icons_main.png') no-repeat -18px 0px;
    }
    .tree-collapsed {
        background: url('/zcurd/css/images/tree_icons_main.png') no-repeat 0px 0px;
    }
    .tree-icon {
        color: #BFBFBF;
        font-size: 12px;
        line-height: 18px;
    }

</style>

<div id="layout" class="easyui-layout" data-options="fit:true, border:false">
    <div data-options="region:'north',border:false, collapsedSize:0" style="height:50px;">
        <div class="head"><table><tr>
            <td width="50%" style="font-size: 14px;">美立特后台管理平台</td>
            <td width="50%" align="right" style="font-size: 12px;">
                <div class="easyui-panel rtool" data-options="border:false" style="text-align: right; background: #09C; color: white; margin-top: -1px;">
                    <a href="#" class="easyui-menubutton" data-options="menu:'#mm1'">admin</a>
                </div>
                <div id="mm1" style="width:150px;">
                    <div data-options="iconCls:'icon-undo'" onclick="location.href='/login/logout'">退出</div>
                </div>
            </td>
        </tr></table></div>
    </div>
    <div id="west" data-options="region:'west',split:true, border:false, collapsedSize:0" style="width:200px;background-color: #424f63;color:white">
        <div class="zsy_menu">
            <div class="menu_head">菜单导航</div>
            <ul id="menuTree"></ul>
        </div>
    </div>
    <div data-options="region:'center', border:false">
        <div id="mainTabs" style="height:250px">
            <div title="首页">
                <iframe src="/manage/index" class="easyui-panel" data-options="fit:true,border:false" frameborder="0"></iframe>
            </div>
        </div>
    </div>
</div>

<div id="tabsMenu">
    <div data-options="iconCls:'glyphicon-refresh'" type="refresh" style="font-size: 12px;">刷新</div>
    <div class="menu-sep"></div>
    <div data-options="iconCls:'glyphicon-remove'" type="close" style="font-size: 12px;">关闭</div>
    <div data-options="iconCls:''" type="closeOther">关闭其他</div>
    <div data-options="iconCls:''" type="closeAll">关闭所有</div>
</div>
<div id="tabTools" style="border: 0px; border-bottom: 1px solid #D3D3D3;">
    <a id="fullScreen" href="###" class="easyui-linkbutton" plain="true" iconCls="glyphicon-fullscreen" onclick="fullScreen(this)"></a>
</div>

<#include "common/dialogWindow.ftl"/>
<#include "common/foot.ftl"/>