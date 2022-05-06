package clan.techreturners;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicTacToeTests {
    @Test
    public void checkPlayingBoardSize() {
        // Arrange
        TicTacToe game = new TicTacToe();

        // Act
        int playingBoardSize = game.getBoardSize();

        // Assert
        assertEquals(9, playingBoardSize);
    }

    @Test
    public void checkPlayerNames() {
        // Arrange
        TicTacToe game = new TicTacToe();

        // Act
        Character[] playerNames = game.getPlayers();

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

    @Test
    void checkDisplayBoard() {
        // Arrange
        ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputContent));
        TicTacToe game = new TicTacToe();

        // Act
        game.displayBoard();

        // Assert
        assertEquals("    1   2   3\r\n" +
                "A     │   │  \r\n" +
                "   ───┼───┼───\r\n" +
                "B     │   │  \r\n" +
                "   ───┼───┼───\r\n" +
                "C     │   │  \r\n", outputContent.toString());
    }
}
