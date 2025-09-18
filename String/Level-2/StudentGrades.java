import java.util.Scanner;

public class StudentGrades {

    // Generate random PCM scores
    public static int[][] generateScores(int students) {
        int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++) {
            scores[i][0] = (int)(Math.random() * 41) + 60; // Physics
            scores[i][1] = (int)(Math.random() * 41) + 60; // Chemistry
            scores[i][2] = (int)(Math.random() * 41) + 60; // Maths
        }
        return scores;
    }

    // Calculate totals, averages, percentages
    public static double[][] calculateResults(int[][] scores) {
        double[][] result = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return result;
    }

    // Calculate grade based on percentage
    public static String[] calculateGrades(double[][] results) {
        String[] grades = new String[results.length];
        for (int i = 0; i < results.length; i++) {
            double p = results[i][2];
            if (p >= 90) grades[i] = "A+";
            else if (p >= 80) grades[i] = "A";
            else if (p >= 70) grades[i] = "B";
            else if (p >= 60) grades[i] = "C";
            else grades[i] = "F";
        }
        return grades;
    }

    // Display table
    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t" +
                               (int)results[i][0] + "\t" + results[i][1] + "\t" +
                               results[i][2] + "\t" + grades[i]);
        }
    }

    public static void main(String[] args) {
        int students = 5; // can take input if needed
        int[][] scores = generateScores(students);
        double[][] results = calculateResults(scores);
        String[] grades = calculateGrades(results);

        displayScorecard(scores, results, grades);
    }
}
