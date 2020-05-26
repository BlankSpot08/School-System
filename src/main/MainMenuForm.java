package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import student.MainForm;

public class MainMenuForm extends Application {
    private Scene mainScene;
    private BorderPane mainBorderPane;
    private HBox hBox;
    private HBox titleHBox;
    private Label titleLabel;
    private Button teacherButton;
    private Button studentButton;
    private Button administratorButton;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage window) {
        window.setScene(createScene(window));

        window.setTitle("I.M. High University");

        window.show();
    }

    public Scene createScene(Stage window) {
        mainBorderPane = new BorderPane();

        mainBorderPane.setTop(createTitle());
        mainBorderPane.setCenter(createVBox(window));

        mainScene = new Scene(mainBorderPane);

        window.setWidth(1250);
        window.setHeight(900);

        window.setMinWidth(500);
        window.setMinHeight(375);

        mainScene.getStylesheets().add("css/main/MainLogin.css");

        return mainScene;
    }

    private HBox createTitle() {
        titleHBox = new HBox();
        titleHBox.setId("title");

        titleLabel = new Label("I.M. HIGH UNIVERSITY");

        titleHBox.getChildren().add(titleLabel);

        return titleHBox;
    }

    private HBox createVBox(Stage window) {
        hBox = new HBox();
        hBox.setId("main");

        administratorButton = new Button("Administrator");

        teacherButton = new Button("Teacher");

        studentButton = new Button("Student");

        studentButton.setOnAction(e -> {
            MainForm main = new MainForm();

            window.setScene(main.createScene(window));
        });

        hBox.getChildren().addAll(administratorButton, teacherButton, studentButton);

        return hBox;
    }
}


