# Restful_API

### How to use?

1. Create a databse named "rest".
2. Change username and password in "application.yml" according to your MySQL settings.
3. Run "main" function in "DemoApplication.java". This step creates a "student" table in the "rest" database.
4. Add some data in "student" table.
5. Use the following restful APIs to retrieve data from database.

    - GET http://localhost:8080/api/students    # get all students
    - GET http://localhost:8080/api/students/{id} # get a student by id
    - POST http://localhost:8080/api/students # insert a student
    - PUT http://localhost:8080/api/students # update a student
    - DELETE http://localhost:8080/api/students/{id} # delete a student by id
    - GET http://localhost:8080/api/studentsInfo/{age} # get all students below age (I used customized query to implement this one)
