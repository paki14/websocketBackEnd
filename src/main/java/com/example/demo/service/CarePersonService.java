package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Care;
import com.example.demo.entity.CarePerson;

public interface CarePersonService {
	
	List<CarePerson> getCarePersionById(Care id);

}
