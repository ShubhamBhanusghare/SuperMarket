package com.supermarket.model;

public class User {

    private final String userId;
    private final String userName;
    private  String password;
    private final Roles role;

    public User(String userId, String userName, String password, Roles role) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.role = role;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public Roles getRole() {
        return role;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    //Questions: used only getters for other fields and setter only for password
    // Also in toString() we have not used password

}
