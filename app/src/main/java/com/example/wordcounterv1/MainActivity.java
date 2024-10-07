package com.example.wordcounterv1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText inputText;
    private TextView wordCountResult;
    private TextView characterCountResult;

    private Count counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = findViewById(R.id.inputText);
        wordCountResult = findViewById(R.id.wordCountResult);
        characterCountResult = findViewById(R.id.characterCountResult);
        Button countWordsButton = findViewById(R.id.countWordsButton);
        Button countCharactersButton = findViewById(R.id.countCharactersButton);

        counter = new Count();

        countWordsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = inputText.getText().toString();
                int wordCount = counter.countWords(text);
                wordCountResult.setText("Word Count: " + wordCount);
            }
        });

        countCharactersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = inputText.getText().toString();
                int characterCount = counter.countCharacters(text);
                characterCountResult.setText("Character Count: " + characterCount);
            }
        });
    }
}
