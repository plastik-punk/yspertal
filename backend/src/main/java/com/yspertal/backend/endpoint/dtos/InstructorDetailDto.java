package com.yspertal.backend.endpoint.dtos;

import com.yspertal.backend.entity.Instructor;

public class InstructorDetailDto {
    private Integer id;
    private String firstName;
    private String lastName;
    private boolean isAdmin;

    public InstructorDetailDto() {
    }

    public InstructorDetailDto(Integer id, String firstName, String lastName, boolean isAdmin) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isAdmin = isAdmin;
    }

    public InstructorDetailDto(Instructor instructor) {
        this.id = instructor.getId();
        this.firstName = instructor.getFirstName();
        this.lastName = instructor.getLastName();
        this.isAdmin = instructor.getIsAdmin();
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public boolean getIsAdmin() {
        return this.isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
}
