import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.print("Name: ");
            String name = String.valueOf(scanner.nextLine());
            if (name.isEmpty()){
                break;
            }
            System.out.print("Duration: ");
            Integer duration = Integer.valueOf(scanner.nextLine());
            
            programs.add(new TelevisionProgram(name, duration));
        }
        
        System.out.print("Program's maximum duration? ");
        Integer maxDuration = Integer.valueOf(scanner.nextLine());
        for (TelevisionProgram televisionProgram: programs) {
            if (televisionProgram.getDuration() <= maxDuration){
                System.out.println(televisionProgram);
            }
            
        }

    }
}
