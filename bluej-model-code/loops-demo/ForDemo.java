
/**
 * Write a description of class ForDemo here.
 * 
 * @author JPearse 
 * @version 1
 */
import java.util.Scanner;
public class ForDemo
{
    // instance variables - replace the example below with your own
    private String[] myStringArray;

    /**
     * Constructor for objects of class ForDemo
     */
    public ForDemo()
    {
        // initialise instance variables
        myStringArray = new String[5];
        Scanner sc = new Scanner(System.in);
        
        //fill the array
        for (int i = 0; i < myStringArray.length; i = i + 1){
            System.out.println("Enter a name:");
            myStringArray[i] = sc.nextLine();
        }
        
        //print the array contents
        for ( int i = 0; i < myStringArray.length; i++) { // i++ is short hand for i += 1 which is shorthand for i = i  1
            System.out.println(myStringArray[i]);
        }
    }
}
