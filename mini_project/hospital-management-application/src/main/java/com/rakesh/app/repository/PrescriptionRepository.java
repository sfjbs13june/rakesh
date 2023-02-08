package com.rakesh.app.repository;

import com.rakesh.app.model.Prescription;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PrescriptionRepository extends MongoRepository<Prescription,String> {

   public Prescription save(Prescription prescription);

   List<Prescription> findByPatientName(String patientName);
}
