import it.mondogrua.p2p.replace_implicit_tree_with_composite.Order;
import it.mondogrua.p2p.replace_implicit_tree_with_composite.Orders;
import it.mondogrua.p2p.replace_implicit_tree_with_composite.OrdersWriter;
import junit.framework.TestCase;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertThat;

public class OrdersWriterTest extends TestCase
{
    public void testFail() {
        Order order = new Order("1");
        Orders orders = new Orders().add(order);

        OrdersWriter ordersWriter = new OrdersWriter(orders);
        assertThat(ordersWriter.getContents(), instanceOf(String.class));
        assertEquals(ordersWriter.getContents(), "<orders><order id='1'></order></orders>");
    }
}
