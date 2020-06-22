package com.example.sudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.util.LinkedList;

public class Game extends AppCompatActivity implements View.OnClickListener{

    CheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7, checkBox8, checkBox9;
    CheckBox checkBoxes[] = new CheckBox[9];
    //SudokuLogic sudoku = new SudokuLogic();
    Button buttons[][] = new Button[9][9];
    Button btnCorrect;
    Button btnCurrentSolutionCorrect;
    Button btnUndo;
    TextView txtViewCorrect;
    int[][] currentResult= new int[9][9];
    int[][] sudoku = new int[9][9];
    LinkedList<int[][]> zwischenstand = new LinkedList<int[][]>();


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        btnCorrect = findViewById(R.id.btnCorrect);
        btnCurrentSolutionCorrect = findViewById(R.id.btnCurrentSolutionCorrect);
        txtViewCorrect = findViewById(R.id.txtViewCorrect);
        txtViewCorrect.setText("");
        btnUndo = findViewById(R.id.btnUndo);


        //buttons Reihe 1
        buttons[0][0] = findViewById(R.id.btn11);
        buttons[0][1] = findViewById(R.id.btn12);
        buttons[0][2] = findViewById(R.id.btn13);
        buttons[0][3] = findViewById(R.id.btn14);
        buttons[0][4] = findViewById(R.id.btn15);
        buttons[0][5] = findViewById(R.id.btn16);
        buttons[0][6] = findViewById(R.id.btn17);
        buttons[0][7] = findViewById(R.id.btn18);
        buttons[0][8] = findViewById(R.id.btn19);
        //buttons Reihe 1 ONCLickListeners
        buttons[0][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[0][0]);
                machWas(0, 0);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[0][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
                int[][] currentresultLocal = new int[9][9];
                for(int i = 0; i < 9; i++){
                      for(int j = 0; j < 9; j++){
                            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
                         }
                }
                setButtonTextToCheckBox(buttons[0][1]);
                machWas(0, 1);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[0][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[0][2]);
                machWas(0, 2);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[0][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[0][3]);
                machWas(0, 3);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[0][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[0][4]);
                machWas(0, 4);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[0][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[0][5]);
                machWas(0, 5);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[0][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[0][6]);
                machWas(0, 6);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[0][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[0][7]);
                machWas(0, 7);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[0][8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[0][8]);
                machWas(0, 8);
            }
        });

        //buttons Reihe 2
        buttons[1][0] = findViewById(R.id.btn21);
        buttons[1][1] = findViewById(R.id.btn22);
        buttons[1][2] = findViewById(R.id.btn23);
        buttons[1][3] = findViewById(R.id.btn24);
        buttons[1][4] = findViewById(R.id.btn25);
        buttons[1][5] = findViewById(R.id.btn26);
        buttons[1][6] = findViewById(R.id.btn27);
        buttons[1][7] = findViewById(R.id.btn28);
        buttons[1][8] = findViewById(R.id.btn29);
        //Buttons Reihe 2 OnClickListener
        buttons[1][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[1][0]);
                machWas(1, 0);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[1][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[1][1]);
                machWas(1, 1);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[1][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[1][2]);
                machWas(1, 2);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[1][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[1][3]);
                machWas(1, 3);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[1][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[1][4]);
                machWas(1, 4);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[1][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[1][5]);
                machWas(1, 5);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[1][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[1][6]);
                machWas(1, 6);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[1][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[1][7]);
                machWas(1, 7);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[1][8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[1][8]);
                machWas(1, 8);
zwischenstand.addLast(currentresultLocal);
            }
        });

        //buttons Reihe 3
        buttons[2][0] = findViewById(R.id.btn31);
        buttons[2][1] = findViewById(R.id.btn32);
        buttons[2][2] = findViewById(R.id.btn33);
        buttons[2][3] = findViewById(R.id.btn34);
        buttons[2][4] = findViewById(R.id.btn35);
        buttons[2][5] = findViewById(R.id.btn36);
        buttons[2][6] = findViewById(R.id.btn37);
        buttons[2][7] = findViewById(R.id.btn38);
        buttons[2][8] = findViewById(R.id.btn39);
        //Buttons Reihe 3 OnClickListener
        buttons[2][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[2][0]);
                machWas(2, 0);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[2][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[2][1]);
                machWas(2, 1);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[2][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[2][2]);
                machWas(2, 2);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[2][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[2][3]);
                machWas(2, 3);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[2][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[2][4]);
                machWas(2, 4);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[2][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[2][5]);
                machWas(2, 5);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[2][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[2][6]);
                machWas(2, 6);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[2][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[2][7]);
                machWas(2, 7);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[2][8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[2][8]);
                machWas(2, 8);
zwischenstand.addLast(currentresultLocal);
            }
        });
        //buttons reihe 4
        buttons[3][0] = findViewById(R.id.btn41);
        buttons[3][1] = findViewById(R.id.btn42);
        buttons[3][2] = findViewById(R.id.btn43);
        buttons[3][3] = findViewById(R.id.btn44);
        buttons[3][4] = findViewById(R.id.btn45);
        buttons[3][5] = findViewById(R.id.btn46);
        buttons[3][6] = findViewById(R.id.btn47);
        buttons[3][7] = findViewById(R.id.btn48);
        buttons[3][8] = findViewById(R.id.btn49);
        //Buttons Reihe 4 OnClickListener
        buttons[3][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[3][0]);
                machWas(3, 0);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[3][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[3][1]);
                machWas(3, 1);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[3][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[3][2]);
                machWas(3, 2);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[3][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[3][3]);
                machWas(3, 3);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[3][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[3][4]);
                machWas(3, 4);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[3][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[3][5]);
                machWas(3, 5);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[3][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[3][6]);
                machWas(3, 6);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[3][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[3][7]);
                machWas(3, 7);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[3][8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[3][8]);
                machWas(3, 8);
zwischenstand.addLast(currentresultLocal);
            }
        });

        //buttons Reihe 5
        buttons[4][0] = findViewById(R.id.btn51);
        buttons[4][1] = findViewById(R.id.btn52);
        buttons[4][2] = findViewById(R.id.btn53);
        buttons[4][3] = findViewById(R.id.btn54);
        buttons[4][4] = findViewById(R.id.btn55);
        buttons[4][5] = findViewById(R.id.btn56);
        buttons[4][6] = findViewById(R.id.btn57);
        buttons[4][7] = findViewById(R.id.btn58);
        buttons[4][8] = findViewById(R.id.btn59);
        //Buttons Reihe 5 OnClickListener
        buttons[4][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[4][0]);
                machWas(4, 0);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[4][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[4][1]);
                machWas(4, 1);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[4][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[4][2]);
                machWas(4, 2);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[4][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[4][3]);
                machWas(4, 3);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[4][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[4][4]);
                machWas(4, 4);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[4][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[4][5]);
                machWas(4, 5);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[4][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[4][6]);
                machWas(4, 6);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[4][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[4][7]);
                machWas(4, 7);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[4][8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[4][8]);
                machWas(4, 8);
zwischenstand.addLast(currentresultLocal);
            }
        });


        //buttons Reihe 6
        buttons[5][0] = findViewById(R.id.btn61);
        buttons[5][1] = findViewById(R.id.btn62);
        buttons[5][2] = findViewById(R.id.btn63);
        buttons[5][3] = findViewById(R.id.btn64);
        buttons[5][4] = findViewById(R.id.btn65);
        buttons[5][5] = findViewById(R.id.btn66);
        buttons[5][6] = findViewById(R.id.btn67);
        buttons[5][7] = findViewById(R.id.btn68);
        buttons[5][8] = findViewById(R.id.btn69);
        //Buttons Reihe 6 OnClickListener
        buttons[5][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[5][0]);
                machWas(5, 0);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[5][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[5][1]);
                machWas(5, 1);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[5][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[5][2]);
                machWas(5, 2);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[5][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[5][3]);
                machWas(5, 3);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[5][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[5][4]);
                machWas(5, 4);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[5][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[5][5]);
                machWas(5, 5);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[5][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[5][6]);
                machWas(5, 6);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[5][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[5][7]);
                machWas(5, 7);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[5][8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[5][8]);
                machWas(5, 8);
zwischenstand.addLast(currentresultLocal);
            }
        });


        //buttons Reihe 7
        buttons[6][0] = findViewById(R.id.btn71);
        buttons[6][1] = findViewById(R.id.btn72);
        buttons[6][2] = findViewById(R.id.btn73);
        buttons[6][3] = findViewById(R.id.btn74);
        buttons[6][4] = findViewById(R.id.btn75);
        buttons[6][5] = findViewById(R.id.btn76);
        buttons[6][6] = findViewById(R.id.btn77);
        buttons[6][7] = findViewById(R.id.btn78);
        buttons[6][8] = findViewById(R.id.btn79);
        //Buttons Reihe 7 OnClickListener
        buttons[6][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[6][0]);
                machWas(6, 0);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[6][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[6][1]);
                machWas(6, 1);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[6][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[6][2]);
                machWas(6, 2);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[6][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[6][3]);
                machWas(6, 3);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[6][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[6][4]);
                machWas(6, 4);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[6][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[6][5]);
                machWas(6, 5);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[6][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[6][6]);
                machWas(6, 6);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[6][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[6][7]);
                machWas(6, 7);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[6][8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[6][8]);
                machWas(6, 8);
zwischenstand.addLast(currentresultLocal);
            }
        });


        //buttons Reihe 8
        buttons[7][0] = findViewById(R.id.btn81);
        buttons[7][1] = findViewById(R.id.btn82);
        buttons[7][2] = findViewById(R.id.btn83);
        buttons[7][3] = findViewById(R.id.btn84);
        buttons[7][4] = findViewById(R.id.btn85);
        buttons[7][5] = findViewById(R.id.btn86);
        buttons[7][6] = findViewById(R.id.btn87);
        buttons[7][7] = findViewById(R.id.btn88);
        buttons[7][8] = findViewById(R.id.btn89);
        //Buttons Reihe 8 OnClickListener
        buttons[7][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[7][0]);
                machWas(7, 0);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[7][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[7][1]);
                machWas(7, 1);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[7][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[7][2]);
                machWas(7, 2);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[7][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[7][3]);
                machWas(7, 3);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[7][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[7][4]);
                machWas(7,4);
                zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[7][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[7][5]);
                machWas(7, 5);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[7][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[7][6]);
                machWas(7, 6);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[7][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[7][7]);
                machWas(7, 7);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[7][8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                setButtonTextToCheckBox(buttons[7][8]);
                machWas(7, 8);
zwischenstand.addLast(currentresultLocal);
            }
        });


        //buttons Reihe 9
        buttons[8][0] = findViewById(R.id.btn91);
        buttons[8][1] = findViewById(R.id.btn92);
        buttons[8][2] = findViewById(R.id.btn93);
        buttons[8][3] = findViewById(R.id.btn94);
        buttons[8][4] = findViewById(R.id.btn95);
        buttons[8][5] = findViewById(R.id.btn96);
        buttons[8][6] = findViewById(R.id.btn97);
        buttons[8][7] = findViewById(R.id.btn98);
        buttons[8][8] = findViewById(R.id.btn99);
        //Buttons Reihe 9 OnClickListener
        buttons[8][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                currentresultLocal[8][0] = setButtonTextToCheckBox(buttons[8][0]);
                machWas(8, 0);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[8][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                currentresultLocal[8][1] = setButtonTextToCheckBox(buttons[8][1]);
                machWas(8, 1);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[8][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                currentresultLocal[8][2] = setButtonTextToCheckBox(buttons[8][2]);
                machWas(8, 2);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[8][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                currentresultLocal[8][3] = setButtonTextToCheckBox(buttons[8][3]);
                machWas(8, 3);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[8][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                currentresultLocal[8][4] = setButtonTextToCheckBox(buttons[8][4]);
                machWas(8, 4);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[8][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                currentresultLocal[8][5] = setButtonTextToCheckBox(buttons[8][5]);
                machWas(8, 5);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[8][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                currentresultLocal[8][6] = setButtonTextToCheckBox(buttons[8][6]);
                machWas(8, 6);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[8][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
int[][] currentresultLocal = new int[9][9];
for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
            currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
         }
}
                currentresultLocal[8][7] = setButtonTextToCheckBox(buttons[8][7]);
                machWas(8, 7);
zwischenstand.addLast(currentresultLocal);
            }
        });
        buttons[8][8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
                int[][] currentresultLocal = new int[9][9];
                for(int i = 0; i < 9; i++){
                    for(int j = 0; j < 9; j++){
                        currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
                    }
                }
                currentresultLocal[8][8] = setButtonTextToCheckBox(buttons[8][8]);
                machWas(8, 8);
                zwischenstand.addLast(currentresultLocal);
            }
        });


        //buttons auswahl der zahlen
        checkBoxes[0] = findViewById(R.id.checkBox1);
        checkBoxes[1] = findViewById(R.id.checkBox2);
        checkBoxes[2] = findViewById(R.id.checkBox3);
        checkBoxes[3] = findViewById(R.id.checkBox4);
        checkBoxes[4] = findViewById(R.id.checkBox5);
        checkBoxes[5] = findViewById(R.id.checkBox6);
        checkBoxes[6] = findViewById(R.id.checkBox7);
        checkBoxes[7] = findViewById(R.id.checkBox8);
        checkBoxes[8] = findViewById(R.id.checkBox9);

        //channge ceckBox if anotherone is checked
        checkBoxes[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxes[1].setChecked(false);
                checkBoxes[2].setChecked(false);
                checkBoxes[3].setChecked(false);
                checkBoxes[4].setChecked(false);
                checkBoxes[5].setChecked(false);
                checkBoxes[6].setChecked(false);
                checkBoxes[7].setChecked(false);
                checkBoxes[8].setChecked(false);
                changeColor(1);

            }
        });
        checkBoxes[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxes[0].setChecked(false);
                checkBoxes[2].setChecked(false);
                checkBoxes[3].setChecked(false);
                checkBoxes[4].setChecked(false);
                checkBoxes[5].setChecked(false);
                checkBoxes[6].setChecked(false);
                checkBoxes[7].setChecked(false);
                checkBoxes[8].setChecked(false);
                changeColor(2);
            }
        });
        checkBoxes[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxes[0].setChecked(false);
                checkBoxes[1].setChecked(false);
                checkBoxes[3].setChecked(false);
                checkBoxes[4].setChecked(false);
                checkBoxes[5].setChecked(false);
                checkBoxes[6].setChecked(false);
                checkBoxes[7].setChecked(false);
                checkBoxes[8].setChecked(false);
                changeColor(3);
            }
        });
        checkBoxes[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxes[0].setChecked(false);
                checkBoxes[1].setChecked(false);
                checkBoxes[2].setChecked(false);
                checkBoxes[4].setChecked(false);
                checkBoxes[5].setChecked(false);
                checkBoxes[6].setChecked(false);
                checkBoxes[7].setChecked(false);
                checkBoxes[8].setChecked(false);
                changeColor(4);
            }
        });
        checkBoxes[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxes[0].setChecked(false);
                checkBoxes[1].setChecked(false);
                checkBoxes[2].setChecked(false);
                checkBoxes[3].setChecked(false);
                checkBoxes[5].setChecked(false);
                checkBoxes[6].setChecked(false);
                checkBoxes[7].setChecked(false);
                checkBoxes[8].setChecked(false);
                changeColor(5);
            }
        });
        checkBoxes[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxes[0].setChecked(false);
                checkBoxes[1].setChecked(false);
                checkBoxes[2].setChecked(false);
                checkBoxes[3].setChecked(false);
                checkBoxes[4].setChecked(false);
                checkBoxes[6].setChecked(false);
                checkBoxes[7].setChecked(false);
                checkBoxes[8].setChecked(false);
                changeColor(6);
            }
        });
        checkBoxes[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxes[0].setChecked(false);
                checkBoxes[1].setChecked(false);
                checkBoxes[2].setChecked(false);
                checkBoxes[3].setChecked(false);
                checkBoxes[4].setChecked(false);
                checkBoxes[5].setChecked(false);
                checkBoxes[7].setChecked(false);
                checkBoxes[8].setChecked(false);
                changeColor(7);
            }
        });
        checkBoxes[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxes[0].setChecked(false);
                checkBoxes[1].setChecked(false);
                checkBoxes[2].setChecked(false);
                checkBoxes[3].setChecked(false);
                checkBoxes[4].setChecked(false);
                checkBoxes[5].setChecked(false);
                checkBoxes[6].setChecked(false);
                checkBoxes[8].setChecked(false);
                changeColor(8);
            }
        });
        checkBoxes[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxes[0].setChecked(false);
                checkBoxes[1].setChecked(false);
                checkBoxes[2].setChecked(false);
                checkBoxes[3].setChecked(false);
                checkBoxes[4].setChecked(false);
                checkBoxes[5].setChecked(false);
                checkBoxes[6].setChecked(false);
                checkBoxes[7].setChecked(false);
                changeColor(9);
            }
        });
        btnUndo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!zwischenstand.isEmpty()){
                    zwischenstand.removeLast();
                    int[][] temp = zwischenstand.getLast();
                    for(int i = 0; i < 9; i++){
                        for(int j = 0; j < 9; j++){
                            buttons[i][j].setText(String.valueOf(temp[i][j]));
                        }
                    }
                }
            }
        });


        //int[][] sudoku = new int[9][9];
        Intent intentSudoku = getIntent();
        final SudokuLogic sudokuClass = new SudokuLogic();
        sudoku = sudokuClass.createSudoku(intentSudoku.getIntExtra("Difficulty", 0));    //das sudoku wird hier erstellt
        //System.out.println("Sudoku gelöst");
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                currentResult[i][j] = sudoku[i][j];
            }
        }
        zwischenstand.addLast(currentResult);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                buttons[i][j].setText(String.valueOf(sudoku[i][j]));
                if(sudoku[i][j] != 0){
                    buttons[i][j].setTextSize(20);
                    buttons[i][j].setTextColor(Color.CYAN);
                }

            }
        }

        btnCorrect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int[][] sudokuCheck = new int[9][9];
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 9; j++) {
                        sudokuCheck[i][j] = Integer.parseInt(buttons[i][j].getText().toString());
                    }
                }
                boolean test = sudokuClass.checkSudoku(sudokuCheck);
                if (test) {
                    txtViewCorrect.setTextColor(Color.GREEN);
                    txtViewCorrect.setText("HURRAAA KORREKT!!");
                    txtViewCorrect.setVisibility(View.VISIBLE);
                } else {
                    txtViewCorrect.setText("Leider Inkorrekt");
                    txtViewCorrect.setTextColor(Color.RED);
                    txtViewCorrect.setVisibility(View.VISIBLE);
                    Toast.makeText(getApplicationContext(), "Deine Lösung ist leider falsch", Toast.LENGTH_LONG).show();
                    for (int b = 0; b < 1000; b++) {

                    }
                    txtViewCorrect.setVisibility(View.GONE);
                }

            }
        });

        btnCurrentSolutionCorrect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Buttons geklickt");
                int[][] sudokuCheck = new int[9][9];
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 9; j++) {
                        sudokuCheck[i][j] = Integer.parseInt(buttons[i][j].getText().toString());
                    }
                }
                boolean test = sudokuClass.test(sudokuCheck);
                if (test) {
                    System.out.println("hallo");
                    txtViewCorrect.setTextColor(Color.GREEN);
                    //Toast.makeText(getApplicationContext(), "Die Richtung Sieht gut aus", Toast.LENGTH_LONG);
                    txtViewCorrect.setText("Sieht gut aus");
                } else {
                    System.out.println("henlo");
                    txtViewCorrect.setTextColor(Color.RED);
                    txtViewCorrect.setText("Überdenk das nochmal");
                    //Toast.makeText(getApplicationContext(), "Die leider nicht richtig", Toast.LENGTH_LONG);
                }
            }
        });
    }

    public int[][] addToSudoku(){
      return null;
    }

    public int setButtonTextToCheckBox(Button button) {
        if (checkBoxes[0].isChecked()) {
            button.setText("1");
            return 1;
        } else if (checkBoxes[1].isChecked()) {
            button.setText("2");
            return 2;
        } else if (checkBoxes[2].isChecked()) {
            button.setText("3");
            return 3;
        } else if (checkBoxes[3].isChecked()) {
            button.setText("4");
            return 4;
        } else if (checkBoxes[4].isChecked()) {
            button.setText("5");
            return 5;
        } else if (checkBoxes[5].isChecked()) {
            button.setText("6");
            return 6;
        } else if (checkBoxes[6].isChecked()) {
            button.setText("7");
            return 7;
        } else if (checkBoxes[7].isChecked()) {
            button.setText("8");
            return 8;
        } else if (checkBoxes[8].isChecked()) {
            button.setText("9");
            return 9;
        } else {
            button.setText("0");
            return 0;
        }
    }

    public void changeColor(int number)                                                             //changes color for all the given numbers
    {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (number == Integer.parseInt(buttons[i][j].getText().toString())) {
                    buttons[i][j].setTextColor(Color.RED);
                    buttons[i][j].setTextSize(20);
                    buttons[i][j].setBackgroundColor(Color.GREEN);
                }
                else if(buttons[i][j].getTextColors().equals(Color.CYAN)){
                    buttons[i][j].setTextColor(Color.CYAN);
                    buttons[i][j].setTextSize(20);
                    buttons[i][j].setBackground(getResources().getDrawable(R.drawable.my_border));
                }
                else {
                    buttons[i][j].setTextColor(Color.GRAY);
                    buttons[i][j].setTextSize(14);
                    buttons[i][j].setBackground(getResources().getDrawable(R.drawable.my_border));
                }
            }
        }
    }

    public boolean anyCheckBoxMarked() {
        for (int i = 0; i < 9; i++) {
            if (checkBoxes[i].isChecked()) {
                return true;
            }
        }
        return false;
    }

    public void machWas(int row, int col) {                                                         //färbt das gerade eben angetippte Feld ein
        if (anyCheckBoxMarked()) {
            buttons[row][col].setTextColor(Color.RED);
            buttons[row][col].setTextSize(20);
            buttons[row][col].setBackgroundColor(Color.GREEN);
        } else {
            Toast.makeText(getApplicationContext(), "Bitte eine Zahl markieren", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){

        }
    }
}