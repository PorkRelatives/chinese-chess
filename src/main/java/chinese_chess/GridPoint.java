package chinese_chess;

import data.Position;
import javafx.geometry.Pos;

public class GridPoint {
    private int x;
    private int y;
    public GridPoint(int x, int y){
        this.x=x;
        this.y=y;
    }
    public GridPoint(Position pos){
        this.x=pos.getRow();
        this.y=pos.getCol();
    }
    public Position toPosition(){
        return new Position(x,y);
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public boolean equals(GridPoint v){
        if(this.x==v.getX()&&this.y==v.getY())return true;
        else return false;
    }
}
