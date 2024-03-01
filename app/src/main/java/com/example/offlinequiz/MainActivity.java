package com.example.offlinequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String selectedTopicName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout botany = findViewById(R.id.botanyLayout);
        final LinearLayout zoology = findViewById(R.id.zoologyLayout);
        final LinearLayout genetics = findViewById(R.id.geneticsLayout);
        final LinearLayout evolution = findViewById(R.id.evolutionLayout);

        final Button startBtn = findViewById(R.id.startQuizBtn);


        botany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopicName = "botany";

                botany.setBackgroundResource(R.drawable.round_back_white_stroke10);

                zoology.setBackgroundResource(R.drawable.round_back_gray10);
                genetics.setBackgroundResource(R.drawable.round_back_gray10);
                evolution.setBackgroundResource(R.drawable.round_back_gray10);
            }
        });

        zoology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "zoology";

                zoology.setBackgroundResource(R.drawable.round_back_white_stroke10);

                botany.setBackgroundResource(R.drawable.round_back_gray10);
                genetics.setBackgroundResource(R.drawable.round_back_gray10);
                evolution.setBackgroundResource(R.drawable.round_back_gray10);
            }
        });

        genetics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "genetics";

                genetics.setBackgroundResource(R.drawable.round_back_white_stroke10);

                zoology.setBackgroundResource(R.drawable.round_back_gray10);
                botany.setBackgroundResource(R.drawable.round_back_gray10);
                evolution.setBackgroundResource(R.drawable.round_back_gray10);
            }
        });

        evolution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "evolution";

                evolution.setBackgroundResource(R.drawable.round_back_white_stroke10);

                zoology.setBackgroundResource(R.drawable.round_back_gray10);
                genetics.setBackgroundResource(R.drawable.round_back_gray10);
                botany.setBackgroundResource(R.drawable.round_back_gray10);
            }
        });

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(selectedTopicName.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please select the Topic", Toast.LENGTH_SHORT).show();
                }
                else{

                    Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                    intent.putExtra("selectedTopic", selectedTopicName);
                    startActivity(intent);
                }
            }
        });
    }
}