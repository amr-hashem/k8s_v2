package com.example.service1.service1.controller;

import com.example.service1.service1.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/service1")
public class Service1Controller {

    @GetMapping("getEmployee")
    public Employee getEmployee() {
        return new Employee("1", "amr", 20);
    }
}
