package edu.qc.seclass.fim;

public class User {
    public String username;
    public String password;
    boolean isEmployee;

//constructors
    public User(String username, String password, boolean isEmployee) {
        this.username = username;
        this.password = password;
        this.isEmployee = isEmployee;
    }

    public User() {
    }

//getters and setters
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

    public boolean isEmployee() {
        return isEmployee;
    }

    public void setEmployee(boolean employee) {
        isEmployee = employee;
    }

    //toString for testing
    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", isEmployee=" + isEmployee +
                '}';
    }
}
