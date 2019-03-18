import it.mondogrua.p2p.replace_implicit_tree_with_composite.*;
import junit.framework.TestCase;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertThat;

public class OrdersWriterTest extends TestCase
{
    public void testOrdersWritersProducesValidXML() {
        Order order = new Order("1");
        Product product = new Product("9999");
        product.setSize(ProductSize.MEDIUM);
        product.setPrice(19.99);
        product.setCurrency("CAD");
        product.setColor("cyan");
        product.setName("Nullable T-Shirt");
        order.add(product);
        Orders orders = new Orders().add(order);

        OrdersWriter ordersWriter = new OrdersWriter(orders);
        assertThat(ordersWriter.getContents(), instanceOf(String.class));
        assertEquals("<orders><order id='1'><product id='9999' color='cyan' size='medium'><price currency='CAD'>19.99</price>Nullable T-Shirt</product></order></orders>", ordersWriter.getContents());
    }
}
