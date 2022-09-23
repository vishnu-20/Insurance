package com.Insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Insurance.entity.InsuranceEntity;

public interface InsuranceRepository extends JpaRepository<InsuranceEntity, Long>{

}
