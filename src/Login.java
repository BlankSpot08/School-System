import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Login extends Application {
    private Scene mainScene;
    private BorderPane mainBorderPane;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage window) {
        mainBorderPane = new BorderPane();

        mainScene = new Scene(mainBorderPane, 1000, 750);

        window.setScene(mainScene);

        window.setTitle("School System");

        window.show();
    }
}
