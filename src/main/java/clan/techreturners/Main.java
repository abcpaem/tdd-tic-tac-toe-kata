package clan.techreturners;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        String move = "PLAY";

        System.out.println("Welcome to Tic Tac Toe!\n");
        System.out.println("There are 2 players: X and O\n\nType the position that you want to play (i.e. A1)\n");

        while (!move.isBlank() && !game.isGameOver()) {
            game.displayBoard();
            System.out.println("\nPlayer " + game.getCurrentPlayer() + " has a turn:");
            move = input.nextLine();
            game.play(move);
        }
        if (game.isGameOver()) {
            game.displayBoard();
            Character winner = game.getWinner();
            System.out.println(winner != null ? "\nThe winner is player " + winner + "!" : "\nIt's a draw!");
        }
    }
}
