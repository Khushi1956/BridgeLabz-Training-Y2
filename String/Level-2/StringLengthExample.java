import java.util.Scanner;

public class StringLengthExample {

    // Method to find string length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); // keep checking chars
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count; // return when exception occurs
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        // User defined method
        int len1 = findLength(text);

        // Built-in method
        int len2 = text.length();

        System.out.println("User-defined length: " + len1);
        System.out.println("Built-in length: " + len2);
    }
}
