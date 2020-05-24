package student;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Login {
    private Scene mainScene;
    private BorderPane mainBorderPane;
    private HBox mainHBox;

    public Scene createScene(Stage window) {
        mainBorderPane = new BorderPane();

        mainBorderPane.setCenter(createMainHBox());

        mainScene = new Scene(mainBorderPane, window.getWidth(), window.getHeight());

        return mainScene;
    }

    private HBox createMainHBox() {
        mainHBox = new HBox();

        return mainHBox;
    }
}
