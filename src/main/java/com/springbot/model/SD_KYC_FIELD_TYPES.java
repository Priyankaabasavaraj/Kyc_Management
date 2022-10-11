package com.springbot.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SD_KYC_FIELD_TYPES")
public class SD_KYC_FIELD_TYPES {

	@Id
	@Column(name="ID",unique = true,nullable = false)
	private Integer id;
	
	
	@Column(name="NAME",nullable = false)
	private String name;


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


	public SD_KYC_FIELD_TYPES(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public SD_KYC_FIELD_TYPES() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
