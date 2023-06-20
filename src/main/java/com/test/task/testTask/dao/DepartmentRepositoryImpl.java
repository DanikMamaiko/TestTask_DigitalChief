package com.test.task.testTask.dao;

import com.test.task.testTask.entities.Department;
import com.test.task.testTask.entities.Employee;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DepartmentRepositoryImpl implements DepartmentRepository{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Department> getAllDepartments() {
        Session session = entityManager.unwrap(Session.class);
        List <Department> allDepartments = session.createQuery("from Department", Department.class).getResultList();
        return allDepartments;
    }

    @Override
    public void saveDepartment(Department department) {
        Session session = entityManager.unwrap(Session.class);
        session.save(department);
    }

    @Override
    public Department showDepartment(int id) {
        Session session = entityManager.unwrap(Session.class);
        Department department = session.get(Department.class, id);
        return department;
    }

    @Override
    public void deleteDepartment(int id) {
        Session session = entityManager.unwrap(Session.class);
        Department department = session.get(Department.class, id);
        for(Employee employee: department.getEmps()){
            employee.setDepartment(null);
        }
        session.delete(department);
    }

    @Override
    public void updateDepartment(Department department) {
        Session session = entityManager.unwrap(Session.class);
        Department oldDepart = session.get(Department.class, department.getId());

        oldDepart.setName(department.getName());
        oldDepart.setWorkersCount(department.getWorkersCount());
        oldDepart.setMinSalary(department.getMinSalary());
        oldDepart.setMaxSalary(department.getMaxSalary());
    }
}
