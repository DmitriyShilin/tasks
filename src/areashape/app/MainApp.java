package areashape.app;

import java.util.LinkedList;
import java.util.List;
import areashape.shape.Shape;
import areashape.shape.circle.Circle;
import areashape.shape.square.Square;
import areashape.shape.triangle.Triangle;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MainApp {
    
    private static Logger LOGGER = null;
    private static FileHandler handler = null;
    
    public static void main(String[] args) {
        
        //Create Circle, Square и Triangle
        Circle circle1 = new Circle(2.0);
        Circle circle2 = new Circle();
        circle2.setRadius(3.0);
        
        Square square1 = new Square(2.0);
        Square square2 = new Square();
        square2.setSide(3.0);
        
        Triangle triangle1 = new Triangle(2.0, 2.0);
        Triangle triangle2 = new Triangle();
        triangle2.setHeight(3.0);
        triangle2.setWidth(3.0);
        
        //Create collecxtion Shape and added Circle, Square и Triangle
        List<Shape> shapes = new LinkedList<>();
        shapes.add(circle1);
        shapes.add(circle2);
        shapes.add(square1);
        shapes.add(square2);
        shapes.add(triangle1);
        shapes.add(triangle2);
        
        //tuning LOGGER        
        try {
            handler = new FileHandler("C:/log/AreaShape.log", false);            
        } catch (IOException | SecurityException ex) {
            Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, ex.toString(), ex);
        } 
        handler.setFormatter(new SimpleFormatter());
        LOGGER = Logger.getLogger(MainApp.class.getName());
        LOGGER.addHandler(handler);
        LOGGER.setLevel(Level.INFO);
        LOGGER.setUseParentHandlers(false);
        
        //print name and area into AreaShape.log        
        for(Shape shape: shapes){
            LOGGER.info("Name Shape: " + shape.getClass().getSimpleName() + " Area = " + shape.getArea()); 
            
        }        
    }
}
