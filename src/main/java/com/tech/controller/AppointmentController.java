package com.tech.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.tech.entity.AppointmentEntity;
import com.tech.entity.PatientEntity;
import com.tech.service.AppointmentService;

@Controller
public class AppointmentController {
/////////////////////////////////////////////////////////
	@Autowired
	AppointmentService appointmentService;
	
///////////////////////////////////////////////////////
	
	  @GetMapping("/Appointment")
		 public String Appointment() {
			 return"Appointment";
		}
	  
	  
	  @PostMapping("/appointment")
		 public String CreateAppointment(@ModelAttribute AppointmentEntity A) {
		  appointmentService.CreateAppoitment(A);
			 return"WelCome";
		}
	  
   @GetMapping("/ViewAppointment")	  
   public String GetAppoitment(Model m) {
	 List<AppointmentEntity> appointment= appointmentService.GetAppointment();
	m.addAttribute("appointment",appointment);
	
	return"ViewAppointment";
  }
   
   
   @GetMapping("/EditeAppointment/{id}")
   public String Edite(@PathVariable int id, Model m) {
 	
 	  AppointmentEntity a1 =appointmentService.EditeById(id);
 	  m.addAttribute("a1",a1);
 	  return"EditeAppointment";
 } 
   
   
   @PostMapping("/updateAppointment")
   public String Update(@ModelAttribute AppointmentEntity p) {
 	 
 	 appointmentService.CreateAppoitment(p);
 	  return"WelCome";
	  
   }  
   
   @GetMapping("/DeleteAppoitment/{id}")
   public String Delete(@PathVariable int id) {
 	
   appointmentService.deletePatient(id);
 	  return "Welcome";
 }
   
}
