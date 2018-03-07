/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingexercise14.pkg29;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class ProgrammingExercise1429 extends Application {
    
    @Override
    public void start(Stage primaryStage) {

        StackPane root = new StackPane();
        int yCord = -100;
        for(int row = 1; row <= 7; row++){
            int tempSpacing = (row * -25) + 25;
            for(int pegs = 1; pegs <= row; pegs++){
                Circle peg = new Circle(10);
                peg.setTranslateX(tempSpacing);
                peg.setTranslateY(yCord);
                root.getChildren().add(peg);
                tempSpacing += 50;
            }
            yCord+=30;
        }
        
        Polyline machineOutline = new Polyline();
        machineOutline.getPoints().addAll(new Double[]{
            -50.0, -250.0,
            -50.0, -225.0,
            -225.0, 0.0,
            -225.0, 25.0,
            -175.0, 25.0,
            -175.0, 0.0,
            -175.0, 25.0,
            -125.0, 25.0,
            -125.0, 0.0,
            -125.0, 25.0,
            -75.0, 25.0,
            -75.0, 0.0,
            -75.0, 25.0,
            -25.0, 25.0,
            -25.0, 0.0,
            -25.0, 25.0,
            25.0, 25.0,
            25.0, 0.0,
            25.0, 25.0,
            75.0, 25.0,
            75.0, 0.0,
            75.0, 25.0,
            125.0, 25.0,
            125.0, 0.0,
            125.0, 25.0,
            175.0, 25.0,
            175.0, 0.0,
            0.0, -225.0,
            0.0, -250.0
            });

        root.getChildren().addAll(machineOutline);
        Scene scene = new Scene(root, 500, 500);
        
        primaryStage.setTitle("Exercise 14.29 - Charles Long");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
