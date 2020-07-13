package vending.machine;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;


public class ProductsPController {
    Products aviraPrime= new Products("Avira Prime",75,"-Complete Pack","-","-",45);
    Products antivirusPRO= new Products("Antivirus PRO",35,"-Antivirus","-","-",39);
    Products optimizerPRO= new Products("Optimizer PRO",10,"-","-Optimizer","-",17);
    Products phantomVPN= new Products("Phantom VPN",50,"-VPN","-","-",18);
    Products speedUp= new Products("Speed Up PRO",25,"-Speeder","-","-",13);
    Products passMan= new Products("Password Manager",20,"-Pass Manager","-","-",23);

    @FXML private Text name;
    @FXML private Text price;
    @FXML private Text desc;
    @FXML private Text stock;
    @FXML private ImageView photo;
    public Products sold;

    public void button1(ActionEvent event) {
        sold=aviraPrime;
        Image image = new Image("photo/avira_prime_125_125.png");
        photo.setImage(image);
        name.setText("Name: " + aviraPrime.getName());
        price.setText("Price: " + aviraPrime.getPrice() + "$");
        desc.setText("Description:\n" + aviraPrime.getD1() + "\n" + aviraPrime.getD2() + "\n" + aviraPrime.getD3());
        stock.setText("In stock: " + aviraPrime.getStock() + " items");

    }

    public void button2(ActionEvent event) {
        sold=optimizerPRO;
        Image image = new Image("photo/optimizer_pro.jpg");
        photo.setImage(image);
        name.setText("Name: " +optimizerPRO.getName());
        price.setText("Price: " + optimizerPRO.getPrice() + "$");
        desc.setText("Description:\n" + optimizerPRO.getD1() + "\n" + optimizerPRO.getD2() + "\n" + optimizerPRO.getD3());
        stock.setText("In stock: " + optimizerPRO.getStock() + " items");

    }

    public void button3(ActionEvent event) {
        sold=speedUp;
        Image image = new Image("photo/speed_up_85_150.jpg");
        photo.setImage(image);
        name.setText("Name: " + speedUp.getName());
        price.setText("Price: " + speedUp.getPrice() + "$");
        desc.setText("Description:\n" + speedUp.getD1() + "\n" + speedUp.getD2() + "\n" + speedUp.getD3());
        stock.setText("In stock: " + speedUp.getStock() + " items");

    }

    public void button4(ActionEvent event) {
        sold=passMan;
        Image image = new Image("photo/password_manager_83_150.jpg");
        photo.setImage(image);
        name.setText("Name: " + passMan.getName());
        price.setText("Price: " + passMan.getPrice() + "$");
        desc.setText("Description:\n" + passMan.getD1() + "\n" + passMan.getD2() + "\n" + passMan.getD3());
        stock.setText("In stock: " + passMan.getStock() + " items");

    }

    public void button5(ActionEvent event) {
        sold=antivirusPRO;
        Image image = new Image("photo/antivirus_pro_99_125.png");
        photo.setImage(image);
        name.setText("Name: " + antivirusPRO.getName());
        price.setText("Price: " + antivirusPRO.getPrice() + "$");
        desc.setText("Description:\n" + antivirusPRO.getD1() + "\n" + antivirusPRO.getD2() + "\n" + antivirusPRO.getD3());
        stock.setText("In stock: " + antivirusPRO.getStock() + " items");

    }

    public void button6(ActionEvent event) {
        sold=phantomVPN;
        Image image = new Image("photo/phantom_vpn_90_150.jpg");
        photo.setImage(image);
        name.setText("Name: " + phantomVPN.getName());
        price.setText("Price: " + phantomVPN.getPrice() + "$");
        desc.setText("Description:\n" + phantomVPN.getD1() + "\n" + phantomVPN.getD2() + "\n" + phantomVPN.getD3());
        stock.setText("In stock: " + phantomVPN.getStock() + " items");

    }

    public void backBtn(javafx.event.ActionEvent event) throws IOException {

        Parent view = FXMLLoader.load(getClass().getResource("startP.fxml"));
        Scene scene = new Scene(view);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public void nextBtn(javafx.event.ActionEvent event) throws IOException {

        Products prod= new Products();
        prod.values(sold.getName(),sold.getPrice(),sold.getStock());


        Parent view = FXMLLoader.load(getClass().getResource("paymentP.fxml"));
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

}
