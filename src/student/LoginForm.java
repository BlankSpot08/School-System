package student;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginForm {
    private Scene mainScene;
    private BorderPane mainBorderPane;
    private VBox mainVBox;
    private Label loginLabel;
    private TextField usernameTextField;
    private PasswordField passwordPasswordField;
    private Button loginButton;
    private Button backButton;
    private HBox buttonsHBox;

    public Scene createScene(Stage window) {
        mainBorderPane = new BorderPane();

        mainBorderPane.setCenter(createMainVBox(window));
        mainBorderPane.setStyle("-fx-background-color: red;");

//        mainVBox = new VBox();
//        mainVBox.setId("main");
//
//        loginLabel = new Label("Student Login");
//
//        usernameTextField = new TextField();
//        usernameTextField.setPromptText("Username");
//
//        passwordPasswordField = new PasswordField();
//        passwordPasswordField.setPromptText("Password");
//
//        mainVBox.getChildren().addAll(loginLabel, usernameTextField, passwordPasswordField, createButtonsHBox(window));

        mainScene = new Scene(createMainVBox(window), window.getWidth(), window.getHeight());
        mainScene.getStylesheets().add("css/student/login/StudentLogin.css");

        return mainScene;
    }

    private HBox createButtonsHBox(Stage window) {
        buttonsHBox = new HBox();

        backButton = new Button("Back");

        backButton.setOnAction(e -> {
            MainForm main = new MainForm();

            window.setScene(main.createScene(window));
        });

        loginButton = new Button("Login");

        buttonsHBox.getChildren().addAll(backButton, loginButton);

        return buttonsHBox;
    }

    private VBox createMainVBox(Stage window) {
        mainVBox = new VBox();
        mainVBox.setId("main");

        loginLabel = new Label("Student Login");

        usernameTextField = new TextField();
        usernameTextField.setPromptText("Username");

        passwordPasswordField = new PasswordField();
        passwordPasswordField.setPromptText("Password");

        mainVBox.getChildren().addAll(loginLabel, usernameTextField, passwordPasswordField, createButtonsHBox(window));

        return mainVBox;
    }
}
