package com.test.task.testTask.service;

import com.test.task.testTask.dao.EmployeeRepository;
import com.test.task.testTask.entities.Department;
import com.test.task.testTask.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServileImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        employeeRepository.saveEmployee(employee);
    }

    @Override
    @Transactional
    public Employee showEmployee(int id) {
        return employeeRepository.showEmployee(id);
    }

    @Override
    @Transactional
    public Employee updateEmployee(Employee employee) {
        employeeRepository.updateEmployee(employee);
        return employee;
    }

    @Override
    @Transactional
    public void deleteEmployee(int id) {
        employeeRepository.deleteEmployee(id);
    }
}
