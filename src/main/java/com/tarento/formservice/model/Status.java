package com.tarento.formservice.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Status {
	DRAFT("Draft"), NEW("New"), REVIEW("Review"), PUBLISH("Publish"), UNPUBLISH("Unpublish"), INSCOMPLETED(
			"INSCOMPLETED"), LEADINSCOMPLETED("LEADINSCOMPLETED"), SENTFORINS("SENTFORINS");

	private String value;

	Status(final String value) {
		this.value = value;
	}

	@JsonValue
	@Override
	public String toString() {
		return value;
	}

	public static Status Status(String passedValue) {
		for (final Status obj : Status.values())
			if (String.valueOf(obj.value).equalsIgnoreCase(passedValue))
				return obj;
		return null;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
