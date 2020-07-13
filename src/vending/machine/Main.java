package vending.machine;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Main extends Application {



    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("startP.fxml"));

        primaryStage.setTitle("Vending Machine");

        Scene mainScene = new Scene(root);
        mainScene.setFill(Color.TRANSPARENT);
        primaryStage.setScene(mainScene);
        primaryStage.setOpacity(0.7f);
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
