package ru.gb.notes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final NoteRepository noteRepository = new SimpleNoteRepository();
    List<Note> noteList = new ArrayList<>();
    private ImageButton addNotesButton;
    private static final String NEW_NOTE_KEY = "action";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setInitialData();

        RecyclerView recyclerView = findViewById(R.id.recyclerview_notes);
        NoteAdapter adapter = new NoteAdapter(noteList, MainActivity.this);
        recyclerView.setAdapter(adapter);
        addNotesButton = findViewById(R.id.addNotes_Button);

        addNotesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NewNote.class);
                intent.putExtra(NEW_NOTE_KEY, "create");
                startActivity(intent);
            }
        });


    }

    private void setInitialData() {

        noteList.add(new Note(1, "Название заметки", "Текст заметки"));
        noteList.add(new Note(2, "Название заметки", "Текст заметки"));
        noteList.add(new Note(3, "Название заметки", "Текст заметки"));
        noteList.add(new Note(4, "Название заметки", "Текст заметки"));

    }
}
