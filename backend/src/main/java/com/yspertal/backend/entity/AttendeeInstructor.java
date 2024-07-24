package com.yspertal.backend.entity;

import com.yspertal.backend.entity.keys.AttendeeInstructorKey;
import com.yspertal.backend.enums.Intensity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@IdClass(AttendeeInstructorKey.class)
public class AttendeeInstructor {

    @Id
    @ManyToOne
    @JoinColumn(name = "attendee_id", nullable = false, referencedColumnName = "id")
    private Attendee attendee;

    @Id
    @ManyToOne
    @JoinColumn(name = "instructor_id", nullable = false, referencedColumnName = "id")
    private Instructor instructor;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Intensity intensity;
}
