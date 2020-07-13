package vending.machine;

public class Products {
    private String name;
    private int price;
    private String d1;
    private String d2;
    private String d3;
    private int stock;

    private static String nameS;
    private static int priceS;
    private static int stockS;


    public Products(){

    }

    public Products(String name, int price, String d1, String d2, String d3, int stock){
        this.name =name;
        this.price = price;
        this.d1=d1;
        this.d2=d2;
        this.d3=d3;
        this.stock=stock;
    }

    public void values(String name, int price, int stock){
        this.nameS=name;
        this.priceS=price;
        this.stockS=stock;
    }

    public String getNameS() {
        return nameS;
    }

    public int getPriceS() {
        return priceS;
    }

    public int getStockS() {
        return stockS;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getD1() {
        return d1;
    }

    public String getD2() {
        return d2;
    }

    public String getD3() {
        return d3;
    }

    public int getStock() {
        return stock;
    }

}
