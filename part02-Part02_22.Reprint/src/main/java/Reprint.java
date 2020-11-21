
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        System.out.println("How many times?");
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int userInput = Integer.valueOf(scanner.nextLine());
      
        while (i < userInput ){
             
            printText();
            i++;
        }
        
        
        
    }
    
    // Don't change the next line that defines the method!
    // (We aren't giving a method a parameter yet)
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
        
    }
}
