import java.util.ArrayList;
//Custom made array list
public class Library{
    private ArrayList<Books> book = new ArrayList<>();
//Method to add books in the library
    public void addBooks(Books b){
        book.add(b);
    }
//Output for books available in the library
    public void displayBooks(){
        for (Books b: book){
            System.out.println("Title: " + b.getTitle());
            System.out.println("Author: " + b.getAuthorFirstname() + " " + b.getAuthorLastname());
            System.out.println("Serial Number: " + b.getSerialNumber());
            System.out.println("Age: " + b.getAge());
            System.out.println();
        }
    }
}
