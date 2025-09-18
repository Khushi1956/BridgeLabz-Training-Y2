import java.util.Scanner;

public class LowercaseCompare {
    static String toLowerManual(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            result.append(ch);
        }
        return result.toString();
    }

    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String builtIn = text.toLowerCase();
        String manual = toLowerManual(text);

        System.out.println("Built-in: " + builtIn);
        System.out.println("Manual: " + manual);
        System.out.println("Are both equal? " + compareStrings(builtIn, manual));

        sc.close();
    }
}
