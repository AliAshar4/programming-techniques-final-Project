import java.util.ArrayList;
import java.util.List;

// Manages the football teams and matches
public class FootballManager {
    private List<FootballTeam> teams;
    private List<FootballMatch> matches;

    // Constructor to initialize the manager with empty lists of teams and matches
    public FootballManager() {
        this.teams = new ArrayList<>();
        this.matches = new ArrayList<>();
    }

    // Method to add a team to the manager
    public void addTeam(FootballTeam team) {
        teams.add(team);
    }

    // Method to remove a team from the manager
    public void removeTeam(FootballTeam team) {
        teams.remove(team);
    }

    // Method to retrieve the list of teams managed by the manager
    public List<FootballTeam> getTeams() {
        return teams;
    }

    // Method to add a match to the manager
    public void addMatch(FootballMatch match) {
        matches.add(match);
    }

    // Method to retrieve the list of matches managed by the manager
    public List<FootballMatch> getMatches() {
        return matches;
    }
    // Method to get a team by its name
    public FootballTeam getTeamByName(String teamName) {
        for (FootballTeam team : teams) {
            if (team.getName().equalsIgnoreCase(teamName)) {
                return team;
            }
        }
        return null; // Team not found
    }
}
