package areashape.shape.triangle;

import areashape.shape.AbstractShape;

public class Triangle extends AbstractShape{
    
    private double width;
    private double height;
    
    public Triangle(){
        this("Triangle", 0.00, 0.00);
    }
    
    public Triangle(String name, double width, double height){
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width*height;
    }
    
    public double getWidth(){
        return width;
    }
    
    public void setWidth(double width){
        this.width = width;
    }   
    
    public double getHeight(){
        return height;
    }
    
    public void setHeight(double height){
        this.height = height;
    }  
}