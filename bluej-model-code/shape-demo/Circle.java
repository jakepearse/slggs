
/**
 * Write a description of class Circle here.
 * 
 * @author J Pearse
 * @version 1.0
 */

public class Circle extends Shape
{
    // We only need one variable to define a Circle
    private int radius;

    /**
     * Constructor for objects of class Circle
     */
    public Circle(int radius)
    {
        // initialise instance variables
        this.radius = radius;
        super.description = "Circles have only one continuous edge";
    }

    @Override
    /**
     * Calculate the area of this Circle
     * @return area
     */
    public double getArea()
    {
        return Math.PI * Math.pow(radius,2);
    }
    
    @Override
    public double getPerimeter()
    {
        // To Do
        return 0.0;// replace this with your solution
    }
}
