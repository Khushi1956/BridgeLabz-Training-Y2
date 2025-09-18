import java.util.Scanner;

public class IllegalArgumentDemo {
    // Method that generates exception
    static void generateException(String text) {
        System.out.println(text.substring(5, 2)); // start > end
    }

    // Method that handles exception
    static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        // generateException(text); // crash
        handleException(text);

        sc.close();
    }
}
