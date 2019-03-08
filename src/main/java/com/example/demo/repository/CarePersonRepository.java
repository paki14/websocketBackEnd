package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Care;
import com.example.demo.entity.CarePerson;
@Repository
public interface CarePersonRepository extends JpaRepository<CarePerson, Integer>{
	List<CarePerson> findByCareId(Care id);

}
