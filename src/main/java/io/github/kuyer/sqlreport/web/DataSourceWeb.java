package io.github.kuyer.sqlreport.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import io.github.kuyer.common.Strings;
import io.github.kuyer.sqlreport.service.DataSourceService;
import io.github.kuyer.sqlreport.service.entity.DataSourceEntity;

/**
 * 数据源界面
 * @author rory.zhang
 */
@Controller
@RequestMapping("/datasource")
public class DataSourceWeb {
	
	@Autowired
	private DataSourceService dataSourceService;
	
	/**
	 * 数据源列表界面
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET)
	public String list(@RequestParam(value="id", required=false, defaultValue="") String id, 
			@RequestParam(value="name", required=false, defaultValue="") String name, 
			@RequestParam(value="type", required=false, defaultValue="") String type, Model model) {
		return "datasource/datasource-list";
	}
	
	/**
	 * 编辑数据源界面
	 * @return
	 */
	@RequestMapping(value="/edit", method=RequestMethod.GET)
	public String edit(@RequestParam(value="id", required=false, defaultValue="") String id, Model model) {
		DataSourceEntity datasource = null;
		if(Strings.isNotEmpty(id)) {
			datasource = dataSourceService.getDataSourceById(Strings.getString(id));
		}
		if(null == datasource) {
			datasource = new DataSourceEntity();
		}
		model.addAttribute("datasource", datasource);
		return "datasource/datasource-edit";
	}

}
