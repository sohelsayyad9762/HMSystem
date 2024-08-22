package com.tech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tech.entity.DoctorsEntity;
import com.tech.service.DoctorService;

@RestController
public class DoctorController {

	public DoctorController() {
		System.out.println("inside DoctorController Constructor");
	}

	@Autowired
	DoctorService doctorService;
	

	@GetMapping("/Welcome1")
	  public String home1() {
	    return "Welcome1";
	  }
	
	@GetMapping("/DrRegister")
	  public String home2() {
	    return "DrRegister";
	  }
	

	@PostMapping("/drregister")
	public String CreateDoctor(@RequestBody DoctorsEntity doctor) {
	    doctorService.CreateDoctor(doctor);
	    return "drregister";
	}

	  
	  @GetMapping("/View1")
	  public String GetDoctor(Model m) {
		  
		  List<DoctorsEntity> patient1= doctorService.GetDoctor();
		  m.addAttribute("GetALLPatient", patient1);
		return "View";
	}
	  
	  @GetMapping("/Edite1/{id}")
	  public String Edite(@PathVariable int id, Model m) {
		
		  DoctorsEntity p1 = doctorService.EditeById(id);
		  m.addAttribute("GetALLPatient",p1);
		  
		  return"Edite";
	} 
	  
	  @PostMapping("/update1")
	  public String Update(@ModelAttribute DoctorsEntity d) {
		 
		  doctorService.CreateDoctor(d);
		  return"WelCome";
	}
	  
	  @GetMapping("/Delete1/{id}")
	  public String Delete(@PathVariable int id) {
		
		  doctorService.deleteDoctor(id);
		  return "Welcome";
	}
	 
}
