import java.util.Scanner;

public class RockPaperScissors {

    // Method to get computer choice
    public static String computerChoice() {
        int n = (int)(Math.random() * 3);
        if (n == 0) return "rock";
        else if (n == 1) return "paper";
        else return "scissors";
    }

    // Method to determine winner
    public static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("paper") && comp.equals("rock")) ||
            (user.equals("scissors") && comp.equals("paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    // Method to calculate stats
    public static String[][] calculateStats(int userWins, int compWins, int games) {
        String[][] stats = new String[2][3];
        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.valueOf((userWins * 100.0) / games) + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.valueOf((compWins * 100.0) / games) + "%";
        return stats;
    }

    // Display table
    public static void displayStats(String[][] stats) {
        System.out.println("\nPlayer\tWins\tPercentage");
        System.out.println("------------------------------");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        int userWins = 0, compWins = 0;

        for (int i = 1; i <= games; i++) {
            System.out.print("Enter choice (rock/paper/scissors): ");
            String user = sc.next().toLowerCase();
            String comp = computerChoice();
            String winner = findWinner(user, comp);

            System.out.println("Game " + i + ": User=" + user + ", Computer=" + comp + " -> Winner: " + winner);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
        }

        String[][] stats = calculateStats(userWins, compWins, games);
        displayStats(stats);
    }
}
