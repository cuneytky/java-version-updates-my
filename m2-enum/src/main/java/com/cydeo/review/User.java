package com.cydeo.review;

public class User {

    public String userName;
    public String firstName;
    public String lastName;

    public Role role;

    public User(String userName, String firstName, String lastName, Role role) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", role=" + role +
                '}';
    }
}
