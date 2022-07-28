package com.models;

public class Employee {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String email;
    private int phoneNumber;
    private int employeeId;

    //for making a new account in the database
    public Employee(String firstName, String lastName, String username, String password, String email, int phoneNumber) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setUsername(username);
        this.setPassword(password);
        this.setEmail(email);
        this.setPhoneNumber(phoneNumber);
    }

    //Getters Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString(){
        return "Employee{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", username='" + getUsername() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", password='" + getPassword() + '\'' +
                ", phoneNumber=" + getPhoneNumber() +
                '}';
    }
}
