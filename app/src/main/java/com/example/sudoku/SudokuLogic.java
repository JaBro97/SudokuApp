package com.example.sudoku;

import java.util.Random;

public class SudokuLogic {

    int[][] sudokuField = new int[9][9];
    int[][] testfieldGlobal = new int[9][9];
    //int globalCounterSolveStarted = 0;
    //int globalCounterSolveExecuted = 0;

    int[][] sudokuFieldZwischenspeicher = new int[9][9];
    int numberIfEasy = 30;
    int numberIfMedium = 20;
    int numberIfHard = 10;
    int counter =1;

    int randomNumber = 0;
    boolean[] randomNumbertested= new boolean[9];


    //das ist das create sudoku was aufjeden fall klappt
    public int[][] createSudokuKlappt(int difficulty) {                                                    //kreiert anfangssudoku mit gewiser anzahl an starter zahlen | 1 leicht| 2 mittel| 3 schwer
        //int[][] newSudoku = new int[9][9];
        for(int counterRow = 0; counterRow < 9; counterRow++){
            for(int counterCol = 0; counterCol < 9; counterCol++){
                sudokuField[counterRow][counterCol] = 0;
                testfieldGlobal[counterRow][counterCol] = 0;
            }
        }
        int counterOfHowManyNumbersAreLeft = 0;
        //sudokuField[randomRow][randomCol] = randomValue;
        int randomRow = 0;
        int randomCol = 0;
        int randomValue = 0;
        if (difficulty == 1) {
            boolean testen = false;
            //boolean numberPlaceable = true;
            while(!testen){
                for(int i = 0; i < 9; i++){
                    for(int j = 0; j < 9; j++){
                        testfieldGlobal[i][j] = 0;
                        sudokuField[i][j] = 0;
                    }
                }
                counterOfHowManyNumbersAreLeft = 0;
                while (counterOfHowManyNumbersAreLeft <= numberIfEasy) {
                    randomRow = randomSelf();
                    randomCol = randomSelf();
                    randomValue = randomSelf() + 1;
                    if((sudokuField[randomRow][randomCol] == 0) && (numberCanBePlaced(randomValue,randomRow,randomCol,sudokuField))){
                        testfieldGlobal[randomRow][randomCol] = randomValue;
                        sudokuField[randomRow][randomCol] = randomValue;
                        counterOfHowManyNumbersAreLeft++;
                    }
                }
                int counterAmount = 0;
                for(int i = 0; i < 9; i++){
                    for(int j = 0; j < 9; j++){
                        counterAmount  = sudokuField[i][j];
                    }
                }
                System.out.println("HALLOOOO: " + counterAmount);
                testen = testWithRandomNumber(testfieldGlobal);
                System.out.println(testen);
            }
            int tralalala = 9;


            //copySudokuField(sudokuField, testfieldGlobal);
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

    public int[][] createSudoku(int difficulty){
        for(int counterRow = 0; counterRow < 9; counterRow++){
            for(int counterCol = 0; counterCol < 9; counterCol++){
                sudokuField[counterRow][counterCol] = 0;
                testfieldGlobal[counterRow][counterCol] = 0;
            }
        }
        int counterOfHowManyNumbersAreLeft = 0;
        if (difficulty == 1){
            sudokuField = doTheCreation(counterOfHowManyNumbersAreLeft, numberIfEasy);
        }
        if (difficulty == 2) {
            sudokuField = doTheCreation(counterOfHowManyNumbersAreLeft, numberIfMedium);
        }
        if (difficulty == 3) {
            sudokuField = doTheCreation(counterOfHowManyNumbersAreLeft, numberIfHard);
        }

        return sudokuField;
    }

    public int[][] doTheCreation(int counterOfHowManyNumbersAreLeft, int numberUpperBound){
        boolean testen = false;
        int randomRow = 0;
        int randomCol = 0;
        int randomValue = 0;
        //boolean numberPlaceable = true;
        while(!testen){
            for(int i = 0; i < 9; i++){
                for(int j = 0; j < 9; j++){
                    testfieldGlobal[i][j] = 0;
                    sudokuField[i][j] = 0;
                }
            }
            counterOfHowManyNumbersAreLeft = 0;
            while (counterOfHowManyNumbersAreLeft <= numberUpperBound) {
                randomRow = randomSelf();
                randomCol = randomSelf();
                randomValue = randomSelf() + 1;
                if((sudokuField[randomRow][randomCol] == 0) && (numberCanBePlaced(randomValue,randomRow,randomCol,sudokuField))){
                    testfieldGlobal[randomRow][randomCol] = randomValue;
                    sudokuField[randomRow][randomCol] = randomValue;
                    counterOfHowManyNumbersAreLeft++;
                }
            }
            int counterAmount = 0;
            for(int i = 0; i < 9; i++){
                for(int j = 0; j < 9; j++){
                    counterAmount  = sudokuField[i][j];
                }
            }
            testen = testWithRandomNumber(testfieldGlobal);
        }
        return sudokuField;
    }

    public int[][] copySudokuField(int[][] field1, int[][] field2){                                 //gibt field1 mit den werten von field2 aus
        for(int i = 0; i < field1.length; i++){
            for(int j = 0; j < field1[i].length; j++){
                field1[i][j] = field2[i][j];
            }
        }
        return field1;
    }


    public int randomSelf(){
        Random random = new Random();
        int randomRow = random.nextInt(9);
        return randomRow;
    }

    public boolean numberCanBePlaced(int numberToBePlaced, int posInRow, int posInColumn, int[][] sudokuFieldTest){
        if(numberToBePlaced > 0 && numberToBePlaced < 10){
            boolean canBePlaced = true;                                                             //muss auf false gesetzt werden, wenn eine der abfragen falsch läuft
            //checkColumn                                                                           //kann man auch eleganter machen wenn eins falsch ist, dass man ganz aufhört zu prüfen
            canBePlaced = canBePlacedInColumn(numberToBePlaced,posInRow, posInColumn, sudokuFieldTest);
            if(!canBePlaced){
                return false;
            }
            //checkRow
            canBePlaced = canBePlacedInRow(numberToBePlaced,posInRow, posInColumn, sudokuFieldTest);
            if(!canBePlaced){
                return false;
            }
            //checkSquare
            canBePlaced = canBePlacedInSquare(numberToBePlaced, posInRow, posInColumn, sudokuFieldTest);

            return canBePlaced;
        }
        return false;
    }

    public boolean canBePlacedInColumn(int numberToBePlaced, int posInRow, int posInColumn, int[][] sudokuFieldTest){
        for(int i = 0; i < 9; i++){
            if(numberToBePlaced == sudokuFieldTest[posInRow][i]){
                return false;
            }
        }
        return true;
    }

    public boolean canBePlacedInRow(int numberToBePlaced, int posInRow, int posInColumn, int[][] sudokuFieldTest){
        for(int i = 0; i < 9; i++){
            if(numberToBePlaced == sudokuFieldTest[i][posInColumn]){
                return false;
            }
        }
        return true;
    }

    public boolean canBePlacedInSquare(int numberCanBePlaced, int posInRow, int posInColumn, int[][] sudokuFieldTest){
        int row = posInRow - (posInRow % 3);
        int col = posInColumn - (posInColumn % 3);
        ////System.out.println("row: " + row + " col: " + col);
        for(int i = row; i < row + 3; i++){
            ////System.out.println("ICH BIN IN DER I SCHLEIFE: " + i);
            for (int j = col; j < col + 3; j++){
                ////System.out.println("col: " + col + " j: " + j);
                if(sudokuFieldTest[i][j] == numberCanBePlaced){
                    //System.out.println("false");
                    return false;
                }
            }
        }
        return true;
    }

    public boolean solve(){
        //globalCounterSolveStarted = globalCounterSolveStarted + 1;
        ////System.out.println("globalCounter(wie oft betrete ich solve) : " + globalCounterSolveStarted);
        for(int row = 0; row < 9; row++){
            for(int col = 0; col < 9; col++){
                if(sudokuField[row][col] == 0){                                                     //search an empty cell
                    for(int number = 1; number <= 9; number++){                                     //try possible numbers
                        if(numberCanBePlaced(number,row,col,sudokuField)){
                            sudokuField[row][col] = number;
                            ////System.out.println(number + " Number placed " + col + " " + row);
                            if(solve()){
                                ////System.out.println("solve ist true");                               //recursiver aufru der methode zum lösen des sudokuproblems
                                return true;
                            }
                            else{
                                ////System.out.println("solve ist false");
                                sudokuField[row][col] = 0;
                            }
                            //globalCounterSolveExecuted++;
                            ////System.out.println("gloablCounter(Wie oft wurde solve ausgeführt) : " + globalCounterSolveExecuted);
                        }else{
                            ////System.out.println(number + " Number cannot be placed " + col + " " + row);
                        }
                    }
                    return false;
                }
            }
        }
        return true;                                                                                //sudoku solved
    }

    public boolean test(int[][] testfieldLocal){
        for(int row = 0; row < 9; row++){
            for(int col = 0; col < 9; col++){
                if(testfieldLocal[row][col] == 0){                                                     //search an empty cell
                    for(int number = 1; number <= 9; number++){                                     //try possible numbers
                        if(numberCanBePlaced(number,row,col,testfieldLocal)){
                            testfieldLocal[row][col] = number;
                            // //System.out.println(number + " Number placed " + col + " " + row);
                            if(test(testfieldLocal)){
                                System.out.println("solve ist true");                               //recursiver aufru der methode zum lösen des sudokuproblems
                                return true;
                            }
                            else{
                                ////System.out.println("solve ist false");
                                testfieldLocal[row][col] = 0;
                            }
                            //globalCounterSolveExecuted++;
                            ////System.out.println("gloablCounter(Wie oft wurde solve ausgeführt) : " + globalCounterSolveExecuted);
                        }else{
                            ////System.out.println(number + " Number cannot be placed " + col + " " + row);
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public boolean testWithRandomNumber(int[][] testfieldLocal){

        for(int row = 0; row < 9; row++){
            for(int col = 0; col < 9; col++){
                if(testfieldLocal[row][col] == 0){                                                     //search an empty cell
                    for(int number = 1; number <= 9; number++){                                     //try possible numbers

                        randomNumber = randomSelf() + 1;
                        if(!randomNumbertested[randomNumber-1]){
                            randomNumbertested[randomNumber-1] = true;
                        }
                        else{
                            if(numberCanBePlaced(randomNumber,row,col,testfieldLocal)){
                                testfieldLocal[row][col] = number;
                                // //System.out.println(number + " Number placed " + col + " " + row);
                                if(test(testfieldLocal)){
                                                                                                    //recursiver aufru der methode zum lösen des sudokuproblems
                                    return true;
                                }
                                else{
                                    ////System.out.println("solve ist false");
                                    testfieldLocal[row][col] = 0;
                                }
                                //globalCounterSolveExecuted++;
                                ////System.out.println("gloablCounter(Wie oft wurde solve ausgeführt) : " + globalCounterSolveExecuted);
                            }else{
                                ////System.out.println(number + " Number cannot be placed " + col + " " + row);
                            }
                        }

                    }
                    return false;
                }
            }
        }
        return true;
    }

    public int[][] getSudokuField(){
        return sudokuField;
    }

    public boolean checkSudoku(int[][] localSudocuField){
        boolean test = false;
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                test = numberCanBePlaced(localSudocuField[i][j], i, j, localSudocuField);
                if(!test){
                    break;
                }
            }
            if(!test){
                break;
            }
        }
        return test;
    }
}
