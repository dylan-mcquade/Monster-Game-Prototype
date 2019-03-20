package System;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    //Stage is the window, primaryStage is the name of the window.
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("monsterSelect.fxml"));
        primaryStage.setTitle("Monster Battle");
        primaryStage.setScene(new Scene(root)); //May need to use (root, width, height)
        primaryStage.setMaximized(true); //Fullscreen
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
