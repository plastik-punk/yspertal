package com.yspertal.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Attendee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @OneToMany(mappedBy = "attendee")
    private List<AttendeeTimeConstraint> timeConstraints;

    @OneToMany(mappedBy = "attendee")
    private List<ProjectAttendee> projects;

    @OneToMany(mappedBy = "attendee")
    private List<AttendeeInstrument> instruments;
}
