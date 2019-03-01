package areashape.app;

import java.util.LinkedList;
import java.util.List;
import areashape.shape.Shape;
import areashape.shape.circle.Circle;
import areashape.shape.square.Square;
import areashape.shape.triangle.Triangle;

public class MainApp {
    
    public static void main(String[] args) {
        
        //Создадим пару объектов Circle, Square и Triangle
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
        
        //Сделаем колекцию Shape и добавим в нее Circle, Square и Triangle
        List<Shape> shapes = new LinkedList<>();
        shapes.add(circle1);
        shapes.add(circle2);
        shapes.add(square1);
        shapes.add(square2);
        shapes.add(triangle1);
        shapes.add(triangle2);
        
        for(Shape shape: shapes){
            System.out.println("Name Shape: " + shape.getName() + "\nArea = " + shape.getArea() + "\n");
        }        
    }
}
