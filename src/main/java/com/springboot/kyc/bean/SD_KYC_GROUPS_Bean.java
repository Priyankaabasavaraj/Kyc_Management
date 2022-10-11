package com.springboot.kyc.bean;

public class SD_KYC_GROUPS_Bean {
	
	private Integer id;
	private String groupName;
	private String lable;
	private Integer groupOrder;
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
	public SD_KYC_GROUPS_Bean(Integer id, String groupName, String lable, Integer groupOrder, Integer parent) {
		super();
		this.id = id;
		this.groupName = groupName;
		this.lable = lable;
		this.groupOrder = groupOrder;
		this.parent = parent;
	}
	public SD_KYC_GROUPS_Bean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
