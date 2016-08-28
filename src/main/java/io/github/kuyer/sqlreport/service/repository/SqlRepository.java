package io.github.kuyer.sqlreport.service.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import io.github.kuyer.sqlreport.service.entity.SqlEntity;

/**
 * SQL数据操作接口
 * @author rory.zhang
 */
public interface SqlRepository extends ElasticsearchRepository<SqlEntity, String> {

}
