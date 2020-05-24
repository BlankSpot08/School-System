package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Login extends Application {
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
        mainBorderPane = new BorderPane();

        mainBorderPane.setTop(createTitle());
        mainBorderPane.setCenter(createVBox(window));

        mainScene = new Scene(mainBorderPane, 1000, 750);
        mainScene.getStylesheets().add("css/main/MainLogin.css");

        window.setScene(mainScene);

        window.setTitle("I.M. High");

        window.show();
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
        hBox.setId("center");

        administratorButton = new Button("Administrator");

        teacherButton = new Button("Teacher");

        studentButton = new Button("Student");

        studentButton.setOnAction(e -> {
            student.Login login = new student.Login();

            window.setScene(login.createScene(window));
        });

        hBox.getChildren().addAll(administratorButton, teacherButton, studentButton);

        return hBox;
    }
}
