package com.yspertal.backend.endpoint.dtos;

public class InstructorLoginDto {
    private String firstName;
    private String lastName;

    public InstructorLoginDto() {
    }

    public InstructorLoginDto(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
