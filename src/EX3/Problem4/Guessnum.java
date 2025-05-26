package EX3.Problem4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import java.util.logging.Logger;
import java.util.random.RandomGenerator;

public class Guessnum extends Application{
    int result = 0;
    int ceil = 100;
    int floor = 0;
    public void start(Stage Stage) {
        Logger logger = Logger.getLogger("Guessnum");
        generator();
        VBox vbox = new VBox();
        StackPane stackPane = new StackPane(vbox);
        Scene scene = new Scene(stackPane, 800, 400);
        Label title = new Label("Guess a number");
        Label tips = new Label("The number is between " + floor + " and " + ceil);
        TextField input = new TextField();
        input.setPromptText("Enter a number");
        input.setMaxWidth(200);
        Button button = new Button("Guess");
        button.setDisable(false);
        button.setOnAction(e -> {
            String text = input.getText();
            if (text.isEmpty()) {
                title.setText("Invalid input");
                return;
            }
            int guess;
            try {
                guess = Integer.parseInt(text);
            } catch (NumberFormatException ex) {
                title.setText("Invalid input");
                logger.warning("Invalid input: " + text);
                vbox.setStyle("-fx-background-color: yellow");
                title.setStyle("-fx-text-fill: black; -fx-font-size: 30px");
                tips.setStyle("-fx-text-fill: black; -fx-font-size: 30px");
                return;
            }
            if (guess < floor || guess > ceil) {
                title.setText("Invalid input");
                logger.warning("Invalid input: " + text);
                vbox.setStyle("-fx-background-color: yellow");
                title.setStyle("-fx-text-fill: black; -fx-font-size: 30px");
                tips.setStyle("-fx-text-fill: black; -fx-font-size: 30px");
                return;
            }
            int result = check(guess);
            if (result == 0) {
                logger.info("Correct!");
                button.setDisable(true);
                input.setDisable(true);
                vbox.setStyle("-fx-background-color: green");
                title.setStyle("-fx-text-fill: white; -fx-font-size: 30px");
                tips.setStyle("-fx-text-fill: white; -fx-font-size: 30px");
                title.setText("Right, good!");
                return;
            } else if (result == 1) {
                title.setText("Too Large");
                vbox.setStyle("-fx-background-color: red");
                title.setStyle("-fx-text-fill: white; -fx-font-size: 30px");
                tips.setStyle("-fx-text-fill: white; -fx-font-size: 30px");
                tips.setText("The number is between " + floor + " and " + (guess - 1));
            } else {
                title.setText("Too Small");
                vbox.setStyle("-fx-background-color: blue");
                title.setStyle("-fx-text-fill: white; -fx-font-size: 30px");
                tips.setStyle("-fx-text-fill: white; -fx-font-size: 30px");
                tips.setText("The number is between " + (guess + 1) + " and " + ceil);
            }
        });
        Button reset = new Button("Reset");
        reset.setOnAction(e -> {
            logger.info("Reseting!");
            vbox.setStyle("-fx-background-color: white");
            title.setStyle("-fx-text-fill: black; -fx-font-size: 30px");
            tips.setStyle("-fx-text-fill: black; -fx-font-size: 30px");
            input.setDisable(false);
            button.setDisable(false);
            reset();
            tips.setText("The number is between " + 0 + " and " + 100);
            title.setText("Guess a number");
            input.clear();
        });
        title.setStyle("-fx-font-size: 30px");
        tips.setStyle("-fx-font-size: 30px");
        button.setStyle("-fx-font-size: 30px");
        reset.setStyle("-fx-font-size: 30px");
        input.setStyle("-fx-font-size: 30px");
        vbox.setAlignment(javafx.geometry.Pos.CENTER);
        vbox.getChildren().addAll(title, input, button, reset, tips);
        Stage.setScene(scene);
        Stage.show();
    }
    
    public static void main(String[] args) {
        Logger.getLogger("javafx").setLevel(java.util.logging.Level.WARNING);
        launch();
    }

    void generator(){
        RandomGenerator random = RandomGenerator.getDefault();
        result = random.nextInt(0, 100);
        Logger logger = Logger.getLogger("Guessnum");
        logger.info("The number is " + result);
    }

    void reset() {
        result = 0;
        ceil = 100;
        floor = 0;
        generator();
    }
    
    int check(int guess) {
        Logger logger = Logger.getLogger("Guessnum");
        if (guess > result) {
            ceil = guess - 1;
            logger.info("Guess "+ guess + " is too large");
            return 1;
        } else if (guess < result) {
            floor = guess + 1;
            logger.info("Guess "+ guess + " is too small");
            return -1;
        } else {
            logger.info("Guess "+ guess + " is correct");
            return 0;
        }
    }
}
