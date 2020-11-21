
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Give a number: ");
        int userInput = Integer.valueOf(scanner.nextLine());
        
        int factorial = 1;
        
        int i = 0;
        
        while (i <= (userInput - 1) ){
            factorial = factorial * (i + 1);
            i++;
        }
        System.out.print("Factorial: " + factorial);
    }
}
