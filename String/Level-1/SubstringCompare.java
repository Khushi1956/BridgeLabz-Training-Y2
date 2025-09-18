import java.util.Scanner;

public class SubstringCompare {
    // Method to create a substring manually using charAt()
    static String manualSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end && i < text.length(); i++) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }

    // Method to compare two strings manually
    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Manual substring
        String manual = manualSubstring(text, start, end);

        // Built-in substring
        String builtIn = "";
        try {
            builtIn = text.substring(start, end);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("⚠ Invalid index range for built-in substring()");
        }

        // Compare both substrings
        boolean isSame = compareStrings(manual, builtIn);

        System.out.println("Manual Substring: " + manual);
        System.out.println("Built-in Substring: " + builtIn);
        System.out.println("Are both substrings equal? " + isSame);

        sc.close();
    }
}
