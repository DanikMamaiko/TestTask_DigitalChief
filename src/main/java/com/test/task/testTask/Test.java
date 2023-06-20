package com.test.task.testTask;

import com.test.task.testTask.entities.Department;
import com.test.task.testTask.entities.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
        try{
            session = sessionFactory.getCurrentSession();

            Department department = new Department("IT", 9, 300, 3000);
            Employee emp1 = new Employee("Danik", "Mamaiko", 300);
            Employee emp2 = new Employee("Ivan", "Ivanov", 3000);

            department.addEmployeeToDepartment(emp1);
            department.addEmployeeToDepartment(emp2);

            session.beginTransaction();

            session.save(department);
//            Department department = session.get(Department.class, 8);
//            session.delete(department);

            session.getTransaction().commit();
            System.out.println("Done!");

        } finally {
            session.close();
            sessionFactory.close();
        }

    }
}
