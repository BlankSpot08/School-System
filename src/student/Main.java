package student;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import main.MainMenu;

public class Main {
    private Scene mainScene;
    private BorderPane mainBorderPane;
    private HBox mainHBox;
    private HBox titleBox;
    private Button loginButton;
    private Button registerButton;
    private Button backButton;
    private Label titleLabel;

    public Scene createScene(Stage window) {
        mainBorderPane = new BorderPane();

        mainBorderPane.setTop(createTitle());
        mainBorderPane.setCenter(createMainHBox(window));

        mainScene = new Scene(mainBorderPane, window.getWidth(), window.getHeight());
        mainScene.getStylesheets().add("css/student/StudentLogin.css");

        return mainScene;
    }

    private HBox createTitle() {
        titleBox = new HBox();
        titleBox.setId("title");

        titleLabel = new Label("STUDENT");

        titleBox.getChildren().add(titleLabel);

        return titleBox;
    }

    private HBox createMainHBox(Stage window) {
        mainHBox = new HBox();
        mainHBox.setId("main");

        loginButton = new Button("Login");

        registerButton = new Button("Register");

        backButton = new Button("Menu");

        mainHBox.getChildren().addAll(loginButton, registerButton, backButton);

        backButton.setOnAction( e -> {
           MainMenu mainMenu = new MainMenu();

           window.setScene(mainMenu.createScene(window));
        });

        return mainHBox;
    }
}
