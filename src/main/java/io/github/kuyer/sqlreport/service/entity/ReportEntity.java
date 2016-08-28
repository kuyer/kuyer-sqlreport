package io.github.kuyer.sqlreport.service.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldIndex;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * 报表实体类
 * @author rory.zhang
 */
@Document(indexName="sqlreport", type="report")
public class ReportEntity {
	
	/** ID **/
	@Id
	@Field(type=FieldType.String, store=true)
	private String id;
	/** 报表名 **/
	@Field(type=FieldType.String, store=true)
	private String name;
	/** 状态 1启用 0禁用 **/
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)
	private String status;
	/** 运行计划 **/
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)
	private String cron;
	/** SQL语句 **/
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)
	private List<String> sqlIds;
	/** 邮件地址，多个邮件以“,”分隔 **/
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)
	private List<String> emails;
	/** 创建时间 **/
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)
	private Long created;
	/** 修改时间 **/
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)
	private Long updated;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCron() {
		return cron;
	}
	public void setCron(String cron) {
		this.cron = cron;
	}
	public List<String> getSqlIds() {
		return sqlIds;
	}
	public void setSqlIds(List<String> sqlIds) {
		this.sqlIds = sqlIds;
	}
	public List<String> getEmails() {
		return emails;
	}
	public void setEmails(List<String> emails) {
		this.emails = emails;
	}
	public Long getCreated() {
		return created;
	}
	public void setCreated(Long created) {
		this.created = created;
	}
	public Long getUpdated() {
		return updated;
	}
	public void setUpdated(Long updated) {
		this.updated = updated;
	}
	
	@Override
	public String toString() {
		return "{\"id\":\"" + id + "\",\"name\":\"" + name + "\",\"status\":\"" + status + "\",\"cron\":\"" + cron
				+ "\",\"sqlIds\":\"" + sqlIds + "\",\"emails\":\"" + emails + "\",\"created\":\"" + created
				+ "\",\"updated\":\"" + updated + "\"}";
	}

}
