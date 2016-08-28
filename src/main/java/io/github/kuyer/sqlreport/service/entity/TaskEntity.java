package io.github.kuyer.sqlreport.service.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldIndex;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * 任务实体类
 * @author rory.zhang
 */
@Document(indexName="sqlreport", type="task")
public class TaskEntity {
	
	/** 任务ID **/
	@Id
	@Field(type=FieldType.String, store=true)
	private String id;
	/** 报表ID **/
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)
	private String reportId;
	/** 开始运行时间 **/
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)
	private Long started;
	/** 运行完成时间 **/
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)
	private Long finished;
	/** 任务状态 0未开始 1运行中 2运行成功 3运行失败 **/
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)
	private String status;
	/** 运行信息 **/
	@Field(type=FieldType.String, store=true)
	private String message;
	/** 邮件主题 **/
	@Field(type=FieldType.String, store=true)
	private String subject;
	/** 邮件内容 **/
	@Field(type=FieldType.String, store=true)
	private String content;
	/** 邮件地址，多个邮件以“,”分隔 **/
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)
	private List<String> emails;
	/** 附件ID **/
	@Field(type=FieldType.String, index=FieldIndex.not_analyzed, store=true)
	private List<String> fileIds;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getReportId() {
		return reportId;
	}
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}
	public Long getStarted() {
		return started;
	}
	public void setStarted(Long started) {
		this.started = started;
	}
	public Long getFinished() {
		return finished;
	}
	public void setFinished(Long finished) {
		this.finished = finished;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public List<String> getEmails() {
		return emails;
	}
	public void setEmails(List<String> emails) {
		this.emails = emails;
	}
	public List<String> getFileIds() {
		return fileIds;
	}
	public void setFileIds(List<String> fileIds) {
		this.fileIds = fileIds;
	}
	
	@Override
	public String toString() {
		return "{\"id\":\"" + id + "\",\"reportId\":\"" + reportId + "\",\"started\":\"" + started
				+ "\",\"finished\":\"" + finished + "\",\"status\":\"" + status + "\",\"message\":\"" + message
				+ "\",\"subject\":\"" + subject + "\",\"content\":\"" + content + "\",\"emails\":\"" + emails
				+ "\",\"fileIds\":\"" + fileIds + "\"}";
	}

}
