package com.dynatheia.heset.Authentication.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
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
@AllArgsConstructor
@Data
public class Note {

    @Id
    private long id;

    private String note;

    @Override
    public String toString() {
        return "Note{" +
                "note='" + note + '\'' +
                '}';
    }
}
