package ru.gb.notes;

public class Note {

    private int noteId;
    private String nameNote;
    private String contentText;

    public Note(int noteId,String nameNote, String contentText) {
        this.nameNote = nameNote;
        this.contentText = contentText;
        this.noteId = noteId;
    }

    public String getNameNote() {
        return nameNote;
    }

    public void setNameNote(String nameNote) {
        this.nameNote = nameNote;
    }

    public String getContentText() {
        return contentText;
    }

    public void setContentText(String contentText) {
        this.contentText = contentText;
    }

    public int getNoteId() {
        return noteId;
    }

    public void setNoteId(int noteId) {
        this.noteId = noteId;
    }
}
