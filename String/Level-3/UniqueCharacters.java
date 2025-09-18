import java.util.Scanner;

public class UniqueCharacters {

    // find length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    // find unique characters
    public static char[] uniqueChars(String text) {
        int n = findLength(text);
        char[] temp = new char[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (c == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) temp[count++] = c;
        }

        char[] result = new char[count];
        for (int i = 0; i < count; i++) result[i] = temp[i];
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();

        char[] unique = uniqueChars(text);
        System.out.print("Unique characters: ");
        for (char c : unique) System.out.print(c + " ");
    }
}
