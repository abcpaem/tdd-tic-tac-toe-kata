package clan.techreturners;

import java.util.Random;

public class TicTacToe {
    private Character currentPlayer;
    char[][] board = {{' ', ' ', ' '},{' ', ' ', ' '},{' ', ' ', ' '}};

    public TicTacToe() {
        Random r = new Random();
        currentPlayer = r.nextBoolean() ? 'X' : 'O';
    }

    public Character getCurrentPlayer() {
        return currentPlayer;
    }

    public int getBoardSize() {
        return board[0].length * board.length;
    }

    public Character[] setupPlayers() {
        return new Character[]{'X', 'O'};
    }

    public String play() {
        String currentState = "Player " + currentPlayer + " has a turn";

        currentPlayer = currentPlayer == 'X' ? 'O' : 'X';

        return currentState;
    }

    public void displayBoard() {
        System.out.println("    1   2   3");
        System.out.println("A   " + board[0][0] + " │ " + board[0][1] + " │ " + board[0][2]);
        System.out.println("   ───┼───┼───");
        System.out.println("B   " + board[1][0] + " │ " + board[1][1] + " │ " + board[1][2]);
        System.out.println("   ───┼───┼───");
        System.out.println("C   " + board[2][0] + " │ " + board[2][1] + " │ " + board[2][2]);
    }
}
