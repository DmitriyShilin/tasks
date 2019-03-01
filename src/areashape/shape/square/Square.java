package areashape.shape.square;

import areashape.shape.AbstractShape;

public class Square extends AbstractShape{
    
    private double side;
    
    public Square(){
        this(0.0);
    }
    
    public Square(double side){        
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2.00);
    }
    
    public double getSide(){
        return side;
    }
    
    public void setSide(double side){
        this.side = side;
    }  
}