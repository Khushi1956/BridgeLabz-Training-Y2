import java.util.Scanner;

public class CharFrequencyNestedLoop {

    public static String[] findFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;
            if (chars[i] == '0') continue;

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // avoid recounting
                }
            }
        }

        // Store result in 1D String array
        String[] result = new String[chars.length];
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[count++] = chars[i] + " : " + freq[i];
            }
        }

        // Trim unused slots
        String[] finalResult = new String[count];
        System.arraycopy(result, 0, finalResult, 0, count);
        return finalResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[] frequencies = findFrequency(text);
        System.out.println("Character Frequencies:");
        for (String s : frequencies) {
            System.out.println(s);
        }
    }
}
