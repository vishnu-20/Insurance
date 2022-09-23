package com.Insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Insurance.entity.InsuranceEntity;
import com.Insurance.service.InsuranceService;

@RestController
@RequestMapping("api/v2")
@CrossOrigin
public class InsuranceController {

	@Autowired
	private InsuranceService insuranceService;

	@GetMapping("/getUserbyId/{id}")
	public ResponseEntity<InsuranceEntity> getById(@PathVariable Long id) {

		InsuranceEntity entity = insuranceService.getById(id);

		return new ResponseEntity<InsuranceEntity>(entity, HttpStatus.OK);

	}

	@GetMapping("/getAll")
	public ResponseEntity<List<InsuranceEntity>> getAllDetails() {

		List<InsuranceEntity> entity = insuranceService.getAllDetails();

		return new ResponseEntity<List<InsuranceEntity>>(entity, HttpStatus.OK);

	}

	@PostMapping("/createuser")
	public ResponseEntity<InsuranceEntity> addUser(@RequestBody InsuranceEntity insuranceEntity) {

		InsuranceEntity entity = insuranceService.createUser(insuranceEntity);

		return new ResponseEntity<InsuranceEntity>(entity, HttpStatus.OK);

	}

	@PutMapping("/updateUser/{id}")
	public ResponseEntity<InsuranceEntity> update(@RequestBody InsuranceEntity insuranceEntity, @PathVariable Long id) {

		InsuranceEntity entity = insuranceService.updateUser(insuranceEntity, id);

		return new ResponseEntity<InsuranceEntity>(entity, HttpStatus.OK);

	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> update(@PathVariable Long id) {

		String entity = insuranceService.deleteUser(id);

		return new ResponseEntity<String>(entity, HttpStatus.OK);

	}

}
