
/**
 * Write a description of class ArraySortingDemo here.
 * 
 * @author J.Pearse
 * @version 1
 */

import java.util.Arrays;

public class ArraySortingDemo
{
    // instance variables - replace the example below with your own
    private int[] myUnsortedArray;

    /**
     * Constructor for objects of class ArraySortingDemo
     */
    public ArraySortingDemo()
    {
        // initialise instance variables
        myUnsortedArray = new int[]{4,21,5,17,0,128,7,2,1,11};
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void sortIt()
    {
        // put your code here
        Arrays.sort(myUnsortedArray);
    }
}
