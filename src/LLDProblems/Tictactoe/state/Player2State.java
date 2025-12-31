package LLDProblems.Tictactoe.state;

public class Player2State implements GameState{
    @Override
    public void next(StateContext context){
        //decide where to move
        System.out.println("Inside Player 2 state, moving to win state");
        context.setState(new WinState());
    }
}
