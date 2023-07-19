package com.test.task.testTask.service.impl;

import com.test.task.testTask.dao.EmployeeRepository;
import com.test.task.testTask.entities.Employee;
import com.test.task.testTask.service.interf.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServileImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        List <Employee> allEmployees = employeeRepository.findAll();
        return allEmployees;
    }

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    @Transactional
    public Employee showEmployee(int id) {
        Optional <Employee> employee = employeeRepository.findById(id);
        return employee.get();
    }

    @Override
    @Transactional
    public void deleteEmployee(int id) {
        Optional <Employee> employee = employeeRepository.findById(id);
        employeeRepository.delete(employee.get());
    }

    @Override
    @Transactional
    public void updateEmployee(Employee employee) {
        Optional<Employee> oldEmployee = employeeRepository.findByName(employee.getName());

        oldEmployee.get().setName(employee.getName());
        oldEmployee.get().setSurname(employee.getSurname());
        oldEmployee.get().setSalary(employee.getSalary());
    }
}
