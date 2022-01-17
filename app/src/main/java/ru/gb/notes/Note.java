package ru.gb.notes;

public class Note {

    private String nameNote;
    private String contentText;

    public Note(String nameNote, String contentText) {
        this.nameNote = nameNote;
        this.contentText = contentText;
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
}
