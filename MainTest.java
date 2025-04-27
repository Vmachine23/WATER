import java.util.Scanner;

public class MainTest extends InvalidInputException{
    public MainTest(String message) {
        super(message);
    }
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
        int choice;
        //menu
        do{
            System.out.println("Welcome to the library! How can I help you?");
            System.out.println("1.Display books");
            System.out.println("2.Check out a book");
            System.out.println("3.Exit");
            choice = in.nextInt();
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
                        target = in.next(); // Expects a string
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("InputMismatchException: Please enter a valid title.");
                        in.next(); // Consume the invalid input
                    }
                    UtilitySearcher.SearchTitle(b, target);
                    try {
                        target = in.next(); // Expects a string
                        UtilitySearcher.SearchTitle(b, target);
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("InputMismatchException: Invalid title.");
                        in.next(); // Consume the invalid input
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
                System.out.println("Goodbye!");
                break;
            }
        }while(choice != 3);
        in.close();
    }
}


