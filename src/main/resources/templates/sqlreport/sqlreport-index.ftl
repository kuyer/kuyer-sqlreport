<#-- 
url: /
path: /sqlreport/sqlreport-index.ftl
remark: 枯叶数据报表首页
-->
<#assign body>
<div class="view mainer">
	<div class="wrap cleax">
		<div class="box bottom">
			<#list 1..18 as i>
			<div class="row"></div>
			</#list>
			<div class="center h1">欢迎来到枯叶数据报表</div>
			<#list 1..28 as i>
			<div class="row"></div>
			</#list>
		</div>
	</div>
</div>
</#assign>
<#assign ptitle="枯叶数据报表" />
<#assign hitem="main" />
<#include "/common/sqlreport-layout.ftl" />