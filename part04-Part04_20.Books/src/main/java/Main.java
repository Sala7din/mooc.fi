import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while (true){
            System.out.print("Title: ");
            String title = String.valueOf(scanner.nextLine());
            if (title.isEmpty()){
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Publication year: ");
            int pubYear = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(title, pages, pubYear));
            
        }
        System.out.print("What information will be printed? ");
        String information = String.valueOf(scanner.nextLine());
        
        for (Book book: books){
            if (information.equals("everything")){
                System.out.println(book);
            }
            if (information.equals("name")){
                System.out.println(book.getTitle());
                
            
            }
            
        }
       

    }
}
