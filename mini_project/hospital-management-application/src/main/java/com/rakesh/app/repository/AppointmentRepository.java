package com.rakesh.app.repository;

import com.rakesh.app.model.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AppointmentRepository extends MongoRepository<Appointment,String> {
    public Appointment findByName(String name);
    public Appointment save(Appointment appointment);
}
