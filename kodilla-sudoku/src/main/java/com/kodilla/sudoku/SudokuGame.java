package com.kodilla.sudoku;
import java.util.Scanner;

public class SudokuGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to Sudoku game! Enter 'PLAY' to play Sudoku, 'SUDOKU' to solve Sudoku, or 'EXIT' to quit:");
            String command = scanner.nextLine().trim().toUpperCase();

            if (command.equals("EXIT")) {
                break;
            } else if (command.equals("SUDOKU")) {
                SudokuBoard board = new SudokuBoard();

                if (SudokuSolver.isSolvable(board.getBoard())) {
                    System.out.println("Solved Sudoku Board:");
                    board.printBoard();
                } else {
                    System.out.println("Sudoku not resolvable.");
                }
            } else if (command.equals("PLAY")) {
                SudokuBoard board = new SudokuBoard();
                boolean isSolvable = playSudoku(scanner, board);

                if (!isSolvable) {
                    System.out.println("Sudoku not resolvable.");
                }
            } else {
                System.out.println("Invalid command. Please enter 'SUDOKU', 'PLAY', or 'EXIT'.");
            }
        }

        scanner.close();
    }

    private static boolean playSudoku(Scanner scanner, SudokuBoard board) {
        System.out.println("Welcome to Sudoku! Type 'EXIT' to quit playing.");

        while (true) {
            System.out.println("Current Sudoku Board:");
            board.printBoard();

            System.out.print("Please enter 'EXIT' to quit, 'SUDOKU' to solve Sudoku, 'CHANGE' to change a number, or row, column, and value (e.g., '3 4 2'): ");
            String input = scanner.nextLine().trim().toUpperCase();

            if (input.equals("EXIT")) {
                break;
            } else if (input.equals("SUDOKU")) {
                SudokuSolver solver = new SudokuSolver();

                if (solver.solveBoard(board.getBoard())) {
                    System.out.println("Solved Sudoku Board:");
                    board.printBoard();
                } else {
                    System.out.println("Sudoku not resolvable.");
                }
            } else if (input.equals("CHANGE")) {
                System.out.print("Enter row, column, and new value (e.g., '3 4 2'): ");
                String changeInput = scanner.nextLine().trim().toUpperCase();

                if (changeInput.matches("[1-9] [1-9] [1-9]")) {
                    String[] parts = changeInput.split(" ");
                    int row = Integer.parseInt(parts[0]) - 1;
                    int col = Integer.parseInt(parts[1]) - 1;
                    int newValue = Integer.parseInt(parts[2]);

                    if (row >= 0 && row < 9 && col >= 0 && col < 9 && newValue >= 0 && newValue <= 9) {
                        board.getBoard()[row][col] = newValue;
                    } else {
                        System.out.println("Invalid input. Please enter valid coordinates (1-9) and a value (0-9).");
                    }
                } else {
                    System.out.println("Invalid input format. Please enter row, column, and value (e.g., '3 4 2').");
                }
            } else if (input.matches("[1-9] [1-9] [1-9]")) {
                String[] parts = input.split(" ");
                int row = Integer.parseInt(parts[0]) - 1;
                int col = Integer.parseInt(parts[1]) - 1;
                int value = Integer.parseInt(parts[2]);

                if (row >= 0 && row < 9 && col >= 0 && col < 9 && value >= 0 && value <= 9) {
                    board.getBoard()[row][col] = value;
                } else {
                    System.out.println("Invalid input. Please enter valid coordinates (1-9) and a value (0-9).");
                }
            } else {
                System.out.println("Invalid input format. Please enter 'EXIT' to quit, 'SUDOKU' to solve Sudoku, or row, column, and value (e.g., '3 4 2').");
            }
        }
        return true;
    }
}