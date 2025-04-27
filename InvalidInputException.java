import java.util.Scanner;

public class InvalidInputException extends Exception{
    public InvalidInputException(String message) {
        super(message);
    }
    public static int readAndParse() throws InvalidInputException {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the target serial number you are looking for: ");
        String input = sc.nextLine();
        try {
        return Integer.parseInt(input);
        } 
        catch (NumberFormatException e) {
        throw new InvalidInputException("Invalid. The serial number is not an integer!: " + input);
        } 
        finally {
        System.out.println("Invalid exception caught!");
        }
    }
}
