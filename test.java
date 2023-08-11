package com.rotate.transition;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;
public class RotateTransitionAnimation extends Application {
@Override
public void start(Stage outStage) throws Exception {
Polygon traingle = new Polygon();// Creating triangle
Double[] doubleValues=new Double[] { 5.0, 5.0, 20.0, 10.0, 10.0, 20.0 };
traingle.getPoints().addAll(doubleValues);
traingle.setFill(Color.LIMEGREEN);
traingle.setStroke(Color.HOTPINK);
traingle.setStrokeWidth(5);
RotateTransition rotateTransition = new RotateTransition();// Creating object for Rotate Transition class
rotateTransition.setAxis(Rotate.Z_AXIS);// Set Axis rotation in Z axis
rotateTransition.setByAngle(360);// Set angle rotation 360 degrees
rotateTransition.setCycleCount(500);// Set cycle count rotation 500
rotateTransition.setDuration(Duration.millis(1000));// Set time duration for change the object
rotateTransition.setAutoReverse(true);//auto reverse activation
rotateTransition.setNode(traingle);//applying rotate transition on triangle
rotateTransition.play();// applying rotation by play method
Group root = new Group(); //creating group for adding elements
root.getChildren().add(traingle); //adding triangle to group
Scene scene = new Scene(root, 700, 500, Color.BLACK);//creating scene
outStage.setScene(scene);//adding scene to stage for display window
outStage.setTitle("Triangle Rotate Transition");
outStage.show();
}
public static void main(String[] args) {
launch(args);//launch method calls start() method internally
}
}
