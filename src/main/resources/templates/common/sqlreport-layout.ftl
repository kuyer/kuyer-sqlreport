<#-- 
path: /common/layout.ftl
remark: 布局页面
-->
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no, minimum-scale=1.0" />
<meta charset="utf-8" />
<link rel="shortcut icon" href="<@s.url '/favicon.ico' />" />
<title><#if ptitle?exists>${ptitle}</#if></title>
<link rel="stylesheet" href="<@s.url '/css/sqlreport.css' />" />
<#if styles?exists>
<#list styles as style>
<link type="text/css" rel="stylesheet" href="<@s.url '${style}' />" />
</#list>
</#if>
</head>
<body>
<div class="page">
	<div class="view header">
		<div class="wrap cleax">
			<div class="item"><a href="<@s.url '/' />" class="title">枯叶数据报表</a></div>
			<div class="item"><a href="<@s.url '/' />" class="active"><span>首页</span></a></div>
			<div class="item"><a href="<@s.url '/datasource' />"><span>数据源配置</span></a></div>
			<div class="item"><a href="<@s.url '/sql' />"><span>数据语句配置</span></a></div>
			<div class="item"><a href="<@s.url '/report' />"><span>任务报表配置</span></a></div>
		</div>
	</div>
	${body}
	<div class="view footer">
		<div class="wrap">
			<a href="http://kuyer.github.io/about.html" target="_blank">关于枯叶</a>
			<span class="split">|</span>
			<a href="http://kuyer.github.io/product.html" target="_blank">产品中心</a>
			<span class="split">|</span>
			<a href="http://kuyer.github.io/service.html" target="_blank">服务中心</a>
		</div>
		<div class="wrap">© 枯叶网络工作组 版权所有</div>
	</div>
</div>
<input type="hidden" id="wcontext" value="<@s.url '' />" />
<script type="text/javascript" src="<@s.url '/js/jquery.js' />"></script>
<script type="text/javascript" src="<@s.url '/js/sqlreport.js' />"></script>
<#if scripts?exists>
<#list scripts as script>
<script type="text/javascript" src="<@s.url '${script}' />"></script>
</#list>
</#if>
</body>
</html>