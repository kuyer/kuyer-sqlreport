package io.github.kuyer.sqlreport.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.kuyer.sqlreport.api.DataSourceApi;
import io.github.kuyer.sqlreport.service.entity.DataSourceEntity;
import io.github.kuyer.sqlreport.service.repository.DataSourceRepository;

/**
 * 数据源服务
 * @author rory.zhang
 */
@Service
public class DataSourceService implements DataSourceApi {

	@Autowired
	private DataSourceRepository dataSourceRepository;
	
	public DataSourceEntity getDataSourceById(String id) {
		return dataSourceRepository.findOne(id);
	}

}
