package com.yspertal.backend.entity;

import com.yspertal.backend.entity.keys.ProjectAttendeeKey;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@IdClass(ProjectAttendeeKey.class)
public class ProjectAttendee {

    @Id
    @ManyToOne
    @JoinColumn(name = "project_id", nullable = false, referencedColumnName = "id")
    private Project project;

    @Id
    @ManyToOne
    @JoinColumn(name = "attendee_id", nullable = false, referencedColumnName = "id")
    private Attendee attendee;
}
