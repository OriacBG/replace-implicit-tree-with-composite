package it.mondogrua.p2p.replace_implicit_tree_with_composite;

import java.util.ArrayList;
import java.util.List;

public class Orders {

    private List<Order> orders = new ArrayList<Order>();

    public int getOrderCount() {
        return orders.size();
    }

    public Order getOrder(int index) {
        return orders.get(index);
    }

}
