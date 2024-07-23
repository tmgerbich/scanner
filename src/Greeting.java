import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Print "What's your name?"
        System.out.println("What's your name?");

        // The string provided by the user will be assigned to the text variable
        // Scanner will read the input entered by the user
        String text = scanner.nextLine();

        // Print a greeting to the user
        System.out.println("Hi " + text);
    }
}
