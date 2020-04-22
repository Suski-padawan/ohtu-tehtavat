
package ohtu;

import java.util.ArrayList;

public class Player implements Comparable<Player> {
    private String name;
    private String team;
    private int goals;
    private int assists;
    private String nationality;
    
    
     public Player(String name, String team, int goals, int assists, String nationality) {
        this.name = name;
        this.team = team;
        this.goals = goals;
        this.assists = assists;
        this.nationality = nationality;
        
    }

    public String getName() {
        return name;
    }
    public int getGoals() {
        return goals;
    }
    public int getAssists() {
        return assists;
    }
     public int getPoints() {
        return goals+assists;
    }
    public String getNationality() {
        return nationality;
    }

    @Override
    public String toString() {
        return name+" "+team+"  "+goals+" + "+assists+" = "+getPoints(); 
    }
    @Override
    public int compareTo(Player player) {
        int comparepoints=player.getPoints();
        return comparepoints-this.getPoints();
    }
}
