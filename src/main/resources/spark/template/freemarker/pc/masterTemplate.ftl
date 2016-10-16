<#macro htmlHead title charset="utf-8" lang="zh-CN">
	<!DOCTYPE html
            PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
            "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	<html>
		<head>
			<title>北京美立特图文制作有限公司</title>
			<meta name="keywords" content="北京美立特图文制作有限公司" />
			<meta name="description" content="北京美立特图文制作有限公司"/>
			<meta name="copyright" content="北京美立特图文制作有限公司"/>
			<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0" />
			<meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />
			<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
			<!--[if lt IE 9]>
  			<script src="http://apps.bdimg.com/libs/html5shiv/3.7/html5shiv.min.js"></script>
  			<script src="http://apps.bdimg.com/libs/respond.js/1.4.2/respond.min.js"></script>
			<![endif]-->

            <link href="/Public/home/images/favicon.ico" rel="shortcut icon" type="image/x-icon" />
            <script src="/Public/wap/js/is_wap.js" type="text/javascript"></script>
            <script type="text/javascript">uaredirect("http://www.dytw.net/wap");</script>
            <link rel="stylesheet" href="/Public/home/css/index.css" />
            <script type="text/javascript" src="/Public/home/js/jquery-1.7.2.min.js"></script>
            <script type="text/javascript" src="/Public/home/js/jquery.SuperSlide.js"></script>
            <script type="text/javascript" src="/Public/home/js/script.js"></script>

			<#nested>
			<script>
				$(function() {
					$("#main-menu").pin({minWidth: 768});
				});
			</script>
		</head>
</#macro>


<#macro htmlBody>
	<body>
	<#--logo-->
		<div class="container">
		<div class="row">
			<div class="col-lg-12 thumbnail" style="border: 0;">
				<img alt="" src="/images/logo.jpg">
			</div>
		</div>
	</div>
		<#--导航-->
		<nav id="main-nav" role="navigation">
			<ul id="main-menu" class="sm sm-blue">
				<li><a href="/">首页</a></li>
				<li ><a href="#">服务项目</a>
					<ul>
						<li><a href="/fwxm/cysj">创意设计</a></li>
						<li><a href="#">数码印刷</a></li>
						<li><a href="jgdy">激光打印</a></li>
						<li><a href="/fwxm/gszd">各式装订</a>
							<ul>
								<li><a>豪华精装</a></li>
								<li><a>水晶装订</a></li>
								<li><a>无线胶装</a></li>
								<li><a>铁环装订</a></li>
								<li><a>文件夹</a></li>
								<li><a>塑环装订</a></li>
								<li><a>维乐装订</a></li>
								<li><a>夹条装订</a></li>
								<li><a>蝶式装</a></li>
								<li><a>骑马订</a></li>
							</ul></li>
						<li><a tabindex="0">喷绘大图</a></li>
						<li><a tabindex="0">胶版印刷</a></li>
						<li><a tabindex="0">24小时</a></li>
						<li><a tabindex="0">取送服务</a></li>
						<li><a tabindex="0">会员服务</a></li>
						<li><a tabindex="0">现场办公</a></li>
						<li><a tabindex="0">网络下单</a></li>
					</ul></li>

				<li><a href="#" tabindex="0">产品列表</a>
					<ul>
						<li><a href="/cplb/scbmyp" tabindex="0">市场部门用品</a>
						<ul>
							<li><a href="#" tabindex="0">VI手册</a>
							<li><a href="#" tabindex="0">策划方案</a>
							<li><a href="#" tabindex="0">促销信息</a>
							<li><a href="#" tabindex="0">企业简介</a>
							<li><a href="#" tabindex="0">宣传封套</a>
							<li><a href="#" tabindex="0">宣传单页</a>
							<li><a href="#" tabindex="0">样刊画册</a>
							<li><a href="#" tabindex="0">手提袋</a>
							<li><a href="#" tabindex="0">直邮商函</a>
							<li><a href="#" tabindex="0">优惠券</a>
							<li><a href="#" tabindex="0">简报资料</a>
							<li><a href="#" tabindex="0">条形码</a>
							<li><a href="#" tabindex="0">招贴海报</a>
							<li><a href="#" tabindex="0">展板</a>
							<li><a href="#" tabindex="0">X展架</a>
							<li><a href="#" tabindex="0">易拉宝</a>
							<li><a href="#" tabindex="0">挂画</a>
							<li><a href="#" tabindex="0">门型展架</a>
							<li><a href="#" tabindex="0">拉网展架</a>
							<li><a href="#" tabindex="0">舞台桁架</a>
							<li><a href="#" tabindex="0">门票</a>
							<li><a href="#" tabindex="0">广告笔</a>
							<li><a href="#" tabindex="0">无纺布袋</a>
							<li><a href="#" tabindex="0">参观证</a>
							<li><a href="#" tabindex="0">各种贴纸</a>
							<li><a href="#" tabindex="0">签到簿/墙</a>
							<li><a href="#" tabindex="0">绶带</a>
						</ul></li>
						<li><a href="#" tabindex="0">销售部门用品</a>
						<ul>
							<li><a href="#" tabindex="0">招投标书</a>
							<li><a href="#" tabindex="0">可研报告</a>
							<li><a href="#" tabindex="0">演示文稿</a>
							<li><a href="#" tabindex="0">促销计划</a>
							<li><a href="#" tabindex="0">销售合同</a>
							<li><a href="#" tabindex="0">产品目录</a>
							<li><a href="#" tabindex="0">说明书</a>
							<li><a href="#" tabindex="0">邀请函</a>
							<li><a href="#" tabindex="0">会场留念</a>
							<li><a href="#" tabindex="0">可变数据</a>
							<li><a href="#" tabindex="0">商务红包</a>
							<li><a href="#" tabindex="0">光盘刻录</a>
						</ul></li>
						<li><a href="#" tabindex="0">技术部门用品</a>
						<ul>
							<li><a href="#" tabindex="0">工程图纸</a>
							<li><a href="#" tabindex="0">大图复印</a>
							<li><a href="#" tabindex="0">技术资料</a>
							<li><a href="#" tabindex="0">蓝图制作</a>
							<li><a href="#" tabindex="0">施工方案</a>
							<li><a href="#" tabindex="0">效果图</a>
							<li><a href="#" tabindex="0">技术文件夹</a>
						</ul></li>
						<li><a href="#" tabindex="0">人事部门用品</a>
						<ul>
							<li><a href="#" tabindex="0">培训资料</a>
							<li><a href="#" tabindex="0">员工手册</a>
							<li><a href="#" tabindex="0">劳动合同</a>
							<li><a href="#" tabindex="0">奖状</a>
							<li><a href="#" tabindex="0">证书</a>
							<li><a href="#" tabindex="0">通讯录</a>
							<li><a href="#" tabindex="0">奖杯</a>
							<li><a href="#" tabindex="0">奖牌</a>
							<li><a href="#" tabindex="0">胸卡</a>
							<li><a href="#" tabindex="0">档案袋</a>
							<li><a href="#" tabindex="0">工作证</a>
							<li><a href="#" tabindex="0">聘书</a>
							<li><a href="#" tabindex="0">抽奖箱</a>
							<li><a href="#" tabindex="0">工作月历</a>
							<li><a href="#" tabindex="0">工位牌</a>
						</ul></li>
						<li><a href="#" tabindex="0">行政部门用品</a>
						<ul>
							<li><a href="#" tabindex="0">数码名片</a>
							<li><a href="#" tabindex="0">拼版名片</a>
							<li><a href="#" tabindex="0">特色名片</a>
							<li><a href="#" tabindex="0">信封</a>
							<li><a href="#" tabindex="0">信纸</a>
							<li><a href="#" tabindex="0">桌牌</a>
							<li><a href="#" tabindex="0">红头文件</a>
							<li><a href="#" tabindex="0">备忘录</a>
							<li><a href="#" tabindex="0">POLO衫</a>
							<li><a href="#" tabindex="0">工装西服</a>
							<li><a href="#" tabindex="0">条幅</a>
							<li><a href="#" tabindex="0">锦旗</a>
							<li><a href="#" tabindex="0">铜牌</a>
							<li><a href="#" tabindex="0">纸杯</a>
							<li><a href="#" tabindex="0">纸抽</a>
							<li><a href="#" tabindex="0">便签</a>
							<li><a href="#" tabindex="0">笔记本</a>
							<li><a href="#" tabindex="0">徽章</a>
							<li><a href="#" tabindex="0">腰线</a>
							<li><a href="#" tabindex="0">领带</a>
							<li><a href="#" tabindex="0">毛巾</a>
							<li><a href="#" tabindex="0">帽子</a>
							<li><a href="#" tabindex="0">T恤</a>
							<li><a href="#" tabindex="0">LOGO墙</a>
							<li><a href="#" tabindex="0">导视牌</a>
							<li><a href="#" tabindex="0">停车证</a>
							<li><a href="#" tabindex="0">扑克</a>
						</ul></li>
						<li><a href="#" tabindex="0">财务部门用品</a>
						<ul>
							<li><a href="#" tabindex="0">企业年报</a>
							<li><a href="#" tabindex="0">原始凭证</a>
							<li><a href="#" tabindex="0">表格报表</a>
							<li><a href="#" tabindex="0">账单</a>
							<li><a href="#" tabindex="0">单据</a>
						</ul></li>
						<li><a href="#" tabindex="0">其他用品</a>
						<ul>
							<li><a href="#" tabindex="0">	个人简历	</a>
							<li><a href="#" tabindex="0">	入学简历	</a>
							<li><a href="#" tabindex="0">	同学录	</a>
							<li><a href="#" tabindex="0">	纪念册	</a>
							<li><a href="#" tabindex="0">	旅行游记	</a>
							<li><a href="#" tabindex="0">	个性贺卡	</a>
							<li><a href="#" tabindex="0">	结婚请柬	</a>
							<li><a href="#" tabindex="0">	台历	</a>
							<li><a href="#" tabindex="0">	挂历	</a>
							<li><a href="#" tabindex="0">	菜谱酒单	</a>
							<li><a href="#" tabindex="0">	会员卡	</a>
							<li><a href="#" tabindex="0">	鼠标垫	</a>
							<li><a href="#" tabindex="0">	礼品套装	</a>
							<li><a href="#" tabindex="0">	吊旗	</a>
							<li><a href="#" tabindex="0">	国标彩旗	</a>
							<li><a href="#" tabindex="0">	注水刀旗	</a>
							<li><a href="#" tabindex="0">	灯箱	</a>
							<li><a href="#" tabindex="0">	扇子	</a>
							<li><a href="#" tabindex="0">	雨伞	</a>
							<li><a href="#" tabindex="0">	气球	</a>
							<li><a href="#" tabindex="0">	充电宝	</a>
							<li><a href="#" tabindex="0">	手机壳	</a>
							<li><a href="#" tabindex="0">	礼品U盘	</a>
							<li><a href="#" tabindex="0">	马克杯	</a>
							<li><a href="#" tabindex="0">	家谱	</a>
							<li><a href="#" tabindex="0">	相册	</a>
							<li><a href="#" tabindex="0">	相框	</a>
						</ul></li>
					</ul></li>

				<li><a href="#" tabindex="0">成功案例</a>
					<ul>
						<li><a href="/cgal/zcfw" tabindex="0">驻场服务案例</a></li>
						<li><a href="#" tabindex="0">现场服务案例</a></li>
						<li><a href="#" tabindex="0">扫描归档案例</a></li>
						<li><a href="#" tabindex="0">奥运场馆文件制作案例</a></li>
						<li><a href="#" tabindex="0">大型周年庆案例</a></li>
						<li><a href="#" tabindex="0">大型活动组织案例</a></li>

					</ul></li>

				<li><a href="/fwwl" tabindex="0">服务网络</a>
					<ul>
						<li><a href="#" tabindex="0">三元桥店</a></li>
						<li><a href="#" tabindex="0">上地店</a></li>
						<li><a href="#" tabindex="0">国贸店</a></li>
						<li><a href="#" tabindex="0">永丰店</a></li>
						<li><a href="#" tabindex="0">安贞店</a></li>
						<li><a href="#" tabindex="0">华为文印中心</a></li>
						<li><a href="#" tabindex="0">广联达文印中心</a></li>
						<li><a href="#" tabindex="0">广利核印中心</a></li>
					</ul></li>
				<li><a href="#" tabindex="0">关于我们</a>
					<ul>
						<li><a href="/gywm/gsjj" tabindex="0">公司简介</a></li>
						<li><a href="#" tabindex="0">企业宗旨</a></li>
						<li><a href="#" tabindex="0">经营理念</a></li>
						<li><a href="#" tabindex="0">企业新闻</a></li>
						<li><a href="#" tabindex="0">联系我们</a></li>
						<li><a href="#" tabindex="0">门店风采</a></li>
						<li><a href="#" tabindex="0">公司活动</a></li>
					</ul></li>

			</ul>
	</nav>
		<#nested>
		
		
		<#--页脚-->
	<div class="container-fluid content-foot">
		<div class="row">
			<div class="container">
				<div class="row">
					<div class="col-xs-2"></div>
					<div class="col-xs-8 table-responsive">
						<table class="table">
							<thead>
								<tr>
									<td><img src="/images/index-l-f-1.jpg" class="img-polaroid"/></td>
									<td><img src="/images/index-l-f-2.jpg" class="img-polaroid"/></td>
									<td><img src="/images/index-l-f-3.jpg" class="img-polaroid"/></td>
									<td><img src="/images/index-l-f-4.jpg" class="img-polaroid"/></td>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>关于我们</td>
									<td>客户服务</td>
									<td>成功案例</td>
									<td>企业新闻</td>
								</tr>
								<tr>
									<td>企业宗旨</td>
									<td>格式装订</td>
									<td>驻场服务</td>
									<td>门店丰采</td>
								</tr>
								<tr>
									<td>门店活动</td>
									<td>其他用品</td>
									<td>现场服务</td>
									<td>公司活动</td>
								</tr>
							</tbody>
						</table>
					</div>
					<div class="col-xs-2"></div>
				</div>
			</div>
		</div>
	</div>
	
	<#--版权-->
	<div id="" class="">
		<div class="">
			<p class="bq" style="text-align: left;">
				<a href="">联系我们</a>&nbsp;|&nbsp;<a href="">人才招募</a><a href="" style="display:none;">法律公告</a>
			</p>
			<p style="text-align: left;">
				版权所有 北京美立特有限公司 
				<a href="">京CP100034678</a>
			</p>
		</div>
	</div> 
	</body>
	</html>
</#macro>