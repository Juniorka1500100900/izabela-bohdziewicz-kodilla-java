package com.kodilla.sudoku;

public class SudokuBoard {
    public static final int GRID_SIZE = 9;
    private int[][] board = new int[GRID_SIZE][GRID_SIZE];

    public SudokuBoard() {
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                board[i][j] = 0;
            }
        }
    }
    public int[][] getBoard() {
        return board;
    }

    public void setCellValue(int row, int col, int value) {
        board[row][col] = value;
    }

    public int getCellValue(int row, int col) {
        return board[row][col];
    }

    public void printBoard() {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println("+-----------------------+");
            }
            for (int j = 0; j < GRID_SIZE; j++) {
                if (j % 3 == 0 && j != 0) {
                    System.out.print("| ");
                }
                if (j == GRID_SIZE - 1) {
                    System.out.println(board[i][j] + " |");
                } else {
                    System.out.print(board[i][j] + " ");
                }
            }
        }
        System.out.println("+-----------------------+");
    }
}
