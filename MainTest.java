import java.util.InputMismatchException;
import java.util.Scanner;

public class MainTest extends InvalidInputException{
    public MainTest(String message) {
        super(message);
    }
    public static void main(String[] args){
        // Check command-line arg for "admin mode"
        boolean adminMode = false;
        if (args.length > 0 && args[0].equalsIgnoreCase("admin")) {
            adminMode = true;
            System.out.println("[Admin Mode Enabled]");
        }
        Library myLibrary = new Library();
        //Books
        Books b1 = new Books("To Kill A Mockingbird", "Harper", "Lee", 2344, "old");
        Books b2 = new Books("Pride and Prejudice", "Jane", "Austin", 8999, "old");
        Books b3 = new Books("Alice's Adventures in Wonderland", "Lewis", "Carroll", 1111, "old");
        Books b4 = new Books("The Kiterunner", "Khaled", "Housseini", 9876, "old");
        Books[] b = { b1, b2, b3, b4 };
        //Adding Books
        myLibrary.addBooks(b1);
        myLibrary.addBooks(b2);
        myLibrary.addBooks(b3);
        myLibrary.addBooks(b4);
        Scanner in = new Scanner(System.in);
        int input;
        int choice;
        //menu
        do{
            do{
                  try {
                    System.out.println("Welcome to the library! How can I help you?");
                    System.out.println("1.Display books");
                    System.out.println("2.Check out a book");
                    if (adminMode) {
                        System.out.println("3.Book to be added (Admin Only)");
                    }
                    System.out.println("4.Exit");
                    choice = in.nextInt(); 
                    if (choice < 1 || choice > 4) {
                        System.out.println("Invalid choice. Please select a valid option.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number between 1 and 4.");
                    in.next(); 
                    choice = -1;
                }
            }while(choice < 1 || choice > 4);
            switch(choice){
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
                    System.out.println("Search by: ");
                    System.out.println("1.Author's first name?");
                    System.out.println("2.Author's last name?");
                    input = in.nextInt();
                    if (input == 1){
                        System.out.println("What is the target Author's first name?");
                        String target = in.next();

                        UtilitySearcher.SearchFirstName(b, target);
                    }
                    else if (input == 2){
                        System.out.println("What is the target Author's last name?");
                        String target = in.next();
                        UtilitySearcher.SearchLastName(b, target);
                    }        
                }
                else if (input == 2){
                    String target = "";
                    System.out.println("What is the target title?");
                    try {
                        target = in.next();
                        UtilitySearcher.SearchTitle(b, target);
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("InputMismatchException: Invalid title.");
                        in.next(); 
                    }
                    finally{
                        System.out.println("Invalid exception caught!");
                    }
                }
                else if (input == 3){
                    try {
                        int target = readAndParse();
                        System.out.println("Parsed int: " + target);
                        UtilitySearcher.binarySerialNumberSearch(b, target);
                    } 
                    catch (InvalidInputException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }
                System.out.println("Did you find the book you were looking for?");
                System.out.println("1.Yes");
                System.out.println("2.No");
                input= in.nextInt();
                if (input == 1){
                    System.out.println("Would you like to check out this book?");
                    System.out.println("1.Yes");
                    System.out.println("2.No");
                    input = in.nextInt();
                    if (input == 1){
                        System.out.println("This book is to be returned within the next 30 days.");
                        System.out.println("A fee of 50 thebe is charged per day that this book is returned late.");
                    }
                }
                else if (input == 2){
                    System.out.println("Sorry that you couldn't find your book.");
                }
                break;

                case 3:

                System.out.println("Enter the title of the book: ");
                String newtitle = in.nextLine();
                newtitle = in.nextLine();

          
                System.out.println("Enter the author's first name: ");
                String newauthorFirstname = in.nextLine();

                System.out.println("Enter the author's last name: ");
                String newauthorLastname = in.nextLine();

                System.out.println("Enter the serial number: ");
                int newserialNumber = in.nextInt();

                Books newBook = new Books(newtitle, newauthorFirstname, newauthorLastname, newserialNumber, "new");
                myLibrary.addBooks(newBook);
                System.out.println("Book added successfully!");
                System.out.println("Here is the current Catalogue: ");
                myLibrary.displayBooks();

                break;

                case 4:
                System.out.println("Goodbye!");
                break;
            }
        }while(choice != 4);
        in.close();
    }
}
