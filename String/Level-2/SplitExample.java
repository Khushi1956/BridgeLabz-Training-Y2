import java.util.Scanner;

public class SplitExample {

    // Method to find length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    // Method to split string into words without using split()
    public static String[] customSplit(String str) {
        int n = findLength(str);
        int spaceCount = 0;

        // Count spaces to determine number of words
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        String[] words = new String[spaceCount + 1];
        int wordIndex = 0;
        int start = 0;

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ' ') {
                words[wordIndex] = str.substring(start, i);
                wordIndex++;
                start = i + 1;
            }
        }
        words[wordIndex] = str.substring(start, n); // last word
        return words;
    }

    // Method to compare two arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] customWords = customSplit(text);
        String[] builtInWords = text.split(" ");

        System.out.println("Custom Split:");
        for (String w : customWords) System.out.println(w);

        System.out.println("Built-in Split:");
        for (String w : builtInWords) System.out.println(w);

        System.out.println("Arrays match? " + compareArrays(customWords, builtInWords));
    }
}
