package com.tech.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class DoctorsEntity {

	
	@Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private 	int id;
		
	   @Column
		private String Emp_Name;
		
	    @Column
		private String Mo_NO;
		
	    @Column
		private String Specialist;
		
	    @Column
		private String Hopital;

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

		public String getSpecialist() {
			return Specialist;
		}

		public void setSpecialist(String specialist) {
			Specialist = specialist;
		}

		public String getHopital() {
			return Hopital;
		}

		public void setHopital(String hopital) {
			Hopital = hopital;
		}

		@Override
		public String toString() {
			return "DoctorsEntity [id=" + id + ", Emp_Name=" + Emp_Name + ", Mo_NO=" + Mo_NO + ", Specialist="
					+ Specialist + ", Hopital=" + Hopital + "]";
		}

		public DoctorsEntity(int id, String emp_Name, String mo_NO, String specialist, String hopital) {
			super();
			this.id = id;
			Emp_Name = emp_Name;
			Mo_NO = mo_NO;
			Specialist = specialist;
			Hopital = hopital;
		}

		public DoctorsEntity() {
			super();
			// TODO Auto-generated constructor stub
		}

		
}
