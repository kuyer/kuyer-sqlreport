package io.github.kuyer.sqlreport.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 数据源界面
 * @author rory.zhang
 */
@Controller
@RequestMapping("/datasource")
public class DataSourceWeb {
	
	/**
	 * 数据源列表界面
	 * @return
	 */
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String list() {
		return "datasource/datasource-list";
	}

}
