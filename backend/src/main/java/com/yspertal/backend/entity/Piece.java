package com.yspertal.backend.entity;

import com.yspertal.backend.enums.Level;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.List;

@Entity
public class Piece {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private String title;

    @Column
    @Enumerated(EnumType.STRING)
    private Level difficulty;

    @OneToMany(mappedBy = "piece")
    private List<PieceInstrument> instruments;

    @OneToOne(mappedBy = "piece")
    private Project project;
}
