package com.dynatheia.heset.Authentication.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;


@Entity(name = "Note")
@Table(
        name = "note"
)
public class Note {
    @Id
    private long id;
    private String note;

    public Note() {
    }
    public Note(String note, long id) {
        this.note = note;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note, long id) {
        this.note = note;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Note{" +
                "note='" + note + '\'' +
                '}';
    }
}
