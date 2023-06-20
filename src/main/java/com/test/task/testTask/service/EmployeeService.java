package com.test.task.testTask.service;

import com.test.task.testTask.entities.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee showEmployee(int id);

    public Employee updateEmployee(Employee employee);

    public void deleteEmployee(int id);
}
