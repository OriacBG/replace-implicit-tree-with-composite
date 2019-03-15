package it.mondogrua.p2p.replace_implicit_tree_with_composite;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private final String id;
    private List<Product> products = new ArrayList<Product>();

    public Order(String id) {
        this.id = id;
    }


    public String getOrderId() {
        return id;
    }


    public int getProductCount() {
        return products .size();
    }


    public Product getProduct(int index) {
        return products.get(index);
    }

    public Order add(Product product)
    {
        this.products.add(product);
        return this;
    }

}
