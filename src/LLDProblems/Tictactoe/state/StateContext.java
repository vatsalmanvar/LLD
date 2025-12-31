package LLDProblems.Tictactoe.state;

import LLDProblems.Tictactoe.entities.Player;

public class StateContext {
    private GameState currentState;

    public StateContext(){
        this.currentState = new IdleGameState();
    }

    public void setState(GameState newState){
        this.currentState = newState;
    }

    public void moveByPlayer(Player Player){
        if(currentState.getClass() == WinState.class){
            System.out.println("Game Over, Player won the game");
        }
        //similar condition for draw state
        currentState.next(this);
    }
}
