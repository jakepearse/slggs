
/**
 * Represent a geometric disc.
 * 
 * @author J Pearse
 * @version 1.0
 */

public class Circle
{
    // We only need one variable to define a Circle
    private int radius;
    private String description;

    /**
     * Constructor for objects of class Circle
     * @param radius The radius of the Circle
     */
    public Circle(int radius)
    {
        // initialise instance variables
        this.radius = radius;
        this.description = "Circles have only one continuous edge";
    }


    /**
     * Method getArea
     * Compute the area of this Circle
     * @return The area of the circle
     */
    public double getArea()
    {
        return Math.PI * Math.pow(radius,2);
    }

    /**
     * Method getPerimeter
     * Compute the perimeter of this Circle
     * @return The perimeter of this Circle
     */
    public double getPerimeter()
    {
        // To Do - replace this with your own solution
        return 0.0;
    }
}
