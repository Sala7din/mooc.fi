
import java.util.Scanner;
import java.util.ArrayList;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> list = new ArrayList<>();
        
        while (true) {
            String input = String.valueOf(scanner.nextLine());
            
            if (input.equals("")){
                break;
            }
            String[] pieces = input.split(",");
            
            list.add(pieces[1]);
        } 
        int oldest = Integer.valueOf(list.get(0));
        
        for (int i = 0; i < list.size(); i++) {
               
            int number = Integer.valueOf(list.get(i));
            if (oldest < number){
                
             oldest = number;    
            }
            
            
        
         
        
        
                
        
            
    }
    System.out.println("Age of the oldest: " + oldest );    
        
        
           
          
    }

}

