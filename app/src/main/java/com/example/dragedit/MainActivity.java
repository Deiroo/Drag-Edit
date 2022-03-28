package com.example.dragedit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    private ViewGroup mainLayout;
    private CustomImageView delfin;
    private CustomImageView gatito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainLayout = findViewById(R.id.main);
        delfin = findViewById(R.id.pollito);
    }

}
