package LLDProblems.Tictactoe.state;

public class IdleGameState implements GameState {

    public void next(StateContext context){
        //decide where to move
        context.setState(new Player1State());
    }
}
