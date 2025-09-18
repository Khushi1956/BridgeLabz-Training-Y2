import java.util.Scanner;

public class ShortestLongestWord {

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

    public static String[] customSplit(String str) {
        int n = findLength(str);
        int spaceCount = 0;

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ' ') spaceCount++;
        }

        String[] words = new String[spaceCount + 1];
        int wordIndex = 0, start = 0;

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ' ') {
                words[wordIndex++] = str.substring(start, i);
                start = i + 1;
            }
        }
        words[wordIndex] = str.substring(start, n);
        return words;
    }

    public static String[][] wordWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static String[] findShortestAndLongest(String[][] wordLengthArr) {
        String shortest = wordLengthArr[0][0];
        String longest = wordLengthArr[0][0];

        for (int i = 1; i < wordLengthArr.length; i++) {
            int len = Integer.parseInt(wordLengthArr[i][1]);
            if (len < findLength(shortest)) shortest = wordLengthArr[i][0];
            if (len > findLength(longest)) longest = wordLengthArr[i][0];
        }

        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = customSplit(text);
        String[][] wordLengthArr = wordWithLengths(words);
        String[] result = findShortestAndLongest(wordLengthArr);

        System.out.println("Shortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);
    }
}
