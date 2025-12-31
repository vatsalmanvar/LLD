package LLDProblems.Tictactoe.state;

public class WinState implements GameState{
    @Override
    public void next(StateContext context){
        System.out.println("Cant move further, Game is in the final state");
    }
}
