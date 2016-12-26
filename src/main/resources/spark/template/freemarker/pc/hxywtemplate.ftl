<!DOCTYPE HTML>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>北京美立特图文快印</title>
    <meta name="description" content="美立特图文快印,专业提供一站式图文快印解决方案,我们的服务涵括:彩色数码印刷,黑白数码印刷,大幅面写真输出,工程图纸输出,文本装订,商务印刷,网络印刷,图文快印,数码快印,图文打印,数码直印,CAD晒图,CAD出图,CAD彩图,数码打样,大图复印,标书打印,工程图打印,菜谱印刷,服装吊牌印刷等" />
    <meta name="keywords" content="美立特图文快印,图文快印,黑白打印,24小时数码快印店,24小时图文快印店,24小时打印店,图文打印店,数码打印店,数码快印公司,标书制作,工程图打印,晒蓝图,数字印刷,印刷报价,数字印刷,云印刷,网络印刷,菜谱制作,大图打印,数码印刷,复印店,彩色喷画,工程图纸打印/复印,CAD输出,工程图纸扫描,平面设计,标书制作装订" />
    <link href="/out/images/favicon.ico" rel="shortcut icon" type="image/x-icon"/>
    <link rel="stylesheet" href="/out/css/index.css"/>
    <link rel="stylesheet" href="/out/css/lanmu.css"/>
    <link rel="stylesheet" href="/out/css/onepage.css"/>
    <link rel="stylesheet" href="/out/css/tab.css"/>
    <script type="text/javascript" src="/out/js/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="/out/js/jquery.SuperSlide.js"></script>
    <script type="text/javascript" src="/out/js/script.js"></script>
    <script type="text/javascript" src="/local/hxyw.js"></script>
    <script type="text/javascript" src="/local/index.js"></script>

</head>

<script type="text/javascript">

    $(function () {
        $('.tab ul.menu li').click(function () {
//获得当前被点击的元素索引值
            var Index = $(this).index();
//给菜单添加选择样式
            $(this).addClass('active').siblings().removeClass('active');
//显示对应的div
            $('.tab').children('div').eq(Index).show().siblings('div').hide();

        });
    });
</script>

<body>

<!--LOGO-->
<div class="boxcontent">
    <div class="top">
        <div class="logo">
            <a href="/"><img src="/out/images/logo.jpg" title="北京美立特" alt="北京美立特"></a>
        </div>

    </div>

</div>

<!--[if lt IE 9]>
<style>
    #nav .mainlevel li {
        background-color: #f48407;
    }
</style>
<![endif]-->
<!--[if lt IE 8]>
<style>
    #nav .mainlevel {
        position: relative;
    }

    #nav .mainlevel ul {
        left: 0px;
    }
</style>
<![endif]-->
<!--[if IE 6]>
<style>
    #top {
        display: none;
    }
</style>
<![endif]-->
<!--daohang-->

<div class="boxcontent daohang">
    <ul id="nav">
        <li class="jquery_out">
            <a href="/">首页</a>
        </li>
        <li class="mainlevel">
            <a href="/hxyw">核心业务</a>
        </li>
        <li class="mainlevel">
            <a href="/cgal">成功案例</a>
        </li>
        <li class="mainlevel">
            <a href="/fwwd">服务网点</a>
        </li>

        <li class="mainlevel">
            <a href="/gywm">关于我们</a>
        </li>
    </ul>
</div>


<!--中间主体内容-->

<div class="boxcontent">
    <div class="contain">
        <div class="left">
            <div class="left_contain">
                <div class="m1">
                    <ul>
                        <#if list??>
                            <#list list as ll>
                            <#if ll.MENUNAME==currentmenu>
                                <li>
                                    <span class="s2"><a href="${ll.URL}" title="${ll.MENUNAME}">${ll.MENUNAME}</a></span>
                                </li>
                            <#else >
                                <li>
                                    <span class="s4"><a href="${ll.URL}" title="${ll.MENUNAME}">${ll.MENUNAME}</a></span>
                                </li>
                            </#if>

                            </#list>
                        </#if>
                    </ul>
                </div>
            </div>

        </div>

        <div class="right">

            <div class="onepage">
                <div class="penhui">
                ${content!""}

                </div>
            </div>

            <div class="tabpage">
                <div class="tab">
                <#if (tabslist?size>0)>
                    <ul class="menu">
                            <#list tabslist as l>
                                <#if l_index == 0 >
                                    <li class="active">${l.TITLE}</li>
                                    <#else >
                                        <li>${l.TITLE}</li>
                                </#if>
                            </#list>
                    </ul>
                </#if>
                    <#--
                    <div class="con1">
                        <p>【大洋图文黄花岗旗舰店】，位于越秀区黄花岗影剧院左侧，是大洋图文最早一家在广州成立的图文快印店。目前是大洋图文所有店面中，员工人数最多，实力最雄厚的一家店面。<br></p>
                        <p>主要营业项目有：数码快印，平面设计，喷绘写真，工程图纸，商务印刷，个性印品等。</p>
                    </div>
                    <div class="con2">
                        <p>【大洋图文黄花岗旗舰店】，位于越秀区黄花岗影剧院左侧，是大洋图文最早一家在广州成立的图文快印店。目前是大洋图文所有店面中，员工人数最多，实力最雄厚的一家店面。<br></p>
                        <p>主要营业项目有：数码快印，平面设计，喷绘写真，工程图纸，商务印刷，个性印品等。</p>
                    </div>
                    -->
                    <#if (tabslist?size>0)>
                        <#list tabslist as l>
                        <div class="con${l_index+1}">${l.CONTENT!""}</div>
                        </#list>
                    </#if>
                </div>
            </div>

        </div>

    </div>
</div>

</div>

<!--页尾-->
<div class="boxcontent bottom_bg2">
    <div class="boxcontent bottom_bg">
        <!--<div class="article">
            <h2>广州图文印刷公司新闻资讯</h2>
            <div class="title">
                [<a href="/Home/Product/index.html">图文印刷案例</a>]:<a href="/Home/Product/index/planmu_id/1.html">商务印刷产品的案例</a>
            </div>

            <div class="title">
                <li><a href="/Home/Article/index.html">大洋图文新闻中心</a>查询你需要的大洋资讯，印刷知识！</li>
                <li><a href="/Home/Mendian/index.html">大洋图文印刷门店</a>我们在广州有20多家门店，承接各类的印刷业务，所有印品都有优秀的品质保证！</li>
            </div>
        </div>-->
        <div class="bottom">
            <div class="copyright">
                <p>
                    版权所有 <span>©</span> 北京美立特图文制作有限公司 保留一切权利
                </p>

                <!--<p>
                    咨询电话：020-87688235 / 87688236 / 87688237
                </p>-->

                <p>
                    北京美立特快印 Copyright <span>©</span> 2000-2016 www.mcopy.com.cn <a href="http://www.miitbeian.gov.cn"
                                                                                   target="_blank">京CP100034678</a>
                </p>
                <p style="display:none; ">
                    <script type="text/javascript" src="/out/js/tongji.js"></script>
                </p>
            </div>

            <div class="weixin">

            </div>

            <div class="fenxiang">
                <div class="fenxiang1">
                    扫描微信二维码，关注最新美立特资讯
                </div>

                <!--<div class="fenxiang2">
                    <a class="f1"></a>
                    <a class="f2"></a>
                    <a class="f3"></a>
                </div>-->
            </div>
        </div>
    </div>
</div>


<div id="top"></div>

<!--海报JS-->
<script type="text/javascript">
    $(document).ready(function () {

        $(".index_focus").hover(function () {
            $(this).find(".index_focus_pre,.index_focus_next").stop(true, true).fadeTo("show", 1)
        }, function () {
            $(this).find(".index_focus_pre,.index_focus_next").fadeOut()
        });

        $(".index_focus").slide({
            titCell: ".slide_nav a ",
            mainCell: ".bd ul",
            delayTime: 500,
            interTime: 3500,
            prevCell: ".index_focus_pre",
            nextCell: ".index_focus_next",
            effect: "fold",
            autoPlay: true,
            trigger: "click",
            startFun: function (i) {
                $(".index_focus_info").eq(i).find("h3").css("display", "block").fadeTo(1000, 1);
                $(".index_focus_info").eq(i).find(".text").css("display", "block").fadeTo(1000, 1);
            }
        });

    });
</script>
<script type="text/javascript" src="/out/js/haibao_late.js"></script>

</body>
</html>