package com.services;

import com.models.Employee;
import com.utils.ConnectionManager;

import java.sql.*;
import java.util.Properties;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class EmployeeServices {

    private ConnectionManager connManager;

//constructor
//getter and setter

    public ID insert(Employee e);
    //inserts employee record and return id (int)
//call init()
//set string: firstname, lastname, email, username, password
    SQL statement -> insert into (firstname, lastname, email, username, "password") values (e.getFirstName, e.getLastName(), e.getEmail(), e.getUsername(), e.getPassword())
//call exec()
//return id

    public void delete(Employee e);
    //deletes employee record by email
//call init()
//set string: email
    SQL statement -> delete from employees where email = e.getEmail();
//call exec()

    public void updateInfo(Employee e, String firstname, String lastname, String username);
    //updates employee record by email
//manager can update firstname, lastname, username
//call init()
//set string: firstname, lastname, email, username
    SQL statment -> update employees set firstname=_firstname, lastname=_lastname, username=_username where email=e.getEmail();
//call exec()

    public void updatePassword(Manager m, String password);
    //updates manager password by email
//call init()
//set string: password
    SQL statement -> update managers set password=_password where email=m.getEmail();
//call exec()

    public Employee getByID(ID id);
    //gets employee record by id
//init()
//set: id (int)
    SQL statement -> select * from employee where id=e.getID()
//exec()
//get employee data members from result set
//return new Employee

    pubic ID getID(Employee e);
    //gets employees id by employee email
//init()
//set: email (string)
    SQL statement -> select id from employees where email=e.getEmail()
//exec()
//get id from result set
//return id

    public PreparedStatement init(String sql);
//get connection
//set auto commit
//prepare statement w/ sql string
//return prepared statement

    public ResultSet exec(PreparedStatement);
//execute query
//close statement
//close connection
//return result set
}

