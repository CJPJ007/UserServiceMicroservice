package com.comp.user.dto;

public class UserDTO {

    private String userId;
    private String firstName;
    private String lastName;

    public UserDTO(String userId, String firstName, String lastName) {
        this.userId=userId;
        this.firstName=firstName;
        this.lastName=lastName; 
    }
    
    public UserDTO() {
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
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

    
}
