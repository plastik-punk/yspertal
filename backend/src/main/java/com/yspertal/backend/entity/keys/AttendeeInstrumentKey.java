package com.yspertal.backend.entity.keys;

import com.yspertal.backend.entity.Attendee;
import com.yspertal.backend.entity.Instrument;

import java.util.Objects;

public class AttendeeInstrumentKey {
    private Attendee attendee;
    private Instrument instrument;

    public AttendeeInstrumentKey() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AttendeeInstrumentKey that = (AttendeeInstrumentKey) o;
        return Objects.equals(attendee, that.attendee) && instrument == that.instrument;
    }

    @Override
    public int hashCode() {
        return Objects.hash(attendee, instrument);
    }
}
