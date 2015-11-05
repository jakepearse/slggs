
/**
 * Abstract class Shape
 * 
 * Abstract classes cannot be instantiated,
 * For a subclass to fill the requirements of being a shape
 * It must Override the abstract methods of Shape.
 * 
 * @author J Pearse
 * @version 1.0
 */
public abstract class Shape
{
    // all shapes should have a short description
    protected String description;
    
   // Our sub-class shapes must provide a getArea method
    abstract double getArea();
    
   // Our sub-class shapes must provide a getPerimeter method
    abstract double getPerimeter();
}
