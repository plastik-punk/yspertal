package com.yspertal.backend.entity.keys;

import com.yspertal.backend.entity.Attendee;
import com.yspertal.backend.entity.Instructor;

import java.util.Objects;

public class AttendeeInstructorKey {
    private Attendee attendee;
    private Instructor instructor;

    public AttendeeInstructorKey() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AttendeeInstructorKey that = (AttendeeInstructorKey) o;
        return Objects.equals(attendee, that.attendee) && Objects.equals(instructor, that.instructor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attendee, instructor);
    }
}
