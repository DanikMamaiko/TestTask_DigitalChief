Зависимость spring-boot-starter-web:
необходимые компоненты для разработки WEB-приложения с помощью Spring MVC

Зависимость spring-boot-starter-test:
зависимость для написания тестов JUnit

Зависимость spring-boot-starter-data-jpa:
интеграция с JPA и для работы с БД

Зависимость mysql-connector-java:
для подключения к MySQL

Зависимость lombok:
уменьшает написания кода (getters, setters, constructors, HashCode, toString)

Зависимость spring-boot-docker-compose
для работы с Docker

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

Пошаговые инструкции для сборки и запуска приложения:
1. Запустить Docker Desktop
2. Запустить приложение
3. Проверка работы приложения (Файл endpoints.md)

    Для подключения к phpmyadmin и просмотра базы данных использовать localhost:8081
    Login: spring_user
    Password: spring_password

Если не работает через Docker, используйте pgAdmin и настройку applicaiton.properties

