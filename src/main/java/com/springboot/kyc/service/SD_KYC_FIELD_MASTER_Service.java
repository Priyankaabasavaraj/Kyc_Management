package com.springboot.kyc.service;

import com.springboot.kyc.model.SD_KYC_FIELD_MASTER;

public interface SD_KYC_FIELD_MASTER_Service {

	public SD_KYC_FIELD_MASTER add(SD_KYC_FIELD_MASTER master);
	public SD_KYC_FIELD_MASTER update(SD_KYC_FIELD_MASTER master);
	public String delete(int id);
	public SD_KYC_FIELD_MASTER  get(int id);
}
