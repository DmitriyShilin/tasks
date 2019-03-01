package areashape.shape.square;

import org.junit.Test;
import static org.junit.Assert.*;

public class SquareTest {
        
    @Test
    public void testGetArea() {
        Square instance = new Square(1.0);
        double expResult = 1.0;
        double result = instance.getArea();
        assertEquals(expResult, result, 0.1);        
    }
}
