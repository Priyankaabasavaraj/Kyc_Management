package com.springbot.model;


import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
	
	
	@Column(name="FIELD_TYPE",nullable = false)
	private Integer fieldType;
	
	@Column(name="TAG_TYPE",nullable = false)
	private Integer tagType;

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

	public SD_KYC_FIELD_MASTER(Integer id, String name, Integer fieldType, Integer tagType,
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
	
	/*@OneToMany(cascade=CascadeType.ALL)//,fetch=FetchType.EAGER)//Manytoone since many employe belong to one department
	@JoinColumn(name="EMPADDRES_ID",referencedColumnName = "ID",nullable = false)
	private List<SD_KYC_FIELD_TYPES> fieldType;*/
	
	

}