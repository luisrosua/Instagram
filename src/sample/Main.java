package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.login.LoginView;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        LoginView root = new LoginView();
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 600, 675));
        primaryStage.show();
    }


    public static void main(String[] args) {

        launch(args);
    }
}
