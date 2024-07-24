package com.yspertal.backend.entity.keys;

import java.util.Objects;

public class ProjectAttendeeKey {
    private Integer project;
    private Integer attendee;

    public ProjectAttendeeKey() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectAttendeeKey that = (ProjectAttendeeKey) o;
        return Objects.equals(project, that.project) && Objects.equals(attendee, that.attendee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(project, attendee);
    }
}
