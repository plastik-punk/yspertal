package com.yspertal.backend.endpoint.dtos;

public class InstructorCreateDto {
    private String firstName;
    private String lastName;
    private boolean isAdmin;

    public InstructorCreateDto() {
    }

    public InstructorCreateDto(String firstName, String lastName, boolean isAdmin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isAdmin = isAdmin;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public boolean getIsAdmin() {
        return this.isAdmin;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
}
