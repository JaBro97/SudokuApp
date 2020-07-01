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
    LinkedList<LoadObject> storedMoves = new LinkedList<LoadObject>();


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


        for(int i = 0; i < 9; i++){                                                                 //setzt mir die ClickListener
            for(int j = 0; j < 9; j++){
                buttons[i][j].setOnClickListener(this);
            }
        }


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
                //if(!zwischenstand.isEmpty()){
                //    zwischenstand.removeLast();
                //    int[][] temp = zwischenstand.getLast();
                //    for(int i = 0; i < 9; i++){
                //        for(int j = 0; j < 9; j++){
                //            buttons[i][j].setText(String.valueOf(temp[i][j]));
                //        }
                //    }
                //}
                undo();
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

    public void colorCurrentButton(int row, int col) {                                                         //färbt das gerade eben angetippte Feld ein
        if (anyCheckBoxMarked()) {
            buttons[row][col].setTextColor(Color.RED);
            buttons[row][col].setTextSize(20);
            buttons[row][col].setBackgroundColor(Color.GREEN);
        } else {
            Toast.makeText(getApplicationContext(), "Bitte eine Zahl markieren", Toast.LENGTH_LONG).show();
        }
    }

    public void undo(){
        LoadObject loadObject = storedMoves.getLast();
        storedMoves.removeLast();
        int row = loadObject.getRowPos();
        int col = loadObject.getColPos();
        int value = loadObject.getValueOld();
        buttons[row][col].setText(String.valueOf(value));
    }

    @Override
    public void onClick(View view) {
        txtViewCorrect.setText("");
        int[][] currentresultLocal = new int[9][9];
        //for(int i = 0; i < 9; i++){
        //    for(int j = 0; j < 9; j++){
        //        currentresultLocal[i][j] = zwischenstand.getLast()[i][j];
        //   }
        //}
        int row = 9;
        int col = 9;                                                                                //hier werden row und col gesetzt jenachdem welcher button gepresst wurde
        switch(view.getId()){
            case R.id.btn11:
                row = 0;
                col = 0;
                break;

            case R.id.btn12:
                row = 0;
                col = 1;
                break;

            case R.id.btn13:
                row = 0;
                col = 2;
                break;
            case R.id.btn14:
                row = 0;
                col = 3;
                break;

            case R.id.btn15:
                row = 0;
                col = 4;
                break;
            case R.id.btn16:
                row = 0;
                col = 5;
                break;

            case R.id.btn17:
                row = 0;
                col = 6;
                break;

            case R.id.btn18:
                row = 0;
                col = 7;
                break;

            case R.id.btn19:
                row = 0;
                col = 8;
                break;

            case R.id.btn21:
                row = 1;
                col = 0;
                break;

            case R.id.btn22:
                row = 1;
                col = 1;
                break;

            case R.id.btn23:
                row = 1;
                col = 2;
                break;

            case R.id.btn24:
                row = 1;
                col = 3;
                break;

            case R.id.btn25:
                row = 1;
                col = 4;
                break;

            case R.id.btn26:
                row = 1;
                col = 5;
                break;

            case R.id.btn27:
                row = 1;
                col = 6;
                break;

            case R.id.btn28:
                row = 1;
                col = 7;
                break;

            case R.id.btn29:
                row = 1;
                col = 8;
                break;

            case R.id.btn31:
                row = 2;
                col = 0;
                break;

            case R.id.btn32:
                row = 2;
                col = 1;
                break;

            case R.id.btn33:
                row = 2;
                col = 2;
                break;

            case R.id.btn34:
                row = 2;
                col = 3;
                break;

            case R.id.btn35:
                row = 2;
                col = 4;
                break;

            case R.id.btn36:
                row = 2;
                col = 5;
                break;

            case R.id.btn37:
                row = 2;
                col = 6;
                break;

            case R.id.btn38:
                row = 2;
                col = 7;
                break;

            case R.id.btn39:
                row = 2;
                col = 8;
                break;

            case R.id.btn41:
                row = 3;
                col = 0;
                break;

            case R.id.btn42:
                row = 3;
                col = 1;
                break;

            case R.id.btn43:
                row = 3;
                col = 2;
                break;

            case R.id.btn44:
                row = 3;
                col = 3;
                break;

            case R.id.btn45:
                row = 3;
                col = 4;
                break;

            case R.id.btn46:
                row = 3;
                col = 5;
                break;

            case R.id.btn47:
                row = 3;
                col = 6;
                break;

            case R.id.btn48:
                row = 3;
                col = 7;
                break;

            case R.id.btn49:
                row = 3;
                col = 8;
                break;

            case R.id.btn51:
                row = 4;
                col = 0;
                break;

            case R.id.btn52:
                row = 4;
                col = 1;
                break;

            case R.id.btn53:
                row = 4;
                col = 2;
                break;

            case R.id.btn54:
                row = 4;
                col = 3;
                break;

            case R.id.btn55:
                row = 4;
                col = 4;
                break;

            case R.id.btn56:
                row = 4;
                col = 5;
                break;

            case R.id.btn57:
                row = 4;
                col = 6;
                break;

            case R.id.btn58:
                row = 4;
                col = 7;
                break;

            case R.id.btn59:
                row = 4;
                col = 8;
                break;

            case R.id.btn61:
                row = 5;
                col = 0;
                break;

            case R.id.btn62:
                row = 5;
                col = 1;
                break;

            case R.id.btn63:
                row = 5;
                col = 2;
                break;

            case R.id.btn64:
                row = 5;
                col = 3;
                break;

            case R.id.btn65:
                row = 5;
                col = 4;
                break;

            case R.id.btn66:
                row = 5;
                col = 5;
                break;

            case R.id.btn67:
                row = 5;
                col = 6;
                break;

            case R.id.btn68:
                row = 5;
                col = 7;
                break;

            case R.id.btn69:
                row = 5;
                col = 8;
                break;

            case R.id.btn71:
                row = 6;
                col = 0;
                break;

            case R.id.btn72:
                row = 6;
                col = 1;
                break;

            case R.id.btn73:
                row = 6;
                col = 2;
                break;

            case R.id.btn74:
                row = 6;
                col = 3;
                break;

            case R.id.btn75:
                row = 6;
                col = 4;
                break;

            case R.id.btn76:
                row = 6;
                col = 5;
                break;

            case R.id.btn77:
                row = 6;
                col = 6;
                break;

            case R.id.btn78:
                row = 6;
                col = 7;
                break;

            case R.id.btn79:
                row = 6;
                col = 8;
                break;

            case R.id.btn81:
                row = 7;
                col = 0;
                break;

            case R.id.btn82:
                row = 7;
                col = 1;
                break;

            case R.id.btn83:
                row = 7;
                col = 2;
                break;

            case R.id.btn84:
                row = 7;
                col = 3;
                break;

            case R.id.btn85:
                row = 7;
                col = 4;
                break;

            case R.id.btn86:
                row = 7;
                col = 5;
                break;

            case R.id.btn87:
                row = 7;
                col = 6;
                break;

            case R.id.btn88:
                row = 7;
                col = 7;
                break;

            case R.id.btn89:
                row = 7;
                col = 8;
                break;

            case R.id.btn91:
                row = 8;
                col = 0;
                break;

            case R.id.btn92:
                row = 8;
                col = 1;
                break;

            case R.id.btn93:
                row = 8;
                col = 2;
                break;

            case R.id.btn94:
                row = 8;
                col = 3;
                break;

            case R.id.btn95:
                row = 8;
                col = 4;
                break;

            case R.id.btn96:
                row = 8;
                col = 5;
                break;

            case R.id.btn97:
                row = 8;
                col = 6;
                break;

            case R.id.btn98:
                row = 8;
                col = 7;
                break;

            case R.id.btn99:
                row = 8;
                col = 8;
                break;
        }
        //currentresultLocal[row][col] = setButtonTextToCheckBox(buttons[row][col]);
        int setValue = setButtonTextToCheckBox(buttons[row][col]);
        colorCurrentButton(row, col);
        LoadObject currentLoadObject = new LoadObject(row, col, setValue);
        storedMoves.addLast(currentLoadObject);
        //zwischenstand.addLast(currentresultLocal);
    }


}