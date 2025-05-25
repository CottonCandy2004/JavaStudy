package EX3.Problem3;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ElevatorSimulation extends Application {
    
    private Elevator elevator;
    private Rectangle elevatorRect;
    private Label floorLabel;
    private boolean isAnimating = false;
    private Button upButton;
    private Button downButton;
    
    @Override
    public void start(Stage primaryStage) {
        elevator = new Elevator();
        
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(15));
        
        floorLabel = new Label("当前楼层: 1F");
        floorLabel.setFont(new Font(20));
        HBox topBox = new HBox(floorLabel);
        topBox.setAlignment(Pos.CENTER);
        topBox.setPadding(new Insets(10));
        root.setTop(topBox);
        
        upButton = new Button("上升");
        downButton = new Button("下降");
        upButton.setPrefWidth(80);
        downButton.setPrefWidth(80);
        
        VBox buttonBox = new VBox(15, upButton, downButton);
        buttonBox.setPadding(new Insets(10));
        buttonBox.setAlignment(Pos.CENTER);
        root.setLeft(buttonBox);
        
        Pane elevatorPane = new Pane();
        elevatorPane.setPrefSize(200, 300);
        
        Rectangle floor2 = new Rectangle(0, 0, 150, 100);
        floor2.setFill(Color.LIGHTGRAY);
        floor2.setStroke(Color.BLACK);
        
        Rectangle floor1 = new Rectangle(0, 150, 150, 100);
        floor1.setFill(Color.LIGHTGRAY);
        floor1.setStroke(Color.BLACK);
        
        Label label2F = new Label("2F");
        label2F.setLayoutX(10);
        label2F.setLayoutY(10);
        
        Label label1F = new Label("1F");
        label1F.setLayoutX(10);
        label1F.setLayoutY(160);
        
        elevatorRect = new Rectangle(50, 170, 50, 60);
        elevatorRect.setFill(Color.BLUE);
        elevatorRect.setStroke(Color.BLACK);
        
        downButton.setDisable(true);;
        elevatorPane.getChildren().addAll(floor1, floor2, label1F, label2F, elevatorRect);
        root.setCenter(elevatorPane);
        
        upButton.setOnAction(e -> {
            if (!isAnimating) {
                downButton.setDisable(true);
                upButton.setDisable(true);
                animateElevatorMovement(true);
            }
        });
        
        downButton.setOnAction(e -> {
            if (!isAnimating) {
                downButton.setDisable(true);
                upButton.setDisable(true);
                animateElevatorMovement(false);
            }
        });
        
        elevator.currentFloorProperty().addListener((obs, oldVal, newVal) -> {
            floorLabel.setText("当前楼层: " + newVal + "F");
        });
        
        Scene scene = new Scene(root, 400, 350);
        primaryStage.setTitle("电梯模拟");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
    private void animateElevatorMovement(boolean isMovingUp) {
        int targetFloor = isMovingUp ? 2 : 1;
        double targetY = (targetFloor == 1) ? 170 : 20;
        
        TranslateTransition transition = new TranslateTransition(Duration.seconds(1), elevatorRect);
        
        double currentY = elevatorRect.getY() + elevatorRect.getTranslateY();
        double deltaY = targetY - currentY;
        
        transition.setByY(deltaY);
        isAnimating = true;
        
        transition.setOnFinished(event -> {
            elevatorRect.setY(targetY);
            elevatorRect.setTranslateY(0);
            isAnimating = false;
            
            // 动画完成后更新电梯楼层
            if (isMovingUp) {
                elevator.moveUp();
                upButton.setDisable(true);
                downButton.setDisable(false);
            } else {
                elevator.moveDown();
                upButton.setDisable(false);
                downButton.setDisable(true);
            }
        });
        
        transition.play();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
