package LLDProblems.Tictactoe.stretagy;

import LLDProblems.Tictactoe.entities.Board;
import LLDProblems.Tictactoe.entities.Player;

public interface WinningStrategy {
    boolean checkWinner(Board board, Player player);
}
