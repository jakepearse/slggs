
/**
 * Write a string to a file using nio.
 * 
 * @author J Pearse 
 * @version 1.0
 */

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class WriteToFile
{
    /**
     * Constructor for objects of class WriteToFile
     */
    public WriteToFile()
    {
        //empty
    }

    /**
     * Write your text to a file
     * 
     * @param   filePath - the name to save your file under
     * @param   text - the text to save in your file 
     */
    public void writeToFile(String filePath,String text)
    {
        Path myPath = Paths.get(filePath);// convert your filePath String into a Path object
        byte[] myTextBytes = text.getBytes();//convert the text String into an array of bytes
        try {
            Files.write(myPath,myTextBytes);// write your file
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
