package areashape.shape.triangle;

import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleTest {
    
    @Test
    public void testGetArea() {
        Triangle instance = new Triangle(1.0, 1.0);
        double expResult = 1.0;
        double result = instance.getArea();
        assertEquals(expResult, result, 0.1);        
    }
}
