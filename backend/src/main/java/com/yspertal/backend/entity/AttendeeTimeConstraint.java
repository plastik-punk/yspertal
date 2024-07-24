package com.yspertal.backend.entity;

import com.yspertal.backend.entity.keys.AttendeeTimeConstraintKey;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalTime;

@Entity
@IdClass(AttendeeTimeConstraintKey.class)
public class AttendeeTimeConstraint {

    @Id
    @ManyToOne
    @JoinColumn(name = "attendee_id", nullable = false, referencedColumnName = "id")
    private Attendee attendee;

    @Id
    @Column(nullable = false)
    private LocalTime startTime;

    @Id
    @Column(nullable = false)
    private LocalTime endTime;
}
