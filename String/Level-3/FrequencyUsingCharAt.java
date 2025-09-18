import java.util.Scanner;

public class FrequencyUsingCharAt {

    public static String[][] getFrequency(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // count unique chars
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] > 0) count++;
        }

        String[][] result = new String[count][2];
        int k = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (freq[c] > 0) {
                result[k][0] = String.valueOf(c);
                result[k][1] = String.valueOf(freq[c]);
                freq[c] = 0; // reset to avoid duplicate entries
                k++;
            }
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
