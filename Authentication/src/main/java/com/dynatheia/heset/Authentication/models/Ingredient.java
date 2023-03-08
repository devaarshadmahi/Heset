package com.dynatheia.heset.Authentication.models;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Entity
@Table(name = "ingredient")
@Transactional
@Data
@AllArgsConstructor
@EqualsAndHashCode
public class Ingredient {
    @Id
    @Column(name = "ingredient_id")
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String ingredient;
    @Column(nullable = true)
    private boolean isBad;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "ingredient_id")
    private List<Note> note;
}
