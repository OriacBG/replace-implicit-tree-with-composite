package it.mondogrua.p2p.replace_implicit_tree_with_composite;

public class Product {

    private final String id;
    private ProductSize size;
    private Double price;
    private String name;
    private String color;
    private String currency;

    public Product(String id) {
        this.id = id;
    }

    public String getID() {
        return this.id;
    }

    public ProductSize getSize() {
        return size;
    }

    public void setSize(ProductSize size) {
        this.size = size;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}
