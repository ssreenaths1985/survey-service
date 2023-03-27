package com.tarento.formservice.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.ToString;

@ToString(includeFieldNames = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "updatedDate", "fields", "inspectionFields" })
public class FormDetail extends Form {

	@JsonProperty("updatedDate")
	private Long updatedDate;
	@JsonProperty("fields")
	private List<Field> fields = null;
	@JsonProperty("mandatoryFields")
	private List<Field> mandatoryFields = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private Long updatedBy;

	@JsonProperty("updatedDate")
	public Long getUpdatedDate() {
		return updatedDate;
	}

	@JsonProperty("updatedDate")
	public void setUpdatedDate(Long updatedDate) {
		this.updatedDate = updatedDate;
	}

	@JsonProperty("fields")
	public List<Field> getFields() {
		return fields;
	}

	@JsonProperty("fields")
	public void setFields(List<Field> fields) {
		this.fields = fields;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@JsonProperty("mandatoryFields")
	public List<Field> getMandatoryFields() {
		return mandatoryFields;
	}

	@JsonProperty("mandatoryFields")
	public void setMandatoryFields(List<Field> mandatoryFields) {
		this.mandatoryFields = mandatoryFields;
	}

	public Long getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}
	
	

}
