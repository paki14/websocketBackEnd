package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Care;
import com.example.demo.entity.CarePerson;
import com.example.demo.service.CarePersonService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class CarePersonController {
	@Autowired
	private CarePersonService carePersonService;

	@GetMapping("/careperson/{id}")
	public ResponseEntity<List<CarePerson>> getCarePersonById( Care id) {
		return new ResponseEntity<List<CarePerson>>(carePersonService.getCarePersionById(id), HttpStatus.OK);

	}
	
}
