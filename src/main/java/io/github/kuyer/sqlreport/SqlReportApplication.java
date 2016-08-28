package io.github.kuyer.sqlreport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

/**
 * SqlReport服务启动
 * @author rory.zhang
 */
@SpringBootApplication
@ComponentScan(basePackages="io.github.kuyer.sqlreport")
@EnableElasticsearchRepositories(basePackages="io.github.kuyer.sqlreport.service.repository")
public class SqlReportApplication {

	public static void main(String[] args) {
		SpringApplication.run(SqlReportApplication.class, args);
	}

}
