package com.dataart.web.controller.rest;

import com.dataart.web.entity.Note;
import com.dataart.web.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by misha on 23.09.16.
 */
@RestController
@RequestMapping(value = "/notes")
public class NoteController {

    @Autowired
    NoteService noteService;


    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Note> getNotes() {
        return noteService.findAll();
    }
}
