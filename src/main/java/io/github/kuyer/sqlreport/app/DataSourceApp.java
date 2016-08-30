package io.github.kuyer.sqlreport.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.github.kuyer.common.Lists;
import io.github.kuyer.common.model.Bases;
import io.github.kuyer.common.model.Results;
import io.github.kuyer.sqlreport.api.DataSourceApi;
import io.github.kuyer.sqlreport.api.model.DataSourceMdl;

@RestController
@RequestMapping("/datasource")
public class DataSourceApp {
	
	@Autowired
	private DataSourceApi dataSourceApi;
	
	/**
	 * 保存数据源操作
	 * @return
	 */
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public Results<DataSourceMdl> save(@ModelAttribute DataSourceMdl dataSource) {
		return null;
	}
	
	/**
	 * 删除数据源操作
	 * @return
	 */
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public Results<Bases> delete(@RequestParam(value="ids", required=false, defaultValue="") String ids) {
		List<String> idx = Lists.toStringArray(ids);
		if(idx.size() == 0) {
			return null;
		}
		return null;
	}

}
