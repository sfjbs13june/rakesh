package com.rakesh.app.repository;

import com.rakesh.app.model.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface AppointmentRepository extends MongoRepository<Appointment,String> {
    public List<Appointment> findByDocterName(String docterName);
    public Appointment save(Appointment appointment);
    public List<Appointment> findByPatientName(String patientName);
}
