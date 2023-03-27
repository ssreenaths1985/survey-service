package com.tarento.formservice.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Darshan Nagesh
 *
 */
@Getter
@Setter
public class SearchObject {

	private String key;
	private Object values;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public Object getValues() {
		return values;
	}
	public void setValues(Object values) {
		this.values = values;
	}

}
