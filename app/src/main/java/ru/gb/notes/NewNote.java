package ru.gb.notes;

import android.os.Bundle;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class NewNote extends AppCompatActivity {

    private EditText titleTextEditText;
    private EditText contentTextEditText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_note);

        titleTextEditText = findViewById(R.id.titleText_edit_text);
        contentTextEditText = findViewById(R.id.contentText_edit_text);
    }
}

