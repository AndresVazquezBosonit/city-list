package com.city.list.citylist;

import org.springframework.stereotype.Component;

@Component
public class City {

    private String name;
    private int population;

    public City() {/*empty*/}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
