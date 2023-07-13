EndPoints for Department:
1. Show All: GET; http://localhost:8080/departments
2. Show by ID: GET; http://localhost:8080/departments/2
3. Save: POST; http://localhost:8080/departments
   {
   "name": "HR",
   "workersCount": 6,
   "minSalary": 400,
   "maxSalary": 2000
   }
4. Update: PUT; http://localhost:8080/departments
   {
   "id": 1,
   "name": "IT",
   "workersCount": 9,
   "minSalary": 300,
   "maxSalary": 3000
   }
5. Delete: DELETE; http://localhost:8080/departments/1


EndPoints for Employee:
1. Show All: GET; http://localhost:8080/employees
2. Show by ID: GET; http://localhost:8080/employees/2
3. Save: POST; http://localhost:8080/employees
   {
   "name": "Markus",
   "surname": "Rashford",
   "salary": 2000
   }
4. Update: PUT; http://localhost:8080/employees
   {
   "id": 2,
   "name": "Oleg",
   "surname": "Vlasov",
   "salary": 2000
   }
5. Delete: DELETE; http://localhost:8080/employees/2