package chinese_chess;

import data.PieceType;
import data.Position;
import data.Side;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class RenderedIndicator extends RenderedTarget{
    public RenderedIndicator(Position pos, double GridWidth, GraphicElements elements) {
        super(pos,GridWidth);
        circle.setFill(Color.web("#EBF6FF"));
        circle.setRadius(GridWidth*0.4);
        circle.setLayoutX((pos.getCol()+1)*GridWidth);
        circle.setLayoutY((pos.getRow()+1)*GridWidth);
        circle.setStrokeWidth(0);
        elements.BoardSurface.getChildren().add(this.circle);
    }
}
