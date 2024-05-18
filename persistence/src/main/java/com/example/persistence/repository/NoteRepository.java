package com.example.persistence.repository;

import java.util.UUID;
import com.example.persistence.model.Note;
import org.springframework.data.repository.CrudRepository;


public interface NoteRepository extends CrudRepository<Note,UUID>  {

}
