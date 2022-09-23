package com.Insurance.service;

import java.util.List;

import com.Insurance.entity.InsuranceEntity;

public interface InsuranceService {

	public List<InsuranceEntity> getAllDetails();

	public InsuranceEntity getById(Long id);

	public InsuranceEntity createUser(InsuranceEntity entity);

	public String deleteUser(Long id);

	public InsuranceEntity updateUser(InsuranceEntity entity, Long id);
}
