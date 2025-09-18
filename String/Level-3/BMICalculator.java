import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and status
    public static String[] getBMIStatus(double weight, double heightCm) {
        double heightM = heightCm / 100; // convert to meters
        double bmi = weight / (heightM * heightM);

        String status;
        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 25) status = "Normal";
        else if (bmi < 30) status = "Overweight";
        else status = "Obese";

        return new String[]{String.valueOf(weight), String.valueOf(heightCm), String.format("%.2f", bmi), status};
    }

    // Method to compute all
    public static String[][] process(double[][] arr) {
        String[][] result = new String[arr.length][4];
        for (int i = 0; i < arr.length; i++) {
            result[i] = getBMIStatus(arr[i][0], arr[i][1]);
        }
        return result;
    }

    // Method to display
    public static void display(String[][] result) {
        System.out.printf("%-10s %-10s %-10s %-12s%n", "Weight", "Height", "BMI", "Status");
        for (String[] row : result) {
            System.out.printf("%-10s %-10s %-10s %-12s%n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight(kg) and height(cm) for person " + (i + 1) + ":");
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }

        String[][] result = process(data);
        display(result);
    }
}
