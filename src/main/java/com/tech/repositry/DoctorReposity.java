package com.tech.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tech.entity.DoctorsEntity;

@Repository
public interface DoctorReposity extends JpaRepository<DoctorsEntity, Integer> {

}

	
