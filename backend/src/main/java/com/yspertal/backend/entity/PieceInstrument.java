package com.yspertal.backend.entity;

import com.yspertal.backend.entity.keys.PieceInstrumentKey;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@IdClass(PieceInstrumentKey.class)
public class PieceInstrument {

    @Id
    @ManyToOne
    @JoinColumn(name = "piece_id", nullable = false, referencedColumnName = "id")
    private Piece piece;

    @Id
    @ManyToOne
    @JoinColumn(name = "instrument_id", nullable = false, referencedColumnName = "id")
    private Instrument instrument;

    @Column(nullable = false)
    private Integer amount;
}
