package com.bridgelabz;

public class TicTacToeGame {

    public static char[] createBoard() {
        char[] board = new char[10]; //board size of 10
        for (int i = 0; i < board.length; i++) { //Iteration from 1 to 9
            board[i] = ' '; //initializing empty values
        }
        return board;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game");
        createBoard();
    }
}