package com.springboot.kyc.service;

import com.springboot.kyc.model.SD_KYC_GROUPS;

public interface SD_KYC_GROUPS_Service {
	public SD_KYC_GROUPS add(SD_KYC_GROUPS master);
	public SD_KYC_GROUPS update(SD_KYC_GROUPS master);
	public String delete(int id);
	public SD_KYC_GROUPS  get(int id);

}
