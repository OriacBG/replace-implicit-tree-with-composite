package it.mondogrua.p2p.replace_implicit_tree_with_composite;

public class OrdersWriter {

    private Orders orders;

    public OrdersWriter(Orders orders) {
      this.orders = orders;
    }

    public String getContents() {
      StringBuffer xml = new StringBuffer();
      xml.append("<orders>");
      for (int i = 0; i < orders.getOrderCount(); i++) {
        Order order = orders.getOrder(i);
        xml.append("<order");
        xml.append(" id='");
        xml.append(order.getOrderId());
        xml.append("'>");
        for (int j=0; j < order.getProductCount(); j++) {
            Product product = order.getProduct(j);
            xml.append("<product");
            xml.append(" id='");
            xml.append(product.getID());
            xml.append("'");
            xml.append(" color='");
            xml.append(colorFor(product));
            xml.append("'");
            if (product.getSize() != ProductSize.NOT_APPLICABLE) {
              xml.append(" size='");
              xml.append(sizeFor(product));
              xml.append("'");
            }
            xml.append(">");
            xml.append("<price");
            xml.append(" currency='");
            xml.append(currencyFor(product));
            xml.append("'>");
            xml.append(product.getPrice());
            xml.append("</price>");
            xml.append(product.getName());
            xml.append("</product>");
          }
        xml.append("</order>");
      }
      xml.append("</orders>");
      return xml.toString();
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
