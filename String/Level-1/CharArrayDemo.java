import java.util.Scanner;

public class CharArrayDemo {
    // Method to return characters manually without using toCharArray()
    static char[] getChars(String text) {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }

    // Method to compare two char arrays
    static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        char[] manual = getChars(text);
        char[] builtIn = text.toCharArray();

        boolean isSame = compareArrays(manual, builtIn);

        System.out.println("Manual Char Array: " + new String(manual));
        System.out.println("Built-in Char Array: " + new String(builtIn));
        System.out.println("Are both arrays equal? " + isSame);

        sc.close();
    }
}
