import java.util.Scanner;

public class StudentVoteChecker {

    public boolean canStudentVote(int age) {
        if (age < 0) return false;   // invalid
        return age >= 18;           // true if eligible
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        StudentVoteChecker svc = new StudentVoteChecker();

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i+1) + ": ");
            ages[i] = sc.nextInt();
            if (svc.canStudentVote(ages[i])) {
                System.out.println("Student " + (i+1) + " CAN vote.");
            } else {
                System.out.println("Student " + (i+1) + " CANNOT vote.");
            }
        }
    }
}
