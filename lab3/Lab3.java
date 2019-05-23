package sylema;

import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Lab3 extends Application {

    public static double X (double originalX){
        return originalX + 300;
    }
    public static double Y (double originalY){
        return originalY + 250;
    }

    public static void main(String args[]) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 1200, 600);
        
        //background
        
        Ellipse oval = new Ellipse(X(5), Y(5), 100, 50);
        oval.setStroke(Color.BLACK);
        oval.setStrokeWidth(1);
        oval.setFill(Color.GREEN);
        root.getChildren().add(oval);
        
        //road
        
        Path road = new Path();
        road.setStrokeWidth(2);
        road.setStrokeLineCap(StrokeLineCap.ROUND);
        road.setStrokeLineJoin(StrokeLineJoin.ROUND);
        MoveTo moveTo_1 = new MoveTo(X(-55), Y(45));
        QuadCurveTo curve_1 = new QuadCurveTo(X(-51), Y(35), X(0), Y(25));
        QuadCurveTo curve_2 = new QuadCurveTo(X(5), Y(15), X(1), Y(13));
        QuadCurveTo curve_3 = new QuadCurveTo(X(1), Y(13), X(10), Y(11));
        QuadCurveTo curve_4 = new QuadCurveTo(X(15), Y(25), X(0), Y(35));
        QuadCurveTo curve_5 = new QuadCurveTo(X(-25), Y(38), X(-25), Y(53));
        road.getElements().addAll(moveTo_1, curve_1,curve_2,curve_3,curve_4,curve_5);
        road.setFill(Color.YELLOW);
        root.getChildren().add(road);
        
        //walls
        
        Path wall1 = new Path();
        wall1.setStrokeWidth(2);
        wall1.setStrokeLineCap(StrokeLineCap.ROUND);
        wall1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        moveTo_1 = new MoveTo(X(-59), Y(7));
        curve_1 = new QuadCurveTo(X(-51), Y(10), X(-13), Y(23));
        curve_2 = new QuadCurveTo(X(-11), Y(-20), X(-11), Y(-20));
        curve_3 = new QuadCurveTo(X(-62), Y(-28), X(-62), Y(-28));
        curve_4 = new QuadCurveTo(X(-59), Y(7), X(-59), Y(7));
        wall1.getElements().addAll(moveTo_1, curve_1,curve_2,curve_3,curve_4);
        wall1.setFill(Color.WHITE);
        root.getChildren().add(wall1);
        
        Path wall2 = new Path();
        wall2.setStrokeWidth(2);
        wall2.setStrokeLineCap(StrokeLineCap.ROUND);
        wall2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        moveTo_1 = new MoveTo(X(33), Y(7));
        curve_1 = new QuadCurveTo(X(25), Y(10), X(-13), Y(23));
        curve_2 = new QuadCurveTo(X(-15), Y(-20), X(-15), Y(-20));
        curve_3 = new QuadCurveTo(X(36), Y(-28), X(36), Y(-28));
        curve_4 = new QuadCurveTo(X(33), Y(7), X(33), Y(7));
        wall2.getElements().addAll(moveTo_1, curve_1,curve_2,curve_3,curve_4);
        wall2.setFill(Color.WHITE);
        root.getChildren().add(wall2);
        
        //roof
        
        Path roof1 = new Path();
        roof1.setStrokeWidth(2);
        roof1.setStrokeLineCap(StrokeLineCap.ROUND);
        roof1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        moveTo_1 = new MoveTo(X(-72), Y(-23));
        curve_1 = new QuadCurveTo(X(-31), Y(-73), X(-31), Y(-73));
        curve_2 = new QuadCurveTo(X(-22), Y(-67), X(-22), Y(-67));
        curve_3 = new QuadCurveTo(X(-15), Y(-7), X(-15), Y(-7));
        curve_4 = new QuadCurveTo(X(-72), Y(-23), X(-72), Y(-23));
        roof1.getElements().addAll(moveTo_1, curve_1,curve_2,curve_3,curve_4);
        roof1.setFill(Color.PURPLE);
        root.getChildren().add(roof1);
        
        Path roof2 = new Path();
        roof2.setStrokeWidth(2);
        roof2.setStrokeLineCap(StrokeLineCap.ROUND);
        roof2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        moveTo_1 = new MoveTo(X(42), Y(-23));
        curve_1 = new QuadCurveTo(X(1), Y(-73), X(1), Y(-73));
        curve_2 = new QuadCurveTo(X(-22), Y(-67), X(-22), Y(-67));
        curve_3 = new QuadCurveTo(X(-15), Y(-7), X(-15), Y(-7));
        curve_4 = new QuadCurveTo(X(42), Y(-23), X(42), Y(-23));
        roof2.getElements().addAll(moveTo_1, curve_1,curve_2,curve_3,curve_4);
        roof2.setFill(Color.PURPLE);
        root.getChildren().add(roof2);
        
        Path roof3 = new Path();
        roof3.setStrokeWidth(2);
        roof3.setStrokeLineCap(StrokeLineCap.ROUND);
        roof3.setStrokeLineJoin(StrokeLineJoin.ROUND);
        moveTo_1 = new MoveTo(X(-31), Y(-73));
        curve_1 = new QuadCurveTo(X(-11), Y(-80), X(-11), Y(-80));
        curve_2 = new QuadCurveTo(X(1), Y(-73), X(1), Y(-73));
        curve_3 = new QuadCurveTo(X(-22), Y(-67), X(-22), Y(-67));
        roof3.getElements().addAll(moveTo_1, curve_1,curve_2,curve_3);
        roof3.setFill(Color.PURPLE);
        root.getChildren().add(roof3);
        
        //door
        
        Arc door = new Arc(X(5), Y(9), 7, 20, -15, 220);
        door.setStroke(Color.BROWN);
        door.setStrokeWidth(2);
        door.setFill(Color.BURLYWOOD);
        root.getChildren().add(door);

        //door knob
        
        Circle door_knob = new Circle(X(8),Y(3),2);
        door_knob.setStroke(Color.YELLOW);
        door_knob.setStrokeWidth(1);
        door_knob.setFill(Color.YELLOW);
        root.getChildren().add(door_knob);
        
        //windows
        
        Path window1 = new Path();
        window1.setStrokeWidth(2);
        window1.setStrokeLineCap(StrokeLineCap.ROUND);
        window1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        moveTo_1 = new MoveTo(X(-50), Y(-10));
        curve_1 = new QuadCurveTo(X(-43), Y(-8), X(-43), Y(-8));
        curve_2 = new QuadCurveTo(X(-43), Y(0), X(-43), Y(0));
        curve_3 = new QuadCurveTo(X(-50), Y(-2), X(-50), Y(-2));
        curve_4 = new QuadCurveTo(X(-50), Y(-10), X(-50), Y(-10));
        window1.getElements().addAll(moveTo_1,curve_1,curve_2,curve_3,curve_4);
        window1.setFill(Color.LIGHTSKYBLUE);
        root.getChildren().add(window1);
        
        Path window2 = new Path();
        window2.setStrokeWidth(2);
        window2.setStrokeLineCap(StrokeLineCap.ROUND);
        window2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        moveTo_1 = new MoveTo(X(-42), Y(-8));
        curve_1 = new QuadCurveTo(X(-36), Y(-6), X(-36), Y(-6));
        curve_2 = new QuadCurveTo(X(-36), Y(2), X(-36), Y(2));
        curve_3 = new QuadCurveTo(X(-42), Y(0), X(-42), Y(0));
        curve_4 = new QuadCurveTo(X(-42), Y(-8), X(-42), Y(-8));
        window2.getElements().addAll(moveTo_1,curve_1,curve_2,curve_3,curve_4);
        window2.setFill(Color.LIGHTSKYBLUE);
        root.getChildren().add(window2);
        
        //chimney
        
        Rectangle chimney1 = new Rectangle(X(3), Y(-72), 10, 30);
        chimney1.setStroke(Color.BLACK);
        chimney1.setStrokeWidth(1);
        chimney1.setFill(Color.YELLOW);
        root.getChildren().add(chimney1);
        
        Rectangle chimney2 = new Rectangle(X(3), Y(-72), 10, 10);
        chimney2.setStroke(Color.BLACK);
        chimney2.setStrokeWidth(1);
        chimney2.setFill(Color.GREEN);
        root.getChildren().add(chimney2);
        
       /* Path chimney1 = new Path();
        chimney1.setStrokeWidth(2);
        chimney1.setStrokeLineCap(StrokeLineCap.ROUND);
        chimney1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        moveTo_1 = new MoveTo(X(0), Y(-70));
        curve_1 = new QuadCurveTo(X(10), Y(-67), X(10), Y(-67));
        curve_2 = new QuadCurveTo(X(10), Y(-37), X(10), Y(-37));
        curve_3 = new QuadCurveTo(X(4), Y(-30), X(4), Y(-30));
        curve_4 = new QuadCurveTo(X(-2), Y(-37), X(-2), Y(-37));
        curve_5 = new QuadCurveTo(X(-10), Y(-50), X(-10), Y(-50));
        QuadCurveTo curve_6 = new QuadCurveTo(X(0), Y(-70), X(0), Y(-70));
        chimney1.getElements().addAll(moveTo_1,curve_1,curve_2,curve_3,curve_4,curve_5,curve_6);
        chimney1.setFill(Color.YELLOW);
        root.getChildren().add(chimney1);
        */
        
        //Animation

        int cycleCount = 2; //animation
        int time = 3000;

        ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(time), root);
        scaleTransition.setToX(2);
        scaleTransition.setToY(2);
        scaleTransition.setAutoReverse(true);

        RotateTransition rotateTransition = new RotateTransition(Duration.millis(time), root);
        rotateTransition.setByAngle(360f);
        rotateTransition.setCycleCount(cycleCount);
        rotateTransition.setAutoReverse(true);


        TranslateTransition translateTransition = new TranslateTransition(Duration.millis(time), root);
        translateTransition.setFromX(150);
        translateTransition.setToX(50);
        translateTransition.setCycleCount(cycleCount+1);
        translateTransition.setAutoReverse(true);


        ScaleTransition scaleTransition2 = new ScaleTransition(Duration.millis(time), root);
        scaleTransition2.setToX(0.1);
        scaleTransition2.setToY(0.1);
        scaleTransition2.setCycleCount(cycleCount);
        scaleTransition2.setAutoReverse(true);

        ParallelTransition parallelTransition = new ParallelTransition();
        parallelTransition.getChildren().addAll(

                rotateTransition,
                scaleTransition,
                scaleTransition2,
                translateTransition
        );

        parallelTransition.setCycleCount(Timeline.INDEFINITE);
        parallelTransition.play();


        primaryStage.setResizable(false);
        primaryStage.setTitle("House");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
