package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Country;
import com.example.demo.service.CountryService;

@SpringBootApplication
public class SpringQuickExampleApplication implements CommandLineRunner {

    private final CountryService countryService;

    SpringQuickExampleApplication(CountryService countryService) {
        this.countryService = countryService;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringQuickExampleApplication.class, args);
    }

    @Override
    public void run(String... args) {

        Country country = new Country("IN", "India");

        countryService.addCountry(country);
    }
}