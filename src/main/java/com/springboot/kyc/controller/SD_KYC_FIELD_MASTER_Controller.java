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

import com.springboot.kyc.model.SD_KYC_FIELD_MASTER;
import com.springboot.kyc.repository.SD_KYC_FIELD_MASTER_Repository;
import com.springboot.kyc.service.SD_KYC_FIELD_MASTER_Service;






@RestController
public class SD_KYC_FIELD_MASTER_Controller {
	
	@Autowired
	private SD_KYC_FIELD_MASTER_Service service;
	
	@Autowired
	private SD_KYC_FIELD_MASTER_Repository repo;

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,value = "/kyc_add")
	public SD_KYC_FIELD_MASTER insert(@RequestBody SD_KYC_FIELD_MASTER master)
	{
		return service.add(master);
	}
	
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE,value = "/kyc_update")
	public SD_KYC_FIELD_MASTER update(@RequestBody SD_KYC_FIELD_MASTER master)
	{
		return service.update(master);
	}
	
	@DeleteMapping(path ="/kyc_delete/{id}")
	public String deleteAddress(@PathVariable int id)
	{
		return service.delete(id);
	}
	
	@GetMapping(value="/kyc_find/{id}")
	public SD_KYC_FIELD_MASTER findbyId(@PathVariable int id){

		if(repo.findById(id).isPresent())
		{
			return repo.findById(id).get();
		}
		else
			return null;
	}
	
	@GetMapping(value="/kyc_find")
	public List<SD_KYC_FIELD_MASTER> findAllbyId(){
		return repo.findAll();
	}
	}
	

