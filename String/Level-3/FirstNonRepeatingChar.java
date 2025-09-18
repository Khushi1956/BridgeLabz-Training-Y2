import java.util.Scanner;

public class FirstNonRepeatingChar {

    public static char findFirstNonRepeating(String text) {
        int[] freq = new int[256]; // ASCII

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        return '\0'; // not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();

        char ch = findFirstNonRepeating(text);
        if (ch != '\0')
            System.out.println("First non-repeating character: " + ch);
        else
            System.out.println("No non-repeating character found.");
    }
}
