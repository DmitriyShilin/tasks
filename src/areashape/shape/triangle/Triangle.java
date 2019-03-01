package areashape.shape.triangle;

import areashape.shape.AbstractShape;

public class Triangle extends AbstractShape{    
    
    private double width;
    private double height;
    
    public Triangle(){
        this(0.0, 0.0);
    }
    
    public Triangle(double width, double height){        
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