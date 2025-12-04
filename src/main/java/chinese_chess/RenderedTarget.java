package chinese_chess;

import data.Position;
import data.Side;
import javafx.scene.shape.Circle;

public abstract class RenderedTarget {
    Circle circle;
    Position position;
    boolean isAlive;
    public RenderedTarget(Position pos, double GridWidth){
        circle = new Circle(GridWidth*0.4);
        this.isAlive=true;
        this.position=pos;
    }
}
