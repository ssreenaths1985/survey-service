package com.tarento.formservice.model;

import org.apache.commons.lang.builder.ToStringBuilder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Result {

	private StatusInfo statusInfo;
	private ResponseData responseData;

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("statusInfo", statusInfo).append("responseData", responseData)
				.toString();
	}

	public StatusInfo getStatusInfo() {
		return statusInfo;
	}

	public void setStatusInfo(StatusInfo statusInfo) {
		this.statusInfo = statusInfo;
	}

	public ResponseData getResponseData() {
		return responseData;
	}

	public void setResponseData(ResponseData responseData) {
		this.responseData = responseData;
	}

}