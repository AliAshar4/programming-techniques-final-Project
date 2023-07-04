import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FootballManager manager = new FootballManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Show Results");
            System.out.println("2. Add Team");
            System.out.println("3. Add Players");
            System.out.println("4. Update Score");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    showResults(manager);
                    break;
                case 2:
                    addTeam(manager, scanner);
                    break;
                case 3:
                    addPlayers(manager, scanner);
                    break;
                case 4:
                    updateScore(manager, scanner);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        } while (choice != 5);
    }

    private static void showResults(FootballManager manager) {
        List<FootballMatch> matches = manager.getMatches();

        System.out.println("Matches:");
        for (FootballMatch match : matches) {
            System.out.println("Home Team: " + match.getHomeTeamName());
            System.out.println("Away Team: " + match.getAwayTeamName());
            System.out.println("Result: " + match.getResult());
            System.out.println();
        }
    }

    private static void addTeam(FootballManager manager, Scanner scanner) {
        System.out.print("Enter team name: ");
        String teamName = scanner.nextLine();
        FootballTeam team = new FootballTeam(teamName);
        manager.addTeam(team);
        System.out.println("Team added successfully!");
    }

    private static void addPlayers(FootballManager manager, Scanner scanner) {
        System.out.print("Enter team name: ");
        String teamName = scanner.nextLine();
        FootballTeam team = manager.getTeamByName(teamName);

        if (team != null) {
            System.out.print("Enter player name: ");
            String playerName = scanner.nextLine();
            team.addPlayer(playerName);
            System.out.println("Player added successfully!");
        } else {
            System.out.println("Team not found!");
        }
    }

    private static void updateScore(FootballManager manager, Scanner scanner) {
        System.out.print("Enter home team name: ");
        String homeTeamName = scanner.nextLine();
        FootballTeam homeTeam = manager.getTeamByName(homeTeamName);

        System.out.print("Enter away team name: ");
        String awayTeamName = scanner.nextLine();
        FootballTeam awayTeam = manager.getTeamByName(awayTeamName);

        if (homeTeam != null && awayTeam != null) {
            System.out.print("Enter home team score: ");
            int homeScore = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter away team score: ");
            int awayScore = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            FootballMatch match = new FootballMatch(homeTeam, awayTeam);
            match.updateScore(homeScore, awayScore);
            manager.addMatch(match);
            System.out.println("Score updated successfully!");
        } else {
            System.out.println("One or both teams not found!");
        }
    }
}

