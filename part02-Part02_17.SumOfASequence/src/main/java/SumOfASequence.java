
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Last number? ");
        
        int userInput = Integer.valueOf(scanner.nextLine());
        
        int sum = 0;
        
        int i = 0;
        
        while (i <= (userInput - 1)){
            sum += (i+1);
            i++;
        }
        
        System.out.print("The sum is " + sum);
        

    }
}
