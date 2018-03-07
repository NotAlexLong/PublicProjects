package programmingexercise14.pkg6.charleslong;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ProgrammingExercise146CharlesLong extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();
        
        int y = -175;
        for(int i = 0; i < 8; i++){
            int x = -175;
            for(int k = 0; k < 8; k++){
                Rectangle piece = new Rectangle(50, 50);
                
                if(i % 2 == 0 || i == 0){
                    if(k % 2 == 0 || k == 0)
                        piece.setFill(Color.WHITE);
                    else
                        piece.setFill(Color.BLACK);
                }
                else{
                    if(k % 2 == 0 || k == 0)
                        piece.setFill(Color.BLACK);
                    else
                        piece.setFill(Color.WHITE); 
                }
                
                piece.setTranslateX(x);
                piece.setTranslateY(y);
                root.getChildren().add(piece);
                x+=50;
            }
            y+=50;
        }
                
        Scene scene = new Scene(root, 400, 400);
        
        primaryStage.setTitle("Programming Exercise 14.6 - Charles Long");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}