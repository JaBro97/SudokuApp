package com.example.sudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBoxSimple;
    CheckBox checkBoxMedium;
    CheckBox checkBoxHard;

    Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxSimple = findViewById(R.id.checkBoxSimple);
        checkBoxMedium = findViewById(R.id.checkBoxMedium);
        checkBoxHard = findViewById(R.id.checkBoxHard);
        btnStart = findViewById(R.id.btnStart);

        checkBoxSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxMedium.setChecked(false);
                checkBoxHard.setChecked(false);
            }
        });
        checkBoxMedium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxSimple.setChecked(false);
                checkBoxHard.setChecked(false);
            }
        });
        checkBoxHard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxSimple.setChecked(false);
                checkBoxMedium.setChecked(false);
            }
        });

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBoxSimple.isChecked()){
                    Intent startGameEasy = new Intent(MainActivity.this, Game.class);
                    startGameEasy.putExtra("Difficulty", 1);                                  //1 ist einfach | 2 ist mittel | 3 ist schwer
                    startActivity(startGameEasy);
                }
                else if(checkBoxMedium.isChecked()){
                    Intent startGameMedium = new Intent(MainActivity.this, Game.class);
                    startGameMedium.putExtra("Difficulty", 2);
                    startActivity(startGameMedium);
                }
                else if(checkBoxHard.isChecked()){
                    Intent startGameHard = new Intent(MainActivity.this, Game.class);
                    startGameHard.putExtra("Difficulty", 3);
                    startActivity(startGameHard);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Bitte eine Schwierigkeit auswählen", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}