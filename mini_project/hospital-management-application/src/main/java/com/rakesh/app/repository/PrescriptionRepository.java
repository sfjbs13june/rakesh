package com.rakesh.app.repository;

import com.rakesh.app.model.Prescription;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PrescriptionRepository extends MongoRepository<Prescription,String> {
   public Prescription fingByName(String name);
   public Prescription save(Prescription prescription);
}
