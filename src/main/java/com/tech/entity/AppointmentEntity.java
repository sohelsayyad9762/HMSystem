package com.tech.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="appointtable")
public class AppointmentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String Name;
	
	@Column
	private String Age;
	
	@Column
	private String Your_Doctor;
	
	@Column
	private String Date;
	
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

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAge() {
		return Age;
	}

	public void setAge(String age) {
		Age = age;
	}

	public String getYour_Doctor() {
		return Your_Doctor;
	}

	public void setYour_Doctor(String your_Doctor) {
		Your_Doctor = your_Doctor;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
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

	public AppointmentEntity(int id, String name, String age, String your_Doctor, String date, String symptoms,
			String address) {
		super();
		this.id = id;
		Name = name;
		Age = age;
		Your_Doctor = your_Doctor;
		Date = date;
		Symptoms = symptoms;
		Address = address;
	}

	public AppointmentEntity() {
		super();
	}

	@Override
	public String toString() {
		return "AppointmentEntity [id=" + id + ", Name=" + Name + ", Age=" + Age + ", Your_Doctor=" + Your_Doctor
				+ ", Date=" + Date + ", Symptoms=" + Symptoms + ", Address=" + Address + "]";
	}
	
	
	
}
