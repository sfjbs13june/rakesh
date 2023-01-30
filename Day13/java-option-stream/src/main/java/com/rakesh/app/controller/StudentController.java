package com.rakesh.app.controller;


import com.rakesh.app.model.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class StudentController {
    public Optional<Student> getStudents(String name){
        Map<String,Student> studentMap=new HashMap();
        Student student1=new Student("rakesh","36","8th","pcs");
        Student student2=new Student("pavan","31","8th","pcs");
        Student student3=new Student("shashank","42","9th","pcs");
        Student student4=new Student("satwik","38","9th","pcs");

        studentMap.put(student1.getName(),student1);
        studentMap.put(student2.getName(),student2);
        studentMap.put(student3.getName(),student3);
        studentMap.put(student4.getName(),student4);
        Student result=studentMap.get(name);
        return Optional.ofNullable(result);
    }
}
