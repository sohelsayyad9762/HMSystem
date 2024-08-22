package com.tech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.tech.entity.PatientEntity;
import com.tech.service.PatientService;

@Controller
class PatientController {
	
	
	public PatientController() {
		System.out.println("inside PatientController Constructor");
	}

	@Autowired
	PatientService patientService;
	
	
	
	
  @GetMapping("/WelCome")
  public String home() {
    return "WelCome";
  }
  
 
  
  @GetMapping("/About")
  public String About() {
    return "About";
  }
  
  @GetMapping("/Register")
  public String TP() {
	return"/Register";
}
  
//  @GetMapping("/View")
//  public String get() {
//	return"/View";
//}
  
  
//  @PostMapping("/register")
//  public String Register(@ModelAttribute PatientEntity p) {
//	  System.out.println(p);
//	  
//	return "WelCome";
//}
  
  @PostMapping("/register")
  public String CreatePatient(@ModelAttribute PatientEntity p) {

	  patientService.CreatePatient(p);
	  return "WelCome";
  }
  
  @GetMapping("/View")
  public String GetPatient(Model m) {
	  
	  List<PatientEntity> patient1= patientService.GetPatient();
	  m.addAttribute("GetALLPatient", patient1);
	return "View";
}
  
  @GetMapping("/Edite/{id}")
  public String Edite(@PathVariable int id, Model m) {
	
	  PatientEntity p1 =patientService.EditeById(id);
	  m.addAttribute("GetALLPatient",p1);
	  
	  return"Edite";
} 
  
  @PostMapping("/update")
  public String Update(@ModelAttribute PatientEntity p) {
	 
	  patientService.CreatePatient(p);
	  return"WelCome";
}
  
  @GetMapping("/Delete/{id}")
  public String Delete(@PathVariable int id) {
	
   patientService.deletePatient(id);
	  return "Welcome";
}
 
	
}