package com.tech.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tech.entity.AppointmentEntity;
import com.tech.entity.PatientEntity;

@Repository
public interface AppointmentRepositry extends JpaRepository<AppointmentEntity, Integer> {

}
