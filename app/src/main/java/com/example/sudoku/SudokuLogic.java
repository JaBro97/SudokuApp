package com.example.sudoku;

import java.util.Random;

public class SudokuLogic {

    int[][] sudokuField = new int[9][9];
    int globalCounterSolveStarted = 0;
    int globalCounterSolveExecuted = 0;

    int[][] sudokuFieldZwischenspeicher = new int[9][9];
    int numberIfEasy = 30;
    int numberIfMedium = 20;
    int numberIfHard = 10;



    public int[][] createSudoku(int difficulty) {                                                    //kreiert anfangssudoku mit gewiser anzahl an starter zahlen | 1 leicht| 2 mittel| 3 schwer
        //int[][] newSudoku = new int[9][9];
        for(int counterRow = 0; counterRow < 9; counterRow++){
            for(int counterCol = 0; counterCol < 9; counterCol++){
                sudokuField[counterRow][counterCol] = 0;
            }
        }
        int counterOfHowManyNumbersAreLeft = 0;
        Random randomRow1 = new Random();
        int randomRow = randomRow1.nextInt(10);
        if(randomRow == 10){
            randomRow = 9;
        }
        if(randomRow == 9){
            randomRow = 8;
        }
        Random random2 = new Random();
        int randomCol = random2.nextInt(10);
        if(randomCol == 10){
            randomCol = 9;
        }
        if(randomCol == 8){
            randomCol = 8;
        }
        Random random3 = new Random();
        int randomValue = random3.nextInt(10);
        if(randomValue == 10){
            randomValue = 9;
        }
        if(randomValue == 0){
            randomValue = 1;
        }
        sudokuField[randomRow][randomCol] = randomValue;



        if (difficulty == 1) {
            //while (counterOfHowManyNumbersAreLeft <= numberIfEasy) {
                solve();
            //}
        }
        if (difficulty == 2) {
            while (counterOfHowManyNumbersAreLeft <= numberIfMedium) {

            }
        }
        if (difficulty == 3) {
            while (counterOfHowManyNumbersAreLeft <= numberIfHard) {

            }
        }

        return sudokuField;
    }

    public boolean numberCanBePlaced(int numberToBePlaced, int posInRow, int posInColumn){
        if(numberToBePlaced > 0 && numberToBePlaced < 10){
            boolean canBePlaced = true;                                                             //muss auf false gesetzt werden, wenn eine der abfragen falsch läuft
            //checkColumn                                                                           //kann man auch eleganter machen wenn eins falsch ist, dass man ganz aufhört zu prüfen
            canBePlaced = canBePlacedInColumn(numberToBePlaced,posInRow, posInColumn);
            if(!canBePlaced){
                return false;
            }
            //checkRow
            canBePlaced = canBePlacedInRow(numberToBePlaced,posInRow, posInColumn);
            if(!canBePlaced){
                return false;
            }
            //checkSquare
            canBePlaced = canBePlacedInSquare(numberToBePlaced, posInRow, posInColumn);

            return canBePlaced;
        }
        return false;
    }

    public boolean canBePlacedInColumn(int numberToBePlaced, int posInRow, int posInColumn){
        for(int i = 0; i < 9; i++){
            if(numberToBePlaced == sudokuField[posInRow][i]){
                return false;
            }
        }
        return true;
    }

    public boolean canBePlacedInRow(int numberToBePlaced, int posInRow, int posInColumn){
        for(int i = 0; i < 9; i++){
            if(numberToBePlaced == sudokuField[i][posInColumn]){
                return false;
            }
        }
        return true;
    }

    public boolean canBePlacedInSquare(int numberCanBePlaced, int posInRow, int posInColumn){
        int row = posInRow - (posInRow % 3);
        int col = posInColumn - (posInColumn % 3);
        //System.out.println("row: " + row + " col: " + col);
        for(int i = row; i < row + 3; i++){
            //System.out.println("ICH BIN IN DER I SCHLEIFE: " + i);
            for (int j = col; j < col + 3; j++){
                //System.out.println("col: " + col + " j: " + j);
                if(sudokuField[i][j] == numberCanBePlaced){
                    System.out.println("false");
                    return false;
                }
            }
        }
        return true;
    }

    public boolean solve(){
        globalCounterSolveStarted = globalCounterSolveStarted + 1;
        System.out.println("globalCounter(wie oft betrete ich solve) : " + globalCounterSolveStarted);
        for(int row = 0; row < 9; row++){
            for(int col = 0; col < 9; col++){
                if(sudokuField[row][col] == 0){                                                     //search an empty cell
                    for(int number = 1; number <= 9; number++){                                     //try possible numbers
                        if(numberCanBePlaced(number,row,col)){
                            sudokuField[row][col] = number;
                            System.out.println(number + " Number placed " + col + " " + row);
                            if(solve()){
                                System.out.println("solve ist true");                               //recursiver aufru der methode zum lösen des sudokuproblems
                                return true;
                            }
                            else{
                                System.out.println("solve ist false");
                                sudokuField[row][col] = 0;
                            }
                            globalCounterSolveExecuted++;
                            System.out.println("gloablCounter(Wie oft wurde solve ausgeführt) : " + globalCounterSolveExecuted);
                        }else{
                            System.out.println(number + " Number cannot be placed " + col + " " + row);
                        }
                    }
                    return false;
                }
            }
        }
        return true;                                                                                //sudoku solved
    }

    public int[][] getSudokuField(){
        return sudokuField;
    }
}
