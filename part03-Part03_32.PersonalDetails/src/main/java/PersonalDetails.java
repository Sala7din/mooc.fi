
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<Integer> birthyearList = new ArrayList<>();
        
        while(true){
        
        String input = String.valueOf(scanner.nextLine());
        
        if (input.equals("")){
            break;
        }
        
        String[] parts = input.split(",");
        
        nameList.add(parts[0]);
        birthyearList.add(Integer.valueOf(parts[1]));
        }
        
        /* longest name  */
        
        String longest = nameList.get(0);
        
        for (int i = 0; i < nameList.size(); i++){
            
            String word = nameList.get(i);
            
            for ( int j = 0; j < word.length(); j++) {
                
                if (longest.length() < word.length()) {
                    
                    longest = word;
                }
                
            }
            
        }
        /* average of the birth years */
        
        int sum = 0;
        int count = 0;
        
        for (int i =0; i < birthyearList.size(); i++){
            
            sum = sum + birthyearList.get(i);
            count++;
        }
        
        double average = sum * 1.0 / count;
        
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + average);
        
        
    }
}
