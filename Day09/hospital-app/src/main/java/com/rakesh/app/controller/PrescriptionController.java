package com.rakesh.app.controller;

import com.rakesh.app.model.Prescription;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/prescription")
public class PrescriptionController {
    @GetMapping("/view-prescription")
    public static Map getAllPrescriptions(String patientName){
        Map patAppMap=new HashMap();
        Prescription prescription1=new Prescription("PID0001","AID0001","DESC0001","PAT0001","DOC0001");


        patAppMap.put(prescription1.getPatientName(),prescription1);
        return patAppMap;
    }
    @PostMapping("/save-prescription")
    public Prescription savePrescription(@RequestBody Prescription prescription){
        Prescription prescription1=new Prescription("PID0001","AID0001","DESC0001","PAT0001","DOC0001");


        System.out.println(prescription);
        return prescription;
    }

}
