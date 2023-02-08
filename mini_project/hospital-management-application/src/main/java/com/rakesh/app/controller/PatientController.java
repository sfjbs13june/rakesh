package com.rakesh.app.controller;

import com.rakesh.app.model.Appointment;
import com.rakesh.app.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    AppointmentRepository appointmentRepository;
    @RequestMapping(value ="/myappointment",method = RequestMethod.GET)
    public List<Appointment> getMyAppointments(@RequestParam String patientName)
    {
        return appointmentRepository.findByPatientName(patientName);
    }

    @RequestMapping(value ="/save",method = RequestMethod.POST)
    public Appointment saveAppointment(@RequestBody Appointment appointment)
    {
        appointment = appointmentRepository.save(appointment);
        return  appointment;
    }
}
