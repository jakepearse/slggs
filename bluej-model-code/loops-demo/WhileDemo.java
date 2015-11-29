
/**
 * Write a description of class WhileDemo here.
 * 
 * @author (JPearse) 
 * @version 1
 */
import java.util.Scanner;
public class WhileDemo
{
    // instance variables - replace the example below with your own
    private boolean condition;

    /**
     * Constructor for objects of class WhileDemo
     */
    public WhileDemo()
    {
        condition = true;
        Scanner sc = new Scanner(System.in);
        while(condition){
            System.out.println("Had enough yet? (y/n)");
            if ( sc.nextLine().equals( "y" ) ) { // see what I did there?
                condition = !condition; // more trickery
            }    
        }
    }
}
