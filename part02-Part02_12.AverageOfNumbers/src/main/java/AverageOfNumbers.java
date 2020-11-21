
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Give a number:");
        
        int amountnumbers = 1;
        double sum = Integer.valueOf(reader.nextLine());
        
        while (true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(reader.nextLine());
            
            if (number == 0) {
                break;
            }else{
                amountnumbers = amountnumbers + 1;
                sum = sum + number;
            }
        }
        
        double average = sum / amountnumbers;
        
        System.out.println("Average of the numbers: " + (average) );
    }
    
}