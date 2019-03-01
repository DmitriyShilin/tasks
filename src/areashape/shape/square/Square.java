package areashape.shape.square;

import areashape.shape.AbstractShape;

public class Square extends AbstractShape{
    
    private String name;
    private double side;
    
    public Square(){
        this("Square", 0.00);
    }
    
    public Square(String name, double side){
        this.name = name;
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2.00);
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    } 
    
    public double getSide(){
        return side;
    }
    
    public void setSide(double side){
        this.side = side;
    }       
    
    @Override
    public String toString(){
        return "\nName Shape: " + name + "\n Area = " + getArea() + "\n";
    }
}