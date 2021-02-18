package com.lomaikai.cardviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Button btnSnackBar;
    private ConstraintLayout parent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSnackBar = findViewById(R.id.btnSnackBar);
        parent = findViewById(R.id.parent);

        btnSnackBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSnackBar();
            }
        });
    }

    private void showSnackBar() {
        Snackbar.make(parent,"This is a Snackbar",Snackbar.LENGTH_INDEFINITE)
            .setAction("Retry", new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(MainActivity.this,"Retry clicked",Toast.LENGTH_SHORT).show();
                }
            })
            .setActionTextColor(Color.RED)
            .setTextColor(Color.BLUE)
            .show();
    }
}