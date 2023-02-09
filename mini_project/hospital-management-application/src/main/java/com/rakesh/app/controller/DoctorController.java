package com.rakesh.app.controller;

import com.rakesh.app.model.Appointment;
import com.rakesh.app.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    AppointmentRepository appointmentRepository;
    @GetMapping("/doctor-appointment")
    public List<Appointment> getAppointments(@RequestParam String doctorName)
    {
        return appointmentRepository.findByDoctorName(doctorName);
    }
    @PostMapping("/save")
    public Appointment saveAppointment(@RequestBody Appointment appointment)
    {
        appointment=appointmentRepository.save(appointment);
        return appointment;
    }

}
