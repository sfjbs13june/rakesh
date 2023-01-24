package com.rakesh.app.controller;

import com.rakesh.app.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class StudentController {
    @GetMapping("/get/students")
    public List<Student> getStudent()
    {
        List listStudents = new ArrayList();
        Student student1 = new Student("rakesh","roll1","10th","PCS");
        Student student2 = new Student("pavan","roll2","8th","KV");
        Student student3 = new Student("karthik","roll3","5th","KMS");

        listStudents.add(student1);
        listStudents.add(student2);
        listStudents.add(student3);
        return listStudents;
    }
    @GetMapping("/map/students")
    public Map mapStudent() {
        Map studentMap = new HashMap();
        Student student1 = new Student("rakesh", "roll1", "10th","PCS");
        Student student2 = new Student("pavan", "roll2", "8th","KV");
        Student student3 = new Student("karthik", "roll3", "5th","KMS");

        studentMap.put(student1.getName(), student1);
        studentMap.put(student2.getName(), student2);
        studentMap.put(student3.getName(), student3);
        return studentMap;
    }


}
