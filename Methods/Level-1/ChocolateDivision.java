import java.util.Scanner;

public class ChocolateDivision {
    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        return new int[]{chocolates % children, chocolates / children};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter chocolates: ");
        int c = sc.nextInt();
        System.out.print("Enter children: ");
        int ch = sc.nextInt();
        int[] res = findRemainderAndQuotient(c, ch);
        System.out.println("Each child gets " + res[1] + " chocolates, Remaining = " + res[0]);
    }
}
