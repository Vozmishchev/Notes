package ru.gb.notes;

import android.app.Application;
import android.content.Context;


public class App extends Application {

    private NoteRepository noteRepository = new SimpleNoteRepository();

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public static App get(Context context) {
        return (App) context.getApplicationContext();
    }

    public NoteRepository getNoteRepository() {
        return noteRepository;
    }
}