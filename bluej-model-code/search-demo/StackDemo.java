
/**
 * Demo of the java.util.Stack Collection
 * @author J Pearse 
 * @version 1
 */

import java.util.Stack;
public class StackDemo
{
    // instance variables
    private Stack<Integer> st;

    /**
     * Constructor for objects of class StackDemo
     */
    public StackDemo()
    {
        // initialise instance variables
        st = new Stack<Integer>();
    }

    /**
     * put a new value into the stack
     * simple wrapper for the push() method provided by Stack
     * @param  y the int to push into the stack
     */
    public void stackIn(int y)
    {
        st.push(y);
    }
    
    
     /**
     * peek allows us to return the value on the top of the Stack
     * without removing it
     */
    public void stackPeek() {
        System.out.println( st.peek() );
    }
    
    /**
     * remove (and return) the value on the top of the stack
     * @ return the value popped off the stack
     */
    public int stackPop() {
        return st.pop();
    }
}
