import java.util.Scanner;

public class InvalidInputException {
    public InvalidInputException(String message) {
        super(message);
    }
    public static int readAndParse() throws InvalidInputException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String input = sc.nextLine();
        try {
        return Integer.parseInt(input);
        } 
        catch (NumberFormatException e) {
        throw new InvalidInputException("Not a valid integer: " + input);
        } 
        finally {
        System.out.println("Finally block: always runs!");
        }
    }
    
    public static void main(String[] args) {
        try {
        int value = readAndParse();
        System.out.println("Parsed int: " + value);
        } 
        catch (InvalidInputException e) {
        System.out.println("Error: " + e.getMessage());
        }
    }
}
