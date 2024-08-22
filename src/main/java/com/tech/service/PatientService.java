package com.tech.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.entity.PatientEntity;
import com.tech.repositry.PatientRepositry;

@Service
public class PatientService {
	
	public PatientService() {
		System.out.println("inside PatientService Constructor");
	}
	
	
	@Autowired
	PatientRepositry patientRepositry;
	
	
	public PatientEntity CreatePatient(PatientEntity p) {
		return patientRepositry.save(p);
		
	}
	
	public List<PatientEntity> GetPatient() {
		return patientRepositry.findAll();
	}
	
	public PatientEntity EditeById(int id) {
	Optional<PatientEntity> p=	patientRepositry.findById(id);
	
	if(p.isPresent())
	{
		return p.get();
	}
	return null;
	
	}
	
	public void deletePatient(int id) {
		patientRepositry.deleteById(id);
	}

}
