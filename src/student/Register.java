package student;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Register {
    private Scene mainScene;
    private BorderPane mainBorderPane;

    public Scene createScene(Stage window) {
        mainBorderPane = new BorderPane();

        mainScene = new Scene(mainBorderPane, window.getWidth(), window.getHeight());

        return mainScene;
    }
}
