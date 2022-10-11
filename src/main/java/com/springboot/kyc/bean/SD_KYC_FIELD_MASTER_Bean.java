package com.springboot.kyc.bean;


import java.util.List;

public class SD_KYC_FIELD_MASTER_Bean {
	
	private Integer id;
	private String name;
	private Integer fieldType;
	private Integer tagType;
	private String dropdown;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getFieldType() {
		return fieldType;
	}
	public void setFieldType(Integer fieldType) {
		this.fieldType = fieldType;
	}
	public Integer getTagType() {
		return tagType;
	}
	public void setTagType(Integer tagType) {
		this.tagType = tagType;
	}
	public String getDropdown() {
		return dropdown;
	}
	public void setDropdown(String dropdown) {
		this.dropdown = dropdown;
	}
	
	public SD_KYC_FIELD_MASTER_Bean(Integer id, String name, Integer fieldType, Integer tagType,
			String dropdown) {
		super();
		this.id = id;
		this.name = name;
		this.fieldType = fieldType;
		this.tagType = tagType;
		this.dropdown = dropdown;
	}
	public SD_KYC_FIELD_MASTER_Bean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
