package com.example.service2.service2.controller;

import com.amazonaws.xray.spring.aop.XRayEnabled;
import com.example.service2.service2.entity.Employee;
import com.example.service2.service2.proxy.EmployeeProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/service2")
@XRayEnabled
public class Service2Controller {

    @Autowired
    private EmployeeProxy proxy;

    @GetMapping("getEmployee")
    public Employee getEmployee() {

        return proxy.getEmployee();
    }
}
