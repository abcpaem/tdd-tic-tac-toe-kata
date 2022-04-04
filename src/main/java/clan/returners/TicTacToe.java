package clan.returners;

import java.util.Random;

public class TicTacToe {
    private Character currentPlayer;

    public TicTacToe() {
        Random r = new Random();
        currentPlayer = r.nextBoolean() ? 'X' : 'O';
    }

    public Character getCurrentPlayer() {
        return currentPlayer;
    }

    public int setupPlayingBoard() {
        return 9;
    }

    public Character[] setupPlayers() {
        return new Character[]{'X', 'O'};
    }

    public String play() {
        return "Player " + currentPlayer + " has a turn";
    }
}
