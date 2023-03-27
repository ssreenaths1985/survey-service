package com.tarento.formservice.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class KeyValue {

	private String key;
	private Object value;

	public KeyValue() {
	}

	public KeyValue(String key, Object value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

}
