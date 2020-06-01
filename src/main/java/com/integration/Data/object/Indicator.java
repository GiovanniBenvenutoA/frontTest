package com.integration.Data.object;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.awt.List;
import java.util.LinkedHashMap;

@JsonIgnoreProperties
public class Indicator {
	
	private String key;
	private String Name;
	private String unit;
	private LinkedHashMap<String,Float> values;
	
	
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

	/*
	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	 */
	public LinkedHashMap<String, Float> getValues() {
		return values;
	}

	public void setValues(LinkedHashMap<String, Float> values) {
		this.values = values;
	}

}
