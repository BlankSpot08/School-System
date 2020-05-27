package administrator;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import main.MainMenuForm;
import student.MainForm;

public class LoginForm {
    private Scene mainScene;
    private BorderPane mainBorderPane;
    private VBox mainVBox;
    private VBox titleVBox;
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

        mainScene = new Scene(createMainVBox(window), window.getWidth(), window.getHeight());
        mainScene.getStylesheets().add("css/administrator/login/AdministratorLogin.css");

        return mainScene;
    }

    private HBox createButtonsHBox(Stage window) {
        buttonsHBox = new HBox();

        backButton = new Button("Back");

        backButton.setOnAction(e -> {
            MainMenuForm main = new MainMenuForm();

            window.setScene(main.createScene(window));
        });

        loginButton = new Button("Login");

        buttonsHBox.getChildren().addAll(backButton, loginButton);

        return buttonsHBox;
    }

    private VBox createTitle() {
        titleVBox = new VBox();
        titleVBox.setId("title");

        loginLabel = new Label("Administrator");

        titleVBox.getChildren().add(loginLabel);

        return titleVBox;
    }

    private VBox createMainVBox(Stage window) {
        mainVBox = new VBox();
        mainVBox.setId("main");


        usernameTextField = new TextField();
        usernameTextField.setPromptText("Username");

        passwordPasswordField = new PasswordField();
        passwordPasswordField.setPromptText("Password");

        mainVBox.getChildren().addAll(createTitle(),
                usernameTextField,
                passwordPasswordField,
                createButtonsHBox(window));

        return mainVBox;
    }
}
