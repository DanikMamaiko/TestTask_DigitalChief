package com.test.task.testTask.dao;

import com.test.task.testTask.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface EmployeeRepository {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee showEmployee(int id);

    public void deleteEmployee(int id);

    public void updateEmployee(Employee employee);

}
