package LLDProblems.Tictactoe;

import LLDProblems.Tictactoe.entities.Board;
import LLDProblems.Tictactoe.entities.Player;
import LLDProblems.Tictactoe.entities.Symbol;
import LLDProblems.Tictactoe.state.StateContext;
import LLDProblems.Tictactoe.stretagy.WinningStrategyContext;

public class TicTacToe {

    private static TicTacToe instance;
    private Board board;
    private Player player1, player2, winner=null, currentPlayer;
    private WinningStrategyContext winningStrategyContext;
    private StateContext stateContext;

    //singleton design pattern

    private TicTacToe(int size){
        board = new Board(size);
        player1 = new Player("Vatsal", Symbol.X);
        player2 = new Player("Dhruv", Symbol.O);
        currentPlayer = player1;
        stateContext = new StateContext();
        winningStrategyContext = new WinningStrategyContext(board);
    }

    public static TicTacToe getInstace(int size){
        if(instance == null) instance = new TicTacToe(size);
        return instance;
    }

    public void makeMove(int row, int col){
        //make move logic;
        board.putSymbol(currentPlayer, row, col);
        stateContext.moveByPlayer(currentPlayer);
        boolean isWinner = winningStrategyContext.checkWinner(currentPlayer);
        if(isWinner){
            System.out.println();
            winner = currentPlayer;
        }
        switchPlayer();
        //notify all the audience if you want

    }
    private void switchPlayer(){
        currentPlayer = (currentPlayer==player1) ? player2 : player1;
    }

    public Player getCurrentPlayer(){return currentPlayer;};


}

/*
Problem Statement
Design and implement a Tic Tac Toe game that allows two players to play on a NxN board, alternating turns,
and determines the winner or a draw.

Requirements
Two Players: The game is played between two players.
Board: The game uses a NxN board.
Turns: Players take turns to place their symbol (X or O) on the board.
Win Condition: The game detects when a player has won (three in a row, column, or diagonal).
Draw Condition: The game detects when the board is full and the game is a draw.
Input Validation: The game prevents moves to already occupied cells.
Extensibility: Easy to change the board size or add new features.

Entities:
1) Chess
2) Player
3) symbol


Design pattern
1) Singleton to create only one instance of game
2) State design pattern of whose turn is


 */