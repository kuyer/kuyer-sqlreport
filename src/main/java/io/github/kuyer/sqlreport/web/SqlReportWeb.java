package io.github.kuyer.sqlreport.web;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * SqlReport首页
 * @author rory.zhang
 */
@Controller
public class SqlReportWeb implements ErrorController {
	
	/**
	 * SqlReport首页界面
	 * @return
	 */
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index() {
		return "sqlreport-index";
	}
	
	/**
	 * 错误界面
	 * @return
	 */
	@RequestMapping(value="/error")
	public String error() {
		return "sqlreport-error";
	}

	@Override
	public String getErrorPath() {
		return "/error";
	}

}
