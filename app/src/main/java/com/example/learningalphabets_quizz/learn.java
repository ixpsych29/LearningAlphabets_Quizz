package com.example.learningalphabets_quizz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class learn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
    }

    public void a_click(View view) {
        Intent in = new Intent(this, alpha_a.class);
        startActivity(in);
    }

    public void b_click(View view) {
        Intent in = new Intent(this, alpha_b.class);
        startActivity(in);
    }

    public void c_click(View view) {
        Intent in = new Intent(this, alpha_c.class);
        startActivity(in);
    }

    public void d_click(View view) {
        Intent in = new Intent(this, alpha_d.class);
        startActivity(in);
    }
}