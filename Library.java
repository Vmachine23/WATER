import java.util.ArrayList;

public class Library{
    private ArrayList<Books> book = new ArrayList<>();

    public void addBooks(Books b){
        book.add(b);
    }

    public void displayBooks(){
        for (Books b: book){
            System.out.println("Title: " + b.getTitle());
            System.out.println("Author: " + b.getAuthorFirstname() + " " + b.getAuthorLastname());
            System.out.println("Serial Number: " + b.getSerialNumber());
            System.out.println();
        }
    }
}
