import it.mondogrua.p2p.replace_implicit_tree_with_composite.*;
import junit.framework.TestCase;

import static org.junit.Assert.assertThat;


public class TagNodeTest extends TestCase {
    private static final String SAMPLE_PRICE = "8.95";

    public void testSimpleTagWithOneAttributeAndValue() {
        TagNode priceTag = new TagNode("price");
        priceTag.addAttribute("currency", "USD");
        priceTag.addValue(SAMPLE_PRICE);
        String expected =
                "<price currency=" +
                        "'" +
                        "USD" +
                        "'>" +
                        SAMPLE_PRICE +
                        "</price>";
        assertEquals("price XML", expected, priceTag.toString());
    }

}
