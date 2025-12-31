package LLDProblems.Tictactoe;

import LLDProblems.Tictactoe.entities.Player;

public class TicTacToeApplication {
    public static void main(String args[]){
        TicTacToe game = TicTacToe.getInstace(4);
        game.makeMove(0, 0);
        game.makeMove(1, 0);
        game.makeMove(2, 0);
        game.makeMove(0, 1);
    }
}
