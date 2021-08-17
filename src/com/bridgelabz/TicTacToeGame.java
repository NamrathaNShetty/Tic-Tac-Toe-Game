package com.bridgelabz;

import java.util.Scanner;

public class TicTacToeGame {

    //Variables
    public static char playerSymbol;
    public static char cpuSymbol;
    static char[] board = new char[10]; //board size of 10

    public static char[] createBoard() {
        for (int i = 0; i < board.length; i++) { //Iteration from 1 to 9
            board[i] = ' '; //initializing empty values
        }
        return board;
    }

       //Display the board
        public static void showBoard() {
            System.out.println("Board Display\n");
            System.out.println(" | "+board[1]+" "+board[2]+" "+board[3]+" |\n");
            System.out.println(" | "+board[4]+" "+board[5]+" "+board[6]+" |\n");
            System.out.println(" | "+board[7]+" "+board[8]+" "+board[9]+" |\n");
    }

    //Function to choose symbol X or O
    public static void main(String[] args) {
       createBoard();
        System.out.println("Select the Letter you wanted \n  Press 1 . Choose X \n  Press 2 . Choose O\n\nEnter your Choice : ");
        Scanner scan =new Scanner(System.in); //Create scanner object
        int choice = scan.nextInt();
        switch(choice){
            case 1 : {
                playerSymbol='X';
                cpuSymbol='O';
                break;
            }
            case 2 :{
                playerSymbol='O';
                cpuSymbol='X';
                break;
            }
            default: {
                System.out.println("Invalid Choice . Retry Again!");
                return;
            }
        }
        TicTacToeGame.showBoard();

    }

}