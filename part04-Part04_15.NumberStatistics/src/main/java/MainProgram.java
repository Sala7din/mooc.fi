
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics1 = new Statistics();
        Statistics statistics2 = new Statistics();
        Statistics statistics3 = new Statistics();
        System.out.println("Enter numbers:");
        
        
        while (true){
            int number = Integer.valueOf(scanner.nextLine());
            
            
            if(number > -1){
                statistics1.addNumber(number);
            }
                
            if( number % 2 == 0 && number > -1){
              
                statistics2.addNumber(number);
            }
            
            if ( number % 2 != 0 && number > -1){
                
                statistics3.addNumber(number);
            }
            
            if(number == -1){
                System.out.println("Sum: " + statistics1.sum());
                System.out.println("Sum of even numbers: " + statistics2.sum());
                System.out.println("Sum of odd numbers: " + statistics3.sum());
                break;
            
            }
            
        }
        
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
    }
}
