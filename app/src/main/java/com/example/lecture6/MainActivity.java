package com.example.lecture6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button preview = findViewById(R.id.preview);
        Button nextview = findViewById(R.id.nextview);
        final ViewFlipper viewfliper = findViewById(R.id.ViewFliper1);

        preview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewfliper.showPrevious();
            }
        });
        nextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewfliper.showNext();
            }
        });

    }
}