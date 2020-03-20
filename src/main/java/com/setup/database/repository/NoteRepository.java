package com.setup.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.setup.database.model.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}