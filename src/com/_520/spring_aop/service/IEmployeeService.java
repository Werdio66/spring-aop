package com._520.spring_aop.service;

import com._520.spring_aop.domain.Employee;

public interface IEmployeeService {

    void save(Employee employee);
    void delete(Employee employee);
}
