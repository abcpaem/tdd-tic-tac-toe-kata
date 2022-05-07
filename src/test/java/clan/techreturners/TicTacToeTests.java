package clan.techreturners;

import clan.techreturners.testhelper.RandomStub;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Random;

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
        Random randomStub = new RandomStub(1);
        TicTacToe game = new TicTacToe(randomStub);
        Character expectedPlayer = 'O';

        // Act
        Character currentPlayer = game.getCurrentPlayer();

        // Assert
        assertEquals(expectedPlayer, currentPlayer);
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
