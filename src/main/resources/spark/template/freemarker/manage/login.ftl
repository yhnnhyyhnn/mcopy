<!DOCTYPE html>
<html lang="en" >
<head>
    <meta charset="utf-8" />
    <title>北京美立特图文快印</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

    <!-- basic styles -->

    <link href="/thirdplugins/css/bootstrap/bootstrap.min.css" rel="stylesheet" />
    <link rel="stylesheet" href="/thirdplugins/assets/css/font-awesome.min.css" />

    <!--[if IE 7]>
    <link rel="stylesheet" href="/thirdplugins/assets/css/font-awesome-ie7.min.css" />
    <![endif]-->

    <!-- page specific plugin styles -->

    <!-- fonts -->

    <!-- ace styles -->

    <link rel="stylesheet" href="/thirdplugins/assets/css/ace.min.css" />
    <link rel="stylesheet" href="/thirdplugins/assets/css/ace-rtl.min.css" />

    <!--[if lte IE 8]>
    <link rel="stylesheet" href="/thirdplugins/assets/css/ace-ie.min.css" />
    <![endif]-->

    <!-- inline styles related to this page -->

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->

    <!--[if lt IE 9]>
    <script src="/thirdplugins/assets/js/html5shiv.js"></script>
    <script src="/thirdplugins/assets/js/respond.min.js"></script>
    <![endif]-->

    <script src="/local/login.js"></script>
    <script>
        <#if error??>
            alert("${error}");
        </#if>
    </script>
</head>

<body class="login-layout">
<div class="main-container">
    <div class="main-content">
        <div class="row">
            <div class="col-sm-10 col-sm-offset-1">
                <div class="login-container">
                    <div class="center">
                        <h2>
                            <i class="icon-leaf green"></i>
                            <span class="white">后台管理系统</span>
                        </h2>
                        <h4 class="blue">&copy; 北京美立特图文制作有限公司</h4>
                    </div>

                    <div class="space-6"></div>

                    <div class="position-relative">
                        <div id="login-box" class="login-box visible widget-box no-border">
                            <div class="widget-body">
                                <div class="widget-main">
                                    <!--<h4 class="header blue lighter bigger">
                                        <i class="icon-coffee green"></i>
                                        Please Enter Your Information
                                    </h4>-->

                                    <div class="space-6"></div>

                                    <form name="denglu" id="denglu" method="post" action="/manage">
                                        <fieldset>
                                            <label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="text" class="form-control" id="username" name="username" placeholder="用户名" />
															<i class="icon-user"></i>
														</span>
                                            </label>

                                            <label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="password" class="form-control" id="password" name="password" placeholder="密码" />
															<i class="icon-lock"></i>
														</span>
                                            </label>

                                            <div class="space"></div>

                                            <div class="clearfix">
                                                <label class="inline">
                                                    <input type="checkbox" id="rememberme" name="rememberme" class="ace" />
                                                    <span class="lbl"> 记住我</span>
                                                </label>

                                                <input type="submit" class="width-35 pull-right btn btn-sm btn-primary" value="登陆" >

                                                </input>
                                            </div>

                                            <div class="space-4"></div>
                                        </fieldset>
                                    </form>

                                </div><!-- /widget-main -->

                            </div><!-- /widget-body -->
                        </div><!-- /login-box -->

                    </div><!-- /position-relative -->
                </div>
            </div><!-- /.col -->
        </div><!-- /.row -->
    </div>
</div><!-- /.main-container -->

<!-- basic scripts -->

<script type="text/javascript">
    window.jQuery || document.write("<script src='/thirdplugins/assets/js/jquery-2.0.3.min.js'>"+"<"+"/script>");
</script>

<!-- <![endif]-->

<!--[if IE]>
<script type="text/javascript">
    window.jQuery || document.write("<script src='/assets/js/jquery-1.10.2.min.js'>"+"<"+"/script>");
</script>
<![endif]-->

<script type="text/javascript">
    if("ontouchend" in document) document.write("<script src='/thirdplugins/assets/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
</script>

<!-- inline scripts related to this page -->

<script type="text/javascript">
    function show_box(id) {
        jQuery('.widget-box.visible').removeClass('visible');
        jQuery('#'+id).addClass('visible');
    }
</script>
</body>
</html>
