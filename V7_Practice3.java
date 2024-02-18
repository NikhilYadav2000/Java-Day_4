import java.util.Scanner;

public class V7_Practice3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // 1. toLowerCase
        // System.out.println("Enter your name");
        // String name = sc.next();
        // System.out.println(name.toLowerCase());

        // 2. Spaces to Underscore
        // String word = " Nikhil ";
        // System.out.println(word.replace(" ", "_"));

        // 3. Replace <|name|>
        // String word = "Dear <|name|>, Thanks a lot!";
        // System.out.println(word.replace("<|name|>", "name"));

        // 4.  Detect double and triple space
        // String word = "  abc   d e";
        // System.out.println(word.indexOf("  ")); // 0 
        // System.out.println(word.indexOf("   ")); // 5

        // 5. Format by escape sequnce character
        System.out.println("Dear Harry,\nThis Java Course is Nice.\nThanks");
    }
}
