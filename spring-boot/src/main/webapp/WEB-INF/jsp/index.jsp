<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" href="${ctx}/css/index/base.css">
<link rel="stylesheet" href="${ctx}/css/index/main.css">
<link rel="stylesheet" href="${ctx}/css/index/vendor.css">
<style type="text/css" media="screen">
#styles {
	background: white;
	padding-top: 12rem;
	padding-bottom: 12rem;
}
</style>

<script src="${ctx}/js/index/modernizr.js"></script>

<link rel="icon" type="image/png" href="${ctx}/img/index/favicon.png">

<title>首页</title>
</head>
<body>
	<header>
		<!-- 页面固定的首页菜单 -->
		<div class="row">

			<div class="logo">
				<a href="index.html"></a>
			</div>

			<nav id="main-nav-wrap">
				<ul class="main-navigation">
					<li><a href="#intro">首页</a></li>
					<li><a href="#styles">简介</a></li>
					<li class="highlight with-sep"><a href="">登录</a></li>
				</ul>
			</nav>
		</div>

	</header>

	<section id="intro">

		<div class="intro-content">
			<div class="row">

				<div class="col-twelve">
					<h5>欢迎使用鹿山学生管理系统</h5>
					<br />
					<h1>笃志勤学，知行合一</h1>
					<a class="button stroke smoothscroll" href="">开始使用</a>
				</div>

			</div>
		</div>

	</section>

	<section id="styles">

		<div class="row">

			<div class="col-twelve tab-full">

				<h1>简介</h1>

				<p class="lead">广西科技大学鹿山学院创建于2002年，是一所由柳州市人民政府和广西科技大学合办、经国家教育部批准实施本科学历教育的高等学校。</p>
				<p class="lead">学院位于广西工业重镇、历史文化名城柳州市，校园占地面积近1000亩，总投资8.3亿元人民币，总建筑面积35万平方米。学院拥有配套设施先进的教学与实验实训楼群，有现代制造、车辆结构、过程控制、定格动画等100多个实验室，图书馆纸质藏书93万册。学院为学生寝室安装了空调，2017年9月已全部投入使用。学院师资力量雄厚，现有专任教师近600人，其中35%具有高级职称，70%以上具有博士、硕士学位。</p>
			</div>

		</div>

		<div class="row">

			<div class="col-six tab-full">

				<h3>校徽</h3>

				<p>
					<img width="120" height="120" class="pull-left"
						src="${ctx}/img/index/school-badge.jpg">
					校徽的象征意义：<br/>
					1.外观形状：金色边框的盾形象征着庄重、荣耀、高贵与典雅，体现出学校对学生人格塑造的重视。
					2.中心形象：
					（1）像两只紧紧相扣的手，既体现了学校在柳州市政府和广西科技大学的合作与支持下科学发展的实际，又象征了学校一直倡导的“没有完美的个人，只有完美的团队”的合作精神。
					（2）像一个向前跨越的人，富有动感和激情，展现学校积极进取的姿态。
					（3）像一个伏案学习的人，尽显沉稳和持重，展现学校教育治学的严谨。
				</p>
				<p>
					校徽的设计含义：<br/>
					1.校徽颜色以冰蓝色为主，象征理智、冷静、沉稳与广阔，强调科技与效率。
					2.校徽背景散发耀眼的光泽，有强烈的艺术美感和视觉传播力，预示着广西科技大学鹿山学院的璀璨明天。
				</p>


				<!-- 	<p>
					A <a href="#">link</a>, <abbr
						title="this really isn't a very good description">abbrebation</abbr>,
					<strong>strong text</strong>, <em>em text</em>,
					<del>deleted text</del>
					, and
					<mark>this is a mark text.</mark>
					<code>.code</code>
				</p> -->

			</div>

			<div class="col-six tab-full">

				<h3>校训</h3>
				
				<h4>笃志勤学</h4>
				
				<p>
				志向坚定而正确，勤奋苦练得学问。出自明代思想家王守仁《勤学》“已立志为君子，自当从事于学，凡学之不勤，必其志之尚未笃也。
				</p>
				
				<h4>知行合一</h4>

				<p>
				理论学习与实践运用统一，道德修养与科学技术并进。由明代思想家王守仁《传习录》“知之真切笃实处，既是行。行之明觉精察处，即是知。知行工夫，本不可离。只为后世学者分作两截用功，先却知、行本体，故有合一并进之说，真知即所以为行，不行不足谓之知。
				</p>

			</div>

		</div>

		<div class="row">

			<div class="col-six tab-full">

				<h3>荣誉称号</h3>
				<ul class="disc">
					<li>“中国民办高等教育优秀院校”</li>
					<li>“全国高校后勤十年社会化改革先进院校”</li>
					<li>广西壮族自治区“安全文明校园”</li>
					<li>“普通高等学校毕业生就业工作先进集体”</li>
					<li>柳州市“优美校园”</li>
					<li>“园林式单位”</li>
				</ul>
			</div>

			<div class="col-six tab-full">

				<h3>校训出处</h3>

				<blockquote>
					<p>已立志为君子，自当从事于学，凡学之不勤，必其志之尚未笃也</p>
					<cite>王守仁《勤学》</cite>
				</blockquote>

				<blockquote>
					<p>知之真切笃实处，既是行。行之明觉精察处，即是知。知行工夫，本不可离。只为后世学者分作两截用功，先却知</p><p>行本体，故有合一并进之说，真知即所以为行，不行不足谓之知。</p>
					<cite>王守仁《传习录》</cite>
				</blockquote>

			</div>

		</div>
 
		<%-- <div class="row half-bottom">

			<div class="col-six tab-full">

				<h3>Responsive Image</h3>

				<p>
					<img src="${ctx}/img/index/post-thumb-1.jpg">
				</p>

			</div>

			<div class="col-six tab-full">

				<h3>Responsive video</h3>

				<div class="fluid-video-wrapper">
					<!-- <iframe
					src="http://player.vimeo.com/video/14592941?title=0&amp;byline=0&amp;portrait=0&amp;color=F64B39"
					width="500" height="281" frameborder="0" webkitallowfullscreen
					mozallowfullscreen allowfullscreen></iframe> -->
				</div>

			</div>

		</div> --%>

	</section>

	<!-- 页脚
   ================================================== -->
	<footer>

		<div class="footer-main">

			<div class="row">

				<div class="col-four tab-full mob-full footer-info">
					<h4>地址</h4>
					<p>
						地址：中国·广西柳州市鱼峰区新柳大道99号<br/>电话号码：0772-3517068
					</p>

				</div>


				<div class="col-two tab-1-3 mob-1-2 social-links">

					<h4>友情链接</h4>

					<ul>
						<li><a href="http://www.lzls.gxut.edu.cn/index.htm" target="_blank">官网</a></li>
						<li><a href="www.baidu.com" target="_blank">百度</a></li>
					</ul>

				</div>

			</div>

		</div>
		<div class="footer-bottom"></div>

	</footer>

	<div id="preloader">
		<div id="loader"></div>
	</div>


</body>
<script src="${ctx}/js/index/plugins.js"></script>
<script src="${ctx}/js/index/main.js"></script>
</html>