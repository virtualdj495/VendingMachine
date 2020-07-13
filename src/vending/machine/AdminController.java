package vending.machine;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminController {

    @FXML
    private TextField userName;

    @FXML
    private PasswordField userPassword;

    @FXML
    private PasswordField confPass;

    @FXML
    private String parola;

    @FXML
    private TextField newUser;

    @FXML
    private TextField newPass;

    @FXML
    private TextField te;
    @FXML
    private TextField tps;
    @FXML
    private TextField tpr;

    public void changeScreenToAdminPage(javafx.event.ActionEvent event) throws IOException {

        Parent view = FXMLLoader.load(getClass().getResource("adminPage.fxml"));
        Scene scene = new Scene(view);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }


    public void changeScreenToConfirmationPage(javafx.event.ActionEvent event) throws IOException {
        Parent view = FXMLLoader.load(getClass().getResource("adminAcc.fxml"));
        Scene scene = new Scene(view);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public void changeScreenToAdminLogin(javafx.event.ActionEvent event) throws IOException {

        Parent view = FXMLLoader.load(getClass().getResource("adminLog.fxml"));
        Scene scene = new Scene(view);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
    public void changeScreenToCreateNewAccount(javafx.event.ActionEvent event) throws IOException {
            Parent view = FXMLLoader.load(getClass().getResource("adminNew.fxml"));
            Scene scene = new Scene(view);

            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(scene);
            window.show();
    }


    public void changeScreenToProducts(javafx.event.ActionEvent event) throws IOException {

        Parent view = FXMLLoader.load(getClass().getResource("productsP.fxml"));
        Scene scene = new Scene(view);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public void changeScreenToPage2(javafx.event.ActionEvent event) throws IOException {

        ReadFile rf = new ReadFile();

        if(rf.read(userName, userPassword) == true) {

            Parent view = FXMLLoader.load(getClass().getResource("adminPage.fxml"));
            Scene scene = new Scene(view);

            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(scene);
            window.show();
        }


    }

    public void displayAB(javafx.event.ActionEvent event) throws IOException {
        Stage newWindow = new Stage();
        newWindow.initModality(Modality.APPLICATION_MODAL);
        newWindow.setTitle("Pop-up confirm");
        newWindow.setMinWidth(250);

        Label label = new Label();
        label.setText("New account created!");
        Button closeButton = new Button("Close the window");
        closeButton.setOnAction(e->newWindow.close());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, closeButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout, 200, 300);
        newWindow.setScene(scene);
        newWindow.showAndWait();

        ReadFile rf = new ReadFile();
        rf.addUser(newUser.getText(), newPass.getText());


        Parent view = FXMLLoader.load(getClass().getResource("adminPage.fxml"));
        scene = new Scene(view);


        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
    public void dataDownloadedPopup(javafx.event.ActionEvent event) throws IOException {
        Stage newWindow = new Stage();
        newWindow.initModality(Modality.APPLICATION_MODAL);
        newWindow.setTitle("Pop-up confirm");
        newWindow.setMinWidth(250);

        Label label = new Label();
        label.setText("Data downloaded!");
        Button closeButton = new Button("Close the window");
        closeButton.setOnAction(e -> newWindow.close());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, closeButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout, 200, 300);
        newWindow.setScene(scene);
        newWindow.showAndWait();

        ReadFile rdata = new ReadFile();
        rdata.addData();
    }
    public void changeScreenToSetStock(javafx.event.ActionEvent event) throws IOException {

        Parent view = FXMLLoader.load(getClass().getResource("stockset.fxml"));
        Scene scene = new Scene(view);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
}
