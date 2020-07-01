package com.example.sudoku;

public class LoadObject {
    int rowPos;
    int colPos;
    int valueOld;

    public LoadObject(int row, int col, int value){
        rowPos = row;
        colPos = col;
        valueOld = value;
    }

    public int getRowPos(){
        return rowPos;
    }
    public int getColPos(){
        return colPos;
    }
    public int getValueOld(){
        return valueOld;
    }
}
