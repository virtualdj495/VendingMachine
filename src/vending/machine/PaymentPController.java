package vending.machine;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import vending.machine.style.Payment;

import java.awt.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class PaymentPController {
    static String lastItem;
    Products prod = new Products();
    Payment paym= new Payment(prod.getPriceS());

    @FXML private Text value;

    public void add1Dollar(javafx.event.ActionEvent event) {
        paym.addM(1);
        value.setText(paym.getPayment()+"$");

    }
    public void add2Dollar(javafx.event.ActionEvent event) {
        paym.addM(2);
        value.setText(paym.getPayment()+"$");

    }
    public void add5Dollar(javafx.event.ActionEvent event) {
        paym.addM(5);
        value.setText(paym.getPayment()+"$");

    }
    public void add10Dollar(javafx.event.ActionEvent event) {
        paym.addM(10);
        value.setText(paym.getPayment()+"$");

    }
    public void add25Cents(javafx.event.ActionEvent event) {
        paym.addM((float) 0.25);
        value.setText(paym.getPayment()+"$");

    }
    public void add50Cents(javafx.event.ActionEvent event) {
        paym.addM((float) 0.5);
        value.setText(paym.getPayment()+"$");

    }


    @FXML private Text atention;



    public void submitBtn(javafx.event.ActionEvent event) throws IOException {

        if(paym.getCash()-paym.getPrice()==0) {

            atention.setText("");
            Parent view = FXMLLoader.load(getClass().getResource("startP.fxml"));
            Scene scene = new Scene(view);

            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(scene);
            window.show();
        }
        else
            atention.setText("Not Enough Money!");

    }

    @FXML private Text amount = new Text();
    @FXML private Text amountInserted = new Text();
    @FXML private Text amountRemaining = new Text();
    @FXML private Text change = new Text();

    public void changeScreenTocashpay(javafx.event.ActionEvent event) throws IOException {

        paym.cashinserted();

       amount.setText( paym.getPrice() + " $");

        if((paym.getPrice()-paym.getCash())>0)
            amountRemaining.setText((paym.getPrice()-paym.getCash())+" $");
        else
            amountRemaining.setText(0+" $");

        amountInserted.setText(paym.getPayment()+"$");

        if(paym.getCash()-paym.getPrice()>0)
            change.setText(paym.getCash()-paym.getPrice()+" $");
        else
            change.setText(0+" $");
        Parent view = FXMLLoader.load(getClass().getResource("cashPay.fxml"));
        Scene scene = new Scene(view);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public void changeScreenToNotImplementedPay(javafx.event.ActionEvent event) throws IOException {

        Parent view = FXMLLoader.load(getClass().getResource("notImplementedPay.fxml"));
        Scene scene = new Scene(view);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public void changeScreenToPaymentPage(javafx.event.ActionEvent event) throws IOException {

        Parent view = FXMLLoader.load(getClass().getResource("paymentP.fxml"));
        Scene scene = new Scene(view);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public void changeScreenToEmulator(javafx.event.ActionEvent event) throws IOException {


        Parent view = FXMLLoader.load(getClass().getResource("emulator.fxml"));
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

    public void changeScreenToPaysafe(javafx.event.ActionEvent event) throws IOException {

        Parent view = FXMLLoader.load(getClass().getResource("paysafePay.fxml"));
        Scene scene = new Scene(view);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
    public void changeScreenToPayConfirm(javafx.event.ActionEvent event) throws IOException, InterruptedException {
         {
            Parent view = FXMLLoader.load(getClass().getResource("paymentConfirmed.fxml"));
            Scene scene = new Scene(view);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(scene);
            window.show();

        }
    }
}
