package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int round = 0;
        int playerScore = 0;
        int computerScore = 0;
        String playerName;
        String endGame;
        String restartGame;
        String playerMove;
        Integer winsNumber;


        System.out.println("Please enter your name.");
        playerName = scanner.nextLine();


        System.out.println("Please enter how many wins do you want to play.");
        winsNumber = Integer.parseInt(scanner.nextLine());


        System.out.println("Welcome to Rock-Paper-Scissors game, " + playerName + "! Let's play till " + winsNumber + " wins. Damn, you must be bored!");
        System.out.println("");
        System.out.println("Let's learn the rules first!");
        System.out.println("Enter 1 for rock.");
        System.out.println("Enter 2 for paper.");
        System.out.println("Enter 3 for scissors.");
        System.out.println("Enter x to quit the game.");
        System.out.println("Enter n to restart the game.");
        System.out.println("");
        System.out.println("And now let's play!");

        for (int i = 0;; i++) {
            if (computerScore == winsNumber || playerScore == winsNumber) {
                break;
            } else {
                int[] rps = {1, 2, 3};
                int computerMove = rps[new Random().nextInt(rps.length)];

                while (true) {
                    System.out.println("Please enter your move: 1, 2, 3 to play, n to restart or x to quit the game.");
                    playerMove = scanner.nextLine();
                    if (playerMove.equals("1") || (playerMove.equals("2") || (playerMove.equals("3")
                            || (playerMove.equals("d") || playerMove.equals("n") || playerMove.equals("x"))))) {
                        break;
                    }
                    System.out.println("Not a valid move!");
                }
                if (playerMove.equals("d")) {
                    System.out.print("D as DOG! <3 ");
                    System.out.println("Take your dog for a walk instead of playing silly games!");
                }

                    if (playerMove.equals("1") || (playerMove.equals("2") || (playerMove.equals("3")))) {
                        System.out.print("Computer played: ");
                        if (computerMove == 1) {
                            System.out.println("rock.");
                        }
                        if (computerMove == 2) {
                            System.out.println("paper.");
                        }
                        if (computerMove == 3) {
                            System.out.println("scissors.");
                        }
                    }

                    if (playerMove.equals(computerMove)) {
                        System.out.println("The game was a tie, no points will be awarded.");
                    } else if (playerMove.equals("1")) {
                        if (computerMove == 2) {
                            System.out.println("You lose! Computer score: 1, your score: 0");
                            computerScore++;
                            System.out.println("General computer score: " + computerScore + ", your score: " + playerScore);
                        } else if (computerMove == 3) {
                            System.out.println("You win! Computer score: 0, your score: 1");
                            playerScore++;
                            System.out.println("General computer score: " + computerScore + ", your score: " + playerScore);
                        }
                    } else if (playerMove.equals("2")) {
                        if (computerMove == 1) {
                            System.out.println("You win! Computer score: 0, your score: 1");
                            playerScore++;
                            System.out.println("General computer score: " + computerScore + ", your score: " + playerScore);
                        } else if (computerMove == 3) {
                            System.out.println("You lose! Computer score: 1, your score: 0");
                            computerScore++;
                            System.out.println("General computer score: " + computerScore + ", your score: " + playerScore);
                        }
                    } else if (playerMove.equals("3")) {
                        if (computerMove == 1) {
                            System.out.println("You lose! Computer score: 1, your score: 0");
                            computerScore++;
                            System.out.println("General computer score: " + computerScore + ", your score: " + playerScore);

                        } else if (computerMove == 2) {
                            System.out.println("You win! Computer score: 0, your score: 1");
                            playerScore++;
                            System.out.println("General computer score: " + computerScore + ", your score: " + playerScore);
                        }
                    } else if (playerMove.equals("x")) {
                        System.out.println("Do you really want to quit? If yes, please type x again.");
                        endGame = scanner.nextLine();

                    } else if (playerMove.equals("n")) {
                        System.out.println("Do you really want to restart? If yes, please type n again.");
                        restartGame = scanner.nextLine();
                    }

                    System.out.println("The game has ended with computer score: " + computerScore + ", your score: " + playerScore);
                }
            }
        }
    }

