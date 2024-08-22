package com.tech.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tech.entity.PatientEntity;

@Repository
public interface PatientRepositry extends JpaRepository<PatientEntity, Integer> {

}
