package it.mondogrua.p2p.replace_implicit_tree_with_composite;

public class OrdersWriter {

    private Orders orders;

    public OrdersWriter(Orders orders) {
        this.orders = orders;
    }

    public String getContents() {
        StringBuffer xml = new StringBuffer();
        writeOrderTo(xml);
        return xml.toString();
    }

    private void writeOrderTo(StringBuffer xml) {
        xml.append("<orders>");
        for (int i = 0; i < orders.getOrderCount(); i++) {
            Order order = orders.getOrder(i);
            TagNode orderNode = new TagNode("order");
            orderNode.addAttribute("id", order.getOrderId());
            writeProductsTo(orderNode, order);
            xml.append(orderNode.toString());
        }
        xml.append("</orders>");
    }

    private void writeProductsTo(TagNode orderNode, Order order) {
        for (int j = 0; j < order.getProductCount(); j++) {
            Product product = order.getProduct(j);
            TagNode productNode = new TagNode("product");
            productNode.addAttribute("id", product.getID());
            productNode.addAttribute("color", colorFor(product));
            if (product.getSize() != ProductSize.NOT_APPLICABLE) {
                productNode.addAttribute("size", sizeFor(product));
            }
            writePriceTo(productNode, product);
            productNode.addValue(product.getName());
            orderNode.add(productNode);
        }
    }

    private void writePriceTo(TagNode productNode, Product product) {
        TagNode priceNode = new TagNode("price");
        priceNode.addAttribute("currency", currencyFor(product));
        priceNode.addValue(priceFor(product));
        productNode.add(priceNode);
    }

    private String priceFor(Product product) {
        return product.getPrice().toString();
    }


    private String sizeFor(Product product) {
        return product.getSize().toString();
    }

    private String currencyFor(Product product) {
        return product.getCurrency();
    }

    private String colorFor(Product product) {
        return product.getColor();
    }

}
