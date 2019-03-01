package areashape.shape.circle;

import org.junit.Test;
import static org.junit.Assert.*;

public class CircleTest {
    
    @Test
    public void testGetArea() {
        Circle instance = new Circle(1.0);
        double expResult = Math.PI;
        double result = instance.getArea();
        assertEquals(expResult, result, 0.1);        
    }
}
