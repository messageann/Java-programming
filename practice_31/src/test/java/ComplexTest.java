import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComplexTest {

    @org. junit.Test
    public void sum()   {
        Complex z1 = new Complex(3, 7);
        Complex z2 = new Complex(-1, 2);
        z1.sumWith(z2);
        int actual = z1.getIm();
        int expected = 7;
        assertEquals(expected,actual);
    }
}