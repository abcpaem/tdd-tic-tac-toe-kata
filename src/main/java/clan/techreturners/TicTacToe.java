package clan.techreturners;

import java.util.Locale;
import java.util.Map;
import java.util.Random;

public class TicTacToe {
    private int currentPlayerIndex;
    private Character[] players = new Character[]{'X', 'O'};
    char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    Map<String, Integer> rows = Map.of("A", 0, "B", 1, "C", 2);

    public TicTacToe() {
        this(new Random());
    }

    public TicTacToe(Random rnd) {
        currentPlayerIndex = rnd.nextInt(2);
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

    public boolean play(String position) {
        if (!isPositionValid(position) || !isPositionAvailable(position)) return false;

        board[rows.get(position.toUpperCase().substring(0, 1))][Integer.parseInt(position.substring(1)) - 1] = getCurrentPlayer();

        currentPlayerIndex = (currentPlayerIndex + 1) % players.length;

        return true;
    }

    private boolean isPositionValid(String position) {
        return position != null && !position.isBlank() && position.toUpperCase().substring(0,1).matches("[ABC]") && position.substring(1).matches("[123]");
    }

    private boolean isPositionAvailable(String position) {
        return Character.isWhitespace(board[rows.get(position.toUpperCase().substring(0,1))][Integer.parseInt(position.substring(1))-1]);
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
