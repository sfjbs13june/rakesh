package com.rakesh.db.controller;

import com.rakesh.db.model.Patient;
import com.rakesh.db.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/patient")
public class PatientController {

    @Autowired
    PatientRepository patientRepository;

    @GetMapping(value = "/read")
    public @ResponseBody
    Iterable<Patient> getAll() {
        return patientRepository.findAll();
    }

    @PostMapping(value = "/save")
    public @ResponseBody
    String store(@RequestBody final Patient patients) {
        patientRepository.save(patients);
        return "saved";
    }

//    @DeleteMapping(value = "/delete")
//    public @ResponseBody
//    String store(@RequestParam("id") final int id) {
//        PatientRepository.deleteById(id);
//        return "deleted";
//    }

}
