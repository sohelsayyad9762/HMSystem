package com.tech.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.entity.AppointmentEntity;
import com.tech.entity.PatientEntity;
import com.tech.repositry.AppointmentRepositry;
import com.tech.repositry.PatientRepositry;

@Service
public class AppointmentService {
	
	public AppointmentService() {
		System.out.println("inside AppointmentService Constructor");
	}
	
	
	@Autowired
	AppointmentRepositry appointmentRepositry;
	
	//
	public void CreateAppoitment(AppointmentEntity A) {
     appointmentRepositry.save(A);
		
	}
	
	public List<AppointmentEntity> GetAppointment() {
		return appointmentRepositry.findAll();
	}
	
	public AppointmentEntity EditeById(int id) {
	Optional<AppointmentEntity> a=	appointmentRepositry.findById(id);
	
	if(a.isPresent())
	{
		return a.get();
	}
	return null;
	
	}
	
	public void deletePatient(int id) {
		appointmentRepositry.deleteById(id);
	}

	

}
