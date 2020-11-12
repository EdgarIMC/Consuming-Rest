package com.millan.rest.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Rating {
	@JsonProperty("Source")
	private String source;
	@JsonProperty("Value")
	private String value;

	
	public Rating() {
	}


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}


	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}


	@Override
	public String toString() {
		return "Rating [source=" + source + ", value=" + value + "]";
	}

	
	
}
