# Chapter 14 Report - Charles Long

## 14.6

### Description:
(Game: display a checkerboard) Write a program that displays a checkerboard
in which each white and black cell is a Rectangle with a fill color black or
white, as shown in Figure 14.44c.

###  Code:
``` Java
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
```
Comments:
This program uses an array and if statments to make a checkerboard in javafx.

## 14.7

### Description:
(Display random 0 or 1) Write a program that displays a 10-by-10 square matrix,
as shown in Figure 14.45a. Each element in the matrix is 0 or 1, randomly generated.
Display each number centered in a text field. Use TextField’s setText
method to set value 0 or 1 as a string.

### Code:
``` Java
package programmingexercise14.pkg7.charleslong;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.Random;

public class ProgrammingExercise147CharlesLong extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Random gen = new Random();
        StackPane root = new StackPane();
        
        int y = -115;
        for(int i = 0; i < 10; i++){
            int x = -115;
            for(int k = 0; k < 10; k++){
                Label num = new Label(gen.nextInt(2) + "");
                num.setTranslateX(x);
                num.setTranslateY(y);
                root.getChildren().add(num);
                x +=25;
            }
            y += 25;
        }

        Scene scene = new Scene(root, 450, 300);
        
        primaryStage.setTitle("Programming Exercise 14.7 - Charles Long");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }   
}
```
### Comments:
This program uses an array and the Random class to make a matrix of random numbers between 0 and 1.

## 14.11
### Description:
(Pai nt a smiley face) Write a program that paints a smiley face, as shown in
Figure 14.46a.

### Code:
``` Java
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
```
### Comments:
This took a lot of time and testing but didn't require an array or anything.

## 14.29

### Description:
(Game: bean machine) Write a program that displays a bean machine introduced
in Programming Exercise 7.21, as shown in Figure 14.52c.

### Code:
``` Java
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
	
    public static void main(String[] args) {
        launch(args);
    } 
}
```

### Comments:
This is the bean machine and it was easy to write except for making the pegs. I used an array to do that.
