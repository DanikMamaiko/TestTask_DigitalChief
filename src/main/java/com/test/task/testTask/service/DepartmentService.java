package com.test.task.testTask.service;

import com.test.task.testTask.entities.Department;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DepartmentService {

    public List<Department> getAllDepartments();

    public void saveDepartment(Department department);

    public Department showDepartment(int id);

    public void deleteDepartment(int id);

    public void updateDepartment(Department department);

}
