package clan.techreturners;

import java.util.Random;

public class TicTacToe {
    private int currentPlayerIndex;
    private Character[] players = new Character[]{'X', 'O'};
    char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};

    public TicTacToe() {
        Random r = new Random();
        currentPlayerIndex = r.nextInt(2);
    }

    public Character getCurrentPlayer() {
        return players[currentPlayerIndex];
    }

    public int getBoardSize() {
        return board[0].length * board.length;
    }

    public Character[] getPlayers() {
        return players;
    }

    public String play() {
        String currentState = "Player " + getCurrentPlayer() + " has a turn";

        currentPlayerIndex = (currentPlayerIndex + 1) % players.length;

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
