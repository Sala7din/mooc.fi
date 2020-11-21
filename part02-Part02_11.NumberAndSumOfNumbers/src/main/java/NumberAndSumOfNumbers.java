
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Give a number:");
        int numbers = 1;
        int sum = Integer.valueOf(reader.nextLine());
        
        while (true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(reader.nextLine());
            
            if (number == 0){
                break;
            }else{
                numbers = numbers + 1;
                sum = sum + number;
            }
        }
        System.out.println("Number of numbers: " + numbers);
        System.out.println("Sum of the numbers: " + sum);
    }
}
