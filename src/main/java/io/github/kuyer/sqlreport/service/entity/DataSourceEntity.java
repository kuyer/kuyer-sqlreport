package io.github.kuyer.sqlreport.service.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldIndex;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * 数据源实体类
 * @author rory.zhang
 */
@Document(indexName="sqlreport", type="datasource")
public class DataSourceEntity {
	
	/** ID **/
	@Id
	@Field(type=FieldType.String, store=true)
	private String id;
	/** 数据源名称 **/
	@Field(type=FieldType.String, store=true)
	private String name;
	/** 数据源类型 **/
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)
	private String type;
	/** 驱动类 **/
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)
	private String driverClass;
	/** JDBC连接地址 **/
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)
	private String jdbcUrl;
	/** 数据库登录名 **/
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)
	private String username;
	/** 数据库密码 **/
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)
	private String password;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDriverClass() {
		return driverClass;
	}
	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}
	public String getJdbcUrl() {
		return jdbcUrl;
	}
	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
		return "{\"id\":\"" + id + "\",\"name\":\"" + name + "\",\"type\":\"" + type + "\",\"driverClass\":\""
				+ driverClass + "\",\"jdbcUrl\":\"" + jdbcUrl + "\",\"username\":\"" + username + "\",\"password\":\""
				+ password + "\",\"created\":\"" + created + "\",\"updated\":\"" + updated + "\"}";
	}

}
