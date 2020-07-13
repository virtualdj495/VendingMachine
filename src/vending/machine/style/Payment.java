package vending.machine.style;

public class Payment {

    private float cash;
    private float price;

    private static float payment;


    public Payment(float price){
        this.cash= (float) 0.0;
        this.price= price;
        this.payment=(float)0.0;
    }
    public void addM(float i){
        payment+=i;
    }
    public float getPayment(){
        return payment;
    }

    public float getCash() {
        return cash;
    }

    public float getPrice() {
        return price;
    }

    public void cashinserted(){
        cash+=payment;
    }

}
