package Homework5.Problem3;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

public class emoji extends Application{
    boolean ishappy = true;
    public void start(Stage stage){
        BorderPane Pane = new BorderPane();
        Circle face = new Circle(150, Color.YELLOW);
        face.setCenterX(150);
        face.setCenterY(150);
        Scene scene = new Scene(Pane, 300, 300);
        stage.setResizable(false);
        stage.setTitle("Emoji");
        Circle eye1 = new Circle(30, Color.BLACK);
        eye1.setCenterX(100);
        eye1.setCenterY(120);
        Circle eye2 = new Circle(30, Color.BLACK);
        eye2.setCenterX(200);
        eye2.setCenterY(120);
        Arc mouth_smile = new Arc(150, 150, 80, 80, -45, -90);
        Arc mouth_sad = new Arc(150, 290, 80, 80, 45, 90);
        mouth_smile.setType(ArcType.OPEN);
        mouth_smile.setFill(null);
        mouth_smile.setStroke(Color.BLACK);
        mouth_smile.setStrokeWidth(3);
        mouth_sad.setType(ArcType.OPEN);
        mouth_sad.setFill(null);
        mouth_sad.setStroke(Color.BLACK);
        mouth_sad.setStrokeWidth(3);
        mouth_smile.setVisible(ishappy);
        mouth_sad.setVisible(!ishappy);
        Pane.setOnMouseClicked(e -> {
            ishappy = !ishappy;
            mouth_smile.setVisible(ishappy);
            mouth_sad.setVisible(!ishappy);
        });
        Pane.getChildren().addAll(face, eye1, eye2, mouth_smile, mouth_sad);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
