<div id="dialogWindow" data-options="border:'thin',collapsible:false,minimizable: false">
    <div class="easyui-layout" data-options="fit:true,border:false">
        <div data-options="region:'center',border:false" style="padding:0px;">
            <iframe src="" class="easyui-panel" data-options="fit:true,border:false" frameborder="0"></iframe>
        </div>
        <div data-options="region:'south',border:false" style="text-align:right;padding:5px 10px 5px 0px;border-top:1px solid #ddd;">
            <a class="easyui-linkbutton" data-options="iconCls:'icon-ok'" href="javascript:void(0)" onclick="javascript:subPage.save();" style="width:80px">保存</a>
            <a class="easyui-linkbutton" data-options="iconCls:'icon-cancel'" href="javascript:void(0)" onclick="javascript:closeWindow()" style="width:80px">取消</a>            
        </div>
    </div>
</div>

<div id="popupWindow" data-options="width:500,height:300,border:'thin',cls:'c9',collapsible:false,shadow:false,minimizable: false,maximizable: false" style="display: none;">
	<iframe src="" class="easyui-panel" data-options="fit:true, border:false" frameborder="0"></iframe>
</div>