package com.example.sudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBoxSimple;

    Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxSimple = findViewById(R.id.checkBoxSimple);
        btnStart = findViewById(R.id.btnStart);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBoxSimple.isChecked()){
                    Intent startGameEasy = new Intent(MainActivity.this, Game.class);
                    startGameEasy.putExtra("Easy", 1);                                  //1 ist einfach | 2 ist mittel | 3 ist schwer
                    startActivity(startGameEasy);
                }
                //HIER MUSS DANN MITEL UND SCHWER EINGEFÜGT WERDEN
                else{
                    //do nothing
                }
            }
        });
    }
}