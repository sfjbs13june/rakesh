package com.rakesh.app.controller;

import com.rakesh.app.model.Appointment;
import com.rakesh.app.model.Prescription;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/doctor")
public class DoctorController {
    @GetMapping("/doctor-appointment")

    public Map getApointment(@RequestParam String doctorName){
        Map doctAppMap = new HashMap();
        Prescription prescription1 = new Prescription("PID0001","AID0001","Desc0001","PAT0001","DOC0001");
        Appointment appointment1 = new Appointment("AID0001","PAT0001","DOC0001","26-01-2023",prescription1);
        doctAppMap.put(appointment1.getDoctorName(),appointment1);
        return doctAppMap;



    }
    @PostMapping("/save-appointment")
    public Appointment saveAppointment(@RequestBody Appointment appointment){
        Prescription prescription1 = new Prescription("AID0001","PAT0001","DOC0001","26-01-2023","PREC0001");
        Appointment appointment1 = new Appointment("AID0001","PAT0001","DOC0001","26-01-2023",prescription1);
        System.out.println(appointment);
        return appointment;


    }
}
