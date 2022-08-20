package model;

public class Medicine {

    private int id;
    private String name;
    private String manufacturer;
    private int qtd;
    private double price;


    public Medicine(int id, String name, String manufacturer, int qtd, double price) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.qtd = qtd;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
