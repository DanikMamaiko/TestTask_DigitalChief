package com.test.task.testTask.service;

import com.test.task.testTask.dao.DepartmentRepository;
import com.test.task.testTask.entities.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    @Transactional
    public List<Department> getAllDepartments() {
        return departmentRepository.getAllDepartments();
    }

    @Override
    @Transactional
    public void saveDepartment(Department department) {
        departmentRepository.saveDepartment(department);
    }

    @Override
    @Transactional
    public Department showDepartment(int id) {
        return departmentRepository.showDepartment(id);
    }

    @Override
    @Transactional
    public void deleteDepartment(int id) {
        departmentRepository.deleteDepartment(id);
    }

    @Override
    @Transactional
    public void updateDepartment(Department department) {
        departmentRepository.updateDepartment(department);
    }
}
