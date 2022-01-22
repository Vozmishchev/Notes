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

    private NoteRepository noteRepository = new SimpleNoteRepository();
    private NoteAdapter adapter;
    private ImageButton addNotesButton;
    private static final String NEW_NOTE_KEY = "action";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        noteRepository = App.get(this).getNoteRepository();

        RecyclerView recyclerView = findViewById(R.id.recyclerview_notes);
        adapter = new NoteAdapter(noteRepository.getNote(),this);
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
}
