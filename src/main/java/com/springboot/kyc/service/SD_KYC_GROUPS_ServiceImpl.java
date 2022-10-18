package com.springboot.kyc.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.kyc.model.SD_KYC_GROUPS;
import com.springboot.kyc.repository.SD_KYC_GROUPS_Repository;




@Transactional
@Service
public class SD_KYC_GROUPS_ServiceImpl implements  SD_KYC_GROUPS_Service{
	
	@Autowired
	private SD_KYC_GROUPS_Repository repo;

	@Override
	public SD_KYC_GROUPS add(SD_KYC_GROUPS master) {
		SD_KYC_GROUPS group = new SD_KYC_GROUPS();
		group.setGroupName(master.getGroupName());
		group.setGroupOrder(master.getGroupOrder());
		group.setLable(master.getLable());
		group.setParent(master.getParent());
	    return repo.save(group);
		
	}
	
	@Override
	public SD_KYC_GROUPS update(SD_KYC_GROUPS master) {
		SD_KYC_GROUPS group = new SD_KYC_GROUPS();
		group.setId(master.getId());
		group.setGroupName(master.getGroupName());
		group.setGroupOrder(master.getGroupOrder());
		group.setLable(master.getLable());
		group.setParent(master.getParent());
	    return repo.save(group);
	}
	

	@Override
	public String delete(int id) {
		repo.deleteById(id);
		return "Entity deleted "+id;
	}

	@Override
	public SD_KYC_GROUPS get(int id) {
		return repo.findById(id).get();
	}
}
