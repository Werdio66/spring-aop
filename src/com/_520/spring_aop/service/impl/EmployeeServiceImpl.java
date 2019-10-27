package com._520.spring_aop.service.impl;

import com._520.spring_aop.dao.IEmployeeDAO;
import com._520.spring_aop.domain.Employee;
import com._520.spring_aop.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private IEmployeeDAO dao;

    public void save(Employee employee) {
        dao.save(employee);
        System.out.println("保存成功");
    }

    public void delete(Employee employee) {
        dao.delete(employee);
        System.out.println("删除失败");
        throw new RuntimeException("lalalal");
    }
}
