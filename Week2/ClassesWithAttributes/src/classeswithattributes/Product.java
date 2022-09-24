/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeswithattributes;

/**
 *
 * @author ASUS
 */
public class Product {

    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String color;
    private String code;

    public Product(int id, String name, String description, double price,
            int stockAmount, String renk) {
        System.out.println("Yapıcı blok çalıştı");
        this.id = id;
        this.color = renk;
        this.name = name;
        this.price = price;
        this.description = description;
        this.stockAmount = stockAmount;
    }

    public Product() {

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getKod() {
        return this.name.substring(0, 1) + id;
    }
}
