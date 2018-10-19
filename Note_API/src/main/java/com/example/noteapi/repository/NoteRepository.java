package com.example.noteapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.noteapi.model.Note;

@Repository
public interface NoteRepository  extends JpaRepository<Note, Long>{

}
