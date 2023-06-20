package com.test.task.testTask.dao;

import com.test.task.testTask.entities.Department;
import com.test.task.testTask.entities.Employee;

import java.util.List;

public interface DepartmentRepository {

    public List<Department> getAllDepartments();

    public void saveDepartment(Department department);

    public Department showDepartment(int id);

    public void deleteDepartment(int id);

    public void updateDepartment(Department department);

}
