package com.test.task.testTask.service.impl;

import com.test.task.testTask.dao.DepartmentRepository;
import com.test.task.testTask.entities.Department;
import com.test.task.testTask.entities.Employee;
import com.test.task.testTask.service.interf.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    @Transactional
    public List<Department> getAllDepartments() {
        List <Department> allDepartments = departmentRepository.findAll();
        return allDepartments;
    }

    @Override
    @Transactional
    public void saveDepartment(Department department) {
        departmentRepository.save(department);
    }

    @Override
    @Transactional
    public Department showDepartment(int id) {
        Optional <Department> department = departmentRepository.findById(id);
        return department.get();
    }

    @Override
    @Transactional
    public void deleteDepartment(int id) {
        Optional <Department> department = departmentRepository.findById(id);
        for(Employee employee: department.get().getEmps()){
            employee.setDepartment(null);
        }
        departmentRepository.delete(department.get());
    }

    @Override
    @Transactional
    public void updateDepartment(Department department) {
        Optional <Department> oldDepart = departmentRepository.findByName(department.getName());

        oldDepart.get().setName(department.getName());
        oldDepart.get().setWorkersCount(department.getWorkersCount());
        oldDepart.get().setMinSalary(department.getMinSalary());
        oldDepart.get().setMaxSalary(department.getMaxSalary());
    }
}
