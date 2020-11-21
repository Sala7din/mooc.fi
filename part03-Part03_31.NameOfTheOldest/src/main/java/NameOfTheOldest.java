
import java.util.Scanner;
import java.util.ArrayList;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<Integer> ageList = new ArrayList<>();
       
        
        
        while (true){
            
            String input = String.valueOf(scanner.nextLine());
            
            if (input.equals("")){
                break;
            }
            
            String[] parts = input.split(",");
            nameList.add(parts[0]);
            ageList.add(Integer.valueOf(parts[1]));
            
       
        }
        
        
        int oldest = ageList.get(0);
        
        for (int i = 0; i < ageList.size(); i++){
            
            
            
            int number = ageList.get(i);
                     
            
            if (oldest < number){
                oldest = number;
            }
          
            
        }
        
        for (int j = 0; j < nameList.size(); j++){    
        int index = ageList.get(j);
        if (index == oldest){
            System.out.println("Name of the oldest: " + nameList.get(j));  
        
        
        }
    }
    }
}
