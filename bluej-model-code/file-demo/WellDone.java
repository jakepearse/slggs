
/**
 * I'm proud of you, it brings to mind these words of wisdom
 * 
 * To find out what it says, write the byte[] tsBytes into a file
 * 
 * @author ? 
 * @version ?
 */

// What will you need to import

public class WellDone
{
    byte[] tsBytes;

    /**
     * Constructor for objects of class WellDone
     */
    public WellDone()
    {
        // this array contains an encoded message
       tsBytes=new byte[]{89,111,117,32,104,101,108,100,32,121,111,117,114,32,104,101,97,100,32,
           108,105,107,101,32,97,32,104,101,114,111,10,79,110,32,97,32,104,105,115,116,111,114,
           121,32,98,111,111,107,32,112,97,103,101,10,73,116,32,119,97,115,32,116,104,101,32,101,
           110,100,32,111,102,32,97,32,100,101,99,97,100,101,10,66,117,116,32,116,104,101,32,115,
           116,97,114,116,32,111,102,32,97,110,32,97,103,101,10,45,32,84,97,121,108,111,114,32,
           83,119,105,102,116,44,32,86,111,105,99,101,32,111,102,32,79,117,114,32,65,103,101};
  

        
    }

    /**
    *
    */
    public void writePraise(String filePath)
    {
        // turn the filePath String into a Path object
        // write the byteArray into your file
    }
}
