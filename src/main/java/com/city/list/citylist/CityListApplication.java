package com.city.list.citylist;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.ArrayList;

@SpringBootApplication
public class CityListApplication {

  public static void main(String[] args) {
    SpringApplication.run(CityListApplication.class, args);
    System.out.println("///---------------------------------READY-----------------------------///");
  }

  @Bean
  public ArrayList<City> createListCity() {
    ArrayList<City> cityList = new ArrayList<City>();
    return cityList;
  }
}
