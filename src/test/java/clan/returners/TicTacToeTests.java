package clan.returners;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicTacToeTests {
    @Test
    public void checkPlayingBoardSize() {
        // Arrange
        TicTacToe game = new TicTacToe();

        // Act
        int playingBoardSize = game.setupPlayingBoard();

        // Assert
        assertEquals(9, playingBoardSize);
    }

    @Test
    public void checkPlayerNames() {
        // Arrange
        TicTacToe game = new TicTacToe();

        // Act
        Character[] playerNames = game.setupPlayers();

        // Assert
        assertArrayEquals(new Character[]{'X', 'O'}, playerNames);
    }

    @Test
    public void checkFirstPlayerTurn() {
        // Arrange
        TicTacToe game = new TicTacToe();

        // Act
        Character currentPlayer = game.getCurrentPlayer();
        String gameState = game.play();

        // Assert
        assertEquals(String.format("Player %c has a turn", currentPlayer), gameState);
    }

    @Test
    public void checkPlayersTakeTurns() {
        // Arrange
        TicTacToe game = new TicTacToe();

        // Act
        Character firstPlayer = game.getCurrentPlayer();
        game.play();
        Character nextPlayer = game.getCurrentPlayer();
        Character expectedPlayer = firstPlayer == 'X' ? 'O' : 'X';

        // Assert
        assertEquals(expectedPlayer, nextPlayer);
    }
}
