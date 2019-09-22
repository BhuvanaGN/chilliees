package com.example.chilliees;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Button btnSingIn, btnSignUp;
        TextView captionText;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
