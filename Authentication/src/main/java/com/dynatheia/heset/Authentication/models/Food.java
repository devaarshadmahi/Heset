package com.dynatheia.heset.Authentication.models;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Entity
@Table(name = "food")
@Transactional
@Data
@EqualsAndHashCode
public class Food {
    @Id
    private Long id;
    @Column(name = "upc")
    private String upc;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_note_id")
    private List<Note> note;
}
