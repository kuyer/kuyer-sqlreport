package io.github.kuyer.sqlreport.service.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import io.github.kuyer.sqlreport.service.entity.TaskEntity;

/**
 * 任务数据操作接口
 * @author rory.zhang
 */
public interface TaskRepository extends ElasticsearchRepository<TaskEntity, String> {

}
