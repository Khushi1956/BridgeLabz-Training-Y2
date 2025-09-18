import java.util.Scanner;

public class VowelConsonantChecker {

    // Method to check character type
    public static String checkChar(char ch) {
        // Convert uppercase to lowercase using ASCII values
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32); 
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Method to check all characters in string
    public static String[][] findCharTypes(String str) {
        int n = str.length();
        String[][] result = new String[n][2];

        for (int i = 0; i < n; i++) {
            result[i][0] = String.valueOf(str.charAt(i));
            result[i][1] = checkChar(str.charAt(i));
        }
        return result;
    }

    // Method to display 2D array
    public static void displayTable(String[][] arr) {
        System.out.println("Character\tType");
        System.out.println("----------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t\t" + arr[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] result = findCharTypes(text);
        displayTable(result);
    }
}
