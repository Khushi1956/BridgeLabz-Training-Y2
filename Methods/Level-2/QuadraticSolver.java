import java.util.Scanner;

public class QuadraticSolver {

    public static double[] findRoots(int a, int b, int c) {
        double delta = (b*b) - (4*a*c);
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2*a);
            double root2 = (-b - Math.sqrt(delta)) / (2*a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            double root = -b / (2.0 * a);
            return new double[]{root};
        } else {
            return new double[]{}; // no real roots
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        double[] roots = findRoots(a, b, c);
        if (roots.length == 0) System.out.println("No real roots");
        else {
            for (double r : roots) System.out.println("Root: " + r);
        }
    }
}
