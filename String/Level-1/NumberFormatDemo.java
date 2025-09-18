import java.util.Scanner;

public class NumberFormatDemo {
    // Method that generates exception
    static void generateException(String text) {
        int num = Integer.parseInt(text); // error if text is not number
        System.out.println("Converted: " + num);
    }

    // Method that handles exception
    static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Converted: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number string: ");
        String text = sc.next();

        // generateException(text); // crash
        handleException(text);

        sc.close();
    }
}
