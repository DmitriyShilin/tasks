package areashape.shape.circle;

import areashape.shape.AbstractShape;

public class Circle extends AbstractShape{
    
    private String name;    
    private double radius;    
    
    public Circle(){
        this("Circle", 0.00);
    }
    
    public Circle(String name, double radius){
        this.name = name;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius, 2.00);
    }
    
    @Override
    public String getName(){
        return name;
    }
    
    @Override
    public void setName(String name){
        this.name = name;
    } 
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }    
}
