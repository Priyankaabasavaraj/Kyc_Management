package com.springboot.kyc.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.kyc.model.SD_KYC_FIELD_TYPES;



@Repository
public  interface SD_KYC_FIELD_TYPES_Repository extends  JpaRepository<SD_KYC_FIELD_TYPES, Integer>{

}
