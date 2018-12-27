package regex.test.tute.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Appinitializer extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent parent = FXMLLoader.load(this.getClass().getResource("/regex/test/tute/view/TeleView.fxml"));

        Scene scene = new Scene(parent);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Validation with RegEx");
        primaryStage.show();
        primaryStage.centerOnScreen();
    }
}
