package com.tarento.formservice.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IncomingData {

	private Long id;
	private Long formId;
	private String title;
	private String applicationId;
	private String recordId;
	private int version;
	private Long timestamp;
	private Object dataObject;
	private Object inspectorDataObject;
	private Object inspectorSummaryDataObject;
	private String formData;
	private String status;
	private String notes;
	private List<Object> comments;
	private AssignApplication inspection;

	private String createdBy;
	private String createdDate;
	private String updatedBy;
	private String updatedDate;
	private Long reviewedBy;
	private String reviewedDate;
	private String inspectionDate;
	private String inspectionCompletedDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getFormId() {
		return formId;
	}
	public void setFormId(Long formId) {
		this.formId = formId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}
	public String getRecordId() {
		return recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public Long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	public Object getDataObject() {
		return dataObject;
	}
	public void setDataObject(Object dataObject) {
		this.dataObject = dataObject;
	}
	public Object getInspectorDataObject() {
		return inspectorDataObject;
	}
	public void setInspectorDataObject(Object inspectorDataObject) {
		this.inspectorDataObject = inspectorDataObject;
	}
	public Object getInspectorSummaryDataObject() {
		return inspectorSummaryDataObject;
	}
	public void setInspectorSummaryDataObject(Object inspectorSummaryDataObject) {
		this.inspectorSummaryDataObject = inspectorSummaryDataObject;
	}
	public String getFormData() {
		return formData;
	}
	public void setFormData(String formData) {
		this.formData = formData;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public List<Object> getComments() {
		return comments;
	}
	public void setComments(List<Object> comments) {
		this.comments = comments;
	}
	public AssignApplication getInspection() {
		return inspection;
	}
	public void setInspection(AssignApplication inspection) {
		this.inspection = inspection;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}
	public Long getReviewedBy() {
		return reviewedBy;
	}
	public void setReviewedBy(Long reviewedBy) {
		this.reviewedBy = reviewedBy;
	}
	public String getReviewedDate() {
		return reviewedDate;
	}
	public void setReviewedDate(String reviewedDate) {
		this.reviewedDate = reviewedDate;
	}
	public String getInspectionDate() {
		return inspectionDate;
	}
	public void setInspectionDate(String inspectionDate) {
		this.inspectionDate = inspectionDate;
	}
	public String getInspectionCompletedDate() {
		return inspectionCompletedDate;
	}
	public void setInspectionCompletedDate(String inspectionCompletedDate) {
		this.inspectionCompletedDate = inspectionCompletedDate;
	}

	
}
