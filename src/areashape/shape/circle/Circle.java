package areashape.shape.circle;

import areashape.shape.AbstractShape;

public class Circle extends AbstractShape{
    
    private double radius;    
    
    public Circle(){
        this(0.0);
    }
    
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius, 2.00);
    }
        
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    } 
}
