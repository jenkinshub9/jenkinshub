package com.org.model;
 
public class LoginVO {
   
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    private String userName;
    private String password;
   
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "LoginVO [userName=" + userName + ", password=" + password + "]";
    }
 
}