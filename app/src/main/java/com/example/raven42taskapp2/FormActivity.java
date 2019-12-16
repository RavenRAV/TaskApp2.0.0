package com.example.raven42taskapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FormActivity extends AppCompatActivity {
    private EditText editTittle, editDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        editTittle = findViewById(R.id.editTittle);
        editDescription = findViewById(R.id.editDescription);

    }

    public void onClick(View view) {
        String title = editTittle.getText().toString().trim();
        String description = editDescription.getText().toString().trim();
        Intent intent = new Intent();
        Task task = new Task(title, description);
        intent.putExtra("task", task);
        setResult(RESULT_OK, intent);
        finish();
    }
}
