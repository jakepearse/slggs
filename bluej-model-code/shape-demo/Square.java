
/**
 *  Squares could be seen as rectangles with equal height and length
 * 
 * @author J Pearse 
 * @version 1.0
 */
public class Square extends Rectangle
{
    // everything needed to define our square, is already provided by its supertype - Rectangle.
    
    /**
     * Constructor for objects of class Square
     */
    public Square(int size)
    {
        // call the constructor of the supertype
        super(size,size);
    }
    // All the methods of Rectangle are automatically available to Square
}
