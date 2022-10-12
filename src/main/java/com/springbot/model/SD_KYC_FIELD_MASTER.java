package com.springbot.model;


import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="SD_KYC_FIELD_MASTER")
public class SD_KYC_FIELD_MASTER {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="FIELD_ID",unique = true,nullable = false)
	private Integer id;
	
	@Column(name="FIELD_NAME",nullable = false)
	private String name;
	
	@ManyToOne(cascade =CascadeType.ALL )
	@JoinColumn(name="FIELD_TYPE",referencedColumnName = "ID" ,nullable = false)
	private  SD_KYC_FIELD_TYPES fieldType;
	
	@ManyToOne(cascade =CascadeType.ALL )
	@JoinColumn(name="TAG_TYPE",referencedColumnName = "ID" ,nullable = false)
	private  SD_KYC_GROUPS tagType;

	@Column(name="DROPDOWN",nullable = false)
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

	public SD_KYC_FIELD_MASTER(Integer id, String name, SD_KYC_FIELD_TYPES fieldType, SD_KYC_GROUPS tagType,
			String dropdown) {
		super();
		this.id = id;
		this.name = name;
		this.fieldType = fieldType;
		this.tagType = tagType;
		this.dropdown = dropdown;
	}

	public SD_KYC_FIELD_MASTER() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}