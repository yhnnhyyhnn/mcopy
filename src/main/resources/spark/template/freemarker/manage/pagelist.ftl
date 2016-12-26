<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <title>北京美立特图文快印</title>

    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

    <!-- basic styles -->

    <link href="/thirdplugins/assets/css/bootstrap.min.css" rel="stylesheet" />
    <link rel="stylesheet" href="/thirdplugins/assets/css/font-awesome.min.css" />

    <!--[if IE 7]>
    <link rel="stylesheet" href="/thirdplugins/assets/css/font-awesome-ie7.min.css" />
    <![endif]-->

    <!-- page specific plugin styles -->

    <link rel="stylesheet" href="/thirdplugins/assets/css/jquery-ui-1.10.3.full.min.css" />
    <link rel="stylesheet" href="/thirdplugins/assets/css/datepicker.css" />
    <link rel="stylesheet" href="/thirdplugins/assets/js/jqGrid5.1/css/ui.jqgrid-bootstrap.css" />

    <!-- fonts -->

    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400,300" />

    <!-- ace styles -->

    <link rel="stylesheet" href="/thirdplugins/assets/css/ace.min.css" />
    <link rel="stylesheet" href="/thirdplugins/assets/css/ace-rtl.min.css" />
    <link rel="stylesheet" href="/thirdplugins/assets/css/ace-skins.min.css" />

    <!--[if lte IE 8]>
    <link rel="stylesheet" href="/thirdplugins/assets/css/ace-ie.min.css" />
    <![endif]-->

    <!-- inline styles related to this page -->

    <!-- ace settings handler -->

    <script src="/thirdplugins/assets/js/ace-extra.min.js"></script>

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->

    <!--[if lt IE 9]>
    <script src="/thirdplugins/assets/js/html5shiv.js"></script>
    <script src="/thirdplugins/assets/js/respond.min.js"></script>
    <![endif]-->
</head>

<body>

<div class="main-container" id="main-container">


    <div class="main-container-inner">


        <div class="main-content" style="margin-left: 0">
            <div class="breadcrumbs" id="breadcrumbs">
                <script type="text/javascript">
                    try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
                </script>


                <div class="nav-search" id="nav-search">
                    <form class="form-search">
								<span class="input-icon">
									<input type="text" placeholder="Search ..." class="nav-search-input" id="nav-search-input" autocomplete="off" />
									<i class="icon-search nav-search-icon"></i>
								</span>
                    </form>
                </div><!-- #nav-search -->
            </div>

            <div class="page-content">
                <div class="page-header">
                    <h1>
                        用户管理
                    </h1>
                </div><!-- /.page-header -->

                <div class="row">
                    <div class="col-xs-12">
                        <!-- PAGE CONTENT BEGINS -->

                        <table id="grid-table"></table>

                        <div id="grid-pager"></div>

                        <!-- PAGE CONTENT ENDS -->
                    </div><!-- /.col -->
                </div><!-- /.row -->
            </div><!-- /.page-content -->
        </div><!-- /.main-content -->


    </div><!-- /.main-container-inner -->

</div><!-- /.main-container -->

<!-- basic scripts -->

<!--[if !IE]> -->

<script src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>

<!-- <![endif]-->

<!--[if IE]>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<![endif]-->

<!--[if !IE]> -->

<script type="text/javascript">
    window.jQuery || document.write("<script src='/thirdplugins/assets/js/jquery-2.0.3.min.js'>"+"<"+"/script>");
</script>

<!-- <![endif]-->

<!--[if IE]>
<script type="text/javascript">
    window.jQuery || document.write("<script src='/thirdplugins/assets/js/jquery-1.10.2.min.js'>"+"<"+"/script>");
</script>
<![endif]-->

<script type="text/javascript">
    if("ontouchend" in document) document.write("<script src='/thirdplugins/assets/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
</script>
<script src="/thirdplugins/assets/js/bootstrap.min.js"></script>
<script src="/thirdplugins/assets/js/typeahead-bs2.min.js"></script>

<!-- page specific plugin scripts -->

<script src="/thirdplugins/assets/js/date-time/bootstrap-datepicker.min.js"></script>
<script src="/thirdplugins/assets/js/jqGrid5.1/jquery.jqGrid.min.js"></script>
<script src="/thirdplugins/assets/js/jqGrid5.1/i18n/grid.locale-cn.js"></script>

<!-- ace scripts -->

<script src="/thirdplugins/assets/js/ace-elements.min.js"></script>
<script src="/thirdplugins/assets/js/ace.min.js"></script>

<!-- inline scripts related to this page -->

<script type="text/javascript">
    var grid_data =
            [
                {id:"1",name:"Desktop Computer",note:"note",stock:"Yes",ship:"FedEx", sdate:"2007-12-03"},
                {id:"2",name:"Laptop",note:"Long text ",stock:"Yes",ship:"InTime",sdate:"2007-12-03"},
                {id:"3",name:"LCD Monitor",note:"note3",stock:"Yes",ship:"TNT",sdate:"2007-12-03"},
                {id:"4",name:"Speakers",note:"note",stock:"No",ship:"ARAMEX",sdate:"2007-12-03"},
                {id:"5",name:"Laser Printer",note:"note2",stock:"Yes",ship:"FedEx",sdate:"2007-12-03"},
                {id:"6",name:"Play Station",note:"note3",stock:"No", ship:"FedEx",sdate:"2007-12-03"},
                {id:"7",name:"Mobile Telephone",note:"note",stock:"Yes",ship:"ARAMEX",sdate:"2007-12-03"},
                {id:"8",name:"Server",note:"note2",stock:"Yes",ship:"TNT",sdate:"2007-12-03"},
                {id:"9",name:"Matrix Printer",note:"note3",stock:"No", ship:"FedEx",sdate:"2007-12-03"},
                {id:"10",name:"Desktop Computer",note:"note",stock:"Yes",ship:"FedEx", sdate:"2007-12-03"},
                {id:"11",name:"Laptop",note:"Long text ",stock:"Yes",ship:"InTime",sdate:"2007-12-03"},
                {id:"12",name:"LCD Monitor",note:"note3",stock:"Yes",ship:"TNT",sdate:"2007-12-03"},
                {id:"13",name:"Speakers",note:"note",stock:"No",ship:"ARAMEX",sdate:"2007-12-03"},
                {id:"14",name:"Laser Printer",note:"note2",stock:"Yes",ship:"FedEx",sdate:"2007-12-03"},
                {id:"15",name:"Play Station",note:"note3",stock:"No", ship:"FedEx",sdate:"2007-12-03"},
                {id:"16",name:"Mobile Telephone",note:"note",stock:"Yes",ship:"ARAMEX",sdate:"2007-12-03"},
                {id:"17",name:"Server",note:"note2",stock:"Yes",ship:"TNT",sdate:"2007-12-03"},
                {id:"18",name:"Matrix Printer",note:"note3",stock:"No", ship:"FedEx",sdate:"2007-12-03"},
                {id:"19",name:"Matrix Printer",note:"note3",stock:"No", ship:"FedEx",sdate:"2007-12-03"},
                {id:"20",name:"Desktop Computer",note:"note",stock:"Yes",ship:"FedEx", sdate:"2007-12-03"},
                {id:"21",name:"Laptop",note:"Long text ",stock:"Yes",ship:"InTime",sdate:"2007-12-03"},
                {id:"22",name:"LCD Monitor",note:"note3",stock:"Yes",ship:"TNT",sdate:"2007-12-03"},
                {id:"23",name:"Speakers",note:"note",stock:"No",ship:"ARAMEX",sdate:"2007-12-03"}
            ];

    jQuery(function($) {
        var grid_selector = "#grid-table";
        var pager_selector = "#grid-pager";

        var template = "<div style='margin-left:15px;'><div> Customer ID <sup>*</sup>:</div><div> {CustomerID} </div>";
        template += "<div> Company Name: </div><div class='wysiwyg-editor' id='editor1'></div>";
        template += "<div> Phone: </div><div>{Phone} </div>";
        template += "<div> Postal Code: </div><div>{PostalCode} </div>";
        template += "<div> City:</div><div> {City} </div>";
        template += "<hr style='width:100%;'/>";
        template += "<div> {sData} {cData}  </div></div>";

        jQuery(grid_selector).jqGrid({
            //direction: "rtl",

            data: grid_data,
            datatype: "local",
            height: 250,
            //colNames:[' ', 'ID','Last Sales','Name', 'Stock', 'Ship via','Notes'],
            colModel:[
                {name:'id',index:'id', width:60, sorttype:"int", editable: true},
                {name:'sdate',index:'sdate',width:90, editable:true},
                {name:'name',index:'name', width:150,editable: true,editoptions:{size:"20",maxlength:"30"}},
                {name:'stock',index:'stock', width:70, editable: true},
                {name:'ship',index:'ship', width:90, editable: true},
                {name:'note',index:'note', width:150, sortable:false,editable: true,edittype:"textarea", editoptions:{rows:"2",cols:"10"}}
            ],

            viewrecords : true,
            rowNum:10,
            rowList:[10,20,30],
            pager : pager_selector,
            altRows: true,
            //toppager: true,

            multiselect: true,
            //multikey: "ctrlKey",
            multiboxonly: true,

            caption: "用户列表信息",
            autowidth: true

        });

        //enable search/filter toolbar
        //jQuery(grid_selector).jqGrid('filterToolbar',{defaultSearch:true,stringResult:true})




        //navButtons
        jQuery(grid_selector).jqGrid('navGrid',pager_selector,
                { 	//navbar options
                    edit: true,
                    editicon : 'icon-pencil blue',
                    add: true,
                    addicon : 'icon-plus-sign purple',
                    del: true,
                    delicon : 'icon-trash red',
                    search: true,
                    searchicon : 'icon-search orange',
                    refresh: true,
                    refreshicon : 'icon-refresh green',
                    view: true,
                    viewicon : 'icon-zoom-in grey',
                },
                {
                    //edit record form
                    //closeAfterEdit: true,
                    editCaption: "The Edit Dialog",
                    template: template,
                    errorTextFormat: function (data) {
                        return 'Error: ' + data.responseText
                    }
                },
                {
                    //new record form
                    closeAfterAdd: true,
                    recreateForm: true,
                    viewPagerButtons: false,
                    beforeShowForm : function(e) {
                        var form = $(e[0]);
                        form.closest('.ui-jqdialog').find('.ui-jqdialog-titlebar').wrapInner('<div class="widget-header" />')
                    }
                },
                {
                    //delete record form
                    recreateForm: true,
                    beforeShowForm : function(e) {
                        var form = $(e[0]);
                        if(form.data('styled')) return false;

                        form.closest('.ui-jqdialog').find('.ui-jqdialog-titlebar').wrapInner('<div class="widget-header" />')

                        form.data('styled', true);
                    },
                    onClick : function(e) {
                        alert(1);
                    }
                },
                {
                    //search form
                    recreateForm: true,
                    afterShowSearch: function(e){
                        var form = $(e[0]);
                        form.closest('.ui-jqdialog').find('.ui-jqdialog-title').wrap('<div class="widget-header" />')
                        style_search_form(form);
                    },
                    afterRedraw: function(){
                        style_search_filters($(this));
                    }
                    ,
                    multipleSearch: true,
                    /**
                     multipleGroup:true,
                     showQuery: true
                     */
                },
                {
                    //view record form
                    recreateForm: true,
                    beforeShowForm: function(e){
                        var form = $(e[0]);
                        form.closest('.ui-jqdialog').find('.ui-jqdialog-title').wrap('<div class="widget-header" />')
                    }
                }
        )


    });
</script>
</body>
</html>
