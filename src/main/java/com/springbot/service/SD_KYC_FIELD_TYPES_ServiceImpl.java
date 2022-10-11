package com.springbot.service;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbot.model.SD_KYC_FIELD_TYPES;
import com.springbot.repository.SD_KYC_FIELD_TYPES_Repository;


@Transactional
@Service
public class SD_KYC_FIELD_TYPES_ServiceImpl implements SD_KYC_FIELD_TYPES_Service{
	
	@Autowired
	private SD_KYC_FIELD_TYPES_Repository repo;
	
	public SD_KYC_FIELD_TYPES add(SD_KYC_FIELD_TYPES master)
	{
		SD_KYC_FIELD_TYPES type = new SD_KYC_FIELD_TYPES();
		type.setId(master.getId());
		type.setName(master.getName());
		return repo.save(type);
	}

	@Override
	public SD_KYC_FIELD_TYPES update(SD_KYC_FIELD_TYPES master) {
		SD_KYC_FIELD_TYPES type = new SD_KYC_FIELD_TYPES();
		type.setId(master.getId());
		type.setName(master.getName());
		return repo.save(type);
	}

	@Override
	public String delete(int id) {
		repo.deleteById(id);
		return "Entity deleted "+id;
	}

	@Override
	public SD_KYC_FIELD_TYPES get(int id) {
		return repo.findById(id).get();
	}

}
