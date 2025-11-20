package chinese_chess;

import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class MenuController {
    static void initGame(Stage stage, GraphicElements elements, TypeOfInit type){
        if(type==TypeOfInit.General){
            System.out.println("Starting New Game");
            elements.GameMenu.getChildren().remove(elements.NewGame);
            elements.GameMenu.getChildren().remove(elements.LoadFromSave);
            elements.GameMenu.getChildren().add(elements.WhosTurn);
            elements.WhosTurn.setText("黑方行棋");
            /*从头开始一个游戏*/
        }else if(type==TypeOfInit.FromSave){
            System.out.println("Starting From Save");
            elements.GameMenu.getChildren().remove(elements.NewGame);
            elements.GameMenu.getChildren().remove(elements.LoadFromSave);
            //开个输入框，然后读取文件
            FileChooser filechooser= new FileChooser();
            filechooser.setTitle("选取存档");
            File file = filechooser.showOpenDialog(stage);
            System.out.println(file);
        }
    }
}
