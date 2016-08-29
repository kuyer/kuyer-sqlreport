package io.github.kuyer.sqlreport.service.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldIndex;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * SQL实体类
 * @author rory.zhang
 */
@Document(indexName="sqlreport", type="sql")
public class SqlEntity {
	
	/** ID **/
	@Id
	@Field(type=FieldType.String, store=true)
	private String id;
	/** 名称 **/
	@Field(type=FieldType.String, store=true)
	private String name;
	/** 数据源ID **/
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)
	private String dataSourceId;
	/** SQL语句 **/
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)
	private String sqlcontent;
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
	public String getDataSourceId() {
		return dataSourceId;
	}
	public void setDataSourceId(String dataSourceId) {
		this.dataSourceId = dataSourceId;
	}
	public String getSqlcontent() {
		return sqlcontent;
	}
	public void setSqlcontent(String sqlcontent) {
		this.sqlcontent = sqlcontent;
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
		return "SqlEntity [id=" + id + ", name=" + name + ", dataSourceId=" + dataSourceId + ", sqlcontent="
				+ sqlcontent + ", created=" + created + ", updated=" + updated + "]";
	}

}
