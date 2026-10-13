package com.example.mygreetingapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText nameInput;
    Button helloButton;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        nameInput = findViewById(R.id.nameInput);
        helloButton = findViewById(R.id.helloButton);
        resultText = findViewById(R.id.resultText);

        helloButton.setOnClickListener(v -> {
            String name = nameInput.getText().toString();
            resultText.setText("Hello " + name + "!");
        });
    }
}