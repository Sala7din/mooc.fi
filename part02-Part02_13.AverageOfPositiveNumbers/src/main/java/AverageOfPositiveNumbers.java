
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        
        double sumPos = 0;
        double number = 0;
        double avgPos = 0;
        int countPos = 0;
        
        
        
        while (true){
            number = Double.valueOf(scanner.nextLine());
            
            if (number == 0 && countPos == 0) {
                System.out.println("Cannot calculate the average");                    
                break;
 
            } else if (number == 0) {
                break;
            }
            if ( number < 0) {
                continue;
            }else{
                sumPos = sumPos + number;
                countPos = countPos + 1;
            }
        }
             
       
           
           
        avgPos = sumPos / countPos;
        System.out.println( avgPos );
                 
            
        
    }
}
      
