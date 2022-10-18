package com.springboot.kyc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.kyc.model.SD_KYC_GROUPS;
import com.springboot.kyc.repository.SD_KYC_GROUPS_Repository;
import com.springboot.kyc.service.SD_KYC_GROUPS_Service;



@RestController
public class SD_KYC_GROUPS_Controller {

	@Autowired
	private SD_KYC_GROUPS_Service group;
	
	@Autowired
	private SD_KYC_GROUPS_Repository repo;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,value = "/SD_KYC_GROUPS/add")
	public SD_KYC_GROUPS insert(@RequestBody SD_KYC_GROUPS master)
	{
		return group.add(master);
	}
	
	
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE,value = "/SD_KYC_GROUPS/update")
	public SD_KYC_GROUPS update(@RequestBody SD_KYC_GROUPS master)
	{
		return group.update(master);
	}
	
	@DeleteMapping(path ="/SD_KYC_GROUPS/delete/{id}")
	public String deleteAddress(@PathVariable int id)
	{
		return group.delete(id);
	}
	
	@GetMapping(value="/SD_KYC_GROUPS/find/{id}")
	public SD_KYC_GROUPS findbyId(@PathVariable int id){

		if(repo.findById(id).isPresent())
		{
			return repo.findById(id).get();
		}
		else
			return null;
	}
	
	@GetMapping(value="/SD_KYC_GROUPS/find")
	public List<SD_KYC_GROUPS> findAllbyId(){
		return repo.findAll();
	}
}

