package com.yspertal.backend.entity.keys;

import com.yspertal.backend.entity.Piece;
import com.yspertal.backend.entity.Instrument;

import java.util.Objects;

public class PieceInstrumentKey {
    private Piece piece;
    private Instrument instrument;

    public PieceInstrumentKey() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PieceInstrumentKey that = (PieceInstrumentKey) o;
        return Objects.equals(piece, that.piece) && Objects.equals(instrument, that.instrument);
    }

    @Override
    public int hashCode() {
        return Objects.hash(piece, instrument);
    }
}
