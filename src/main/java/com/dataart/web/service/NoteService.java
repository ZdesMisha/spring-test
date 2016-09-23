package com.dataart.web.service;

import com.dataart.web.entity.Note;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by misha on 23.09.16.
 */
@Service
public interface NoteService {
    List<Note> findAll();
}
