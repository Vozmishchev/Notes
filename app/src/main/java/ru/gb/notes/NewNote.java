package ru.gb.notes;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class NewNote extends AppCompatActivity {

    private EditText titleTextEditText;
    private EditText contentTextEditText;
    private String action;
    private ImageButton saveButton;
    private static final String NEW_NOTE_KEY = "action";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_note);

        titleTextEditText = findViewById(R.id.titleText_edit_text);
        contentTextEditText = findViewById(R.id.contentText_edit_text);
        saveButton = findViewById(R.id.save_Button);

        Intent intent = getIntent();
        action = intent.getStringExtra(NEW_NOTE_KEY);
    }
}

