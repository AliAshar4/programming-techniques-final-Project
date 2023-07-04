// Represents a football match between two teams
public class FootballMatch extends FootballTeam {
    private int homeGoals;
    private int awayGoals;
    private FootballTeam homeTeam;
    private FootballTeam awayTeam;

    // Constructor to initialize the match with the home team and away team
    public FootballMatch(FootballTeam homeTeam, FootballTeam awayTeam) {
        super(""); // Call the superclass constructor (FootballTeam) with an empty name
        this.homeGoals = 0;
        this.awayGoals = 0;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    // Method to update the score of the match
    public void updateScore(int homeGoals, int awayGoals) {
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
    }

    // Method to get the home team's name
    public String getHomeTeamName() {
        return homeTeam.getName();
    }

    // Method to get the away team's name
    public String getAwayTeamName() {
        return awayTeam.getName();
    }

    // Method to get the result of the match
    public String getResult() {
        if(homeGoals > awayGoals){
            return getHomeTeamName() + " " + homeGoals + " - " + getAwayTeamName() + " " + awayGoals + " " + "Winner: " + getHomeTeamName();
        }else{
            return getHomeTeamName() + " " + homeGoals + " - " + getAwayTeamName() + " " + awayGoals + " "+ "Winner: " + getAwayTeamName();
        }
    }
}
