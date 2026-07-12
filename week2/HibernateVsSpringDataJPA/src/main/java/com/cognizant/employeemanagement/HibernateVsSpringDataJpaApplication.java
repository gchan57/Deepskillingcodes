package com.cognizant.employeemanagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.employeemanagement.model.Employee;
import com.cognizant.employeemanagement.service.EmployeeService;

@SpringBootApplication
public class HibernateVsSpringDataJpaApplication
        implements CommandLineRunner {

    @Autowired
    private EmployeeService employeeService;

    public static void main(String[] args) {

        SpringApplication.run(HibernateVsSpringDataJpaApplication.class,args);

    }

    @Override
    public void run(String... args) {

        Employee e1=new Employee(101,"Guna",50000.0);

        Employee e2=new Employee(102,"Rahul",60000.0);

        employeeService.addEmployee(e1);

        employeeService.addEmployee(e2);

        List<Employee> employees=
                employeeService.getEmployees();

        employees.forEach(System.out::println);

    }

}