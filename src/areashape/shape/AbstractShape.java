package areashape.shape;

public abstract class AbstractShape implements Shape{
    
    private String name;
    
    public AbstractShape(String name){
        this.name = name;
    }
    
    @Override
    public abstract double getArea();
    
    @Override
    public String getName(){
        return name;
    }
    
    @Override
    public void setName(String name){
        this.name = name;
    }    
}
