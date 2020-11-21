
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        
        
        
        while (true){
        int input = Integer.valueOf(scanner.nextLine());
        if (input == 9999){
            break;
        }else{
        numbers.add(input);
        }
        }
        
        
        int smallest = numbers.get(0);
        for ( int i = 0; i < numbers.size(); i++){
            int number = numbers.get(i);
            if (smallest > numbers.get(i)){
                smallest = number;
            }
        } 
        
        System.out.println("Smallest number: " + smallest);
        
        
        for ( int i = 0; i < numbers.size(); i++){
            int index = numbers.get(i);
            if (index == smallest){
                System.out.println("Found at index: " + i);
            }
        } 

        
    }
}
