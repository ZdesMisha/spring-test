package com.dataart.web.dao;

import com.dataart.web.entity.Note;

import java.util.List;

/**
 * Created by misha on 23.09.16.
 */

public interface NoteDao {
    List<Note> findAll();
}
