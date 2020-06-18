package com.example.sudoku;

public class SudokuLogic {

    int[][] sudokuField = new int[9][9];
    int[][] sudokuFieldZwischenspeicher = new int[9][9];
    int numberIfEasy = 30;
    int numberIfMedium = 20;
    int numberIfHard = 10;



    public int[][] createSudoku(int difficulty){                                                    //kreiert anfangssudoku mit gewiser anzahl an starter zahlen | 1 leicht| 2 mittel| 3 schwer
        int[][] newSudoku = new int[9][9];
        int counterOfHowManyNumbersAreLeft = 0;

        if(difficulty == 1){
            while(counterOfHowManyNumbersAreLeft <= numberIfEasy){

            }
        }
        if(difficulty == 2){
            while(counterOfHowManyNumbersAreLeft <= numberIfMedium){

            }
        }
        if(difficulty == 3){
            while(counterOfHowManyNumbersAreLeft <= numberIfHard){

            }
        }

        return newSudoku;
    }

    public boolean numberCanBePlaced(int numberToBePlaced, int posInRow, int posInColumn){
        if(numberToBePlaced > 0 && numberToBePlaced < 10){
            boolean canBePlaced = true;                                                             //muss auf false gesetzt werden, wenn eine der abfragen falsch läuft
            //checkColumn                                                                           //kann man auch eleganter machen wenn eins falsch ist, dass man ganz aufhört zu prüfen
            canBePlaced = canBePlacedInColumn(numberToBePlaced,posInRow, posInColumn);
            //checkRow
            canBePlaced = canBePlacedInRow(numberToBePlaced,posInRow, posInColumn);
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
        int row = posInRow - posInRow % 3;
        int col = posInColumn - posInColumn % 3;
        for(int i = row; i < row + 3; i++){
            for (int j = col; i < col + 3; j++){
                if(sudokuField[i][j] == numberCanBePlaced){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean solve(){
        for(int row = 0; row < 9; row++){
            for(int col = 0; col < 9; col++){
                if(sudokuField[row][col] == 0){                                                     //search an empty cell
                    for(int number = 1; number <= 9; number++){                                     //try possible numbers
                        if(numberCanBePlaced(number,col,row)){
                            sudokuField[row][col] = number;
                            if(solve()){                                                            //recursiver aufru der methode zum lösen des sudokuproblems
                                return true;
                            }
                            else{                                                                   //if not a solution, setit back to zero
                                sudokuField[row][col] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;                                                                                //sudoku solved
    }
}
