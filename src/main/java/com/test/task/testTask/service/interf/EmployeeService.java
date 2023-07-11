package com.test.task.testTask.service.interf;

import com.test.task.testTask.entities.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee showEmployee(int id);

    public void updateEmployee(Employee employee);

    public void deleteEmployee(int id);
}
