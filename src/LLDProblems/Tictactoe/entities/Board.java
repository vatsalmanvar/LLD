package LLDProblems.Tictactoe.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Board {

    private int size;
    private List<List<Integer>> board;

    public Board(int size){
        this.size = size;
        board = new ArrayList<>();
        for(int i=0; i<size; i++){
            board.add(Collections.nCopies(size, 0));
        }
    }

    public void putSymbol(Player player, int row, int col){
        //check is it legal or not else raise exception
        System.out.println("putting the symbol at"+row+" "+col+" with symbol "+player.getSymbol().toString());
    }
}