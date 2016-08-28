package io.github.kuyer.sqlreport.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/datasource")
public class DataSourceApp {
	
	/**
	 * 保存数据源操作
	 * @return
	 */
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String save() {
		return null;
	}
	
	/**
	 * 删除数据源操作
	 * @return
	 */
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public String delete(@RequestParam(value="ids", required=false, defaultValue="") String ids) {
		return null;
	}

}
