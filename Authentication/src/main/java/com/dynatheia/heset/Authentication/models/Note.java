package com.dynatheia.heset.Authentication.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;
import lombok.*;


@Entity(name = "Note")
@Table(
        name = "note"
)
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
//@Getter
//@Setter
@NoArgsConstructor
@Data
@Transactional
public class Note {

    @Id
//    @Column(name = "note_id")
    private long id;
    @Column
    private String note;
}
