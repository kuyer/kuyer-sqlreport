package io.github.kuyer.sqlreport.service.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import io.github.kuyer.sqlreport.service.entity.ReportEntity;

/**
 * 报表数据操作接口
 * @author rory.zhang
 */
public interface ReportRepository extends ElasticsearchRepository<ReportEntity, String> {

}
