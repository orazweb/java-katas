import org.junit.Assert;
import org.junit.Test;

public class BinaryToDecimalTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(true, true);
    }

    @Test
    public void testEmptyArgument() throws Exception {
        try {
            BinaryToDecimal.convert("");
            Assert.fail("No IllegalArgumentException throw for empty argument");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Illegal binary string", e.getMessage());
        }
    }

    @Test
    public void testNullArgument() throws Exception {
        try {
            BinaryToDecimal.convert(null);
            Assert.fail("No IllegalArgumentException throw for null argument");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Illegal binary string", e.getMessage());
        }
    }

    @Test
    public void testIllegalArgument() throws Exception {
        try {
            BinaryToDecimal.convert("3");
            Assert.fail("No IllegalArgumentException throw for illegal argument");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Illegal binary string", e.getMessage());
        }
    }

    @Test
    public void testOther() throws Exception {
        Assert.assertEquals(1, BinaryToDecimal.convert("1"));
        Assert.assertEquals(3, BinaryToDecimal.convert("11"));
        Assert.assertEquals(13, BinaryToDecimal.convert("1101"));
        Assert.assertEquals(167, BinaryToDecimal.convert("10100111"));
        Assert.assertEquals(255, BinaryToDecimal.convert("11111111"));
    }
}
