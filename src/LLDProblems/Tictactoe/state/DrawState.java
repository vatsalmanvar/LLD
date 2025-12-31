package LLDProblems.Tictactoe.state;

public class DrawState implements GameState{
    public void next(StateContext context){
        System.out.println("Game is in the Draw State");
    }
}
