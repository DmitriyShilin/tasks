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
        Circle circle1 = new Circle("Circle_R=2.00", 2.00);
        Circle circle2 = new Circle();
        circle2.setRadius(3.00);
        
        Square square1 = new Square("Square_S=2.00", 2.00);
        Square square2 = new Square();
        square2.setSide(3.00);
        
        Triangle triangle1 = new Triangle("Triangle_W=2.00_H=2.00", 2.00, 2.00);
        Triangle triangle2 = new Triangle();
        triangle2.setHeight(3.00);
        triangle2.setWidth(3.00);
        
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
            //System.out.println("Name Shape: " + shape.getName() + "\nArea = " + shape.getArea() + "\n");
            LOGGER.info("\nName Shape: " + shape.getName() + "\n Area = " + shape.getArea() + "\n");
        }        
    }
}
