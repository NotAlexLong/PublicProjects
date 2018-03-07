package programmingexercise14.pkg11.charleslong;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class ProgrammingExercise1411CharlesLong extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Circle head = new Circle(150);
            head.setFill(Color.WHITE);
            head.setStroke(Color.BLACK);
        
        Ellipse outsideEye1 = new Ellipse(35, 25);
            outsideEye1.setFill(Color.WHITE);
            outsideEye1.setStroke(Color.BLACK);
            outsideEye1.setTranslateX(-50);
            outsideEye1.setTranslateY(-50);
        
        Circle insideEye1 = new Circle(25);
            insideEye1.setTranslateX(-50);
            insideEye1.setTranslateY(-50);
       
        Ellipse outsideEye2 = new Ellipse(35, 25);
            outsideEye2.setFill(Color.WHITE);
            outsideEye2.setStroke(Color.BLACK);
            outsideEye2.setTranslateX(50);
            outsideEye2.setTranslateY(-50);
        
        Circle insideEye2 = new Circle(25);
            insideEye2.setTranslateX(50);
            insideEye2.setTranslateY(-50);
            
        Polyline nose = new Polyline();
            nose.getPoints().addAll(new Double[]{
                0.0, 0.0,
                20.0, 10.0,
                10.0, 20.0 });
            nose.setTranslateY(25);
            
        Ellipse mouthShown = new Ellipse(50, 25);
            mouthShown.setFill(Color.WHITE);
            mouthShown.setStroke(Color.BLACK);
            mouthShown.setTranslateY(75);
            
        Ellipse mouthHidden = new Ellipse(53, 25);
            mouthHidden.setFill(Color.WHITE);
            mouthHidden.setTranslateY(73);
        
        StackPane root = new StackPane();
        root.getChildren().addAll(head, outsideEye1, insideEye1, outsideEye2, insideEye2, nose, mouthShown, mouthHidden);
        
        Scene scene = new Scene(root, 500, 500);
        
        primaryStage.setTitle("Programming Exercise 14.11 - Charles Long");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
