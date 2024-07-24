package com.yspertal.backend.entity;

import com.yspertal.backend.entity.keys.AttendeeInstrumentKey;
import com.yspertal.backend.enums.Level;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@IdClass(AttendeeInstrumentKey.class)
public class AttendeeInstrument {

    @Id
    @ManyToOne
    @JoinColumn(name = "attendee_id", nullable = false, referencedColumnName = "id")
    private Attendee attendee;

    @Id
    @ManyToOne
    @JoinColumn(name = "instrument_id", nullable = false, referencedColumnName = "id")
    private Instrument instrument;

    @Column
    @Enumerated(EnumType.STRING)
    private Level level;
}
