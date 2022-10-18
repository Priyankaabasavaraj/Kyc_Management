package com.springboot.kyc.bean;


import java.util.List;


import com.springboot.kyc.model.SD_KYC_FIELD_TYPES;
import com.springboot.kyc.model.SD_KYC_GROUPS;

public class SD_KYC_FIELD_MASTER_Bean {
	
	private Integer id;
	private String name;
	private SD_KYC_FIELD_TYPES  fieldType;
	private SD_KYC_GROUPS tagType;
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
	
	
	public SD_KYC_FIELD_TYPES getFieldType() {
		return fieldType;
	}
	public void setFieldType(SD_KYC_FIELD_TYPES fieldType) {
		this.fieldType = fieldType;
	}
	public SD_KYC_GROUPS getTagType() {
		return tagType;
	}
	public void setTagType(SD_KYC_GROUPS tagType) {
		this.tagType = tagType;
	}
	public String getDropdown() {
		return dropdown;
	}
	public void setDropdown(String dropdown) {
		this.dropdown = dropdown;
	}
	
	
	public SD_KYC_FIELD_MASTER_Bean(Integer id, String name, SD_KYC_FIELD_TYPES fieldType, SD_KYC_GROUPS tagType,
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
