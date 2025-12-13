package GameSave;


import Core.Board;

import java.io.Serializable;
import java.util.List;

public class GameSaveData implements Serializable {
    private static final long serialVersionUID = 1L;

    public final String username;
    public final List<MoveRecord> moveHistory;

    public final Board initialBoard;
    public final Board finalBoard;

    public GameSavePublicness publicness;


    public GameSaveData(String username, List<MoveRecord> moveHistory,Board initialBoard) throws Exception {
        this.username = username;
        this.moveHistory = moveHistory;
        this.initialBoard=initialBoard;

        Board tempBoard=initialBoard;
        for(MoveRecord moveRecord : moveHistory){
            tempBoard.movePiece(moveRecord.fromPosition,moveRecord.toPosition,false);
        }
        this.finalBoard=tempBoard;
        publicness=GameSavePublicness.PRIVATE;
    }

    public GameSaveData(String username, List<MoveRecord> moveHistory) throws Exception {
        this.username = username;
        this.moveHistory = moveHistory;
        this.initialBoard=new Board(username);

        Board tempBoard=initialBoard;
        for(MoveRecord moveRecord : moveHistory){
            tempBoard.movePiece(moveRecord.fromPosition,moveRecord.toPosition,false);
        }
        this.finalBoard=tempBoard;
        publicness=GameSavePublicness.PRIVATE;
    }

    public void setPublicness(GameSavePublicness publicness){
        this.publicness=publicness;
    }
}
