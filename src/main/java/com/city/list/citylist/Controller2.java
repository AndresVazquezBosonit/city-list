package com.city.list.citylist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Controller2 {
    @Autowired
    ArrayList<City> cityList;

    @GetMapping("controller1/getcity")
    public ArrayList<City> getCityList(){
        System.out.println("Controller 2 OK");
        return cityList;
    };
}
