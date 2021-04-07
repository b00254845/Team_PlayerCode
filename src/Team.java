
public class Team {

    private Player[] players;
    private Integer totalnumOfPlayers;

    public Team(Integer playerListSize) {
        this.players = new Player[playerListSize];
        this.totalnumOfPlayers = 0;

    }

    public String toString() {
        String teamDetails = new String();
        if (this.totalnumOfPlayers != 0) {
            for (Integer player = 0; player < this.totalnumOfPlayers; player++) {
                teamDetails += this.players[player] + "\n";
            }
        } else {
            teamDetails += "player list is empty";
        }

        return teamDetails;
    }

    public void addPlayer(Integer number, String name) {
        // no error checking - assumes space in array and number is unique
        this.players[this.totalnumOfPlayers] = new Player(number, name);
        this.totalnumOfPlayers++;

    }

}
