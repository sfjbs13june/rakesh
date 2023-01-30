package com.rakesh.app.model;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    String roll;
    String std;
    String schoolName;

    public Student(String name, String roll, String std, String schoolName) {
        this.name = name;
        this.roll = roll;
        this.std = std;
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getStd() {
        return std;
    }

    public void setStd(String std) {
        this.std = std;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public List getAllDetails(){
        List all=new ArrayList();
        all.add(0,name);
        all.add(1,roll);
        all.add(2,std);
        all.add(3,schoolName);
        return all;

    }
}
