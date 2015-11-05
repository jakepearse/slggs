
/**
 * It's much easier to read from files in newer versions versions of Java by using nio.
 * 
 * @author J Pearse 
 * @version 1.0
 */
import java.nio.BufferedReader;
import java.nio.file.Path;
import java.nio.charset.StandardCharsets;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.nio.file.Files;

public class newReadFromFile
{

    /**
     * Constructor for objects of class newReadFromFile
     */
    public newReadFromFile()
    {
        //empty Constructor
    }

    /**
     * The easiest way to read from a file in Java
     * @param filePath the path of the file we want to read
     */
    public void printFileContents(String filePath)
    {
        Path myPath = Paths.get(filePath);// convert your filePath String into a Path object
        Charset myCharset = StandardCharsets.UTF_8; // you have to specify how your text file is encoded
        try {
            for (String line : Files.readAllLines(myPath, myCharset)) {
                System.out.println(line);
            }
        } catch (Exception e) {
                e.printStackTrace();
            }
        }
    
}
