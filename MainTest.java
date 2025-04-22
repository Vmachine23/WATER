import java.util.Scanner;

public class MainTest{
    public static void main(String[] args){
        Library myLibrary = new Library();
        //Books
        Books b1 = new Books("To Kill A Mockingbird", "Harper", "Lee", 2344);
        Books b2 = new Books("Pride and Prejudice", "Jane", "Austin", 8999);
        Books b3 = new Books("Alice's Adventures in Wonderland", "Lewis", "Carroll", 1111);
        Books b4 = new Books("The Kiterunner", "Khaled", "Housseini", 9876);
        Books[] b = { b1, b2, b3, b4 };
        //Adding Books
        myLibrary.addBooks(b1);
        myLibrary.addBooks(b2);
        myLibrary.addBooks(b3);
        myLibrary.addBooks(b4);
        Scanner in = new Scanner(System.in);
        int input;
        //menu
        do{
            System.out.println("Welcome to the library! How can I help you?");
            System.out.println("1.Display books");
            System.out.println("2.Search for book");
            System.out.println("3.Check out book");
            System.out.println("4.Add new book");
            System.out.println("5.Exit");
            input = in.nextInt();
            switch(input){
                case 1:
                System.out.println("How would you like the Catalogue to be displayed?");
                System.out.println("1.Default");
                System.out.println("2.Ordered by serial number");
                input = in.nextInt();
                System.out.println("Here is the current Catalogue: ");
                if (input == 1){
                    myLibrary.displayBooks();
                }
                else if (input == 2){
                    UtilitySorter.serialsorter(b);
                    for (Books c: b){
                        System.out.println("Title: " + c.getTitle());
                        System.out.println("Author: " + c.getAuthorFirstname() + " " + c.getAuthorLastname());
                        System.out.println("Serial Number: " + c.getSerialNumber());
                        System.out.println();
                    }
                    System.out.println();
                }
                break;
    
                case 2:
                System.out.println("1.Author");
                System.out.println("2.Title");
                System.out.println("3.Serial Number");
                input = in.nextInt();
                if (input == 1){
                    System.out.println("");
                }
                else if (input == 2){
                    System.out.println("");
                }
                else if (input == 3){
                    System.out.println("What is the target serial numbernumber?");
                    int target = in.nextInt();
                    UtilitySearcher.SearchSerialNumber(b, target);
                }
                break;
    
                case 3:
    
    
                break;
    
                case 4:
    
                break;
            }
        }while(input != 5);
        in.close();
    }
}
