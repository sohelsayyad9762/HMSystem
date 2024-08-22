package com.tech.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.entity.DoctorsEntity;
import com.tech.entity.PatientEntity;
import com.tech.repositry.DoctorReposity;

@Service
public class DoctorService {

	public DoctorService() {
		System.out.println("inside DoctorService Constructor");
	}
	
	@Autowired
	DoctorReposity doctorReposity;
	
	
	public DoctorsEntity CreateDoctor(DoctorsEntity d) {
		return doctorReposity.save(d);
		
	}
	
	public List<DoctorsEntity> GetDoctor() {
		return doctorReposity.findAll();
	}
	
	public DoctorsEntity EditeById(int id) {
	Optional<DoctorsEntity> p=	doctorReposity.findById(id);
	
	if(p.isPresent())
	{
		return p.get();
	}
	return null;
	
	}
	
	public void deleteDoctor(int id) {
		doctorReposity.deleteById(id);
	}

}
