package com.dataart.web.service;

import com.dataart.web.dao.NoteDao;
import com.dataart.web.entity.Note;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by misha on 23.09.16.
 */

public class NoteServiceImpl implements NoteService {

    @Autowired
    NoteDao noteDao;

    @Override
    public List<Note> findAll() {
        return noteDao.findAll();
    }
}
