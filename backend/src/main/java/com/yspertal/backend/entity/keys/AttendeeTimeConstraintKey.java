package com.yspertal.backend.entity.keys;

import com.yspertal.backend.entity.Attendee;

import java.io.Serializable;
import java.sql.Time;
import java.util.Objects;

public class AttendeeTimeConstraintKey implements Serializable {
    private Attendee attendee;
    private Time startTime;
    private Time endTime;

    public AttendeeTimeConstraintKey() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AttendeeTimeConstraintKey that = (AttendeeTimeConstraintKey) o;
        return Objects.equals(attendee, that.attendee) && Objects.equals(startTime, that.startTime) && Objects.equals(endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attendee, startTime, endTime);
    }
}
