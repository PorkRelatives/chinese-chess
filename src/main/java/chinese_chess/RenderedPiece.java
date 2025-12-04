package chinese_chess;

import data.PieceType;
import data.Position;
import data.Side;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class RenderedPiece extends RenderedTarget{
    Side side;
    PieceType type;
    public RenderedPiece(Position pos, Side s, PieceType type, double GridWidth, GraphicElements elements) {
        super(pos,GridWidth);
        this.side=s;
        this.type=type;
        circle.setFill(Color.web("#FFD963"));
        circle.setRadius(GridWidth*0.4);
        circle.setLayoutX((pos.getCol()+1)*GridWidth);
        circle.setLayoutY((pos.getRow()+1)*GridWidth);
        circle.setStroke(Paint.valueOf("#000000"));
        elements.BoardSurface.getChildren().add(this.circle);
    }
}
