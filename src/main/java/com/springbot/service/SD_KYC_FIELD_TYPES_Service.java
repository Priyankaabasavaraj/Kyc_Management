package com.springbot.service;

import com.springbot.model.SD_KYC_FIELD_TYPES;

public interface SD_KYC_FIELD_TYPES_Service {
	public SD_KYC_FIELD_TYPES add(SD_KYC_FIELD_TYPES master);
	public SD_KYC_FIELD_TYPES update(SD_KYC_FIELD_TYPES master);
	public String delete(int id);
	public SD_KYC_FIELD_TYPES  get(int id);
}


