package com.city.list.citylist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController()
public class Controller1 {

    @Autowired
    ArrayList<City> cityList;

    @RequestMapping(value="/controller1/addcity", method = RequestMethod.POST, consumes = "application/json" )
    public ArrayList<City> addCity(@RequestBody City city){
    System.out.println("add city ok");
        cityList.add(city);
        return cityList;
    }

}
