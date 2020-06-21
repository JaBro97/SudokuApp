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

public class Game extends AppCompatActivity {

    CheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7, checkBox8, checkBox9;
    SudokuLogic sudoku = new SudokuLogic();
    Button buttons[][] = new Button[9][9];
    Button btnCorrect;
    Button btnCurrentSolutionCorrect;
    TextView txtViewCorrect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        btnCorrect = findViewById(R.id.btnCorrect);
        btnCurrentSolutionCorrect  = findViewById(R.id.btnCurrentSolutionCorrect);
        txtViewCorrect = findViewById(R.id.txtViewCorrect);
        txtViewCorrect.setText("");

        //buttons auswahl der zahlen
        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        checkBox5 = findViewById(R.id.checkBox5);
        checkBox6 = findViewById(R.id.checkBox6);
        checkBox7 = findViewById(R.id.checkBox7);
        checkBox8 = findViewById(R.id.checkBox8);
        checkBox9 = findViewById(R.id.checkBox9);

        //channge ceckBox if anotherone is checked
        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
                checkBox5.setChecked(false);
                checkBox6.setChecked(false);
                checkBox7.setChecked(false);
                checkBox8.setChecked(false);
                checkBox9.setChecked(false);
            }
        });
        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBox1.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
                checkBox5.setChecked(false);
                checkBox6.setChecked(false);
                checkBox7.setChecked(false);
                checkBox8.setChecked(false);
                checkBox9.setChecked(false);
            }
        });
        checkBox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox4.setChecked(false);
                checkBox5.setChecked(false);
                checkBox6.setChecked(false);
                checkBox7.setChecked(false);
                checkBox8.setChecked(false);
                checkBox9.setChecked(false);
            }
        });
        checkBox4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox5.setChecked(false);
                checkBox6.setChecked(false);
                checkBox7.setChecked(false);
                checkBox8.setChecked(false);
                checkBox9.setChecked(false);
            }
        });
        checkBox5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
                checkBox6.setChecked(false);
                checkBox7.setChecked(false);
                checkBox8.setChecked(false);
                checkBox9.setChecked(false);
            }
        });
        checkBox6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
                checkBox5.setChecked(false);
                checkBox7.setChecked(false);
                checkBox8.setChecked(false);
                checkBox9.setChecked(false);
            }
        });
        checkBox7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
                checkBox5.setChecked(false);
                checkBox6.setChecked(false);
                checkBox8.setChecked(false);
                checkBox9.setChecked(false);
            }
        });
        checkBox8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
                checkBox5.setChecked(false);
                checkBox6.setChecked(false);
                checkBox7.setChecked(false);
                checkBox9.setChecked(false);
            }
        });
        checkBox9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
                checkBox5.setChecked(false);
                checkBox6.setChecked(false);
                checkBox7.setChecked(false);
                checkBox8.setChecked(false);
            }
        });



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
                setButtonTextToCheckBox(buttons[0][0]);
            }
        });
        buttons[0][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[0][1]);
            }
        });
        buttons[0][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[0][2]);
            }
        });
        buttons[0][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[0][3]);
            }
        });
        buttons[0][4] .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[0][4]);
            }
        });
        buttons[0][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[0][5]);
            }
        });
        buttons[0][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[0][6]);
            }
        });
        buttons[0][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[0][7]);
            }
        });
        buttons[0][8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[0][8]);
            }
        });

        //buttons Reihe 2
        buttons[1][0] = findViewById(R.id.btn21);
        buttons[1][1]  = findViewById(R.id.btn22);
        buttons[1][2]  = findViewById(R.id.btn23);
        buttons[1][3]  = findViewById(R.id.btn24);
        buttons[1][4]  = findViewById(R.id.btn25);
        buttons[1][5]  = findViewById(R.id.btn26);
        buttons[1][6]  = findViewById(R.id.btn27);
        buttons[1][7]  = findViewById(R.id.btn28);
        buttons[1][8]  = findViewById(R.id.btn29);
        //Buttons Reihe 2 OnClickListener
        buttons[1][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[1][0]);
            }
        });
        buttons[1][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[1][1]);
            }
        });
        buttons[1][2] .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[1][2] );
            }
        });
        buttons[1][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[1][3]);
            }
        });
        buttons[1][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[1][4]);
            }
        });
        buttons[1][5] .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[1][5] );
            }
        });
        buttons[1][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[1][6]);
            }
        });
        buttons[1][7] .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[1][7] );
            }
        });
        buttons[1][8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[1][8]);
            }
        });

        //buttons Reihe 3
        buttons[2][0] = findViewById(R.id.btn31);
        buttons[2][1]  = findViewById(R.id.btn32);
        buttons[2][2]  = findViewById(R.id.btn33);
        buttons[2][3]  = findViewById(R.id.btn34);
        buttons[2][4]  = findViewById(R.id.btn35);
        buttons[2][5]  = findViewById(R.id.btn36);
        buttons[2][6]  = findViewById(R.id.btn37);
        buttons[2][7]  = findViewById(R.id.btn38);
        buttons[2][8]  = findViewById(R.id.btn39);
        //Buttons Reihe 3 OnClickListener
        buttons[2][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[2][0]);
            }
        });
        buttons[2][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[2][1]);
            }
        });
        buttons[2][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[2][2]);
            }
        });
        buttons[2][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[2][3]);
            }
        });
        buttons[2][4] .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[2][4] );
            }
        });
        buttons[2][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[2][5]);
            }
        });
        buttons[2][6] .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[2][6] );
            }
        });
        buttons[2][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[2][7]);
            }
        });
        buttons[2][8] .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[2][8] );
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
setButtonTextToCheckBox(buttons[3][0]);
            }
        });
        buttons[3][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[3][1]);
            }
        });
        buttons[3][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[3][2]);
            }
        });
        buttons[3][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[3][3]);
            }
        });
        buttons[3][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[3][4]);
            }
        });
        buttons[3][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[3][5]);
            }
        });
        buttons[3][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[3][6]);
            }
        });
        buttons[3][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[3][7]);
            }
        });
        buttons[3][8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[3][8]);
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
setButtonTextToCheckBox(buttons[4][0]);
            }
        });
        buttons[4][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[4][1]);
            }
        });
        buttons[4][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[4][2]);
            }
        });
        buttons[4][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[4][3]);
            }
        });
        buttons[4][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[4][4]);
            }
        });
        buttons[4][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[4][5]);
            }
        });
        buttons[4][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[4][6]);
            }
        });
        buttons[4][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[4][7]);
            }
        });
        buttons[4][8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[4][8]);
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
setButtonTextToCheckBox(buttons[5][0]);
            }
        });
        buttons[5][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[5][1]);
            }
        });
        buttons[5][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[5][2]);
            }
        });
        buttons[5][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[5][3]);
            }
        });
        buttons[5][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[5][4]);
            }
        });
        buttons[5][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[5][5]);
            }
        });
        buttons[5][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[5][6]);
            }
        });
        buttons[5][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[5][7]);
            }
        });
        buttons[5][8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[5][8]);
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
setButtonTextToCheckBox(buttons[6][0]);
            }
        });
        buttons[6][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[6][1]);
            }
        });
        buttons[6][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[6][2]);
            }
        });
        buttons[6][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[6][3]);
            }
        });
        buttons[6][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[6][4]);
            }
        });
        buttons[6][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[6][5]);
            }
        });
        buttons[6][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[6][6]);
            }
        });
        buttons[6][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[6][7]);
            }
        });
        buttons[6][8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[6][8]);
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
setButtonTextToCheckBox(buttons[7][0]);
            }
        });
        buttons[7][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[7][1]);
            }
        });
        buttons[7][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[7][2]);
            }
        });
        buttons[7][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[7][3]);
            }
        });
        buttons[7][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[7][4]);
            }
        });
        buttons[7][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[7][5]);
            }
        });
        buttons[7][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[7][6]);
            }
        });
        buttons[7][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[7][7]);
            }
        });
        buttons[7][8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[7][8]);
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
setButtonTextToCheckBox(buttons[8][0]);
            }
        });
        buttons[8][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[8][1]);
            }
        });
        buttons[8][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[8][2]);
            }
        });
        buttons[8][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[8][3]);
            }
        });
        buttons[8][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[8][4]);
            }
        });
        buttons[8][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[8][5]);
            }
        });
        buttons[8][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[8][6]);
            }
        });
        buttons[8][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[8][7]);
            }
        });
        buttons[8][8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtViewCorrect.setText("");
setButtonTextToCheckBox(buttons[8][8]);
            }
        });


        int[][] sudoku = new int[9][9];
        Intent intentSudoku = getIntent();
        final SudokuLogic sudokuClass = new SudokuLogic();
        sudoku = sudokuClass.createSudoku(intentSudoku.getIntExtra("Difficulty",0));    //das sudoku wird hier erstellt
        //System.out.println("Sudoku gelöst");

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                buttons[i][j].setText(String.valueOf(sudoku[i][j]));
            }
        }

        btnCorrect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int[][] sudokuCheck= new int[9][9];
                for(int i = 0; i < 9; i++){
                    for(int j = 0; j < 9; j++){
                        sudokuCheck[i][j] = Integer.parseInt(buttons[i][j].getText().toString());
                    }
                }
                boolean test = sudokuClass.checkSudoku(sudokuCheck);
                if(test){
                    txtViewCorrect.setTextColor(Color.GREEN);
                    txtViewCorrect.setText("HURRAAA KORREKT!!");
                    txtViewCorrect.setVisibility(View.VISIBLE);
                }
                else{
                    txtViewCorrect.setText("Leider Inkorrekt");
                    txtViewCorrect.setTextColor(Color.RED);
                    txtViewCorrect.setVisibility(View.VISIBLE);
                    Toast.makeText(getApplicationContext(),"Deine Lösung ist leider falsch", Toast.LENGTH_LONG).show();
                    for(int b = 0; b < 1000; b++){

                    }
                    txtViewCorrect.setVisibility(View.GONE);
                }

            }
        });

        btnCurrentSolutionCorrect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Buttons geklickt");
                int[][] sudokuCheck= new int[9][9];
                for(int i = 0; i < 9; i++){
                    for(int j = 0; j < 9; j++){
                        sudokuCheck[i][j] = Integer.parseInt(buttons[i][j].getText().toString());
                    }
                }
                boolean test = sudokuClass.test(sudokuCheck);
                if(test){
                    System.out.println("hallo");
                    txtViewCorrect.setTextColor(Color.GREEN);
                    //Toast.makeText(getApplicationContext(), "Die Richtung Sieht gut aus", Toast.LENGTH_LONG);
                    txtViewCorrect.setText("Sieht gut aus");
                }
                else{
                    System.out.println("henlo");
                    txtViewCorrect.setTextColor(Color.RED);
                    txtViewCorrect.setText("Überdenk das nochmal");
                    //Toast.makeText(getApplicationContext(), "Die leider nicht richtig", Toast.LENGTH_LONG);
                }
            }
        });
    }

    public void setButtonTextToCheckBox(Button button){
        if(checkBox1.isChecked()){
            button.setText("1");
        }
        else if(checkBox2.isChecked()){
            button.setText("2");
        }
        else if(checkBox3.isChecked()){
            button.setText("3");
        }
        else if(checkBox4.isChecked()){
            button.setText("4");
        }
        else if(checkBox5.isChecked()){
            button.setText("5");
        }
        else if(checkBox6.isChecked()){
            button.setText("6");
        }
        else if(checkBox7.isChecked()){
            button.setText("7");
        }
        else if(checkBox8.isChecked()){
            button.setText("8");
        }
        else if(checkBox9.isChecked()){
            button.setText("9");
        }
        else{
            Toast.makeText(getApplicationContext(),"Bitte eine Zahl auswählen", Toast.LENGTH_LONG).show();
        }
    }


}