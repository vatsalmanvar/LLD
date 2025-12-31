package LLDProblems.Tictactoe.stretagy;

import LLDProblems.Tictactoe.entities.Board;
import LLDProblems.Tictactoe.entities.Player;

import java.util.ArrayList;
import java.util.List;

public class WinningStrategyContext {
    public List<WinningStrategy> winningStrategies;
    public Board board;

    public WinningStrategyContext(Board board){
        this.winningStrategies = List.of(
                new RowWinningStrategy(),
                new ColumnWinningStrategy(),
                new DiagonalWinningStrategy()
        );
        this.board = board;
    }

    public boolean checkWinner(Player player) {
        for (WinningStrategy strategy : winningStrategies) {
            if (strategy.checkWinner(board, player)) {
                return true;
            }
        }
        return false;
    }
}
