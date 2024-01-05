package com.example.javaquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String[] question ={"Java is a person?", "Java is introduced in 1233?", "Java was created using Python?",
            "Java has abstract classes", "Java support interface?"};
    private boolean[] answer = {false, false , false, true, true};
    private int score = 0;
    private int index = 0;
    Button yes;
    Button no;
    TextView ques;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        ques = findViewById(R.id.question);
        ques.setText(question[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index <= question.length-1){
                    if(answer[index] == true){
                        score++;
                    }
                    index++;
                    if(index <= question.length-1){
                        ques.setText(question[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your score is: " + score, Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index <= question.length-1){
                    if(answer[index] == false){
                        score++;
                    }
                    index++;
                    if(index <= question.length-1){
                        ques.setText(question[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your score is: " + score, Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}