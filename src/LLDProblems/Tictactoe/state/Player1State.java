package LLDProblems.Tictactoe.state;

import LLDProblems.StackOverFlow.Entities.Post;

public class Player1State implements GameState{
    public void next(StateContext context){
        //decide where to move
        System.out.println("Inside Player 1 state, moving to player 2");
        context.setState(new Player2State());
    }
}
