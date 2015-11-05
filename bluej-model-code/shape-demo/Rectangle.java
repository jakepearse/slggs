
/**
 * Rectangles are quadrilaterals with 2 pairs of identical sides
 * 
 * @author J Pearse 
 * @version 1.0
 */
public class Rectangle extends Shape
{
    // 2 measurements are needed to define a rectangle
    int height;
    int length;
    /**
     * Constructor for objects of class Rectangle
     */
    public Rectangle(int height, int length)
    {
       // initialise instance variables
       this.height = height;
       this.length = length;
    }
    
    /**
     * The perimeter of a rectangle is twice it's height plus twice its length
     * @return The rectangle's's perimeter
     */
    @Override
    public double getPerimeter()
    {
        return 2 * this.height + 2 * this.length;
    }

    // You must add a getArea method to match the one deifned in Shape
    
}
