<#-- 
url: /datasource/edit
path: /datasource/datasource-edit.ftl
remark: 添加/修改数据源配置
-->
<#assign body>
<div class="view mainer">
	<div class="wrap cleax">
		<div class="box bottom">
			<div class="box-right"><a href="javascript:window.history.go(-1);">返回</a></div>
			<span class="name">添加/修改数据源配置</span>
			<div class="line"></div>
			<div class="row"></div>
			<form method="post" action="<@s.url '/datasource/save' />" onsubmit="return false;">
			<table class="form">
				<tr>
					<td width="20%" class="label">数据源名称</td>
					<td width="80%"><input type="text" class="edt" /></td>
				</tr>
				<tr>
					<td class="label">数据源类型</td>
					<td><input type="text" class="edt" /></td>
				</tr>
				<tr>
					<td class="label">驱动类</td>
					<td><input type="text" class="edt" /></td>
				</tr>
				<tr>
					<td class="label">JDBC连接地址</td>
					<td><input type="text" class="edt" /></td>
				</tr>
				<tr>
					<td class="label">登录名</td>
					<td><input type="text" class="edt" /></td>
				</tr>
				<tr>
					<td class="label">密码</td>
					<td><input type="text" class="edt" /></td>
				</tr>
			</table>
			<div class="row"></div>
			<div class="row"></div>
			<div class="center">
				<input type="submit" class="btn btn-pri fill" value="保存" />
				<input type="button" class="btn" value="测试连接" />
			</div>
			</form>
		</div>
	</div>
</div>
</#assign>
<#assign ptitle="添加/修改数据源配置 - 枯叶数据报表" />
<#assign hitem="datasource" />
<#include "/common/sqlreport-layout.ftl" />