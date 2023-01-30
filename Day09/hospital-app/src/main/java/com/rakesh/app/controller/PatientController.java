package com.rakesh.app.controller;

import com.rakesh.app.model.Appointment;
import com.rakesh.app.model.Prescription;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/patient")
public class PatientController {
    @GetMapping("/myappointment")
    public Map getMyAppointment(@RequestParam String patientName)
    {
        Map patMap = new HashMap();
        Prescription prescription1 = (Prescription) PrescriptionController.getAllPrescriptions("PID0001");
        Appointment appointment1 = new Appointment("AID0001","PID0001","DOC0001","25-01-2023",prescription1);
        patMap.put(appointment1.getPatientName(),appointment1);
        return patMap;

    }

    @PostMapping("/save")
    public Appointment saveAppointment(@RequestBody Appointment appointment)
    {
        Prescription prescription1 = new Prescription("PID0001","AID0001","DESC0001","PAT0001","DOC0001");
        Appointment appointment1 = new Appointment("AID0001","PID0001","DOC0001","25-01-2023",prescription1);
        System.out.println(appointment);
        return appointment;
    }


}
