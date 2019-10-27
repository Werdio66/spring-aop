package com._520.spring_aop.test;


import com._520.spring_aop.domain.Employee;
import com._520.spring_aop.service.IEmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class App {

    @Autowired
    private IEmployeeService service;

    @Test
    void testSave(){
        System.out.println(service);
        service.save(new Employee());
    }

    @Test
    void testDelete(){
        System.out.println(service);
        service.delete(new Employee());
    }
}
