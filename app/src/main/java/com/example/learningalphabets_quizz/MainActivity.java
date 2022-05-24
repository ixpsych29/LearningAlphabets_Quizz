package com.example.learningalphabets_quizz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void learn_alpha(View view) {
        Intent i = new Intent(this, learn.class);
        startActivity(i);
    }

    public void quizz(View view) {
        Intent in = new Intent(this, quizz.class);
        startActivity(in);
    }

    public void rapo(View view) {
        Intent inbrowse = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/murshad-044"));
        startActivity(inbrowse);
    }
}