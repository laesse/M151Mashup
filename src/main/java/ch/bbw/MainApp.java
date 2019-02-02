package ch.bbw;

import ch.bbw.dao.DAOMeme;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MainApp{

    public static void main(String[] args) {
        new DAOMeme("cheese").getMeme();
    }

}
