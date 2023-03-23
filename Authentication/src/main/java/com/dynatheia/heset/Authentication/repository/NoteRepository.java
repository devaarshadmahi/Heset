package com.dynatheia.heset.Authentication.repository;

import com.dynatheia.heset.Authentication.models.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
}
