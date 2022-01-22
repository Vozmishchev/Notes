package ru.gb.notes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class SimpleNoteRepository implements NoteRepository {
    private final List<Note> simple = new ArrayList<>();
    private int noteId;

    public SimpleNoteRepository() {
        simple.addAll(setInitialData());
    }

    private static List<Note> setInitialData() {

        final List<Note> noteList = new ArrayList<>();
        noteList.add(new Note(1, "Название заметки", "Текст заметки"));
        noteList.add(new Note(2, "Название заметки", "Текст заметки"));
        noteList.add(new Note(3, "Название заметки", "Текст заметки"));
        noteList.add(new Note(4, "Название заметки", "Текст заметки"));
        return noteList;
    }

    @Override
    public List<Note> getNote() {
        return new ArrayList<>(simple);
    }

    @Override
    public void deleteNote(Note note) {

    }
//
//    private int findPosition(Note note) {
//        for (int i = 0; i < simple.size(); i++) {
//            if (note.getNoteId() == noteId) {
//                return i;
//            }
//        }
//        return 0;
//    }
}


