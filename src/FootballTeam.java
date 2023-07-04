import java.util.ArrayList;
import java.util.List;

// Represents a football team with a name and a list of players
public class FootballTeam {
    private String name;
    private List<String> players;

    // Constructor to initialize the team with a name and an empty list of players
    public FootballTeam(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    // Getter method to retrieve the team's name
    public String getName() {
        return name;
    }

    // Method to add a player to the team
    public void addPlayer(String player) {
        players.add(player);
    }

    // Method to remove a player from the team
    public void removePlayer(String player) {
        players.remove(player);
    }

    // Method to retrieve the list of players in the team
    public List<String> getPlayers() {
        return players;
    }
}
