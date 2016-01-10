
/**
 * Write a description of class Chatbot here.
 * 
 * @author J Pearse
 * @version 1
 */
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Vector;
import java.util.Set;
import java.util.Random;
public class Chatbot
{
    // instance variables
    private String input;
    private String key;
    private Scanner kb;
    private Vector<String> input_list;
    private HashMap<String,String[]> response;
    
    /**
     * Constructor for objects of class Chatbot
     */
    public Chatbot(){
        response = new HashMap<String,String[]>();
        
        
        response.put("WHAT IS YOUR NAME",
                    new String[]{"MY NAME IS CHATTERBOT2.",
                        "YOU CAN CALL ME CHATTERBOT2.",
                        "WHY DO YOU WANT TO KNOW MY NAME?"});
        
        response.put("HI", new String[]{"HI THERE!",
            "HOW ARE YOU?",
            "HI!"});
        
        response.put("HOW ARE YOU", new String[]{"I'M DOING FINE!",
             "I'M DOING WELL AND YOU?",
            "WHY DO YOU WANT TO KNOW HOW AM I DOING?"});

            
            // these need to be added to the response HashMap
            /*{"WHO ARE YOU",
            /*    {"I'M AN A.I PROGRAM.",
            /*    "I THINK THAT YOU KNOW WHO I'M.",
             * "WHY ARE YOU ASKING?"}
            },

            {"ARE YOU INTELLIGENT",
                {"YES,OFCORSE.",
                    "WHAT DO YOU THINK?",
                    "ACTUALY,I'M VERY INTELLIGENT!"}
                },

                {"ARE YOU REAL",
                    {"DOES THAT QUESTION REALLY MATERS TO YOU?",
                        "WHAT DO YOU MEAN BY THAT?",
                        "I'M AS REAL AS I CAN BE."}
                    }
                });*/

        
        kb = new Scanner(System.in);
        System.out.println("Talk to me");
        input = kb.nextLine();
        Set<String> keys = response.keySet();
        String[] responses;
        for (String key: keys){
            if (input.toUpperCase().contains(key)){
                responses = response.get(key);
                Random r = new Random();
                int choice = r.nextInt(responses.length);
                System.out.println(responses[choice]);
            }
        }
    }
}
