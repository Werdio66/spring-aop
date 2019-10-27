package com._520.spring_aop.dao.impl;

import com._520.spring_aop.dao.IEmployeeDAO;
import com._520.spring_aop.domain.Employee;
import org.springframework.stereotype.Repository;

//@Repository
public class EmployeeDAOImpl implements IEmployeeDAO {
    public void save(Employee employee) {
        System.out.println("保存员工");
    }

    public void delete(Employee employee) {
        System.out.println("删除员工");
    }
}
