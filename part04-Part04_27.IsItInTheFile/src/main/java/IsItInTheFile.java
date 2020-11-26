
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        ArrayList<String> lines = new ArrayList<>();
        
        try (Scanner scanner1 = new Scanner(Paths.get(file))) {
            while (scanner1.hasNextLine()) {
                lines.add(scanner1.nextLine());
                
            }
            System.out.println("Search for:");
            String searchedFor = scanner.nextLine();
        
            if (lines.contains(searchedFor)) {
                System.out.println("Found!");
            }else{
                System.out.println("Not found");
            }    
            
            
        }
        catch (Exception e) {
                System.out.println("Reading the file" +file+ " failed.");

        
        

    }
}   }
