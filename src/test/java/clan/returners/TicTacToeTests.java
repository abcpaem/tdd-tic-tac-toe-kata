package clan.returners;

import org.junit.jupiter.api.Test;

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
}
