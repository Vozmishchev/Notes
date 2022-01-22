package ru.gb.notes;

import java.util.ArrayList;
import java.util.List;

public interface NoteRepository {
    List<Note> getNote() ;

    void deleteNote(Note note);




}

