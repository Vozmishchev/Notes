package ru.gb.notes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayList<Note> noteList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setInitialData();

        RecyclerView recyclerView = findViewById(R.id.recyclerview_notes);
        NoteAdapter adapter = new NoteAdapter(noteList, MainActivity.this);
        recyclerView.setAdapter(adapter);


    }

    private void setInitialData() {

        noteList.add(new Note("Бразилия", "Бразилиа"));
        noteList.add(new Note("Аргентина", "Буэнос-Айрес"));
        noteList.add(new Note("Колумбия", "Богота"));
        noteList.add(new Note("Уругвай", "Монтевидео"));
        noteList.add(new Note("Чили", "Сантьяго"));
    }
}
