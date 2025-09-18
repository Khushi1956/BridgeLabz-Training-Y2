import java.util.Scanner;

public class FrequencyUsingUniqueChars {

    // Method to find length without using length()
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

    // Method to find unique characters
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

    // Method to get frequency of each unique character
    public static String[][] getFrequency(String text) {
        char[] unique = uniqueChars(text);
        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            char c = unique[i];
            int count = 0;
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == c) count++;
            }
            result[i][0] = String.valueOf(c);
            result[i][1] = String.valueOf(count);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();

        String[][] result = getFrequency(text);
        System.out.println("Character | Frequency");
        for (String[] row : result) {
            System.out.println("    " + row[0] + "     |     " + row[1]);
        }
    }
}
