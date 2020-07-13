package vending.machine;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class StartPController {


    public void changeScreenToProducts(javafx.event.ActionEvent event) throws IOException {

        Parent view = FXMLLoader.load(getClass().getResource("productsP.fxml"));
        Scene scene = new Scene(view);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public void changeScreenToNotImplementedLang(javafx.event.ActionEvent event) throws IOException {

        Parent view = FXMLLoader.load(getClass().getResource("notImplementedLang.fxml"));
        Scene scene = new Scene(view);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
    public void changeScreenToHomeScreen(javafx.event.ActionEvent event) throws IOException {

        Parent view = FXMLLoader.load(getClass().getResource("startP.fxml"));
        Scene scene = new Scene(view);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

}
