import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players = new ArrayList<Player>();
    private int maxSize = 16;

    public Team(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void addPlayer(Player player) {
        if (players.size() < maxSize) {
            players.add(player);
        }
    }
    
    public void printPlayers() {
        for (Player player : players) {
            System.out.println(player);
        }
    }
    
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    
    public int size() {
        return players.size();
    }
    
    public int goals() {
        int totalGoals = 0;
        for (Player player : players) {
            totalGoals += player.goals();
        }
        return totalGoals;
    }
}
