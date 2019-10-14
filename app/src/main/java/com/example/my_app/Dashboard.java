package com.example.my_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        TextView profile = (TextView) findViewById(R.id.profile);
        TextView qa = (TextView) findViewById(R.id.qa);
        TextView quiz = (TextView) findViewById(R.id.quiz);
        TextView pquiz = (TextView) findViewById(R.id.pquiz);
        /*profile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent profileIntent = new Intent(Dashboard.this, Profile.class);
                startActivity(profileIntent);

            }
        });
        qa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent profileIntent = new Intent(Dashboard.this, Profile.class);
                startActivity(profileIntent);

            }
        });*/
        quiz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent quizIntent = new Intent(Dashboard.this, CreateQuiz.class);
                startActivity(quizIntent);

            }
        });
        pquiz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent pquizIntent = new Intent(Dashboard.this, PlayQuiz.class);
                startActivity(pquizIntent);

            }
        });
    }
}
