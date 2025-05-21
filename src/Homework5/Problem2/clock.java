package Homework5.Problem2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class clock extends Application {
    boolean ifsecond = true;
    boolean if24h = true;
    boolean ifdate = true;
    boolean ifweek = true;
    public void start(Stage stage)  {
        VBox vbox1 = new VBox();
        HBox hbox1 = new HBox();
        Label time = new Label(timer.getFormatTime(ifsecond, if24h));
        time.setStyle("-fx-font-size: 72px; -fx-font-weight: bold;");
        Label date = new Label("");
        date.setStyle("-fx-font-size: 36px; -fx-font-weight: bold;");
        ChoiceBox<String> choiceBox1 = new ChoiceBox<>();
        choiceBox1.getItems().addAll("12-hour", "24-hour");
        choiceBox1.setValue("24-hour");
        choiceBox1.setOnAction(e -> {
            if (choiceBox1.getValue().equals("12-hour")) {
                if24h = false;
            } else {
                if24h = true;
            }
        });
        CheckBox checkBoxSecond = new CheckBox("Show Second");
        checkBoxSecond.setSelected(ifsecond);
        checkBoxSecond.setOnAction(e -> {
            ifsecond = checkBoxSecond.isSelected();
        });
        CheckBox checkBoxWeek = new CheckBox("Show Week");
        checkBoxWeek.setSelected(ifweek);
        checkBoxWeek.setDisable(!ifweek);
        checkBoxWeek.setOnAction(e -> {
            ifweek = checkBoxWeek.isSelected();
        });
        CheckBox checkBoxDate = new CheckBox("Show Date");
        checkBoxDate.setSelected(ifdate);
        checkBoxDate.setOnAction(e -> {
            ifdate = checkBoxDate.isSelected();
            checkBoxWeek.setDisable(!ifdate);
        });
        hbox1.getChildren().addAll(choiceBox1, checkBoxSecond, checkBoxDate, checkBoxWeek);
        vbox1.getChildren().addAll(date, time, hbox1);
        vbox1.setAlignment(javafx.geometry.Pos.CENTER);
        hbox1.setAlignment(javafx.geometry.Pos.CENTER);
        Scene scene = new Scene(new StackPane(vbox1), 640, 300);
        stage.setScene(scene);
        stage.setTitle("Clock");
        stage.centerOnScreen();
        stage.show();
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(0.2), e -> {
            date.setText(ifdate ? timer.getFormatDate(ifweek) : "");
            time.setText(timer.getFormatTime(ifsecond, if24h));
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }
    public static void main(String[] args) {
        launch();
    }
}
