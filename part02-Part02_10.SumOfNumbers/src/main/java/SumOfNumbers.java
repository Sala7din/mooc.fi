
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Give a number:");
        
        int sum = Integer.valueOf(reader.nextLine());
        
        while (true){
            System.out.println("Give a number:");
            
            int number = Integer.valueOf(reader.nextLine());
            
            
            if (number == 0){
                break;
            }else{
                sum = sum + number; 
            }
            
        }
        
        System.out.println("Sum of the numbers: " + sum);

        
        

    }
}
