package Game;
//This file is now for test only

import Core.Board;

public class Game{
    private Board board= new Board();
    public void printBoard(){
        board.printBoard();
    }
    public Board getBoard(){
        return board;
    }

}