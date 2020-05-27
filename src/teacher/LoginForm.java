package teacher;

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

public class LoginForm {
    private Scene mainScene;
    private BorderPane mainBorderPane;
    private VBox mainVBox;
    private HBox titleHBox;
    private Label titleLabel;
    private TextField usernameTextField;
    private PasswordField passwordPasswordField;
    private HBox buttonsHBox;
    private Button loginButton;
    private Button backButton;

    public Scene createScene(Stage window) {
        mainBorderPane = new BorderPane();

        mainBorderPane.setCenter(createMainVBox(window));

        mainScene = new Scene(mainBorderPane,
                window.getWidth(),
                window.getHeight());
        mainScene.getStylesheets().add("css/teacher/TeacherLogin.css");

        return mainScene;
    }

    private HBox createButtons(Stage window) {
        buttonsHBox = new HBox();

        loginButton = new Button("Login");

        backButton = new Button("Back");

        backButton.setOnAction(e -> {
            MainMenuForm main = new MainMenuForm();

            window.setScene(main.createScene(window));
        });

        buttonsHBox.getChildren().addAll(backButton
                , loginButton);

        return buttonsHBox;
    }

    private HBox createTitle() {
        titleHBox = new HBox();
        titleHBox.setId("title");

        titleLabel = new Label("Teacher Login");

        titleHBox.getChildren().add(titleLabel);

        return titleHBox;
    }

    public VBox createMainVBox(Stage window) {
        mainVBox = new VBox();
        mainVBox.setId("main");

        usernameTextField = new TextField();
        usernameTextField.setPromptText("Username");

        passwordPasswordField = new PasswordField();
        passwordPasswordField.setPromptText("Password");

        mainVBox.getChildren().addAll(createTitle(),
                usernameTextField,
                passwordPasswordField,
                createButtons(window));

        return mainVBox;
    }
}
