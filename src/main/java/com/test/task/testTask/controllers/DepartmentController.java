package com.test.task.testTask.controllers;

import com.test.task.testTask.entities.Department;
import com.test.task.testTask.service.interf.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/departments")
    public List<Department> getAllDepartments(){
        List <Department> allDepartments = departmentService.getAllDepartments();
        return allDepartments;
    }

    @GetMapping("/departments/{id}")
    public Department getDepartmentById(@PathVariable("id") int id){
        return departmentService.showDepartment(id);
    }

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        departmentService.saveDepartment(department);
        return department;
    }

    @PutMapping("/departments")
    public Department updateDepartment(@RequestBody Department department){
        departmentService.updateDepartment(department);
        return department;
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartment(@PathVariable("id") int id){
        departmentService.deleteDepartment(id);
        return "Department with ID = " + id + " was deleted";
    }

}
