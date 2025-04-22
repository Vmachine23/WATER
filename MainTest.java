import java.util.Scanner;

public class MainTest{
    public static void main(String[] args){
        Library myLibrary = new Library();
        //Books
        Books b1 = new Books("To Kill A Mockingbird", "Harper", "Lee", 2344);
        Books b2 = new Books("Pride and Prejudice", "Jane", "Austin", 8999);
        Books b3 = new Books("Alice's Adventures in Wonderland", "Lewis", "Carroll", 1111);
        Books b4 = new Books("The Kiterunner", "Khaled", "Housseini", 9876);
        //Adding Books
        myLibrary.addBooks(b1);
        myLibrary.addBooks(b2);
        myLibrary.addBooks(b3);
        myLibrary.addBooks(b4);
        //menu
        System.out.println("Welcome to the library! How can I help you?");
        System.out.println("1.Display books");
        System.out.println("2.Search for book");
        System.out.println("3.Check out book");
        System.out.println("4.Add new book");
        System.out.println("3.Exit");
        Scanner in = new Scanner(System.in);
        int input;
        input = in.nextInt();
        switch(input){
            case 1:
            System.out.println("Here is the current Catalogue: ");
             myLibrary.displayBooks();
             break;
            case 2:

            System.out.println("1.Author");
            System.out.println("2.Title");
            System.out.println("3.Serial Number");
            input = in.nextInt();
            if (input == 1){

            }
            else if (input == 2){

                System.out.println("");
            

            }
            else if (input == 3){

            }
            break;

            case 3:

            break;

            case 4:
            break;

}


}
}
