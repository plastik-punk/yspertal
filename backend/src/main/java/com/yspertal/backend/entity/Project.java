package com.yspertal.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.time.LocalTime;
import java.util.List;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "instructor_id", nullable = false, referencedColumnName = "id")
    private Instructor instructor;

    @OneToOne
    @JoinColumn(name = "piece_id", nullable = false, referencedColumnName = "id")
    private Piece piece;

    @Column
    private LocalTime startTime;

    @Column
    private Integer minutes;

    @OneToMany(mappedBy = "project")
    private List<ProjectAttendee> attendees;
}
