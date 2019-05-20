package sylema;
import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
public class Lab1 extends Application {
 public static void main(String[] args) {
 launch(args);
 }
 @Override
 public void start(Stage primaryStage) {
 Group root = new Group();
 Scene scene = new Scene(root, 480, 290);

 Ellipse ellipse = new Ellipse(362,145,110,120);
 root.getChildren().add(ellipse);
 ellipse.setFill(Color.WHITE);
 
 Ellipse ellipse2 = new Ellipse(362,145,103,113);
 root.getChildren().add(ellipse2);
 ellipse2.setFill(Color.SILVER);
 
 Circle circle = new Circle(230,145,100);
 root.getChildren().add(circle);
 circle.setFill(Color.DARKRED);
 
 Circle circle2 = new Circle(490,145,100);
 root.getChildren().add(circle2);
 circle2.setFill(Color.DARKRED);
 
 Rectangle r = new Rectangle(69, 139, 340, 10); 
 root.getChildren().add(r); 
 r.setFill(Color.BLACK);; 
 
 scene.setFill(Color.DARKRED); 

 primaryStage.setScene(scene);
 primaryStage.show();
 }
}