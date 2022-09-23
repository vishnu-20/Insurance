package com.Insurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Insurance.entity.InsuranceEntity;
import com.Insurance.repository.InsuranceRepository;

@Service
public class InsuranceServiceImpl implements InsuranceService {

	@Autowired
	private InsuranceRepository insuranceRepository;

	@Override
	public List<InsuranceEntity> getAllDetails() {

		return insuranceRepository.findAll();
	}

	@Override
	public InsuranceEntity getById(Long id) {

		return insuranceRepository.findById(id).get();
	}

	@Override
	public InsuranceEntity createUser(InsuranceEntity entity) {

		return insuranceRepository.save(entity);
	}

	@Override
	public String deleteUser(Long id) {
		String val = "no such data";
		InsuranceEntity entity = insuranceRepository.findById(id).get();

		if (entity != null) {

			insuranceRepository.delete(entity);
			val = "deleted successfully";
		}
		return val;
	}

	@Override
	public InsuranceEntity updateUser(InsuranceEntity entity, Long id) {
		InsuranceEntity data = insuranceRepository.findById(id).get();

		if (data != null) {

			data = insuranceRepository.saveAndFlush(entity);

		}
		return data;
	}

}
