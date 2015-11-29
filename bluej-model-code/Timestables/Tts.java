import java.util.Scanner;
/** 
 * @author ashamed
 */
class Tts {
    int factor;
    public Tts(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a whole number:");
        factor = sc.nextInt();
        System.out.println("1 times "+factor+" ="+factor);
        System.out.println("2 times "+factor+" ="+ (2 * factor));
        System.out.println("3 times "+factor+" ="+ (3 * factor));
        System.out.println("4 times "+factor+" ="+ (4 * factor));
        System.out.println("5 times "+factor+" ="+ (5 * factor));
        System.out.println("6 times "+factor+" ="+ (6 * factor));
        System.out.println("7 times "+factor+" ="+ (7 * factor));
        System.out.println("8 times "+factor+" ="+ (8 * factor));
        System.out.println("9 times "+factor+" ="+ (9 * factor));
        System.out.println("10 times "+factor+" ="+ (10 * factor));
    }
}