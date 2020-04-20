
package ohtu;

public class Player {
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

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name+"("+nationality+")"+" team "+team+" goals "+goals+" assists "+assists;
    }
      
}
