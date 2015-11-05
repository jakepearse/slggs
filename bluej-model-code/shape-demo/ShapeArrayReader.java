
/**
 * Write a description of class ShapeArrayReader here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShapeArrayReader
{
    // we can use the type Shape becuse all of our shapes are extended from that.
    private Shape[] shapeArray;

    /**
     * Constructor for objects of class ShapeArrayReader
     */
    public ShapeArrayReader(Shape shapeA, Shape shapeB, Shape shapeC)
    {
        // initialise instance variables
        // There are quicker ways to do this but hopefully this is the most clear
        
        //initalize our array
        this.shapeArray = new Shape[3];
        //assign our first shape at index 0
        this.shapeArray[0] = shapeA;
        //the second shape at index 1
        this.shapeArray[1] = shapeB;
        // and finally the third at index 2
        this.shapeArray[2] = shapeC;
    }

    /**
     * Print out the contents of the shape array
     */
    public void ReadShapes()
    {
        for (Shape s: shapeArray) {
            System.out.println(s.getClass() + " Area= "+ s.getArea() + " Perimeter= " + s.getPerimeter());
        }
    }
}
