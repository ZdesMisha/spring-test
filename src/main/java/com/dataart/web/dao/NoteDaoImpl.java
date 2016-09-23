package com.dataart.web.dao;

import com.dataart.web.entity.Note;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by misha on 23.09.16.
 */
@Repository
public class NoteDaoImpl implements NoteDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Note> findAll() {
        return entityManager.createNamedQuery("SELECT c FROM Note c", Note.class).getResultList();
    }
}
