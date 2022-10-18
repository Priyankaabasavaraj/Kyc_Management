package com.springboot.kyc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SD_KYC_GROUPS")
public class SD_KYC_GROUPS {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID",unique = true,nullable = false)
	private Integer id;
	
	@Column(name="GROUP_NAME",nullable = false)
	private String groupName;
	
	@Column(name="LABEL",nullable = false)
	private String lable;
	
	@Column(name="GROUP_ORDER",nullable = false)
	private Integer groupOrder;
	
	@Column(name="PARENT",nullable = false)
	private Integer parent;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getLable() {
		return lable;
	}

	public void setLable(String lable) {
		this.lable = lable;
	}

	public Integer getGroupOrder() {
		return groupOrder;
	}

	public void setGroupOrder(Integer groupOrder) {
		this.groupOrder = groupOrder;
	}

	public Integer getParent() {
		return parent;
	}

	public void setParent(Integer parent) {
		this.parent = parent;
	}

	public SD_KYC_GROUPS(Integer id, String groupName, String lable, Integer groupOrder, Integer parent) {
		super();
		this.id = id;
		this.groupName = groupName;
		this.lable = lable;
		this.groupOrder = groupOrder;
		this.parent = parent;
	}

	public SD_KYC_GROUPS() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
