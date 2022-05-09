package clan.techreturners;

import clan.techreturners.testhelper.RandomStub;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

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
        game.play("A1");
        Character nextPlayer = game.getCurrentPlayer();
        Character expectedPlayer = firstPlayer == 'X' ? 'O' : 'X';

        // Assert
        assertEquals(expectedPlayer, nextPlayer);
    }

    @Test
    public void checkPlayResultWhenBoardPositionIsAvailable() {
        // Arrange
        TicTacToe game = new TicTacToe();

        // Act
        boolean isValidMove = game.play("A1");

        // Assert
        assertTrue(isValidMove);
    }

    @Test
    public void checkPlayResultWhenBoardPositionIsNotAvailable() {
        // Arrange
        TicTacToe game = new TicTacToe();

        // Act
        boolean isValidMove = game.play("A1");
        isValidMove = game.play("A1"); // Second player is trying to play the same position

        // Assert
        assertFalse(isValidMove);
    }

    @ParameterizedTest(name = "{index}) Position {0} is not valid")
    @ValueSource(strings = {" ", "D1", "X4", "null", "WHATEVER"})
    public void checkPlayResultWhenBoardPositionIsNotValid(String position) {
        // Arrange
        TicTacToe game = new TicTacToe();

        // Act
        boolean isValidMove = game.play(position.equals("null") ? null : position);

        // Assert
        assertFalse(isValidMove);
    }

    @ParameterizedTest(name = "Positions played with no winner: {0}")
    @ValueSource(strings = "A1,A2,A3,B1,B2,B3,C1,C2,C3")
    public void checkIsGameOverWithNoWinner(String moves) {
        // Arrange
        TicTacToe game = new TicTacToe();
        String[] positions = moves.split(",");

        // Act
        for (String pos : positions) {
            game.play(pos);
        }
        Character winner = game.getWinner();

        //Assert
        assertTrue(game.isGameOver() && winner == null);
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
