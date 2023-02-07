package com.rakesh.app;

import com.rakesh.app.model.Hospital;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionsApp {
    public Optional<Hospital> getCat(String name){

        Hospital cat1= new Hospital("c1","3");
        Hospital cat2=new Hospital("c2","4");
        Map<String, Hospital> data = new HashMap<>();
        data.put("c1", cat1);
        data.put("c2", cat2);
        Hospital result= data.get(name);
        return Optional.ofNullable(result);

    }
}
