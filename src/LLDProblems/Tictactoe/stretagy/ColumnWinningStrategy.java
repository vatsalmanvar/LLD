package LLDProblems.Tictactoe.stretagy;

import LLDProblems.Tictactoe.entities.Board;
import LLDProblems.Tictactoe.entities.Player;

public class ColumnWinningStrategy implements WinningStrategy{
    public boolean checkWinner(Board board, Player player){
        System.out.println("Checking winner by col winning strategy");
        return false;
    }
}
