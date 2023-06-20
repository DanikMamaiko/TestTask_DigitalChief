CREATE TABLE test_db.departments (
id int NOT NULL AUTO_INCREMENT,
name varchar(15),
workers_count int,
max_salary int,
min_salary int,
PRIMARY KEY (id)
);

CREATE TABLE test_db.employees (
id int NOT NULL AUTO_INCREMENT,
name varchar(15),
surname varchar(25),
salary int,
department_id int,
PRIMARY KEY (id),
FOREIGN KEY (department_id) REFERENCES test_db.departments(id));

Создаются две сущности: Departments & Employees
Тип связи: Один ко Многим

Departments атрибуты: название департамента, 
            кол-во работников в департаменте,
            максимальная зп в департаменте,
            минимальная зп в департаменте

Employees атрибуты: имя работника,
                фамилия работника
                зп
                ключ для подключения к Departments