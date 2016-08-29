<#-- 
url: /
path: /sqlreport/sqlreport-error.ftl
remark: 枯叶配置中心失败页面
-->
<#assign body>
<div class="view mainer">
	<div class="wrap cleax">
		<div class="box bottom center">
			<#list 1..18 as i>
			<div class="row"></div>
			</#list>
			<div class="center h2">小枯很遗憾，这个页面丢了 ......</div>
			<#list 1..28 as i>
			<div class="row"></div>
			</#list>
		</div>
	</div>
</div>
</#assign>
<#include "/common/sqlreport-layout.ftl" />