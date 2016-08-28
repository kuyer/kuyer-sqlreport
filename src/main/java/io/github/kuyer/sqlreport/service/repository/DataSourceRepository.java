package io.github.kuyer.sqlreport.service.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import io.github.kuyer.sqlreport.service.entity.DataSourceEntity;

/**
 * 数据源数据操作接口
 * @author rory.zhang
 */
public interface DataSourceRepository extends ElasticsearchRepository<DataSourceEntity, String> {

}
