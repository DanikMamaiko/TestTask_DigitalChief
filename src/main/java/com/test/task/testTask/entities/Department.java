package com.test.task.testTask.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="departments")
@NoArgsConstructor
@AllArgsConstructor
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    int id;

    @Column(name="name")
    String name;

    @Column(name="workers_count")
    int workersCount;

    @Column(name="min_salary")
    int minSalary;

    @Column(name="max_salary")
    int maxSalary;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH}, mappedBy = "department")
    List<Employee> emps;

    public void addEmployeeToDepartment(Employee employee){
        if(emps == null){
            emps = new ArrayList<>();
        }
        emps.add(employee);
        employee.setDepartment(this);
    }

    public Department(String name, int workersCount, int minSalary, int maxSalary) {
        this.name = name;
        this.workersCount = workersCount;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWorkersCount() {
        return workersCount;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public List<Employee> getEmps() {
        return emps;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkersCount(int workersCount) {
        this.workersCount = workersCount;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    public void setEmps(List<Employee> emps) {
        this.emps = emps;
    }


}
