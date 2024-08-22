package com.tech.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Patient")
public class PatientEntity {
	
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private 	int id;
	
   @Column
	private String Emp_Name;
	
    @Column
	private String Mo_NO;
	
    @Column
	private String Symptoms;
	
    @Column
	private String Address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmp_Name() {
		return Emp_Name;
	}

	public void setEmp_Name(String emp_Name) {
		Emp_Name = emp_Name;
	}

	public String getMo_NO() {
		return Mo_NO;
	}

	public void setMo_NO(String mo_NO) {
		Mo_NO = mo_NO;
	}

	public String getSymptoms() {
		return Symptoms;
	}

	public void setSymptoms(String symptoms) {
		Symptoms = symptoms;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public PatientEntity(int id, String emp_Name, String mo_NO, String symptoms, String address) {
		super();
		this.id = id;
		Emp_Name = emp_Name;
		Mo_NO = mo_NO;
		Symptoms = symptoms;
		Address = address;
	}

	public PatientEntity() {
		super();
	}

	@Override
	public String toString() {
		return "PatientEntity [id=" + id + ", Emp_Name=" + Emp_Name + ", Mo_NO=" + Mo_NO + ", Symptoms=" + Symptoms
				+ ", Address=" + Address + "]";
	}
	
    
    

}
