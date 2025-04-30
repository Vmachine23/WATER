import java.util.Scanner;
//Custom made exception to catch invalid entered integer during input stage
public class InvalidInputException extends Exception{
    public InvalidInputException(String message) {
        super(message);
    }
    public static int readAndParse() throws InvalidInputException {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the target serial number you are looking for: ");
        String input = sc.nextLine();
        sc.close();
        try {
        return Integer.parseInt(input); //Checks the integer put
        } 
        catch (NumberFormatException e) {
        throw new InvalidInputException("Invalid. The serial number is not an integer!: " + input); //Catches the invalid integer put
        } 
        finally {
        System.out.println("Invalid exception caught!");
        }
    }
}
