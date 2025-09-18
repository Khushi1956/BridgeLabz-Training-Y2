import java.util.Scanner;

public class StringIndexDemo {
    // Method that generates exception
    static void generateException(String text) {
        System.out.println("Char: " + text.charAt(text.length())); // invalid index
    }

    // Method that handles exception
    static void handleException(String text) {
        try {
            System.out.println("Char: " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        // generateException(text); // will crash
        handleException(text);

        sc.close();
    }
}
