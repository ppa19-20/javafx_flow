package ppa1920;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainController {

    public GridPane grid;

    protected Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public Stage getStage() {
        return stage;
    }

    public void loadMain(ActionEvent actionEvent) {

    }

    public void initialize() {
        try {
            FXMLLoader subLoader = new FXMLLoader(getClass().getResource("welcome.fxml"));
            Parent component = subLoader.load();
            WelcomeController welcomeController = subLoader.getController();
            welcomeController.setMainController(this);
            grid.add(component, 0, 1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
