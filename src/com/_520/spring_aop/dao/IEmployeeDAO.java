package com._520.spring_aop.dao;

import com._520.spring_aop.domain.Employee;

public interface IEmployeeDAO {

    void save(Employee employee);

    void delete(Employee employee);
}
