
/**
 * In the old days we had to read files like this with Java, urgh!
 * 
 * @author J Pearse
 * @version 1.0
 */
import java.io.FileReader;
import java.io.BufferedReader;
   
public class ReadFromFile
{
    // instance variables - replace the example below with your own
    FileReader myFileReader;
    BufferedReader myBufferedReader;
    /**
     * Constructor for objects of class ReadFromFile
     */
    public ReadFromFile()
    {
    
    }

    /**
    *@param filePath The path of the file we want to read
     */
    public void printFileContents(String filePath)
    {
       try {
            // reading from a file is likely to go wrong (eg. wrong filename) so it must be wrapped
            // in a try/catch block
            myFileReader = new FileReader(filePath);
            myBufferedReader = new BufferedReader(myFileReader);
            String myLine ="";// I don't want this to start off as null - nothing will get read
            while (myLine != null) {
                myLine = myBufferedReader.readLine();
                System.out.println(myLine);
                // Bonus question: How can I stop it from printing the null line at the end?
            }
            myFileReader.close();
    
        } catch (Exception e) { // The catch block is executed when there is an exception
                e.printStackTrace();
        }
    }
}
