package com.example.service2.service2.proxy;

import com.example.service2.service2.entity.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service1", url = "${SERVICE1_SERVICE_SERVICE_HOST:http://localhost}:8080")
public interface EmployeeProxy {
    // double check
    @GetMapping("/api/v1/service1/getEmployee")
    Employee getEmployee();
}
